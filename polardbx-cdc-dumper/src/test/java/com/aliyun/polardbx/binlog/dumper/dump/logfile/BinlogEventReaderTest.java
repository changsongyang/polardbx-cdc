/**
 * Copyright (c) 2013-2022, Alibaba Group Holding Limited;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * </p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.aliyun.polardbx.binlog.dumper.dump.logfile;

import com.aliyun.polardbx.binlog.domain.BinlogCursor;
import com.aliyun.polardbx.binlog.testing.BaseTest;
import com.aliyun.polardbx.rpc.cdc.BinlogEvent;
import org.junit.Ignore;
import org.junit.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

@Ignore
public class BinlogEventReaderTest extends BaseTest {
    File dir = new File(System.getProperty("user.dir") + "/binlog/mysql/");

    @Test
    public void nextBinlogEvent() throws IOException {
        LogFileManager logFileManager = new LogFileManager();
        logFileManager.setBinlogRootPath(dir.getPath());
        logFileManager.setLatestFileCursor(new BinlogCursor("binlog.000001", 860L));

        BinlogEventReader binlogFileReader =
            new BinlogEventReader(logFileManager.getBinlogFileByName("binlog.000001"),
                0, 0, -1);

        binlogFileReader.valid();
        binlogFileReader.skipPos();
        binlogFileReader.skipOffset();

        while (binlogFileReader.hasNext()) {
            BinlogEvent binlogEvent = binlogFileReader.nextBinlogEvent();
            System.out.println(binlogEvent);
        }
    }

    @Test
    public void binlogDumper() throws IOException {
        LogFileManager logFileManager = new LogFileManager();
        logFileManager.setBinlogRootPath(dir.getPath());
        BinlogEventReader binlogFileReader =
            new BinlogEventReader(logFileManager.getBinlogFileByName("binlog.000001"), 0, 0, -1);
        BufferedWriter bw = new BufferedWriter(
            new OutputStreamWriter(new FileOutputStream("/Users/yanfenglin/Downloads/tmp/binlog.000004-dmp")));
        binlogFileReader.valid();
        binlogFileReader.skipPos();
        binlogFileReader.skipOffset();
        while (binlogFileReader.hasNext()) {
            BinlogEvent binlogEvent = binlogFileReader.nextBinlogEvent();
            bw.write(
                binlogEvent.getEndLogPos() + "---" + binlogEvent.getServerId() + "---" + binlogEvent.getEventType()
                    + " " + binlogEvent.getInfo() + " size : " + binlogEvent.getSerializedSize() + "\n");
        }
        bw.close();
    }
}

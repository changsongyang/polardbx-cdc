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
package com.aliyun.polardbx.binlog.daemon.rest.resources;

import com.aliyun.polardbx.binlog.AlarmEvent;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.sun.jersey.spi.resource.Singleton;
import lombok.extern.slf4j.Slf4j;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

@Path("/events")
@Produces(MediaType.APPLICATION_JSON)
@Singleton
@Slf4j
public class EventsResource {

    private final Cache<String, AlarmEvent> eventsCache = CacheBuilder.newBuilder()
        .maximumSize(256)
        .expireAfterWrite(5, TimeUnit.MINUTES)
        .build();

    @GET
    @Path("/query")
    public Collection<AlarmEvent> query() {
        return eventsCache.asMap().values();
    }

    @POST
    @Path("/report")
    @Produces(MediaType.TEXT_PLAIN)
    public String report(AlarmEvent event) {
        if (log.isDebugEnabled()) {
            log.debug("receive report alarm event success, {} ", event.toString());
        }
        eventsCache.put(event.getEventKey(), event);
        return "success";
    }
}

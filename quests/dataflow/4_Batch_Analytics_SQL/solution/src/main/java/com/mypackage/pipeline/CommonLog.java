/*
 * Copyright (C) 2018 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.mypackage.pipeline;

import org.apache.beam.sdk.schemas.JavaFieldSchema;
import org.apache.beam.sdk.schemas.annotations.DefaultSchema;

/**
 * A class used for parsing JSON web server events
 */
@DefaultSchema(JavaFieldSchema.class)
public class CommonLog {
    public String user_id;
    public String ip;
    @javax.annotation.Nullable public double lat;
    @javax.annotation.Nullable public double lng;
    public String timestamp;
    public String http_request;
    public String user_agent;
    public Long http_response;
    public Long num_bytes;
}
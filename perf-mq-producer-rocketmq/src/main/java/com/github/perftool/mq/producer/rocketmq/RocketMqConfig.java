/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.github.perftool.mq.producer.rocketmq;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@Configuration
@Service
public class RocketMqConfig {

    @Value("${ROCKETMQ_ADDR:localhost:9876}")
    public String rocketMqAddr;

    @Value("${ROCKETMQ_PRODUCER_NUM_PER_THREAD:1}")
    public int producerNum;

    @Value("${ROCKETMQ_GROUP_NAME:groupName}")
    public String groupName;

    @Value("${ROCKETMQ_TOPIC:topic}")
    public String topic;

    @Value("${ROCKETMQ_MESSAGE_BYTE:1024}")
    public int messageByte;
}

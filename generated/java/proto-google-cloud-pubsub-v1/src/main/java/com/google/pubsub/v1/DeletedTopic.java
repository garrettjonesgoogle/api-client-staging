/*
 * Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.pubsub.v1;

import com.google.api.resourcenames.ResourceName;
import com.google.api.resourcenames.ResourceNameType;

// AUTO-GENERATED DOCUMENTATION AND CLASS
@javax.annotation.Generated("by GAPIC protoc plugin")
public class DeletedTopic extends TopicName {

  private static final String FIXED_VALUE = "_deleted-topic_";

  private static final DeletedTopic instance = new DeletedTopic();

  private DeletedTopic() {}

  public static DeletedTopic instance() {
    return instance;
  }

  public static boolean matches(String value) {
    return FIXED_VALUE.equals(value);
  }

  /**
   * @deprecated This method is only present to satisfy the ResourceName interface.
   */
  @Deprecated
  public ResourceNameType getType() {
    throw new UnsupportedOperationException("DeletedTopic.getType() not supported");
  }

  @Override
  public String toString() {
    return FIXED_VALUE;
  }
}


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

package com.google.cloud.bigquery.datatransfer.v1;

import com.google.common.base.Preconditions;
import com.google.api.resourcenames.ResourceName;
import com.google.api.resourcenames.ResourceNameType;
import java.util.ArrayList;
import java.util.List;

// AUTO-GENERATED DOCUMENTATION AND CLASS
@javax.annotation.Generated("by GAPIC protoc plugin")
public class UntypedRunName extends RunName {

  private final String rawValue;

  private UntypedRunName(String rawValue) {
    this.rawValue = Preconditions.checkNotNull(rawValue);
  }

  public static UntypedRunName from(ResourceName resourceName) {
    return new UntypedRunName(resourceName.toString());
  }

  public static UntypedRunName parse(String formattedString) {
    return new UntypedRunName(formattedString);
  }

  public static List<UntypedRunName> parseList(List<String> formattedStrings) {
    List<UntypedRunName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<UntypedRunName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (UntypedRunName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return true;
  }

  /**
   * @deprecated This method is only present to satisfy the ResourceName interface.
   */
  @Deprecated
  public ResourceNameType getType() {
    throw new UnsupportedOperationException("UntypedRunName.getType() not supported");
  }

  @Override
  public String toString() {
    return rawValue;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof UntypedRunName) {
      UntypedRunName that = (UntypedRunName) o;
      return this.rawValue.equals(that.rawValue);
    }
    return false;
  }

  @Override
  public int hashCode() {
    return rawValue.hashCode();
  }
}

/*
 * Copyright 2012-2013 Continuuity,Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.continuuity.weave.internal.yarn;

import org.apache.hadoop.yarn.api.records.ContainerState;

/**
 * This interface is for adapting differences in ContainerStatus between Hadoop 2.0 and 2.1
 */
public interface YarnContainerStatus {

  String getContainerId();

  ContainerState getState();

  int getExitStatus();

  String getDiagnostics();
}

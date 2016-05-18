/*
 * Copyright 2016 Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.hops.metadata.yarn.dal.rmstatestore;

import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;

import java.util.Collection;
import java.util.List;

public interface GarbageCollectorAllocRespDataAccess<T> extends EntityDataAccess {
    void addAll(Collection<T> allocResps) throws StorageException;
    List<T> getSubset(int limit) throws StorageException;
    List<T> getAll() throws StorageException;
    void removeAll(Collection<T> toRemove) throws StorageException;
}

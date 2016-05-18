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
package io.hops.metadata.yarn.entity.rmstatestore;

public class GarbageCollectorAllocResp {

    public static enum TYPE {
        ALLOCATED_CONTAINERS,
        CONTAINERS_STATUSES
    }

    private final String applicationAttemptID;
    private final Integer responseID;
    private final TYPE type;
    
    public GarbageCollectorAllocResp(String applicationAttemptID, Integer responseID,
            TYPE type) {
        this.applicationAttemptID = applicationAttemptID;
        this.responseID = responseID;
        this.type = type;
    }

    public String getApplicationAttemptID() {
        return applicationAttemptID;
    }

    public Integer getResponseID() {
        return responseID;
    }

    public TYPE getType() {
        return type;
    }

    @Override
    public int hashCode() {
        return applicationAttemptID.hashCode() + 100 * responseID.hashCode() * type.hashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof GarbageCollectorAllocResp) {
            GarbageCollectorAllocResp obj = (GarbageCollectorAllocResp) other;
            return (this.applicationAttemptID.equals(obj.getApplicationAttemptID())
                && this.responseID.equals(obj.getResponseID())
                && this.type == obj.getType());
        }
        return false;
    }

    @Override
    public String toString() {
        return "ApplicationAttemptID: " + applicationAttemptID + ", responseID: " + responseID
                + ", Type: " + type.toString();
    }
}
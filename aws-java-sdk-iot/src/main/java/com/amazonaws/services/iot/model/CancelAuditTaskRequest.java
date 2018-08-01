/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CancelAuditTaskRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the audit you want to cancel. You can only cancel an audit that is "IN_PROGRESS".
     * </p>
     */
    private String taskId;

    /**
     * <p>
     * The ID of the audit you want to cancel. You can only cancel an audit that is "IN_PROGRESS".
     * </p>
     * 
     * @param taskId
     *        The ID of the audit you want to cancel. You can only cancel an audit that is "IN_PROGRESS".
     */

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * <p>
     * The ID of the audit you want to cancel. You can only cancel an audit that is "IN_PROGRESS".
     * </p>
     * 
     * @return The ID of the audit you want to cancel. You can only cancel an audit that is "IN_PROGRESS".
     */

    public String getTaskId() {
        return this.taskId;
    }

    /**
     * <p>
     * The ID of the audit you want to cancel. You can only cancel an audit that is "IN_PROGRESS".
     * </p>
     * 
     * @param taskId
     *        The ID of the audit you want to cancel. You can only cancel an audit that is "IN_PROGRESS".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelAuditTaskRequest withTaskId(String taskId) {
        setTaskId(taskId);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTaskId() != null)
            sb.append("TaskId: ").append(getTaskId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CancelAuditTaskRequest == false)
            return false;
        CancelAuditTaskRequest other = (CancelAuditTaskRequest) obj;
        if (other.getTaskId() == null ^ this.getTaskId() == null)
            return false;
        if (other.getTaskId() != null && other.getTaskId().equals(this.getTaskId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
        return hashCode;
    }

    @Override
    public CancelAuditTaskRequest clone() {
        return (CancelAuditTaskRequest) super.clone();
    }

}

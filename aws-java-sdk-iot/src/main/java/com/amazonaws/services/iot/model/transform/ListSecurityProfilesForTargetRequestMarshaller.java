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
package com.amazonaws.services.iot.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iot.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ListSecurityProfilesForTargetRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListSecurityProfilesForTargetRequestMarshaller {

    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("nextToken").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("maxResults").build();
    private static final MarshallingInfo<Boolean> RECURSIVE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("recursive").build();
    private static final MarshallingInfo<String> SECURITYPROFILETARGETARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("securityProfileTargetArn").build();

    private static final ListSecurityProfilesForTargetRequestMarshaller instance = new ListSecurityProfilesForTargetRequestMarshaller();

    public static ListSecurityProfilesForTargetRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListSecurityProfilesForTargetRequest listSecurityProfilesForTargetRequest, ProtocolMarshaller protocolMarshaller) {

        if (listSecurityProfilesForTargetRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listSecurityProfilesForTargetRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(listSecurityProfilesForTargetRequest.getMaxResults(), MAXRESULTS_BINDING);
            protocolMarshaller.marshall(listSecurityProfilesForTargetRequest.getRecursive(), RECURSIVE_BINDING);
            protocolMarshaller.marshall(listSecurityProfilesForTargetRequest.getSecurityProfileTargetArn(), SECURITYPROFILETARGETARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

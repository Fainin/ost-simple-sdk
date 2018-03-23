package com.fainin.sdk.response.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Set;

/**
 * Created by hishamaborob on 23-Mar-18.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AirdropDate {

    private String airdropUuid;
    private String currentStatus;
    private Set<String> stepsComplete;

    public String getAirdropUuid() {
        return airdropUuid;
    }

    public void setAirdropUuid(String airdropUuid) {
        this.airdropUuid = airdropUuid;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    public Set<String> getStepsComplete() {
        return stepsComplete;
    }

    public void setStepsComplete(Set<String> stepsComplete) {
        this.stepsComplete = stepsComplete;
    }

    @Override
    public String toString() {
        return "AirdropDate{" +
                "airdropUuid='" + airdropUuid + '\'' +
                ", currentStatus='" + currentStatus + '\'' +
                ", stepsComplete=" + stepsComplete +
                '}';
    }
}

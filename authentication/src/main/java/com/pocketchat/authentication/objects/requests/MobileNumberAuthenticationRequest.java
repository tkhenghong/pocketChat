package com.pocketchat.authentication.objects.requests;

public class MobileNumberAuthenticationRequest {
    private String mobileNumber;

    public MobileNumberAuthenticationRequest() {
    }

    public MobileNumberAuthenticationRequest(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}

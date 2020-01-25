package com.xlccc.design.principle.singleresponsibility;

public class Method {
    private void updateUserInfo(String userName , String address)
    {
        userName = "linkp";
        address = "beijing";
    }
    private void updateUserInfo(String userName , String... properties){
        userName = "linkp";
    }

    private void updateUserName(String userName )
    {
        userName = "linkp";
    }
    private void updateUserAddress(String address){
        address = "beijing";
    }
}

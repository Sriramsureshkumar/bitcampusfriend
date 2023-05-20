package com.blackboxindia.bit_campusfriend.Network.Interfaces;


public interface onCompleteListener<T> {
    void onSuccess(T data);
    void onFailure(Exception e);
}

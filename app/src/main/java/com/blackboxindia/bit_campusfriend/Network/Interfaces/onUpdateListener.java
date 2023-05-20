package com.blackboxindia.bit_campusfriend.Network.Interfaces;

import com.blackboxindia.bit_campusfriend.dataModels.UserInfo;


public interface onUpdateListener {

    void onSuccess(UserInfo userInfo);

    void onFailure(Exception e);

}

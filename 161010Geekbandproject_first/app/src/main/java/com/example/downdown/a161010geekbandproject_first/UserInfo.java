package com.example.downdown.a161010geekbandproject_first;

import java.io.Serializable;

/**
 * Created by downdown on 2016/10/11.
 */
public class UserInfo implements Serializable {
    private String mUserName;
    private int mAge;

    public String getmUserName() {
        return mUserName;
    }

    public void setmUserName(String mUserName) {
        this.mUserName = mUserName;
    }

    public int getmAge() {
        return mAge;
    }

    public void setmAge(int mAge) {
        this.mAge = mAge;
    }

    public UserInfo(int mAge, String mUserName) {
        this.mAge = mAge;
        this.mUserName = mUserName;

    }
}

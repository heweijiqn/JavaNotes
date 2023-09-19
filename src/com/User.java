/**
 @author hwj
 * @version 1.0
 * @date 2022/8/4 2:09
 */


package com;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 1L;  //序列化版本号  必须要有
    private String userId;//用户Id/用户名
    private String passwd;//用户密码

    public User() {

    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public User(String userId, String passwd) {
        this.userId = userId;
        this.passwd = passwd;

    }
}

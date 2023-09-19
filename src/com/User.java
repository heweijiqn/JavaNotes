/**
 @author hwj
 * @version 1.0
 * @date 2022/8/4 2:09
 */


package com;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 1L;  //���л��汾��  ����Ҫ��
    private String userId;//�û�Id/�û���
    private String passwd;//�û�����

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

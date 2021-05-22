package com.cookandroid.retrofit_0511;

import com.google.gson.annotations.SerializedName;

public class Post { //https://jsonplaceholder.typicode.com 서버에 있는 Json 데이터 구조를 정의함
    /**
     * {
     *     "userId": 1,
     *     "id": 1,
     *     "title": "sunt aut facere repellat ~~~",
     *     "body": "quia et suscipit\nsuscipit ~~~"
     * },
     */



    @SerializedName("CLIENT_ID")
    private String CLIENT_ID;
    @SerializedName("CLIENT_PWD")
    private String CLIENT_PWD;
    @SerializedName("CLIENT_NAME")
    private String CLIENT_NAME;
    @SerializedName("CLIENT_PHONE")
    private String CLIENT_PHONE;
    @SerializedName("CLIENT_EMAIL")
    private String CLIENT_EMAIL;

    public String getCLIENT_ID() {
        return CLIENT_ID;
    }

    public void setCLIENT_ID(String CLIENT_ID) {
        this.CLIENT_ID = CLIENT_ID;
    }

    public String getCLIENT_PWD() {
        return CLIENT_PWD;
    }

    public void setCLIENT_PWD(String CLIENT_PWD) {
        this.CLIENT_PWD = CLIENT_PWD;
    }

    public String getCLIENT_NAME() {
        return CLIENT_NAME;
    }

    public void setCLIENT_NAME(String CLIENT_NAME) {
        this.CLIENT_NAME = CLIENT_NAME;
    }

    public String getCLIENT_PHONE() {
        return CLIENT_PHONE;
    }

    public void setCLIENT_PHONE(String CLIENT_PHONE) {
        this.CLIENT_PHONE = CLIENT_PHONE;
    }

    public String getCLIENT_EMAIL() {
        return CLIENT_EMAIL;
    }

    public void setCLIENT_EMAIL(String CLIENT_EMAIL) {
        this.CLIENT_EMAIL = CLIENT_EMAIL;
    }
}

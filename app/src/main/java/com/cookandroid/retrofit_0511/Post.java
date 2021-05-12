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
    private int userId;
    private int id;
    private String title;
    private String body;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}

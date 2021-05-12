package com.cookandroid.retrofit_0511;

import java.util.HashMap;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface JsonPlaceHolderApi {


    //Call<List<post> 구조를 가지는 이유는 https://jsonplaceholder.typicode.com
    //서버에 접속해보면 post라는 데이터양식들의 lIST로 이루어져있기때문!
    @GET("/posts")
    Call<List<Post>> getPost(@Query("userId") String id);

    @FormUrlEncoded
    @POST("/posts")
    Call<Post> postData(@FieldMap HashMap<String , Object> param);
}

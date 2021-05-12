package com.cookandroid.retrofit_0511;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private final String BASEURL = "https://jsonplaceholder.typicode.com";
    private TextView textViewResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewResult = findViewById(R.id.text_view_result);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASEURL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        JsonPlaceHolderApi jsonPlaceHolderApi = retrofit.create(JsonPlaceHolderApi.class);



        //////아래 형식으로도 가능하다.
//        jsonPlaceHolderApi.getPost("1").enqueue(new Callback<List<Post>>() {
//            @Override
//            public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {
//                if (response.isSuccessful()) {
//
//                    List<Post> posts = response.body();
//                    String data=Integer.toString(posts.get(0).getId());
//                    Toast.makeText(getApplicationContext(),"성공", Toast.LENGTH_LONG).show();
//                    textViewResult.setText(data);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<List<Post>> call, Throwable t) {
//                Toast.makeText(getApplicationContext(),"실패", Toast.LENGTH_LONG).show();
//            }
//        });

        Call<List<Post>> call = jsonPlaceHolderApi.getPost("1");
        call.enqueue(new Callback<List<Post>>() {
            @Override
            public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {
                if (!response.isSuccessful()) {
                    textViewResult.setText("code: " + response.code());
                    return;
                }

                List<Post> posts = response.body();
                Toast.makeText(getApplicationContext(),"배열문제인가?",Toast.LENGTH_LONG).show();
                textViewResult.setText("안녕");
            }

            @Override
            public void onFailure(Call<List<Post>> call, Throwable t) {
                textViewResult.setText(t.getMessage());
            }
        });


        // 여기서 부터 데이터 전송송
       HashMap<String,Object> input=new HashMap<>();
        input.put("userId",1);
        input.put("title","제목넣자");
        input.put("body","body body 당근당근");
        jsonPlaceHolderApi.postData(input).enqueue(new Callback<Post>() {
            @Override
            public void onResponse(Call<Post> call, Response<Post> response) {
                if (response.isSuccessful()){
                    Post data=response.body();
                    textViewResult.append(data.getBody());
                }
            }

            @Override
            public void onFailure(Call<Post> call, Throwable t) {

            }
        });
    }
}
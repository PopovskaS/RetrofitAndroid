package com.example.retrofitandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.retrofitandroid.Models.Comment;
import com.example.retrofitandroid.Models.PostModel;
import com.example.retrofitandroid.Service.PostService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PostModel postModelRequest = new PostModel("Stefanija Post", 1200);

        PostService.initalizeRetrofit();

        Call<PostModel> getPostsModel = PostService._postService.createPost(postModelRequest);

        getPostsModel.enqueue(new Callback<PostModel>() {
            @Override
            public void onResponse(Call<PostModel> call, Response<PostModel> response) {
                PostModel postModelResponse = response.body();
            }

            @Override
            public void onFailure(Call<PostModel> call, Throwable t) {

            }
        });
    }
}

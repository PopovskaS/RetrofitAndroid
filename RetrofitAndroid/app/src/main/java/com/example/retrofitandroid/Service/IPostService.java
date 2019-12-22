package com.example.retrofitandroid.Service;

import com.example.retrofitandroid.Models.PostModel;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface IPostService {

    @POST("/posts")
    Call<PostModel> createPost(@Body PostModel requestModel);
}

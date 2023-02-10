package com.example.facebook_v2.data;

import com.example.facebook_v2.pojo.PostModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PostInterface {
    @GET("posts")
    public Call<List<PostModel>>getPosts();
}

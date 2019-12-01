package com.rujira.retrofit2rxjava.Retrofit;


import com.rujira.retrofit2rxjava.Model.Post;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface IMyAPI {
    @GET("posts")
    Observable<List<Post>> getPosts();


}

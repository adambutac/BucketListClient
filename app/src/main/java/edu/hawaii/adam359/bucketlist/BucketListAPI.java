package edu.hawaii.adam359.bucketlist;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by Super on 1/15/2018.
 */

public interface BucketListAPI {
    @GET("/api/tasks")
    Call<ServerResponse> get();

    @FormUrlEncoded
    @POST("/api/tasks")
    Call<ServerResponse> post(@Field("data")String data);
}
package edu.hawaii.adam359.bucketlist;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by Super on 1/15/2018.
 */

public interface BucketListAPI {
    @GET("/api")
    Call<List<ServerResponse>> get();

    @POST("/api")
    Call<List<ServerResponse>> post(@Field("data") String data);
}
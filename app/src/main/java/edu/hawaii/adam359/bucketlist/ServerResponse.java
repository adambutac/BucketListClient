package edu.hawaii.adam359.bucketlist;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Super on 1/15/2018.
 */

class ServerResponse implements Serializable {
    @SerializedName("data")
    private String data;
    @SerializedName("status")
    private String status;

    public void setData (String s) {
        this.data = s;
    }
    public void setStatus (String s) {
        this.status = s;
    }
    public String getData () {
        return this.data;
    }
    public String getStatus() {
        return this.status;
    }
}

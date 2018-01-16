package edu.hawaii.adam359.bucketlist;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Super on 1/15/2018.
 */

class ServerResponse implements Serializable {
    @SerializedName("task_id")
    private int taskID;
    @SerializedName("subject")
    private String subject;
    @SerializedName("start_date")
    private String startDate;
    @SerializedName("end_date")
    private String endDate;
    @SerializedName("description")
    private String description;

    public void setTaskID (int i) {
        this.taskID = i;
    }
    public void setSubject (String s) {
        this.subject = s;
    }
    public void setStatDate (String s) {
        this.startDate = s;
    }
    public void setEndDate (String s) {
        this.endDate = s;
    }
    public void setDescription (String s) {
        this.description = s;
    }

    public int setTaskID () {
        return this.taskID;
    }
    public String setSubject () {
        return this.subject;
    }
    public String setStatDate () {
        return this.startDate;
    }
    public String setEndDate () {
        return this.endDate;
    }
    public String setDescription () {
        return this.description;
    }
}

package edu.hawaii.adam359.bucketlist;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Super on 1/16/2018.
 */

public class Task {
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
    public void setStartDate (String s) {
        this.startDate = s;
    }
    public void setEndDate (String s) {
        this.endDate = s;
    }
    public void setDescription (String s) {
        this.description = s;
    }
    public int getTaskID () {
        return this.taskID;
    }
    public String getSubject () {
        return this.subject;
    }
    public String getStartDate () {
        return this.startDate;
    }
    public String getEndDate () {
        return this.endDate;
    }
    public String getDescription () {
        return this.description;
    }

    @Override
    public String toString() {
        return subject;
    }
}

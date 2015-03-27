package com.example.lucassmith.quantumreporting.Model;

/**
 * Created by lucassmith on 3/26/2015.
 */
public class Results {
    private int mId;
    private String mCreationDate;
    private int mCustomerId;
    private int mReportId;
    private String mMachine;
    private String mCoating;

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getCreationDate() {
        return mCreationDate;
    }

    public void setCreationDate(String creationDate) {
        mCreationDate = creationDate;
    }

    public int getCustomerId() {
        return mCustomerId;
    }

    public void setCustomerId(int customerId) {
        mCustomerId = customerId;
    }

    public int getReportId() {
        return mReportId;
    }

    public void setReportId(int reportId) {
        mReportId = reportId;
    }

    public String getMachine() {
        return mMachine;
    }

    public void setMachine(String machine) {
        mMachine = machine;
    }

    public String getCoating() {
        return mCoating;
    }

    public void setCoating(String coating) {
        mCoating = coating;
    }
}

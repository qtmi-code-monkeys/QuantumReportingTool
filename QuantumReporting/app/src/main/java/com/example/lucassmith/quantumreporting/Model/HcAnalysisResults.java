package com.example.lucassmith.quantumreporting.Model;

/**
 * Created by lucassmith on 3/26/2015.
 */
public class HcAnalysisResults extends Results{
    private String mHardcoat;
    private int mAverageThickness;
    private int mAverageHaze;
    private String mDelamTest;

    public String getHardcoat() {
        return mHardcoat;
    }

    public void setHardcoat(String hardcoat) {
        mHardcoat = hardcoat;
    }

    public int getAverageThickness() {
        return mAverageThickness;
    }

    public void setAverageThickness(int averageThickness) {
        mAverageThickness = averageThickness;
    }

    public int getAverageHaze() {
        return mAverageHaze;
    }

    public void setAverageHaze(int averageHaze) {
        mAverageHaze = averageHaze;
    }

    public String getDelamTest() {
        return mDelamTest;
    }

    public void setDelamTest(String delamTest) {
        mDelamTest = delamTest;
    }
}

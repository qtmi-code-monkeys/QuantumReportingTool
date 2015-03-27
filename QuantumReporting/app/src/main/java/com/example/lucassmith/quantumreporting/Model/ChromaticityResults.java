package com.example.lucassmith.quantumreporting.Model;

/**
 * Created by lucassmith on 3/26/2015.
 */
public class ChromaticityResults extends Results{

    private int mL;
    private int mA;
    private int mB;
    private String mCurveSuccess;

    public String getCurveSuccess() {
        return mCurveSuccess;
    }

    public void setCurveSuccess(String curveSuccess) {
        mCurveSuccess = curveSuccess;
    }

    public int getL() {
        return mL;
    }

    public void setL(int l) {
        mL = l;
    }

    public int getA() {
        return mA;
    }

    public void setA(int a) {
        mA = a;
    }

    public int getB() {
        return mB;
    }

    public void setB(int b) {
        mB = b;
    }
}

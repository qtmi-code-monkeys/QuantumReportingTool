package com.example.lucassmith.quantumreporting.Model;

/**
 * Created by lucassmith on 3/27/2015.
 */
public class Report {

    private String mCustomerName;
    private String mCustomerMachine;
    private String mCustomerCoating;
    private String mTestType;

    private boolean mWca;
    private boolean mSwb;
    private boolean mBayer;
    private boolean mHcAnalysis;
    private boolean mChromaticity;
    private boolean mQuv;
    private boolean mQsun;

    private BayerResults mBayerResults;
    private ChromaticityResults mChromaticityResults;
    private HcAnalysisResults mHcAnalysisResults;
    private SwbResults mSwbXResults;
    private SwbResults mSwbDcResults;
    private SwbResults mSwbDiResults;
    private SwbResults mSwbCResults;
    private WcaResults mWcaResults;

    public Report(BayerResults bayerResults, ChromaticityResults chromaticityResults, HcAnalysisResults hcAnalysisResults,
                  SwbResults swbXResults, SwbResults swbDcResults, SwbResults swbDiResults, SwbResults swbCResults,
                  WcaResults wcaResults) {
        mBayerResults = bayerResults;
        mChromaticityResults = chromaticityResults;
        mHcAnalysisResults = hcAnalysisResults;
        mSwbXResults = swbXResults;
        mSwbDcResults = swbDcResults;
        mSwbDiResults = swbDiResults;
        mSwbCResults = swbCResults;
        mWcaResults = wcaResults;
    }

    public Report(String customerName, String customerMachine, String customerCoating, String testType){
        mCustomerName = customerName;
        mCustomerMachine = customerMachine;
        mCustomerCoating = customerCoating;
        mTestType = testType;
    }

    public String getCustomerName() {
        return mCustomerName;
    }

    public void setCustomerName(String customerName) {
        mCustomerName = customerName;
    }

    public String getCustomerMachine() {
        return mCustomerMachine;
    }

    public void setCustomerMachine(String customerMachine) {
        mCustomerMachine = customerMachine;
    }

    public String getCustomerCoating() {
        return mCustomerCoating;
    }

    public void setCustomerCoating(String customerCoating) {
        mCustomerCoating = customerCoating;
    }

    public String getTestType() {
        return mTestType;
    }

    public void setTestType(String testType) {
        mTestType = testType;
    }

    public boolean isWca() {
        return mWca;
    }

    public void setWca(boolean wca) {
        mWca = wca;
    }

    public boolean isSwb() {
        return mSwb;
    }

    public void setSwb(boolean swb) {
        mSwb = swb;
    }

    public boolean isBayer() {
        return mBayer;
    }

    public void setBayer(boolean bayer) {
        mBayer = bayer;
    }

    public boolean isHcAnalysis() {
        return mHcAnalysis;
    }

    public void setHcAnalysis(boolean hcAnalysis) {
        mHcAnalysis = hcAnalysis;
    }

    public boolean isChromaticity() {
        return mChromaticity;
    }

    public void setChromaticity(boolean chromaticity) {
        mChromaticity = chromaticity;
    }

    public boolean isQuv() {
        return mQuv;
    }

    public void setQuv(boolean quv) {
        mQuv = quv;
    }

    public boolean isQsun() {
        return mQsun;
    }

    public void setQsun(boolean qsun) {
        mQsun = qsun;
    }

    public BayerResults getBayerResults() {
        return mBayerResults;
    }

    public void setBayerResults(BayerResults bayerResults) {
        mBayerResults = bayerResults;
    }

    public ChromaticityResults getChromaticityResults() {
        return mChromaticityResults;
    }

    public void setChromaticityResults(ChromaticityResults chromaticityResults) {
        mChromaticityResults = chromaticityResults;
    }

    public HcAnalysisResults getHcAnalysisResults() {
        return mHcAnalysisResults;
    }

    public void setHcAnalysisResults(HcAnalysisResults hcAnalysisResults) {
        mHcAnalysisResults = hcAnalysisResults;
    }

    public SwbResults getSwbXResults() {
        return mSwbXResults;
    }

    public void setSwbXResults(SwbResults swbXResults) {
        mSwbXResults = swbXResults;
    }

    public SwbResults getSwbDcResults() {
        return mSwbDcResults;
    }

    public void setSwbDcResults(SwbResults swbDcResults) {
        mSwbDcResults = swbDcResults;
    }

    public SwbResults getSwbDiResults() {
        return mSwbDiResults;
    }

    public void setSwbDiResults(SwbResults swbDiResults) {
        mSwbDiResults = swbDiResults;
    }

    public SwbResults getSwbCResults() {
        return mSwbCResults;
    }

    public void setSwbCResults(SwbResults swbCResults) {
        mSwbCResults = swbCResults;
    }

    public WcaResults getWcaResults() {
        return mWcaResults;
    }

    public void setWcaResults(WcaResults wcaResults) {
        mWcaResults = wcaResults;
    }
}

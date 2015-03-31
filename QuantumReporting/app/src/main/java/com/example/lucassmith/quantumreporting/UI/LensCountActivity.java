package com.example.lucassmith.quantumreporting.UI;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;

import com.example.lucassmith.quantumreporting.R;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class LensCountActivity extends ActionBarActivity {

    private final static String TAG = LensCountActivity.class.getSimpleName();
    @InjectView(R.id.wcaCountSpinner) Spinner mWcaCountSpinner;
    @InjectView(R.id.swbCountSpinner) Spinner mSwbCountSpinner;
    @InjectView(R.id.hcCountSpinner) Spinner mHcCountSpinner;
    @InjectView(R.id.chromaticityCountSpinner) Spinner mChromaticityCountSpinner;
    @InjectView(R.id.bayerCountSpinner) Spinner mBayerCountSpinner;

    @InjectView(R.id.wcaHorizontalLayout) LinearLayout mWcaHorizontalLayout;
    @InjectView(R.id.swbHorizontalLayout) LinearLayout mSwbHorizontalLayout;
    @InjectView(R.id.hcHorizontalLayout) LinearLayout mHcHorizontalLayout;
    @InjectView(R.id.chromaticityHorizontalLayout) LinearLayout mChromaticityLinearLayout;
    @InjectView(R.id.bayerHorizontalLayout) LinearLayout mBayerHorizontalLayout;


    @InjectView(R.id.lensCountSubmitButton) Button mLensCountSubmitButton;
    @InjectView(R.id.lensCountBackButton) Button mLensCountBackButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lens_count);
        ButterKnife.inject(this);
        final Intent intent = getIntent();

        setUpCountSpinners(intent);

        final Spinner[] spinners = getSpinners();


        mLensCountSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int i=0; i<spinners.length; i++){
                    String spinnerName = spinners[i].getContentDescription().toString();

                    if(spinners[i].getVisibility()==View.VISIBLE){

                        int spinnerValue = Integer.parseInt(spinners[i].getSelectedItem().toString());
                        Log.i(TAG, spinnerName + " " + spinnerValue);
                        intent.putExtra(spinnerName + " count", spinnerValue);
                    }
                    else if (spinners[i].getVisibility()==View.INVISIBLE)
                    {
                        Log.i(TAG, spinnerName + " " + 0);
                        intent.putExtra(spinnerName + " count", 0);
                    }
                }

                loadTestResults(intent);
            }
        });

        mLensCountBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }



    private void loadTestResults(Intent intent) {

        intent.setClass(this, TestResultsActivity.class);

        startActivity(intent);
    }

    private Spinner[] getSpinners() {
        Spinner[] spinners = new Spinner[5];
        spinners[0] = mWcaCountSpinner;
        spinners[1] = mSwbCountSpinner;
        spinners[2] = mHcCountSpinner;
        spinners[3] = mChromaticityCountSpinner;
        spinners[4] = mBayerCountSpinner;

        return spinners;
    }

    private void setUpCountSpinners(Intent intent) {
        if(intent.getBooleanExtra(getString(R.string.wca_checkbox), false)){
            mWcaHorizontalLayout.setVisibility(View.VISIBLE);
        }
        else
        {
            mWcaCountSpinner.setVisibility(View.INVISIBLE);
        }
        if(intent.getBooleanExtra(getString(R.string.swb_checkbox), false)){
            mSwbHorizontalLayout.setVisibility(View.VISIBLE);
        }
        else
        {
            mSwbCountSpinner.setVisibility(View.INVISIBLE);
        }
        if(intent.getBooleanExtra(getString(R.string.hc_analysis_check),false)){
            mHcHorizontalLayout.setVisibility(View.VISIBLE);
        }
        else
        {
            mHcCountSpinner.setVisibility(View.INVISIBLE);
        }
        if(intent.getBooleanExtra(getString(R.string.chromaticity_check),false)){
            mChromaticityLinearLayout.setVisibility(View.VISIBLE);
        }
        else{
            mChromaticityCountSpinner.setVisibility(View.INVISIBLE);
        }
        if (intent.getBooleanExtra(getString(R.string.bayer_check), false)){
            mBayerHorizontalLayout.setVisibility(View.VISIBLE);
        }
        else
        {
            mBayerCountSpinner.setVisibility(View.INVISIBLE);
        }
    }


}

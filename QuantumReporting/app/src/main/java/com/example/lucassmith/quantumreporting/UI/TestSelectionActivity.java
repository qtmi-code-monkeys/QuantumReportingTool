package com.example.lucassmith.quantumreporting.UI;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import com.example.lucassmith.quantumreporting.R;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class TestSelectionActivity extends ActionBarActivity {

    public static final String TAG = TestSelectionActivity.class.getSimpleName();
    @InjectView(R.id.wcaCheck) CheckBox mWcaCheck;
    @InjectView(R.id.swbCheck) CheckBox mSwbCheck;
    @InjectView(R.id.hcAnalysisCheck) CheckBox mHcAnalysisCheck;
    @InjectView(R.id.chromaticityCheck) CheckBox mChromaticityCheck;
    @InjectView(R.id.bayerCheck) CheckBox mBayerCheck;

    @InjectView(R.id.testSelectionSubmitButton)  Button mTestSelectionSubmitButton;
    @InjectView(R.id.testSelectionBackButton) Button mTestSelectionBackButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_selection);
        ButterKnife.inject(this);

         final Intent intent = getIntent();

        //alertUserAboutError(intent.getExtras().toString());
        setupCheckBoxes(intent.getStringExtra("testType"));


        mTestSelectionSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Test selection submit button pressed");


                boolean[] tests = new boolean[5];
                tests[0] = mWcaCheck.isChecked();
                tests[1] = mSwbCheck.isChecked();
                tests[2] = mHcAnalysisCheck.isChecked();
                tests[3] = mChromaticityCheck.isChecked();
                tests[4] = mBayerCheck.isChecked();

                if(checkForCheckedBoxes(tests)) {
                    startResultsLog(tests[0], tests[1], tests[2], tests[3], tests[4], intent);
                }
                else{
                    alertUserAboutError("No tests were selected.");
                }

            }
        });

        mTestSelectionBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void setupCheckBoxes(String testType) {
        if(testType.equalsIgnoreCase(getString(R.string.pre_install))){
            mHcAnalysisCheck.setChecked(true);
            mSwbCheck.setChecked(true);
        }
        else if(testType.equalsIgnoreCase(getString(R.string.standard))){
            mSwbCheck.setChecked(true);
            mWcaCheck.setChecked(true);
            mHcAnalysisCheck.setChecked(true);
            mChromaticityCheck.setChecked(true);
        }

        else if(testType.equalsIgnoreCase(getString(R.string.non_standard))){
            mSwbCheck.setChecked(true);
            mWcaCheck.setChecked(true);
            mHcAnalysisCheck.setChecked(true);
            mChromaticityCheck.setChecked(true);
            mBayerCheck.setChecked(true);
        }
    }

    public boolean checkForCheckedBoxes(boolean[] tests) {



        Log.i(TAG, "In button check method");
        Log.i(TAG, tests.length+"");

        int counter = 0;
        for(int i = 0; i<tests.length; i++){
            if(tests[i]){
                counter++;
                Log.i(TAG, counter+"");
            }
        }


        if(counter != 0 ){
            return true;
        }
        else{
            return false;
        }

    }

    private void alertUserAboutError(String issue) {
        AlertDialogFragment dialog = new AlertDialogFragment(issue);
        dialog.show(getFragmentManager(), "error_dialog");
    }

    private void startResultsLog(boolean wca, boolean swb, boolean hc, boolean chromaticity, boolean bayer, Intent intent) {



        Log.i(TAG, wca + " " + swb + " " + hc + " " + chromaticity + " " + bayer);
        Log.i(TAG, intent.toString());
        intent.putExtra(getString(R.string.wca_checkbox), wca);
        intent.putExtra(getString(R.string.swb_checkbox),swb);
        intent.putExtra(getString(R.string.hc_analysis_check),hc);
        intent.putExtra(getString(R.string.chromaticity_check), chromaticity);
        intent.putExtra(getString(R.string.bayer_check), bayer);
        intent.setClass(this, LensCountActivity.class);

        startActivity(intent);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_test_selection, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

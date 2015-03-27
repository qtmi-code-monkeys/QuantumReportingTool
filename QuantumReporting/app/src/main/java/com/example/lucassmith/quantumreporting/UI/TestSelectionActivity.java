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

    Intent intent = getIntent();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_selection);
        ButterKnife.inject(this);

        mTestSelectionSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Test selection submit button pressed");
                startResultsLog(mWcaCheck.hasSelection(), mSwbCheck.hasSelection(), mHcAnalysisCheck.hasSelection(),
                        mChromaticityCheck.hasSelection(), mBayerCheck.hasSelection());
            }
        });
    }

    private void startResultsLog(boolean wca, boolean swb, boolean hc, boolean chromaticity, boolean bayer) {

        intent.putExtra("wca",wca);
        intent.putExtra("swb",swb);
        intent.putExtra("hc",hc);
        intent.putExtra("chromaticity", chromaticity);
        intent.putExtra("bayer", bayer);
        intent.setClass(this, TestResultsActivity.class);

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

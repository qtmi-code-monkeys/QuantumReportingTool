package com.example.lucassmith.quantumreporting.UI;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Spinner;

import com.example.lucassmith.quantumreporting.Model.Report;
import com.example.lucassmith.quantumreporting.R;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class NewReportActivity extends ActionBarActivity {

    private final static String TAG = NewReportActivity.class.getSimpleName();

    @InjectView(R.id.customerSelectSpinner)  Spinner mCustomerSelectSpinner;
    @InjectView(R.id.machineSelectSpinner) Spinner mMachineSelectSpinner;
    @InjectView(R.id.coatingSelectSpinner) Spinner mCoatingSelectSpinner;
    @InjectView(R.id.testTypeRadioGroup) RadioGroup mTestTypeRadioGroup;
    @InjectView(R.id.reportInfoSubmitButton) Button mReportInfoSubmitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_report);
        ButterKnife.inject(this);

        mReportInfoSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String customer = String.valueOf(mCustomerSelectSpinner.getSelectedItem());
                final String machine = String.valueOf(mMachineSelectSpinner.getSelectedItem());
                final String coating = String.valueOf(mCoatingSelectSpinner.getSelectedItem());
                final String testType = String.valueOf(mTestTypeRadioGroup.getCheckedRadioButtonId());

                Log.i(TAG, "Report info submit button pressed");
                submitInfo(customer, machine, coating, testType);
            }
        });
    }

    private void submitInfo(String customer, String machine, String coating, String testType) {
        if(testType == null ){
            /*
                Throw error saying that a test type must be selected
                Need to make fragment error class
             */
        }

        else {

            Intent intent = new Intent(this, TestSelectionActivity.class);
            intent.putExtra("customer", customer);
            intent.putExtra("machine", machine);
            intent.putExtra("coating", coating);
            intent.putExtra("testType", testType);
            startActivity(intent);
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_new_test, menu);
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

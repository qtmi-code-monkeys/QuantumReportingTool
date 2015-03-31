package com.example.lucassmith.quantumreporting.UI;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.lucassmith.quantumreporting.R;

import butterknife.ButterKnife;
import butterknife.InjectView;


public class MainActivity extends ActionBarActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @InjectView(R.id.newReportButton) Button mNewReportButton;
    @InjectView(R.id.viewReportsButton) Button mViewReportsButton;
    @InjectView(R.id.viewResultsButton) Button mViewResultsButton;
    @InjectView(R.id.viewCustomersButton) Button mViewCustomersButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);

        mNewReportButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "New report button tapped");
                Intent intent = new Intent(MainActivity.this, NewReportActivity.class);
                startActivity(intent);
            }
        });

        mViewReportsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "View Reports button tapped");

            }
        });

        mViewResultsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "View Results button tapped");

            }
        });

        mViewCustomersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "View Customers button tapped");
            }
        });

    }

    private void alertUserAboutError(String issue) {
        AlertDialogFragment dialog = new AlertDialogFragment(issue);
        dialog.show(getFragmentManager(), "error_dialog");
    }


}

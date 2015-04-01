package com.example.lucassmith.quantumreporting.UI;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import com.example.lucassmith.quantumreporting.Model.BayerResults;
import com.example.lucassmith.quantumreporting.Model.ChromaticityResults;
import com.example.lucassmith.quantumreporting.Model.HcAnalysisResults;
import com.example.lucassmith.quantumreporting.Model.Report;
import com.example.lucassmith.quantumreporting.Model.SwbResults;
import com.example.lucassmith.quantumreporting.Model.WcaResults;
import com.example.lucassmith.quantumreporting.R;

import butterknife.InjectView;

public class SwbResultsActivity extends ActionBarActivity {

    private Report mReport;

    @InjectView(R.id.resultsBackButton) Button mResultsBackButton;
    @InjectView(R.id.resultsSubmitButton) Button mResultsSubmitButton;
    //@InjectView(R.id.results)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_results);
    }



}

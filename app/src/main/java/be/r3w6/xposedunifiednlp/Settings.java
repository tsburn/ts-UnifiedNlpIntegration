
package be.r3w6.xposedunifiednlp;

import android.app.Activity;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.content.pm.PackageManager;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;


public class Settings extends Activity {

    private List<CheckStep> steps = new ArrayList<>();
    private TextView logTextView;
    private Activity me;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        me = this;

        logTextView = (TextView) findViewById(R.id.textView);

        final Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if ( ContextCompat.checkSelfPermission( button.getContext(), android.Manifest.permission.ACCESS_COARSE_LOCATION ) != PackageManager.PERMISSION_GRANTED ) {

                    ActivityCompat.requestPermissions(me, new String[] {  android.Manifest.permission.ACCESS_COARSE_LOCATION  },0 );
                }

                logTextView.setText("");
                startCheck();
            }
        });

        initCheckSteps();
    }

    private void initCheckSteps() {
        steps.add(new PackageCheckStep(this));
        steps.add(new NetworkLocationCheckStep(this));
        steps.add(new LocationCheckStep(this));
    }

    private void startCheck() {
        final Button button = (Button) findViewById(R.id.button);
        button.setEnabled(false);
        button.setText(R.string.button_check_settings_checking);
        AsyncTask<CheckStep, CheckStep, Boolean> checkWorkingTask = new AsyncTask<CheckStep, CheckStep, Boolean>() {
            @Override
            protected Boolean doInBackground(CheckStep... steps) {

                for (CheckStep step : steps) {
                    step.setState(CheckStep.StepState.RUNNING);
                    //publishProgress(step);
                    step.runStep();
                    publishProgress(step);
                    if(step.getState() == CheckStep.StepState.FAIL) {
                        return false;
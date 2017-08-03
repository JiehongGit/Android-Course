package com.example.tiancai.lifecycle;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class LogActivity extends Activity {

    private Button myButton;
    static final String LIFT_TAG="LogActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Log.v(LogActivity.LIFT_TAG, "FirstActivity --> onCreate");
        Button myButton = (Button)findViewById(R.id.myButton);
        myButton.setText("Activity");
        myButton.setOnClickListener(new ButtonOnClickListener());
    }
    class ButtonOnClickListener implements OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setClass(LogActivity.this,LogActivity2.class);
            LogActivity.this.startActivity(intent);
        }
    }
    protected void onDestroy(){
        Log.v(LogActivity.LIFT_TAG,"FirstAcvity --->onDestory");
        super.onDestroy();
    }

    protected void onPause() {
        Log.v(LogActivity.LIFT_TAG, "FirstAcvity --->onPause");
        super.onPause();
    }

    protected void onRestart() {
        Log.v(LogActivity.LIFT_TAG, "FirstAcvity --->onRestart");
        super.onRestart();
    }

    @Override
    protected void onResume() {
        Log.v(LogActivity.LIFT_TAG, "FirstAcvity --->onResume");
        super.onResume();
    }

    @Override
    protected void onStart() {
        Log.v(LogActivity.LIFT_TAG, "FirstAcvity --->onStart");
        super.onStart();
    }

    @Override
    protected void onStop() {
        Log.v(LogActivity.LIFT_TAG, "FirstAcvity --->onStop");
        super.onStop();
    }
}

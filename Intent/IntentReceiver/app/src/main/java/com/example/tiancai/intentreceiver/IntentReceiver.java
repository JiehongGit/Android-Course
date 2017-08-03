package com.example.tiancai.intentreceiver;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;

public class IntentReceiver extends Activity {

    private Button myButton = null;
    private final String nobody = "Who.care.the.name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myButton = (Button)findViewById(R.id.myButton);
        myButton.setOnClickListener(new MyButtonListener());
    }
    class MyButtonListener implements OnClickListener{
        public void onClick(View v){
            Intent intent = new Intent(nobody);
            intent.putExtra("testIntent","1111111111");
            sendBroadcast(intent);
        }
    }
}

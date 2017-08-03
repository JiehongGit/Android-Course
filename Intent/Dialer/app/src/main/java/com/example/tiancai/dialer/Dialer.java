package com.example.tiancai.dialer;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Dialer extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        final EditText phoneNum=(EditText)findViewById(R.id.phoneNum);
        final Button button=(Button)findViewById(R.id.Button01);
        button.setOnClickListener(new Button.OnClickListener(){
			public void onClick(View b){
				String call = phoneNum.getText().toString();
				if(PhoneNumberUtils.isGlobalPhoneNumber(call)){
					Intent I = new Intent(Intent.ACTION_CALL,Uri.parse("tell://"+call));
					startActivity(I);
				}
				else{
					Toast.makeText(Dialer.this,"您输入的号码不正确，请重新输入",Toast.LENGTH_LONG).show();
				}
			}
		});
	}
}

package com.example.tiancai.xmldesign;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class otherActivity extends Activity{
	private Intent intent;
	private Bundle bunde;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.other);

		Bundle bunde = this.getIntent().getExtras();

		String ans = bunde.getString("ans");

		String sexText = "";
		if (ans.equals("in")) {
			sexText = "正确";
			} else {
            sexText = "错误";
			}
		TextView tv1 = (TextView) findViewById(R.id.text1);
		tv1.setText("您选择的答案是：" + sexText);
		

		Button btn3_back = (Button) findViewById(R.id.button_back);
		btn3_back.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick(View v) {
                otherActivity.this.setResult(RESULT_OK, intent);
                otherActivity.this.finish();
			}

        });
	}
		
}
		




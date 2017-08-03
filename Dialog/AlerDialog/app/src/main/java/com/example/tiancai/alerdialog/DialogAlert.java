package com.example.tiancai.alerdialog;

import android.app.Activity;
import android.os.Bundle;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

public class DialogAlert extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		Builder dialog = new Builder(DialogAlert.this);
		dialog.setIcon(android.R.drawable.ic_dialog_info);
		dialog.setTitle("欢迎");// 可写在strings里面
		dialog.setMessage("欢迎使用本程序");
		dialog.setPositiveButton("肯定", new OnClickListener() {
			public void onClick(DialogInterface a0, int a1) {
				// 确定完成的事情
			}
		});
		dialog.setNegativeButton("否定", new OnClickListener() {
			public void onClick(DialogInterface a0, int a1) {
				// 确定否定的事情
			}
		});
		dialog.create();
		dialog.show();
	}
}

package com.next.bluesignin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ForgotPasswordActivity extends AppCompatActivity implements View.OnClickListener
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_forgot_password);

		Button bRecoveredPassword = findViewById(R.id.bRecoverPassword);
		TextView tvSignIn = findViewById(R.id.tvSignIn);

		bRecoveredPassword.setOnClickListener(this);
		tvSignIn.setOnClickListener(this);
	}

	@Override
	public void onClick(View view)
	{
		switch (view.getId())
		{
			case R.id.bRecoverPassword:
				Log.i(MainActivity.LOG_TAG, "Recover password clicked.");
				break;
			case R.id.tvSignIn:
				finish();
				break;
		}
	}
}

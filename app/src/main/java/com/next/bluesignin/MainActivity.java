package com.next.bluesignin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
	public static String LOG_TAG = "BlueSignIn";

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button bSignIn = findViewById(R.id.bSignIn);
		TextView tvForgotPassword = findViewById(R.id.tvForgotPassword);
		TextView tvSignUp = findViewById(R.id.tvSignUp);

		bSignIn.setOnClickListener(this);
		tvForgotPassword.setOnClickListener(this);
		tvSignUp.setOnClickListener(this);
	}

	@Override
	public void onClick(View view)
	{
		switch (view.getId())
		{
			case R.id.bSignIn:
				Log.i(LOG_TAG, "Sign in clicked.");
				break;
			case R.id.tvForgotPassword:
				startActivity(new Intent(MainActivity.this, ForgotPasswordActivity.class));
				break;
			case R.id.tvSignUp:
				startActivity(new Intent(MainActivity.this, SignUpActivity.class));
				break;
		}
	}
}

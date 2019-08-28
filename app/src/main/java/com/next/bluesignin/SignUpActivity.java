package com.next.bluesignin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sign_up);

		Button bSignUp = findViewById(R.id.bSignUp);
		TextView tvSignIn = findViewById(R.id.tvSignIn);

		bSignUp.setOnClickListener(this);
		tvSignIn.setOnClickListener(this);
	}

	@Override
	public void onClick(View view)
	{
		switch (view.getId())
		{
			case R.id.bSignUp:
				Log.i(MainActivity.LOG_TAG, "Sign up clicked.");
				break;
			case R.id.tvSignIn:
				finish();
				break;
		}
	}
}

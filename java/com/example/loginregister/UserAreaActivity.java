package com.example.loginregister;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class UserAreaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);

        final EditText etUsername = (EditText) findViewById(R.id.etUsername);
        final EditText etAge = (EditText) findViewById(R.id.etAge);
        final EditText etPasswordUa = (EditText) findViewById(R.id.etPasswordUa);

        final TextView tvWelcomeMsg = (TextView) findViewById(R.id.tvWelcomeMsg);
        final TextView tvNameMsg = (TextView) findViewById(R.id.tvNameMsg);

        Intent intent = getIntent();

        String name = intent.getStringExtra("name");
        String username = intent.getStringExtra("username");
        int age = intent.getIntExtra("age", -10);
        String password = intent.getStringExtra("password");

        assert  tvNameMsg != null;
        tvNameMsg.setText(name);
        tvNameMsg.setTextColor(getResources().getColor(R.color.colorNameMsg));
        assert tvWelcomeMsg != null;
        tvWelcomeMsg.setText("  Welcome to the app :)");
        tvWelcomeMsg.setTextColor(getResources().getColor(R.color.colorWelcomeMsg));


        assert etUsername != null;
        etUsername.setText(username);
        assert etAge != null;
        etAge.setText(age + "");
        assert etPasswordUa != null;
        etPasswordUa.setText(password);
    }

    public void bFinishApp (View view)
    {
        finish();
    }
}

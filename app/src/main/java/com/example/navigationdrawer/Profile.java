package com.example.navigationdrawer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Profile extends AppCompatActivity {


    TextView text;
    TextView password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        text = (TextView) findViewById(R.id.textView);
        password = (TextView) findViewById(R.id.textView3);

        String mail2 = getIntent().getStringExtra(home.PUTT_MAIL);
        String pass2 = getIntent().getStringExtra(home.PUTT_PASS);
        text.setText(mail2);
        password.setText(pass2);
    }


}
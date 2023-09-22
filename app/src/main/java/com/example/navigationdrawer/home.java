package com.example.navigationdrawer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class home extends AppCompatActivity {

    CardView cardView;
    public  static final String PUTT_MAIL = "com.HOME_MAIL";
    public static final String PUTT_PASS = "com.HOME_PASS";
    String mail1;
    String pass1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        cardView = findViewById(R.id.card_view1);
//        mail1 = getIntent().getStringExtra(MainActivity.PUT_MAIL);
//        pass1 = getIntent().getStringExtra(MainActivity.PUT_PASS);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(home.this,Profile.class);
                intent1.putExtra(PUTT_MAIL,  mail1);
                intent1.putExtra(PUTT_PASS,  pass1);
                startActivity(intent1);

            }
        });

    }

    private class getIntent extends Intent {
    }
}
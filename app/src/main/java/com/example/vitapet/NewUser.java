package com.example.vitapet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class NewUser extends AppCompatActivity {
    Button btn_Previous;
    ImageButton Facebook;
    ImageButton Twitter;
    ImageButton Google;
    Button NewUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_user);

        //BTN PREVIOUS
        btn_Previous = (Button) findViewById(R.id.nu_ic_previous);
        btn_Previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent prev = new Intent(NewUser.this, LandingActivity.class);
                startActivity(prev);
            }
        });

        Facebook=(ImageButton)findViewById(R.id.facebook);
        Facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent f=new Intent(NewUser.this, FacebookLogin.class);
                startActivity(f);
            }
        });

        Twitter=(ImageButton)findViewById(R.id.twitter);
        Twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent t=new Intent(NewUser.this, TwitterLogin.class);
                startActivity(t);
            }
        });

        Google=(ImageButton)findViewById(R.id.google);
        Google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent g=new Intent(NewUser.this, GoogleLogin.class);
                startActivity(g);
            }
        });

        NewUser=(Button)findViewById(R.id.sing);
        NewUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nu=new Intent(NewUser.this, User.class);
                startActivity(nu);
            }
        });
    }
}

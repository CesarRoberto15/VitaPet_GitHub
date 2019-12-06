package com.example.vitapet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.FaceDetector;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LandingActivity extends AppCompatActivity {
    
    Button Login;
    Button Sing_up;
    Button Facebook;
    Button Twitter;
    Button Google;
    Button Reportes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);

        //LOGIN
        Login =(Button)findViewById(R.id.btn_login);
        Login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent l=new Intent(LandingActivity.this, Login1.class);
                startActivity(l);
            }
        });

        Sing_up = (Button)findViewById(R.id.btn_sing_up);
        Sing_up.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent l1=new Intent(LandingActivity.this, NewUser.class);
                startActivity(l1);
            }
        });

        Facebook = (Button)findViewById(R.id.btn_facebook);
        Facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent f=new Intent(LandingActivity.this, FacebookLogin.class);
                startActivity(f);
            }
        });

        Twitter = (Button)findViewById(R.id.btn_twitter);
        Twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent t=new Intent(LandingActivity.this, TwitterLogin.class);
                startActivity(t);
            }
        });

        Google = (Button)findViewById(R.id.btn_google);
        Google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent g=new Intent(LandingActivity.this, GoogleLogin.class);
                startActivity(g);
            }
        });

        Reportes = (Button) findViewById(R.id.btn_report);
        Reportes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent r=new Intent(LandingActivity.this, Reports.class);
                startActivity(r);
            }
        });


    }
    /*public void reports(View view){
        Intent principalIntent= new Intent(this,Reports.class);
        startActivity(principalIntent);
    }*/



}

package com.example.vitapet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Login1 extends AppCompatActivity {

    Button btn_Previous;
    ImageButton Facebook;
    ImageButton Twitter;
    ImageButton Google;
    Button Login;
    TextView Recover;
    Button Submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login1);

        //BTN PREVIOUS
        btn_Previous = (Button) findViewById(R.id.lg_ic_previous);
        btn_Previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent prev = new Intent(Login1.this, LandingActivity.class);
                startActivity(prev);
            }
        });

        Facebook=(ImageButton)findViewById(R.id.facebook);
        Facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent f=new Intent(Login1.this, FacebookLogin.class);
                startActivity(f);
            }
        });

        Twitter=(ImageButton)findViewById(R.id.twitter);
        Twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent t=new Intent(Login1.this, TwitterLogin.class);
                startActivity(t);
            }
        });

        Google=(ImageButton)findViewById(R.id.google);
        Google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent g=new Intent(Login1.this, GoogleLogin.class);
                startActivity(g);
            }
        });

        Login=(Button)findViewById(R.id.login);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent l1=new Intent(Login1.this, User.class);
                startActivity(l1);
            }
        });

        Recover=(TextView) findViewById(R.id.lg_txt_pregunta);
        Recover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent r = new Intent(Login1.this, RecoverActivity.class);
                startActivity(r);
            }
        });

        Submit = (Button) findViewById(R.id.login);
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s = new Intent(Login1.this, DashboardActivity.class);
                startActivity(s);
            }
        });
    }
}

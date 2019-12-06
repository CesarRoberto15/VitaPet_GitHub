package com.example.vitapet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button login;
    Button sing_up;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login =(Button)findViewById(R.id.btn_login);
        login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent l=new Intent(MainActivity.this, Login1.class);
                startActivity(l);
            }
        });

        sing_up = (Button)findViewById(R.id.btn_sing_up);
        sing_up.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent l1=new Intent(MainActivity.this, NewUser.class);
                startActivity(l1);
            }
        });

    }
}

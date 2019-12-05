package com.example.vitapet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button Login;
    Button New;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Login=(Button)findViewById(R.id.login);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent l=new Intent(MainActivity.this, Login1.class);
                startActivity(l);
            }
        });

        New=(Button)findViewById(R.id.newaccount);
        New.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent l1=new Intent(MainActivity.this, NewUser.class);
                startActivity(l1);
            }
        });
    }
}

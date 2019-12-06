package com.example.vitapet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VerifyActivity extends AppCompatActivity {

    Button btn_Previous;
    Button btn_Verify;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);

        //BTN PREVIOUS
        btn_Previous = (Button) findViewById(R.id.vr_ic_previous);
        btn_Previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent prev = new Intent(VerifyActivity.this, RecoverActivity.class);
                startActivity(prev);
            }
        });
        //BTN VERIFY
        btn_Verify = (Button) findViewById(R.id.vr_btn_previous);
        btn_Verify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent prev = new Intent(VerifyActivity.this, Login1.class);
                startActivity(prev);
            }
        });
    }
}

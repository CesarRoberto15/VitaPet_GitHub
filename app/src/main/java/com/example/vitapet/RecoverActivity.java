package com.example.vitapet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RecoverActivity extends AppCompatActivity {

    Button btn_Previous;
    Button Submit;
    TextView Resend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recover);

        //BTN PREVIOUS
        btn_Previous = (Button) findViewById(R.id.rc_ic_previous);
        btn_Previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent prev = new Intent(RecoverActivity.this, Login1.class);
                startActivity(prev);
            }
        });

        Submit=(Button)findViewById(R.id.rc_btn_verify);
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s=new Intent(RecoverActivity.this, VerifyActivity.class);
                startActivity(s);
            }
        });

        Resend = (TextView) findViewById(R.id.rc_txt_resend);
        Resend.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent r = new Intent(RecoverActivity.this, Login1.class);
                startActivity(r);
            }
        });

    }
}

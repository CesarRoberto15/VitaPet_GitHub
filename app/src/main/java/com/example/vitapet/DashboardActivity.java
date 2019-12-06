package com.example.vitapet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DashboardActivity extends AppCompatActivity {

    TextView Usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

     Usuario = (TextView)findViewById(R.id.ds_lbl_user);
     Usuario.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent u = new Intent(DashboardActivity.this,User.class);
             startActivity(u);
         }
     });

    }
}

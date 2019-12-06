package com.example.vitapet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DashboardActivity extends AppCompatActivity {

    Button btn_News;
    Button btn_Reports;
    Button btn_Map;
    Button btn_Pets;
    Button btn_Perfil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        //BTN NOTICIAS


        //BTN REPORTES


        //BTN MAPA


        //BTN MASCOTAS


        //BOTON PERFIL
        btn_Perfil = (Button) findViewById(R.id.ds_btn_perfil);
        btn_Perfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(DashboardActivity.this, User.class);
                startActivity(p);
            }
        });

    }
}

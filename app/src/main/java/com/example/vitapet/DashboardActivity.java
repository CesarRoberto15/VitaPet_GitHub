package com.example.vitapet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DashboardActivity extends AppCompatActivity {

    Button btn_Previous;
    Button btn_News;
    Button btn_Reports;
    Button btn_Map;
    Button btn_Pets;
    Button btn_Perfil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        //BTN ATRAS
        btn_Previous = (Button) findViewById(R.id.ds_ic_previous);
        btn_Previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent prev = new Intent(DashboardActivity.this, Login1.class);
                startActivity(prev);
            }
        });
        //BTN NOTICIAS
        btn_News = (Button) findViewById(R.id.ds_btn_news);
        btn_News.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n = new Intent(DashboardActivity.this, LandingActivity.class);
                startActivity(n);
            }
        });
        //BTN REPORTES
        btn_Reports = (Button) findViewById(R.id.ds_btn_reports);
        btn_Reports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent r = new Intent(DashboardActivity.this, Reports.class);
                startActivity(r);
            }
        });
        //BTN MAPA
        btn_Map = (Button) findViewById(R.id.ds_btn_map);
        btn_Map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m = new Intent(DashboardActivity.this, LandingActivity.class);
                startActivity(m);
            }
        });
        //BTN MASCOTAS
        btn_Pets  =(Button) findViewById(R.id.ds_btn_pets);
        btn_Pets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent r = new Intent(DashboardActivity.this, LandingActivity.class);
                startActivity(r);
            }
        });
        //BOTON PERFIL
        btn_Perfil = (Button) findViewById(R.id.ds_btn_perfil);
        btn_Perfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pr = new Intent(DashboardActivity.this, LandingActivity.class);
                startActivity(pr);
            }
        });

    }

    public void enter_users(View view){
        Intent principalIntent= new Intent(this,User.class);
        startActivity(principalIntent);
    }

    public void enter_addPet(View view){
        Intent principalIntent= new Intent(this,AddPet.class);
        startActivity(principalIntent);
    }


}

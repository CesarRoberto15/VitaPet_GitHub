package com.example.vitapet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/*import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;*/

import java.util.ArrayList;


public class Reports extends AppCompatActivity {

    //PieChart pieChart;
    Button btn_Previous;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reports);
        Resources res = getResources();
        String[] arcano = res.getStringArray(R.array.veterinary);


        /*pieChart =(PieChart) findViewById(R.id.pieChart);

        pieChart.setUsePercentValues(true);
        pieChart.getDescription().setEnabled(false);
        pieChart.setExtraOffsets(5,10,5,5);
        pieChart.setDragDecelerationFrictionCoef(0.15f);

        pieChart.setDrawHoleEnabled(true);
        pieChart.setHoleColor(Color.WHITE);
        pieChart.setTransparentCircleRadius(61f);

        ArrayList <PieEntry> yValues= new ArrayList<>();

        yValues.add(new PieEntry(40,arcano[0]));
        yValues.add(new PieEntry(20,arcano[1]));
        yValues.add(new PieEntry(20,arcano[2]));
        yValues.add(new PieEntry(10,arcano[3]));
        yValues.add(new PieEntry(10,arcano[4]));


        PieDataSet dataSet= new PieDataSet(yValues,"Veterinary");
        dataSet.setSliceSpace(3f);
        dataSet.setSelectionShift(5f);
        dataSet.setColors(ColorTemplate.JOYFUL_COLORS);

        PieData data= new PieData((dataSet));
        data.setValueTextSize(10f);
        data.setValueTextColor(Color.YELLOW);

        pieChart.setData(data);*/

        //BTN PREVIOUS
        btn_Previous = (Button) findViewById(R.id.rp_ic_previous);
        btn_Previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent prev = new Intent(Reports.this, DashboardActivity.class);
                startActivity(prev);
            }
        });


    }


}
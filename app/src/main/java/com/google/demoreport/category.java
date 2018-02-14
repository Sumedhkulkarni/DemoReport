package com.google.demoreport;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class category extends AppCompatActivity {

    ImageView imv;

    Button btn_bar, btn_line, btn_pie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        imv = findViewById(R.id.img1);

        imv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btn_bar = findViewById(R.id.btn_barchart);
        btn_line = findViewById(R.id.btn_categoryLinechart);
        btn_pie = findViewById(R.id.btn_piechart);

        btn_bar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bar_category_intent = new Intent(category.this, Category_bar.class);
                startActivity(bar_category_intent);
            }
        });

        btn_line.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent line_category_intent = new Intent(category.this, Category_line.class);
                startActivity(line_category_intent);
            }
        });

        btn_pie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pie_category_intent = new Intent(category.this, Category_pie.class);
                startActivity(pie_category_intent);
            }
        });

    }
}
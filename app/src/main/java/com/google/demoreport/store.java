package com.google.demoreport;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class store extends AppCompatActivity {

    ImageView iv, imr;

    Button b1, b2, b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);

        iv = findViewById(R.id.img10);
        imr = findViewById(R.id.iv_refresh);

        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        imr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation rotateAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotation);
                imr.startAnimation(rotateAnimation);
            }
        });

        b1 = findViewById(R.id.btn_barchart);
        b2 = findViewById(R.id.btn_storeLinechart);
        b3 = findViewById(R.id.btn_piechart);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bar_store_intent = new Intent(store.this, Store_bar.class);
                startActivity(bar_store_intent);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent line_store_intent = new Intent(store.this, Store_line.class);
                startActivity(line_store_intent);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pie_store_intent = new Intent(store.this, Store_pie.class);
                startActivity(pie_store_intent);
            }
        });
    }
}

package com.google.demoreport;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button store, item, staff, time, payment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        store = findViewById(R.id.store);
        item = findViewById(R.id.item);
        staff = findViewById(R.id.staff);
        time  = findViewById(R.id.time);
        payment = findViewById(R.id.payment);

        store.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent storeintent = new Intent(MainActivity.this, store.class);
                startActivity(storeintent);

            }
        });

        item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent itemintent = new Intent(MainActivity.this, category.class);
                startActivity(itemintent);

            }
        });

        staff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent staffintent = new Intent(MainActivity.this, staff.class);
                startActivity(staffintent);

            }
        });

        time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent timeintent = new Intent(MainActivity.this, time.class);
                startActivity(timeintent);

            }
        });

        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent paymentintent = new Intent(MainActivity.this, payment.class);
                startActivity(paymentintent);

            }
        });
    }
}

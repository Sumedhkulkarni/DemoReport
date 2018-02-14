package com.google.demoreport;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class login extends AppCompatActivity {

    ImageView iv;
    Animation fromtop;
    EditText emailValidate, passwordValidate;
    String email, emailPattern, password;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn = findViewById(R.id.login);
        iv = findViewById(R.id.img);

        emailValidate = findViewById(R.id.eid);
        passwordValidate = findViewById(R.id.pwd);


        fromtop = AnimationUtils.loadAnimation(this, R.anim.from_top);

        iv.setAnimation(fromtop);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(login.this, MainActivity.class);

                emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

                email = emailValidate.getText().toString().trim();
                password = passwordValidate.getText().toString();

                if (email.matches(emailPattern) && password.length()>=8)
                    startActivity(intent);
                else
                {
                    Toast toast = Toast.makeText(getApplicationContext(),"Invalid email address or password", Toast.LENGTH_SHORT);
                    toast.setGravity( Gravity.CENTER_HORIZONTAL, 0, 250);
                    toast.show();
                }
//                startActivity(intent);
            }
        });
    }
}

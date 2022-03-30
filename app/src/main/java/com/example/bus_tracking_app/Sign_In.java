package com.example.bus_tracking_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Sign_In extends AppCompatActivity {

    TextView SingInToSignUp;
    Button SignIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign);

        SingInToSignUp = findViewById(R.id.SignInToSignUp);
        SignIn= findViewById(R.id.SignIn);

        SignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Home_Page.class);
                startActivity(intent);
            }
        });

        SingInToSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Sign_Up.class);
                startActivity(intent);
            }
        });
    }
    public void changeActivity(View view){

    }

}
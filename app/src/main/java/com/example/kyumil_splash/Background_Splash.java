package com.example.kyumil_splash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Background_Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_background__splash);

        //Mainactivity.class 자리에 다음에 넘어갈 액티비를 넣기

        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("state", "launch");
        finish();

    }
}

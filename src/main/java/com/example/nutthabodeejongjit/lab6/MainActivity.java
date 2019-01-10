package com.example.nutthabodeejongjit.lab6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void callweb(View view){
        Intent intent = new Intent(this, callWebView.class);
        startActivity(intent);
    }
    public void callphone(View view){
        Intent intent = new Intent(this,callPhone.class);
        startActivity(intent);
    }
    public void callmap(View view){
        Intent intent = new Intent(this,callMap.class);
        startActivity(intent);
    }
}

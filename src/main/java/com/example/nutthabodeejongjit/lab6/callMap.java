package com.example.nutthabodeejongjit.lab6;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class callMap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_map);
    }
    public void displayMap1(View view){
        String lat = "15.0017532";
        String lng = "102.116202";

        String strUri = "https://maps.google.com/maps?q=loc:" + lat + "," + lng + " (" + "ม.วงษ์" + ")";
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(strUri));
        intent.setClassName("com.google.android.apps.maps","com.google.android.maps.MapsActivity");
        startActivity(intent);
    }
}

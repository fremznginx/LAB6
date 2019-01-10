package com.example.nutthabodeejongjit.lab6;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class callPhone extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_phone);

        Button btnCall = findViewById(R.id.button2);
        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = findViewById(R.id.editText2);
                String txtPhone = tv.getText().toString();
                Intent itn = new Intent(Intent.ACTION_DIAL);
                itn.setData(Uri.parse("tel:" + txtPhone));
                startActivity(itn);
            }
        });
        Button btnCall2 = findViewById(R.id.button3);
        btnCall2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itn = new Intent(Intent.ACTION_DIAL);
                itn.setData(Uri.parse("tel:0652377716"));
                startActivity(itn);
            }
        });
    }
}

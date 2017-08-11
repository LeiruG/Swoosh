package com.gelves.uriel.swooshapplicationprogram;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class First extends AppCompatActivity {
Button start;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        start = (Button)findViewById(R.id.welcomestart);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundColor(Color.parseColor("#bfe4c25c"));
                Intent i = new Intent(First.this,Final.class);
                startActivity(i);
            }
        });
    }
}

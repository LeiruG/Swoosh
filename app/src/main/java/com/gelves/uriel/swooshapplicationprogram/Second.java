package com.gelves.uriel.swooshapplicationprogram;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Second extends AppCompatActivity {
Button fin,bgn,bal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        fin = (Button)findViewById(R.id.finbtn);
        bal = (Button)findViewById(R.id.ballerbtn);
        bgn = (Button)findViewById(R.id.beginbtn);






        bal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bgn.setBackgroundColor(Color.parseColor("#b4000000"));
                bal.setBackgroundColor(Color.parseColor("#bfe4c25c"));
                fin.setOnClickListener(new View.OnClickListener(){
                    @Override public void onClick(View v) {
                        v.setBackgroundColor(Color.parseColor("#bfe4c25c"));
                        Intent i = new Intent(Second.this,Final.class);
                        i.putExtra("result",bal.getText().toString());
                        startActivity(i);

                    }
                });
            }
        });

        bgn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bal.setBackgroundColor(Color.parseColor("#b4000000"));
                bgn.setBackgroundColor(Color.parseColor("#bfe4c25c"));
                fin.setOnClickListener(new View.OnClickListener(){
                    @Override public void onClick(View v) {
                        v.setBackgroundColor(Color.parseColor("#bfe4c25c"));
                        Intent i = new Intent(Second.this,Final.class);
                        i.putExtra("result",bgn.getText().toString());

                        startActivity(i);

                    }
                });
            }
        });




    }
}

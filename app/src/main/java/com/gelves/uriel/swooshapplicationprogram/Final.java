package com.gelves.uriel.swooshapplicationprogram;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Final extends AppCompatActivity {
Button men,women,coed,nxt;TextView resu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        men = (Button)findViewById(R.id.menbtn);
        women = (Button)findViewById(R.id.womenbtn);
        coed = (Button)findViewById(R.id.coedbtn);
        nxt = (Button)findViewById(R.id.nxtbtn);


        resu = (TextView)findViewById(R.id.help);

        Intent intresu = getIntent();

        String result = intresu.getStringExtra("result");





        resu.setText(result);

        nxt.setEnabled(false);
        nxt.setTextColor(Color.parseColor("#b4000000"));

        men.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                men.setBackgroundColor(Color.parseColor("#bfe4c25c"));
                women.setBackgroundColor(Color.parseColor("#b4000000"));
                coed.setBackgroundColor(Color.parseColor("#b4000000"));
                nxt.setEnabled(true);
                nxt.setTextColor(Color.parseColor("#b4ffffff"));
                nxt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(Color.parseColor("#bfe4c25c"));
                        Intent i = new Intent(Final.this,Second.class);

                        startActivity(i);

                    }
                });
            }
        });

        women.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                men.setBackgroundColor(Color.parseColor("#b4000000"));
                women.setBackgroundColor(Color.parseColor("#bfe4c25c"));
                coed.setBackgroundColor(Color.parseColor("#b4000000"));
                nxt.setEnabled(true);
                nxt.setTextColor(Color.parseColor("#b4ffffff"));
                nxt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(Color.parseColor("#bfe4c25c"));
                        Intent i = new Intent(Final.this,Second.class);

                        startActivity(i);

                    }
                });
            }
        });

        coed.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                men.setBackgroundColor(Color.parseColor("#b4000000"));
                women.setBackgroundColor(Color.parseColor("#b4000000"));
                coed.setBackgroundColor(Color.parseColor("#bfe4c25c"));
                nxt.setEnabled(true);
                nxt.setTextColor(Color.parseColor("#b4ffffff"));
                nxt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(Color.parseColor("#bfe4c25c"));
                        Intent i = new Intent(Final.this,Second.class);

                        startActivity(i);

                    }
                });
            }
        });



        resu.setVisibility(View.VISIBLE);

    }
}

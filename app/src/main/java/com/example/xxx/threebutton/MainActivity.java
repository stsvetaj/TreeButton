package com.example.xxx.threebutton;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button circle = (Button) findViewById(R.id.circle);
        circle.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), Circle.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button rectangle = (Button) findViewById(R.id.rectangle);
        rectangle.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), Rectangle.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button line = (Button) findViewById(R.id.line);
        line.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), Line.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }
}
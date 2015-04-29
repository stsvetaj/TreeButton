package com.example.xxx.threebutton;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;


public class Rectangle extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new DrawRectangle(this));

    }


    public static class DrawRectangle extends View {


        protected DrawRectangle(Context context) {
            super(context);

        }

        private Paint paint = new Paint();


        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            canvas.drawColor(Color.YELLOW);

            paint.setColor(Color.BLACK);
            paint.setStrokeWidth(3);
            float leftx = 205;
            float topy = 500;
            float rightx = 400;
            float bottomy = 700;
            canvas.drawRect(leftx, topy, rightx, bottomy, paint);

        }
    }
}
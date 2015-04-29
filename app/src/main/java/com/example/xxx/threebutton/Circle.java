package com.example.xxx.threebutton;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

public class Circle extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new DrawCircle(this));

    }


    public static class DrawCircle extends View {


        protected DrawCircle(Context context) {
            super(context);

        }

        private Paint paint = new Paint();

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            canvas.drawColor(Color.YELLOW);

            paint.setAntiAlias(true);
            paint.setColor(Color.RED);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(4.5f);
            canvas.drawCircle(50, 50, 30, paint);

        }
    }
}
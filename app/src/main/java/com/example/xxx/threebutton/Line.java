package com.example.xxx.threebutton;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;


public class Line extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new DrawLine(this));

    }


    public static class DrawLine extends View {


        protected DrawLine(Context context) {
            super(context);

        }

        private Paint paint = new Paint();


        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            canvas.drawColor(Color.YELLOW);

            final int x1 = 200;
            final int y1 = 200;
            final int x2 = 100;
            final int y2 = 100;

            canvas.drawLine(x1, y1, x2, y2, paint);

        }
    }
}

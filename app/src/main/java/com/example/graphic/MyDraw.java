package com.example.graphic;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

public class MyDraw extends View {
    public MyDraw(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);

        paint.setColor(Color.WHITE);
        canvas.drawPaint(paint);

        paint.setColor(Color.YELLOW);
        canvas.drawCircle(0, 0, 400, paint);

        paint.setColor(Color.rgb(0, 128, 0));
        canvas.drawRect(0, getHeight() - 200, getWidth(), getHeight(), paint);
        paint.setColor(Color.BLACK);
        canvas.drawLine(0, getHeight() - 200, getWidth(), getHeight() - 200, paint);

        paint.setColor(Color.rgb(117, 45, 0));
        canvas.drawRect(getWidth() / 2 - 400, getHeight() - 900, getWidth() / 2 + 400, getHeight() - 100, paint);

        paint.setStrokeWidth(4);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setAntiAlias(true);
        Path path = new Path();
        path.moveTo(getWidth() / 2, getHeight() - 1300);
        path.lineTo(getWidth() / 2 + 400, getHeight() - 900);
        path.lineTo(getWidth() / 2 - 400, getHeight() - 900);
        path.close();
        canvas.drawPath(path, paint);

        paint.setColor(Color.BLUE);
        paint.setStrokeWidth(5);
        for (int i = getWidth() / 2 - 340; i < getWidth() / 2 - 50; i += 10) {
            canvas.drawLine(i, getHeight() - 700, i, getHeight() - 300, paint);
        }
        for (int i = getHeight() - 690; i < getHeight() - 300; i += 10) {
            canvas.drawLine(getWidth() / 2 - 350, i, getWidth() / 2 - 50, i, paint);
        }

        paint.setColor(Color.WHITE);
        paint.setStrokeWidth(5);
        int startX = getWidth() / 2 + 50, startY = getHeight() - 110, stopX = getWidth() / 2 + 60, stopY = getHeight() - 100;
        while (startX != stopX || startY != stopY) {
            canvas.drawLine(startX, startY, stopX, stopY, paint);

            if (stopX < getWidth() / 2 + 350) stopX += 10;
            else stopY -= 10;

            if (startY > getHeight() - 700) startY -= 10;
            else startX += 10;
        }

        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5);
        canvas.drawLine(getWidth() / 2, getHeight() - 950, getWidth() / 2, getHeight() - 1150, paint);
        canvas.drawLine(getWidth() / 2 - 100, getHeight() - 1050, getWidth() / 2 + 100, getHeight() - 1050, paint);
        for (int i = 0; i < 100; i += 10) {
            canvas.drawCircle(getWidth() / 2, getHeight() - 1050, i, paint);
        }


        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(10);
        canvas.drawLine(getWidth() / 2 - 400, getHeight() - 100, getWidth() / 2 + 400, getHeight() - 100, paint);
        canvas.drawLine(getWidth() / 2 - 400, getHeight() - 900, getWidth() / 2 - 400, getHeight() - 100, paint);
        canvas.drawLine(getWidth() / 2 - 400, getHeight() - 900, getWidth() / 2, getHeight() - 1300, paint);
        canvas.drawLine(getWidth() / 2 - 400, getHeight() - 900, getWidth() / 2 + 400, getHeight() - 900, paint);
        canvas.drawLine(getWidth() / 2 + 400, getHeight() - 900, getWidth() / 2, getHeight() - 1300, paint);
        canvas.drawLine(getWidth() / 2 + 400, getHeight() - 900, getWidth() / 2 + 400, getHeight() - 100, paint);

        canvas.drawLine(getWidth() / 2 + 50, getHeight() - 700, getWidth() / 2 + 50, getHeight() - 100, paint);
        canvas.drawLine(getWidth() / 2 + 50, getHeight() - 700, getWidth() / 2 + 350, getHeight() - 700, paint);
        canvas.drawLine(getWidth() / 2 + 350, getHeight() - 700, getWidth() / 2 + 350, getHeight() - 100, paint);

        canvas.drawLine(getWidth() / 2 - 50, getHeight() - 700, getWidth() / 2 - 50, getHeight() - 300, paint);
        canvas.drawLine(getWidth() / 2 - 350, getHeight() - 300, getWidth() / 2 - 50, getHeight() - 300, paint);
        canvas.drawLine(getWidth() / 2 - 350, getHeight() - 700, getWidth() / 2 - 50, getHeight() - 700, paint);
        canvas.drawLine(getWidth() / 2 - 350, getHeight() - 700, getWidth() / 2 - 350, getHeight() - 300, paint);

        paint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(getWidth() / 2, getHeight() - 1050, 100, paint);
    }
}
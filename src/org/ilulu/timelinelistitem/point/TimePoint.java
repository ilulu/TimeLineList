package org.ilulu.timelinelistitem.point;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import org.ilulu.timelinelistitem.R;

/**
 * Created by ilulu on 14-10-31.
 */
public class TimePoint extends View {

    public int colorId = R.color.red_point_color;

    public TimePoint(Context context) {
        super(context);
    }

    public TimePoint(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TimePoint(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onDraw(Canvas canvas) {

        float height = getHeight();
        float width = getWidth();
        super.onDraw(canvas);

        float x = (float) (getWidth() * 0.5);
//        float y = (float)(getHeight()*0.2);
        float y = 30;
        float radius = (float) (getWidth() - getWidth() * 0.5);


        Paint paintOutter = new Paint();
        paintOutter.setAntiAlias(true);
        paintOutter.setColor(getResources().getColor(colorId));
        paintOutter.setAlpha(100);
        radius = radius * 0.9f;//留20的空白
        canvas.drawCircle(x, y, radius, paintOutter);//先画外圈的原型

        //内圈圆
        Paint paintInner = new Paint(Paint.ANTI_ALIAS_FLAG);
        paintInner.setColor(getResources().getColor(colorId));
        canvas.drawCircle(x, y, radius * 0.75f, paintInner);//再画内圈的园



        //上线的连线
        float topPoint = y - radius;
        float bottomPoint = y + radius;

        Paint topLinePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        topLinePaint.setStrokeWidth(10.0f);
        topLinePaint.setColor(Color.LTGRAY);
        canvas.drawLine(x, topPoint, x, 0f, topLinePaint);
        Paint bottomLinePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        bottomLinePaint.setStrokeWidth(10.0f);
        bottomLinePaint.setColor(Color.LTGRAY);
        canvas.drawLine(x, bottomPoint, x, height, bottomLinePaint);
    }
}

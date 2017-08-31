package baway.com.customtextview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by 贾秀坤 on 2017/8/31.
 */

public class MyTextView extends View {
    private String text;
    private int textColor;
    private float textSize;

    public MyTextView(Context context) {
        super(context);
        initAttrs(null);
    }

    public MyTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initAttrs(attrs);
    }

    private void initAttrs(AttributeSet attrs) {
        TypedArray typedArray = getContext().obtainStyledAttributes(attrs, R.styleable.MyTextView);
        text = typedArray.getString(R.styleable.MyTextView_text);
        textSize = typedArray.getDimension(R.styleable.MyTextView_textSize, 20);
        textColor = typedArray.getColor(R.styleable.MyTextView_textColor, 0xffff00);
    }

    //画 canvas画布
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //初始化画笔
        Paint paint = new Paint();
        //抗锯齿
        paint.setAntiAlias(true);
        paint.setColor(textColor);
        paint.setTextSize(textSize);
        canvas.drawText(text, 100, 100, paint);
    }
}

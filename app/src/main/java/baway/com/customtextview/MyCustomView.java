package baway.com.customtextview;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by 贾秀坤 on 2017/8/31.
 */

public class MyCustomView extends LinearLayout implements View.OnClickListener {
    private TextView tilte;
    private ImageView icon;

    public MyCustomView(Context context) {
        super(context);
    }

    public MyCustomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initView(context);
    }

    private void initView(Context context) {
        inflate(context, R.layout.custom_item, this);
        tilte = (TextView) findViewById(R.id.title);
        icon = (ImageView) findViewById(R.id.icon);
        icon.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.equals(icon)) {
            Toast.makeText(getContext(), "我在自定义view中被点击了", Toast.LENGTH_LONG).show();
        }
    }
}

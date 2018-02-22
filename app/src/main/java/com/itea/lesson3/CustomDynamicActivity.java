package com.itea.lesson3;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/**
 * Created by skozigon on 21.02.2018.
 */

public class CustomDynamicActivity extends LinearLayout {

    public CustomDynamicActivity(Context context) {
        super(context);

        LinearLayout rActivity = new LinearLayout(context);
        LayoutParams lLayoutParams = new LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        Button button = new Button(context);
        button.setText("Hi");
        Button button2 = new Button(context);
        button.setText("By");

        rActivity.setGravity(Gravity.BOTTOM);

        rActivity.addView(button);
        rActivity.addView(button2);
    }
}

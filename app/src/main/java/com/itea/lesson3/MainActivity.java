package com.itea.lesson3;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import android.widget.TextView;

import static android.text.InputType.TYPE_TEXT_FLAG_CAP_CHARACTERS;

public class MainActivity extends AppCompatActivity {
    public LinearLayout rActivity;
    public LinearLayout layout1;
    public LinearLayout layout2;
    public LinearLayout layout3;
    public LinearLayout layout4;
    public LinearLayout layout5;
    public Button tButton;
    public Button sUpButton;
    public Button gButton;
    public Button fButton;
    public EditText loginText;
    public EditText passText;
    public Button loginButton;
    public TextView tPass;
    public TextView sText;
    public TextView helloText;
    public View view1;
    public View view2;
    public TextView tOr;


    @Override
    public void setTheme(int resid) {
        super.setTheme(android.support.v7.appcompat.R.style.Theme_AppCompat_NoActionBar);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        rActivity = new LinearLayout(this);
        LinearLayout.LayoutParams lLayoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        rActivity.setOrientation(LinearLayout.VERTICAL);
        rActivity.setBackgroundColor(0x00303030);
        rActivity.setGravity(Gravity.BOTTOM);
        rActivity.setPadding(25, 25, 25, 25);

        layout1 = new LinearLayout(this);
        LinearLayout.LayoutParams lLayoutParams1 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        layout1.setOrientation(LinearLayout.HORIZONTAL);

        LinearLayout.LayoutParams buttonParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, 0.2f);
        tButton = new Button(this);
        tButton.setBackgroundColor(Color.alpha(0));
        tButton.setText("Terms");
        tButton.setInputType(TYPE_TEXT_FLAG_CAP_CHARACTERS);

        sUpButton = new Button(this);
        sUpButton.setBackgroundColor(Color.alpha(0));
        sUpButton.setText("Sign up");
        sUpButton.setInputType(TYPE_TEXT_FLAG_CAP_CHARACTERS);

        layout1.addView(sUpButton, buttonParams);
        layout1.addView(tButton, buttonParams);

        layout2 = new LinearLayout(this);
        LinearLayout.LayoutParams lLayoutParams2 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        layout2.setOrientation(LinearLayout.VERTICAL);
        layout2.setPadding(0, 0, 0, 100);

        loginText = new EditText(this);
        loginText.setHint("Login");
        loginText.setHintTextColor(Color.GRAY);
        loginText.setEms(10);
        loginText.setInputType(InputType.TYPE_TEXT_VARIATION_EMAIL_SUBJECT);

        passText = new EditText(this);
        passText.setHint("Password");
        passText.setHintTextColor(Color.GRAY);
        passText.setEms(10);
        passText.setInputType(InputType.TYPE_CLASS_NUMBER);

        loginButton = new Button(this);
        loginButton.setBackgroundColor(Color.GREEN);
        loginButton.setText("Log in");
        loginButton.setInputType(TYPE_TEXT_FLAG_CAP_CHARACTERS);

        tPass = new TextView(this);
        tPass.setTextColor(Color.GRAY);
        tPass.setText("Forgot your password?");
        tPass.setInputType(TYPE_TEXT_FLAG_CAP_CHARACTERS);
        tPass.setGravity(TextView.TEXT_ALIGNMENT_GRAVITY);
        tPass.setTextSize(15);
        tPass.setEms(5);
        tPass.setPadding(0, 18, 0, 0);

        layout2.addView(loginText);
        layout2.addView(passText);
        layout2.addView(loginButton);
        layout2.addView(tPass);

        layout3 = new LinearLayout(this);
        LinearLayout.LayoutParams lLayoutParams3 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        layout3.setOrientation(LinearLayout.HORIZONTAL);
        layout3.setPadding(0, 50, 0, 80);

        view1 = new View(this);
        view2 = new View(this);
        LinearLayout.LayoutParams vPar = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 5);
        vPar.weight = 3;
        vPar.gravity = Gravity.CENTER_VERTICAL;

        view1.setLayoutParams(vPar);
        view1.setBackgroundColor(Color.GRAY);
        view1.setLayoutParams(vPar);

        view2.setLayoutParams(vPar);
        view2.setBackgroundColor(Color.GRAY);
        view2.setLayoutParams(vPar);

        tOr = new TextView(this);
        tOr.setText(" OR ");
        tOr.setGravity(Gravity.CENTER_VERTICAL);

        layout3.addView(view1);
        layout3.addView(tOr);
        layout3.addView(view2);

        layout4 = new LinearLayout(this);
        LinearLayout.LayoutParams lLayoutParams4 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        layout4.setOrientation(LinearLayout.HORIZONTAL);
        layout4.setPadding(0, 0, 0, 20);

        LinearLayout.LayoutParams buttonNParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, 2.0f);
        gButton = new Button(this);
        gButton.setBackgroundColor(Color.parseColor("#e13719"));
        gButton.setText("Google");
        gButton.setInputType(TYPE_TEXT_FLAG_CAP_CHARACTERS);
        gButton.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.google_end, 0, 0, 0);

        fButton = new Button(this);
        fButton.setBackgroundColor(Color.parseColor("#3c5a99"));
        fButton.setText("Facebook");
        fButton.setInputType(TYPE_TEXT_FLAG_CAP_CHARACTERS);
        fButton.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.facebook, 0, 0, 0);

        layout4.addView(gButton, buttonNParams);
        layout4.addView(fButton, buttonNParams);

        layout5 = new LinearLayout(this);
        LinearLayout.LayoutParams lLayoutParams5 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        layout5.setOrientation(LinearLayout.VERTICAL);
        layout5.setPadding(0, 0, 0, 20);

        sText = new TextView(this);
        helloText = new TextView(this);

        sText.setText("String in using");
        sText.setTextSize(15);
        sText.setInputType(TYPE_TEXT_FLAG_CAP_CHARACTERS);

        helloText.setText("Hello again");
        helloText.setTextSize(25);
        helloText.setInputType(TYPE_TEXT_FLAG_CAP_CHARACTERS);
        helloText.setGravity(Gravity.CENTER_HORIZONTAL);
        helloText.setPadding(0, 0, 0, 50);

        layout5.addView(helloText);
        layout5.addView(sText);

        rActivity.addView(layout5, lLayoutParams5);
        rActivity.addView(layout4, lLayoutParams4);
        rActivity.addView(layout3, lLayoutParams3);
        rActivity.addView(layout2, lLayoutParams2);
        rActivity.addView(layout1,lLayoutParams1 );

        setContentView(rActivity, lLayoutParams);
    }
}

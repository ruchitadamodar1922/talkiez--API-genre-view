package com.example.talkiezz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Animation name1;
    private TextView talkiez;
    private static int var1=2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        talkiez=(TextView)findViewById(R.id.talkiezz);
        name1= AnimationUtils.loadAnimation(this,R.anim.top_anim);

        talkiez.setAnimation(name1);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(MainActivity.this,dashboardActivity.class);
                startActivity(intent);
                finish();
            }
        },var1);


    }
}
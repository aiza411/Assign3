package com.smd.elderease;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Splash_Screen extends AppCompatActivity {

    private static int timer=5000;
    Animation logo_anim,elder_anim,ease_anim;
    ImageView logo;
    TextView ElderText,EaseText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);
        logo=findViewById(R.id.logo);
        ElderText=findViewById(R.id.elder_txt);
        EaseText=findViewById(R.id.ease_txt);

        logo_anim= AnimationUtils.loadAnimation(this,R.anim.logo_animation);
        elder_anim= AnimationUtils.loadAnimation(this,R.anim.elder_animation);
        ease_anim= AnimationUtils.loadAnimation(this,R.anim.ease_animation);

        logo.setAnimation(logo_anim);
        ElderText.setAnimation(elder_anim);
        EaseText.setAnimation(ease_anim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run()
            {
                Intent intent=new Intent(Splash_Screen.this,Signup.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                finish();
            }
        },timer);
    }
}
package com.furkaneren.catch_the_kenny;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Firstscreen extends AppCompatActivity {
    TextView scoretext;
    Handler handler;
    Runnable runnable;
    TextView textView;
    ImageView imageView12;
    ImageView imageView13;
    ImageView imageView14;
    ImageView imageView15;
    ImageView imageView16;
    ImageView imageView17;
    ImageView imageView18;
    ImageView imageView19;
    ImageView imageView20;
    ImageView imageView21;
    ImageView imageView22;
    ImageView imageView23;
    ImageView[] imagearray;

    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstscreen);
    }

    public void start(View view){
        Intent ıntent=new Intent(Firstscreen.this,Dificult.class);
        startActivity(ıntent);
    }
}
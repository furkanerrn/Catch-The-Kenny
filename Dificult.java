package com.furkaneren.catch_the_kenny;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Dificult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dificult);
    }

    public void easy(View view){
        Intent ıntent=new Intent(Dificult.this,MainActivity.class);
        startActivity(ıntent);
    }
    public void medium(View view){
        Intent ıntent=new Intent(Dificult.this,Medium.class);
        startActivity(ıntent);
    }
    public void hard(View view){
        Intent ıntent=new Intent(Dificult.this,Hard.class);
        startActivity(ıntent);
    }

}
package com.furkaneren.catch_the_kenny;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Hard extends AppCompatActivity {
    TextView scoretext4; //değişiklik
    Handler handlerrr; //değişiklik
    Runnable runnableee; //değişiklik
    TextView textView4; //değişiklik
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
        setContentView(R.layout.activity_hard);
        scoretext4=(TextView) findViewById(R.id.scoretext4);
        textView4=(TextView)findViewById(R.id.textView4);
        imageView12=(ImageView)findViewById(R.id.imageView12);
        imageView13=(ImageView)findViewById(R.id.imageView13);
        imageView14=(ImageView)findViewById(R.id.imageView14);
        imageView15=(ImageView)findViewById(R.id.imageView15);
        imageView16=(ImageView)findViewById(R.id.imageView16);
        imageView17=(ImageView)findViewById(R.id.imageView17);
        imageView18=(ImageView)findViewById(R.id.imageView18);
        imageView19=(ImageView)findViewById(R.id.imageView19);
        imageView20=(ImageView)findViewById(R.id.imageView20);
        imageView21=(ImageView)findViewById(R.id.imageView21);
        imageView22=(ImageView)findViewById(R.id.imageView22);
        imageView23=(ImageView)findViewById(R.id.imageView23);
        imagearray=new ImageView[]{imageView12,imageView13,imageView14,imageView15,imageView16,imageView17,imageView18,imageView19,imageView20,imageView21,imageView22,imageView23};
        hideimages();


        new CountDownTimer(16000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {

                textView4.setText("Time: "+millisUntilFinished/1000 );
            }

            @Override
            public void onFinish() {

                for (ImageView imageView:imagearray) {
                    imageView.setVisibility(View.INVISIBLE);
                }
                textView4.setText("Time out");
                scoretext4.setText("                         --");
                handlerrr.removeCallbacks(runnableee);


                //ALERT DİALOG KISMI
                AlertDialog.Builder alert=new AlertDialog.Builder(Hard.this);
                alert.setTitle("Restart");
                alert.setMessage("Do you want to restart ? \n Your Score: "+score); //**

                alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //restart : güncel aktivite biter ve program yeniden başlar
                        Intent intent=getIntent();
                        finish();
                        startActivity(intent);
                    }
                });

                alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(Hard.this,"Game over",Toast.LENGTH_LONG).show();
                        Intent ıntent=new Intent(Hard.this,Firstscreen.class);
                        startActivity(ıntent);
                    }
                });

                alert.setIcon(R.drawable.kennnny);
                alert.show();
                //ALERT DİALOG KISMI
            }
        }.start();
    }

    public void hideimages(){
        handlerrr=new Handler();
        runnableee=new Runnable() {
            @Override
            public void run() {
                for (ImageView imageView:imagearray){  //BAŞTA HİÇBİR İMAGEVİEW GÖRÜNMEZ
                    imageView.setVisibility(View.INVISIBLE);

                }
                Random random=new Random(); // İMAGEVİEW LERİN GÖRÜNÜMÜ KISMI
                int i=random.nextInt(12);
                imagearray[i].setVisibility(View.VISIBLE);
                handlerrr.postDelayed(this,150);

            }
        };
        handlerrr.post(runnableee);


    }
    public void increaseScore(View view){
        score++;

        scoretext4.setText("Score: "+score);
    }

}

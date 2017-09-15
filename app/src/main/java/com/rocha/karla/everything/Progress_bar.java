package com.rocha.karla.everything;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class Progress_bar extends AppCompatActivity {

    Button btn;
    ProgressBar pgBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);

        btn = (Button)findViewById(R.id.button);
        pgBar = (ProgressBar)findViewById(R.id.idProgressBar);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBtnClick();
            }
        });
    }

    public void onBtnClick(){
        Thread thread= new Thread(){
            @Override
            public void run() {
                super.run();
                for (int i = 0; i <= 100; ){
                    try {
                        // Delay of on second by sleep(1000)
                        sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    //Uploading ProgressBar
                    pgBar.setProgress(i);
                    i += 10;
                }
            }
        };
        thread.start();
    }








}

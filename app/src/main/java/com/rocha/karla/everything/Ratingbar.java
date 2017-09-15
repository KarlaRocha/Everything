package com.rocha.karla.everything;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class Ratingbar extends AppCompatActivity {
    Button btn;
    RatingBar ratingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_bar);

        btn = (Button)findViewById(R.id.button);
        ratingBar = (RatingBar)findViewById(R.id.idratingBar);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBtnClick();
            }
        });

    }

    public void onBtnClick(){
        float ratingvalue = ratingBar.getRating();
        Toast.makeText(getApplicationContext(), "Rating is: " + ratingvalue, Toast.LENGTH_SHORT).show();
    }

}

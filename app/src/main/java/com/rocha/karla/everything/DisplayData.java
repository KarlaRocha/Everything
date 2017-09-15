package com.rocha.karla.everything;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;

/**
 * Created by karla on 07/09/2017.
 */

public class DisplayData extends AppCompatActivity {
    Context context = this;
    public Integer getDisplayWidthDP(){
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return Math.round(displayMetrics.widthPixels / displayMetrics.density);
    }
    public Integer getDisplayHeightDP(){
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return Math.round(displayMetrics.heightPixels / displayMetrics.density);
    }
}

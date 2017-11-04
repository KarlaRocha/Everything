package com.rocha.karla.everything;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;

public class TxtSwitcher extends AppCompatActivity {
    TextSwitcher textSwitcher;
    Button leftBtn, rightBtn;
    int index = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_txt_switcher);

        final String [] list = AppData.DataList.MOVIE_TITLES;

        textSwitcher = (TextSwitcher)findViewById(R.id.idTxtSwitcher);
        leftBtn = (Button)findViewById(R.id.idLeftBtn);
        rightBtn = (Button)findViewById(R.id.idRightBtn);

        textSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                TextView textView = new TextView(getApplicationContext());
                textView.setTextSize(18);
                return textView;
            }
        });

        leftBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index > 0){
                    index -= index;
                    textSwitcher.setText(list[index]);
                }
            }
        });

        rightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index < list.length-1){
                    index += index;
                    textSwitcher.setText(list[index]);
                }
            }
        });
    }
}

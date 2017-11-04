package com.rocha.karla.everything;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class CToast extends AppCompatActivity {
    Button btn;
    View viewLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ctoast);

        LayoutInflater layoutInflater = getLayoutInflater();

        btn = (Button)findViewById(R.id.idBtnCToast);
        viewLayout = layoutInflater.inflate(R.layout.custom_toast,
                (ViewGroup)findViewById(R.id.custom_toast_layout));

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast turtleToast = Toast.makeText(CToast.this, "Turtle Toast", Toast.LENGTH_SHORT);
                turtleToast.setGravity(Gravity.CENTER,0,0);
                turtleToast.setView(viewLayout);
                turtleToast.show();
            }
        });
    }
}

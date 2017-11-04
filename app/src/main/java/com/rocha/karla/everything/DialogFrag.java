package com.rocha.karla.everything;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.rocha.karla.everything.R;

public class DialogFrag extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog_frag);

        btn = (Button)findViewById(R.id.idDialogFrag);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogFragment();
            }
        });
    }

    public void DialogFragment(){
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setTitle("Turtle Wave");
        builder.setMessage("Make a choice");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                // After option is clicked the fragment disappears and nothing happens
                Toast.makeText(DialogFrag.this, "You chose yes.", Toast.LENGTH_SHORT).show();
            }
        }).setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(DialogFrag.this, "You chose no.", Toast.LENGTH_SHORT).show();
                finish();
            }
        }).setNeutralButton("Whatever", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(DialogFrag.this, "Whatever man.", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
        builder.create().show();
    }
}

package com.royettecamahalan.inputevents;

import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button btnclick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnclick= (Button) findViewById(R.id.btnclick);

        btnclick.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        //Dialog
        final Dialog d=new Dialog(this);
        d.setTitle("Basic Info");
        d.setContentView(R.layout.dialoglayout);

        Button btndone= (Button) d.findViewById(R.id.btnDone);
        final EditText ETName= (EditText) d.findViewById(R.id.txtname);

        btndone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Your name is " + ETName.getText().toString(), Toast.LENGTH_SHORT).show();
                d.dismiss();
            }
        });
        d.show();

        //Alert (For Yes Or No)
        /*AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle("Valentines Day");
        builder.setMessage("Do you have a date this coming valentines?");


        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"Congrats! You have a date.",Toast.LENGTH_SHORT).show();
            }
        });
        builder.setNegativeButton("Nah", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"Daghan nata.",Toast.LENGTH_SHORT).show();
            }
        });
        builder.create().show();*/


    }
}

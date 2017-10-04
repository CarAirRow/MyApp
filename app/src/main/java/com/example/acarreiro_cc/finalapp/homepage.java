package com.example.acarreiro_cc.finalapp;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class homepage extends AppCompatActivity implements View.OnClickListener {

    Button logOutButton;
//comment
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContesntView(R.layout.activity_homepage);

        logOutButton =  (Button)  findViewById(R.id.logOutButton);

        logOutButton.setOnClickListener(this);
    }

    public void onClick(View v) {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);

        if(logOutButton.isPressed()){
            alertDialogBuilder.setMessage("GoodBye!!");
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);

        }
    }
}


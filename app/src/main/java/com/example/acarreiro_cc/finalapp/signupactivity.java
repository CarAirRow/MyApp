package com.example.acarreiro_cc.finalapp;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class signupactivity extends AppCompatActivity implements View.OnClickListener {
    Button   signUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signupactivity);

        signUpButton = (Button) findViewById(R.id.signUpButton);

        signUpButton.setOnClickListener(this);
    }

    public void onClick(View v) {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);

        if(signUpButton.isPressed()){
            alertDialogBuilder.setMessage("Congratulations!!");
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);

        }
    }



}

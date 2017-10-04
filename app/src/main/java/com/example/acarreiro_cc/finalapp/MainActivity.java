package com.example.acarreiro_cc.finalapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText userNameEditText;
    EditText passswordEditText;

    Button   loginButton;
    Button   signUpButton;

    String user = "";
    String pass = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        loginButton = (Button) findViewById(R.id.loginButton);
        signUpButton = (Button) findViewById(R.id.signUpButton);


        loginButton.setOnClickListener(this);
        signUpButton.setOnClickListener(this);
    }

    public void onClick(View v) {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        userNameEditText = (EditText) findViewById(R.id.userNameEditText);
        pass = userNameEditText.getText().toString();

        passswordEditText = (EditText) findViewById(R.id.passswordEditText);
        user = passswordEditText.getText().toString();

        if(signUpButton.isPressed()){
            alertDialogBuilder.setMessage("Happy You Are Joining!!");
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
            Intent intent = new Intent(this, signupactivity.class);
            startActivity(intent);

            }
        if(loginButton.isPressed()&& pass.equals("helloWorld") && user.equals("AlexxCarreiroo") ) {
                alertDialogBuilder.setMessage("WELECOME BACK");
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
                Intent intent = new Intent(this, homepage.class);
                startActivity(intent);
            }
        if (loginButton.isPressed()&& !pass.equals("helloWorld") && !user.equals("AlexxCarreiroo")){
            alertDialogBuilder.setMessage("INVALID");
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }



    }
}

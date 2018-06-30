package com.example.android.quizapp;

import android.app.TaskStackBuilder;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void submitResult(View v){

        displayMessage();
    }
    public void displayMessage(){
        new AlertDialog.Builder(this)
                .setTitle("Closing application")
                .setMessage("Gracias! We appreciate your feedback")
        .create().show();
    }
}

package com.example.firebaseapp2018;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;

public class RegisterActivity extends AppCompatActivity {

    EditText e1,e2;
    FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        FirebaseApp.initializeApp(this);

        e1= (EditText) findViewById(R.id.login);
        e2= (EditText) findViewById(R.id.pass);

        auth = FirebaseAuth.getInstance();

    }

    public void createUser(View view){

        if(e1.getText().toString().equals("") || e2.getText().toString().equals("")){
            Toast.makeText(getApplicationContext(),"NULL CREDENTIAL",Toast.LENGTH_LONG);
        }
        else
        {
            Toast.makeText(getApplicationContext(),"CREDENTIAL",Toast.LENGTH_LONG);
        }
    }

}

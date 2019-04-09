package com.example.budkitapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    public Button login;
    public EditText Email;
    public EditText Passwd;
    public TextView register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login = (Button) findViewById(R.id.login);
        Email = (EditText) findViewById(R.id.email);
        Passwd = (EditText) findViewById(R.id.password);
        register = (TextView) findViewById(R.id.registernow);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mulaiLogin(Email.getText().toString(), Passwd.getText().toString());
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Login.this, SignUp.class);
                startActivity(intent);
            }
        });
    }

    private void mulaiLogin(String email, String passwd) {


        if (email.equals("1234@coba.com") && (passwd.equals("1234"))) {
            Intent intent = new Intent(Login.this, MainActivity.class);
            startActivity(intent);
        } else {
            Toast.makeText(this, "email atau password salah", Toast.LENGTH_SHORT).show();
        }
    }
}

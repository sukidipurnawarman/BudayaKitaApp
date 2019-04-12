package com.example.budkitapp;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Login extends AppCompatActivity {
    public Button login;
    public EditText Email;
    public EditText Passwd;
    public TextView register;
    public FirebaseAuth mAuth;
    public FirebaseUser currentUser;
    public FirebaseAuth.AuthStateListener mAuthListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login = (Button) findViewById(R.id.login);
        Email = (EditText) findViewById(R.id.email);
        Passwd = (EditText) findViewById(R.id.password);
        register = (TextView) findViewById(R.id.registernow);
        mAuth = FirebaseAuth.getInstance();
        cekLogin();

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

    private void cekLogin() {
        mAuthListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                if (firebaseAuth.getCurrentUser() != null){
                    FirebaseUser curUser = mAuth.getCurrentUser();
                    currentUser = curUser;
                    startActivity(new Intent(Login.this, MainActivity.class));
                    Toast.makeText(Login.this,mAuth.getCurrentUser().getEmail(),Toast.LENGTH_LONG).show();
                    finish();
                }
            }
        };
    }

    private void mulaiLogin(String email, String passwd) {

        mAuth.signInWithEmailAndPassword(email,passwd)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                   if(task.isSuccessful()){
                       FirebaseUser curUser = mAuth.getCurrentUser();
                       currentUser = curUser;
                       startActivity(new Intent(Login.this, MainActivity.class));
                   }else {
                       Toast.makeText(Login.this, "Account Doesn't Exist",
                               Toast.LENGTH_SHORT).show();
                   }
                    }
                });


    }

    @Override
    protected void onStart() {
        mAuth.addAuthStateListener(mAuthListener);
        super.onStart();
    }
}

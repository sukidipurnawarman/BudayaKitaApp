package com.example.budkitapp;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class SignUp extends AppCompatActivity implements View.OnClickListener {
    private EditText email,passwd;
    private Button signup;
    private ProgressDialog progressDialog;

    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        firebaseAuth = FirebaseAuth.getInstance();

        email = (EditText) findViewById(R.id.emailRegis) ;
        passwd = (EditText) findViewById(R.id.passwordRegis);
        signup = (Button) findViewById(R.id.register);
        progressDialog = new ProgressDialog(this);

        signup.setOnClickListener(this);
    }
    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = firebaseAuth.getCurrentUser();
    }



    private void registerUser() {

        //getting email and password from edit texts
        String Email = email.getText().toString().trim();
        String Password = passwd.getText().toString().trim();

        //checking if email and passwords are empty
        if (TextUtils.isEmpty(Email)) {
            Toast.makeText(this, "Please enter email", Toast.LENGTH_LONG).show();
            return;
        }

        if (TextUtils.isEmpty(Password)) {
            Toast.makeText(this, "Please enter password", Toast.LENGTH_LONG).show();
            return;
        }
        if (Password.length() <8 ) {

            passwd.setError("Password minimal 8 karakter");
            return;
        }

        //if the email and password are not empty
        //displaying a progress dialog

        progressDialog.setMessage("Registering Please Wait...");
        progressDialog.show();

            firebaseAuth.createUserWithEmailAndPassword(Email, Password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if(task.isSuccessful()){
                        //display some message here
                        startActivity(new Intent(SignUp.this,MainActivity.class));
                        progressDialog.dismiss();
                        FirebaseUser user = firebaseAuth.getCurrentUser();
                        finish();

                    }else{
                        try {
                            //display some message here
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        Toast.makeText(SignUp.this,"Registration Error",Toast.LENGTH_LONG).show();
                    }
                    progressDialog.dismiss();
                }
            });
        }
    //</editor-fold>

    @Override
    public void onClick(View v) {
        registerUser();
    }


}


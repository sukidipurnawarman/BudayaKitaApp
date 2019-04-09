package com.example.budkitapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Agreement extends AppCompatActivity {

    private Button setuju;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agreement);
    setuju = findViewById(R.id.setuju) ;
    setuju.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
       mulaiActivity();
    }
});

    }
    public void mulaiActivity(){
        Intent lanjut = new Intent(this, Login.class);
        startActivity(lanjut);
        finish();
    }
}

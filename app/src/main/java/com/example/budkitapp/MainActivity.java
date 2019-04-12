package com.example.budkitapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;
    private FirebaseAuth mAuth;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_dashboard:
                  Dashboard dashboard = new Dashboard();
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.fragment_container, dashboard)
                            .commit();
                    return true;
                case R.id.navigation_notifications:
                   // mTextMessage.setText(R.string.title_dashboard);
                    Notification notification = new Notification();
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.fragment_container, notification)
                            .commit();
                    return true;
                case R.id.navigation_explore:
                   // mTextMessage.setText(R.string.title_notifications);
                    Explore explore = new Explore();
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.fragment_container, explore)
                            .commit();
                    return true;
                case R.id.navigation_account:
                    //mTextMessage.setText(R.string.title_notifications);
                    Account account= new Account();
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.fragment_container, account)
                            .commit();
                    return true;
                case R.id.navigation_setting:
                   // mTextMessage.setText(R.string.title_notifications);
                    Setting setting= new Setting();
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.fragment_container, setting)
                            .commit();
                    mAuth.signOut();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Dashboard dashboard = new Dashboard();
        mAuth = FirebaseAuth.getInstance();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, dashboard)
                .commit();
        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }
}

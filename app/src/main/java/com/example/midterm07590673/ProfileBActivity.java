package com.example.midterm07590673;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class ProfileBActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_b);

        Toast t = Toast.makeText(ProfileBActivity.this, R.string.toast_welcome1,Toast.LENGTH_SHORT);
        t.show();
    }
}

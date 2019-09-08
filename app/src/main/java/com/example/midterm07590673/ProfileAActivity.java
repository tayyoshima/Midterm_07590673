package com.example.midterm07590673;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class ProfileAActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_a);

        Toast t = Toast.makeText(ProfileAActivity.this, R.string.toast_welcome,Toast.LENGTH_SHORT);
        t.show();
    }

}

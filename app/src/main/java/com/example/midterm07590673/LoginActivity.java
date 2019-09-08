package com.example.midterm07590673;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.example.midterm07590673.NewModel.Auth;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button loginButton = findViewById(R.id.login_button);

        loginButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                EditText emailEditText = findViewById(R.id.email_edit_text);
                EditText passwordEditText = findViewById(R.id.password_edit_text);

                String InputEmail = emailEditText.getText().toString();
                String InputPassword = passwordEditText.getText().toString();


                String loginInvalidText = getString(R.string.login_invalid);

                Auth auth = new Auth(InputEmail,InputPassword);


                int result = auth.check();

                if(result==2){


                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Intent intent = new Intent(LoginActivity.this, ProfileAActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    }, 500);
                }
                else if(result==1){


                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Intent intent = new Intent(LoginActivity.this, ProfileBActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    }, 500);
                }
                else {
                    AlertDialog.Builder dialog = new AlertDialog.Builder(LoginActivity.this);
                    dialog.setTitle("Error");
                    dialog.setMessage(R.string.login_invalid);
                    dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            //todo
                        }
                    });

                    dialog.show();

                }
            }
        });
    }
}

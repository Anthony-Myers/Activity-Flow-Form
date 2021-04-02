package com.example.activityflowform;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class EmailActivity extends AppCompatActivity {
    Button goToPasswordActivityButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.email_activity);
        goToPasswordActivityButton = findViewById(R.id.go_to_password_activity_button);
        goToPasswordActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToPasswordActivity();
            }
        });
    }

    public void goToPasswordActivity(){
        Intent intent = new Intent(this, PasswordActivity.class);
        intent.putExtra(Constants.EMAIL, getIntent().getExtras().getString(Constants.FIRST_NAME));
        startActivity(intent);
    }
}

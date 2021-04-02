package com.example.activityflowform;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class PasswordActivity extends AppCompatActivity {
    Button goToFinalScreenButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.password_activity);
        goToFinalScreenButton = findViewById(R.id.go_to_ending_activity_button);
        goToFinalScreenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToFinalScreen();
            }
        });
    }

    public void goToFinalScreen(){
        Intent intent = new Intent(this, CongratulationsActivity.class);
        intent.putExtra(Constants.PASSWORD, getIntent().getExtras().getString(Constants.EMAIL));
        startActivity(intent);
    }
}

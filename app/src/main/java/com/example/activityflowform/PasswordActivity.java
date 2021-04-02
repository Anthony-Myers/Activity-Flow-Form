package com.example.activityflowform;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class PasswordActivity extends AppCompatActivity {
    Button goToFinalScreenButton;
    TextView passwordEntry;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.password_activity);

        goToFinalScreenButton = findViewById(R.id.go_to_ending_activity_button);
        passwordEntry = findViewById(R.id.password_edit_text);

        goToFinalScreenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToFinalScreen();
            }
        });
    }

    public void goToFinalScreen(){
        Intent intent = new Intent(this, CongratulationsActivity.class);
        intent.putExtra(Constants.FIRST_NAME, getIntent().getExtras().getString(Constants.FIRST_NAME));
        intent.putExtra(Constants.SURNAME, getIntent().getExtras().getString(Constants.SURNAME));
        intent.putExtra(Constants.EMAIL, getIntent().getExtras().getString(Constants.EMAIL));
        intent.putExtra(Constants.PASSWORD, passwordEntry.getText().toString());
        startActivity(intent);
    }
}

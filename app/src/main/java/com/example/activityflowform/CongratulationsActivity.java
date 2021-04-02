package com.example.activityflowform;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CongratulationsActivity extends AppCompatActivity {
    TextView firstName, surname, email, password;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.congratulations_activity);

        firstName = findViewById(R.id.name_final_edit_text);
        firstName.setText(getIntent().getExtras().getString(Constants.FIRST_NAME));
        firstName.setEnabled(false);

        surname = findViewById(R.id.surname_final_edit_text);
        surname.setText(getIntent().getExtras().getString(Constants.SURNAME));
        surname.setEnabled(false);

        email = findViewById(R.id.email_final_edit_text);
        email.setText(getIntent().getExtras().getString(Constants.EMAIL));
        email.setEnabled(false);

        password = findViewById(R.id.password_final_edit_text);
        password.setText(getIntent().getExtras().getString(Constants.PASSWORD));
        password.setEnabled(false);
    }
}

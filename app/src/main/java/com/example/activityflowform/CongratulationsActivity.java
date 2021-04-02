package com.example.activityflowform;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CongratulationsActivity extends AppCompatActivity {
    TextView firstName, surname, email, password;
    Intent intent = new Intent(this, NameActivity.class);


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.congratulations_activity);
        firstName = findViewById(R.id.name_final_edit_text);
        firstName.setText(getIntent().getExtras().getString(Constants.FIRST_NAME));
        firstName.setEnabled(false);
    }
}

package com.example.activityflowform;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class NameActivity extends AppCompatActivity {
    Button goToEmailActivityButton;
    TextView nameEntry, surnameEntry;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.name_activity);

        goToEmailActivityButton = findViewById(R.id.go_to_email_activity_button);
        nameEntry = findViewById(R.id.first_name_edit_text);
        surnameEntry = findViewById(R.id.surname_edit_text);

        goToEmailActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToEmailActivity();
            }
        });
    }

    public void goToEmailActivity(){
        Intent intent = new Intent(this, EmailActivity.class);
        intent.putExtra(Constants.FIRST_NAME, nameEntry.getText().toString());
        intent.putExtra(Constants.SURNAME, surnameEntry.getText().toString());
        startActivity(intent);
    }
}

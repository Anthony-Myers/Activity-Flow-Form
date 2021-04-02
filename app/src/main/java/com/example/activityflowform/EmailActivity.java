package com.example.activityflowform;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class EmailActivity extends AppCompatActivity {
    Button goToPasswordActivityButton;
    TextView emailEntry;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.email_activity);

        goToPasswordActivityButton = findViewById(R.id.go_to_password_activity_button);
        emailEntry = findViewById(R.id.email_address_edit_text);

        goToPasswordActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToPasswordActivity();
            }
        });
    }

    public void goToPasswordActivity(){
        Intent intent = new Intent(this, PasswordActivity.class);
        intent.putExtra(Constants.FIRST_NAME, getIntent().getExtras().getString(Constants.FIRST_NAME));
        intent.putExtra(Constants.SURNAME, getIntent().getExtras().getString(Constants.SURNAME));
        intent.putExtra(Constants.EMAIL, emailEntry.getText().toString());
        startActivity(intent);
    }
}

package com.example.resellerbd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {
    private Button CreateAccountButton;
    private EditText inputName, inputID, inputNumber, inputPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        CreateAccountButton = findViewById(R.id.register_button);
        inputName = findViewById(R.id.enter_name);
        inputID = findViewById(R.id.enter_player_id);
        inputNumber = findViewById(R.id.enter_mobile_number);
        inputPassword = findViewById(R.id.enter_password);


    }
}
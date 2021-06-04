package com.example.resellerbd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        register = findViewById(R.id.registerTV);

        register.setOnClickListener(v -> {
            Intent intent = new Intent (this,RegisterActivity.class);
            startActivity(intent);
        });
    }

}
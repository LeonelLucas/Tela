package com.example.talkenglish.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.talkenglish.Menus;
import com.example.talkenglish.R;

public class LoginActivity extends AppCompatActivity {

    private Button entrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        this.entrar = (Button) findViewById(R.id.entrar);
        this.entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(LoginActivity.this , Menus.class);
                startActivity(intent);

            }
        });

    }
}
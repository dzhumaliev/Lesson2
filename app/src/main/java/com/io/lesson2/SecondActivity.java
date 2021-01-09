package com.io.lesson2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    EditText editT;
    Button btnReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        editT = findViewById(R.id.et1);
        btnReturn = findViewById(R.id.btn1);



        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editT.getText().toString();

                Intent intent = new Intent();
                intent.putExtra("key", text);
                setResult(RESULT_OK, intent);
                finish();

            }
        });

    }
}
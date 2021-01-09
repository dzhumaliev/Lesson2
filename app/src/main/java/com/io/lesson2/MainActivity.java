package com.io.lesson2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("onCreate");
        btn = findViewById(R.id.btn1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                // 1 - ый вид интента   явный интент

//                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
//                startActivity(intent);


                // 2 - ой вид интента     не явный интент

                // контакт
//                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: (+996) 700 700700" ));
//                startActivity(intent);

                // КАМЕРА
//                Intent intentCamera = new Intent(MediaStore.INTENT_ACTION_STILL_IMAGE_CAMERA);
//                startActivity(intentCamera);


//                String text = "cars";
//                Intent intentGoogle = new Intent(Intent.ACTION_WEB_SEARCH);
//                intentGoogle.putExtra(SearchManager.QUERY, text);
//                startActivity(intentGoogle);


                // 3 - ий вид интента   интент на результат

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivityForResult(intent, 15);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


        if (requestCode == 15) {
            if (resultCode == RESULT_OK) {
                String returnedData = data.getStringExtra("key");
                Toast.makeText(this, returnedData, Toast.LENGTH_LONG).show();
            }
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("onResume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("onDestroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("onStop");
    }
}
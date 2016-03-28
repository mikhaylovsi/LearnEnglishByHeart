package com.marrog.learnenglishbyheart;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class WriteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write);

    }


    public void moveToMain(View view) {

        Intent intent = new Intent(WriteActivity.this, MainActivity.class);
        startActivity(intent);

    }
}

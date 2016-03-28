package com.marrog.learnenglishbyheart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void moveToWrite(View view) {

        Intent intent = new Intent(MainActivity.this, WriteActivity.class);
        startActivity(intent);

    }

    public void moveToLearn(View view) {
    }

    public void exit(View view) {
        finish();
    }
}

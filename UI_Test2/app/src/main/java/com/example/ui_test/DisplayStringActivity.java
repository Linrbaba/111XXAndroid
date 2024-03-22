package com.example.ui_test2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayStringActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_display_string);

        TextView txtshow = (TextView) findViewById(R.id.txtshow);
        Intent intent = getIntent();
        String reveibedString = intent.getStringExtra("userInput");
                txtshow.setText("輸入:" + reveibedString);
    }
}
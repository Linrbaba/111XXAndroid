package com.example.ui_test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.EditText;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);
    }

    public  void  sendstring(View view){
        EditText edtinput = (EditText) findViewById(R.id.edtinput);
     String string2Send = edtinput.getText().toString();

        Intent intent =new Intent( this, DisplayStringActivity.class);
        intent.putExtra("userInput",string2Send);
        startActivity(intent);
    }
}
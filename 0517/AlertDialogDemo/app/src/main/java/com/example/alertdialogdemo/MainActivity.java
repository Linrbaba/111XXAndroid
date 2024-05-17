package com.example.alertdialogdemo;

import static com.example.alertdialogdemo.R.id.btnAbout;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.net.wifi.p2p.WifiP2pGroup;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements DialogInterface.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnAbout = (Button)  findViewById((R.id.btnAbout);
        btnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    new AlertDialog.Builder(MainActivity.this)
                            .setTitle("關於那本書")
                            .setMessage("Android程式設計與應用\n作者:xxx\n教師:xxx")
                            .setCancelable(true)
                            .setPositiveButton("確定",null)
                            .show();
                }

        });

        Button btnExit = (Button)  findViewById((R.id.btnExit);
        btnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("確定")
                        .setMessage("確定結束本程式")
                        .setCancelable(true)
                        .setPositiveButton("確定",MainActivity.this)
                        .setPositiveButton("取消",null)
                        .show();
            }

        });
        Button btncolor = (Button)  findViewById((R.id.btncolor);
        btnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("選擇一個顏色")
                        .setItems(new  )
                        .setCancelable(true)
                        .setPositiveButton("確定",MainActivity.this)
                        .setPositiveButton("取消",null)
                        .show();
            }

        });
    }

    @Override
    public void onClick(DialogInterface dialog, int which) {
        switch (which){
            case  DialogInterface.BUTTON_POSITIVE:
                finish();
                break;
            case DialogInterface.BUTTON_NEGATIVE:
                Toast.makeText(this, "按下取消鈕!",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
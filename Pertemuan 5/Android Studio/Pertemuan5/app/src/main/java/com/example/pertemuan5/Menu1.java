package com.example.pertemuan5;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu1 extends AppCompatActivity {
    //deklarasi object java
    Button BtnOK;
    Button BtnOKH;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu1);

        //hubungan object java dengan id xml
        BtnOK = findViewById(R.id.Btn1);
        BtnOKH = findViewById(R.id.Btn2);

    }

    //code mengubah warna
    public void Rubah_Warna1(View v){
        BtnOK.setBackgroundColor(Color.RED);
    }
    public void Rubah_Warna2(View v){
        BtnOKH.setBackgroundColor(Color.GREEN);
    }
}

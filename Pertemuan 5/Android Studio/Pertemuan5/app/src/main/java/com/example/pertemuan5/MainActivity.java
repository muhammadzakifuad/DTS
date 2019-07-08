package com.example.pertemuan5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    private android.view.MenuInflater MenuInflater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenu,menu);
        return true;
    }

    public boolean onOptionItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.Menu1){
            startActivity(new Intent(this, Menu1.class));
        }else if (item.getItemId()==R.id.Menu2){
            startActivity(new Intent(this, Menu2.class));
        }else if (item.getItemId()==R.id.Menu3){
            startActivity(new Intent(this, Menu3.class));
        }
        return true;
    }

}

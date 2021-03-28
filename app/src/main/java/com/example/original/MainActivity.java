package com.example.original;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View view = findViewById(R.id.activity_main);
        view.setBackgroundColor(Color.WHITE);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_light, menu);
        return true;
    }

    @Override
    public boolean onCreateOptionsItemSelected(MenuItem item) {
        View view = findViewById(R.id.activity_main);
        switch (item.getItemId()){
            case R.id.red:
                view.setBackgroundColor(Color.RED);
                return true;
            case R.id.green:
                view.setBackgroundColor(Color.GREEN);
                return true;
            case R.id.blue:
                view.setBackgroundColor(Color.BLUE);
                return true;
            case R.id.white:
                view.setBackgroundColor(Color.WHITE);
                return true;
        }
        return false;
    }
}
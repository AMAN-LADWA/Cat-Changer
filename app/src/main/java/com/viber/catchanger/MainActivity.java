package com.viber.catchanger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public void changeCat(View view){
        Log.i("info","button pressed");
        ImageView image= (ImageView) findViewById(R.id.catImageView);
        image.setImageResource(R.drawable.cat2);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
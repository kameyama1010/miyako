package com.example.kotsu5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.slideBtn).setOnClickListener(this);
        findViewById(R.id.button8).setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.slideBtn:
                startActivity(new Intent(this, Main2Activity.class));
                overridePendingTransition(
                        android.R.anim.slide_in_left, android.R.anim.slide_out_right
                );
                break;
            case R.id.button8:
                startActivity(new Intent(this, Main6Activity.class));
                break;
        }
    }
}


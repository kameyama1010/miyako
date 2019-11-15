package com.example.kotsu5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        findViewById(R.id.button).setOnClickListener(this);
        findViewById(R.id.button2).setOnClickListener(this);
        findViewById(R.id.button3).setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.button2:
                startActivity(new Intent(this, Main3Activity.class));
                overridePendingTransition(
                        android.R.anim.slide_in_left, android.R.anim.slide_out_right
                );
                break;
            case R.id.button:
                Toast toast= Toast.makeText(Main2Activity.this,"今後実装予定",Toast.LENGTH_SHORT);
                toast.show();
                break;
            case R.id.button3:
                Toast toast2= Toast.makeText(Main2Activity.this,"今後実装予定",Toast.LENGTH_SHORT);
                toast2.show();
                break;


        }
    }
}

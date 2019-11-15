package com.example.kotsu5;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        ImageView img = findViewById(R.id.imageView4);
        Resources res = getResources();

        Bitmap bitmap = BitmapFactory.decodeResource(res, R.drawable.application_logo_noname);
        Bitmap bitmap2 = Bitmap.createScaledBitmap(bitmap, 200, 200, false);

        img.setImageBitmap(bitmap2);


        findViewById(R.id.button6).setOnClickListener(this);
        findViewById(R.id.button7).setOnClickListener(this);
        findViewById(R.id.button4).setOnClickListener(this);
        findViewById(R.id.button5).setOnClickListener(this);

    }

    @Override
    public void onClick(View v){

        switch(v.getId()){
            case R.id.button6:
                startActivity(new Intent(this, Main4Activity.class));
                overridePendingTransition(
                        android.R.anim.slide_in_left, android.R.anim.slide_out_right
                );
                break;

        case R.id.button7:
        Toast toast= Toast.makeText(Main3Activity.this,"今後実装予定",Toast.LENGTH_SHORT);
        toast.show();
        break;
        case R.id.button4:
                Toast toast1= Toast.makeText(Main3Activity.this,"今後実装予定",Toast.LENGTH_SHORT);
                toast1.show();
                break;
                case R.id.button5:
                Toast toast2= Toast.makeText(Main3Activity.this,"今後実装予定",Toast.LENGTH_SHORT);
                toast2.show();
                break;
    }
}}

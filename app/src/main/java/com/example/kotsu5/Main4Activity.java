package com.example.kotsu5;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
public class Main4Activity extends AppCompatActivity implements AdapterView.OnItemClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);


        // リストに表示するデータ
        ArrayList<ListRow> listItems = new ArrayList<>();
        for (int i = 1; i < 2; i++) {
            // R.mipmap.ic_launcher_roundはデフォルトで用意されているアイコン
            Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher_round);
            ListRow item = new ListRow(bmp, "オススメプラン " + i);
            listItems.add(item);
        }
        // MyAdapterを作成し、データを設定
        TestAdapter adapter = new TestAdapter(this, R.layout.list_items,listItems);
        // ListViewにArrayAdapterを関連付け、データの表示を行う
        ListView listView = findViewById(R.id.listView1);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }
    @Override
    public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
        Intent intent = new Intent(this.getApplicationContext(), Main5Activity.class);

        // Activity をスイッチする
        startActivity(intent);
}
}
package com.example.kotsu5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
public class TestAdapter extends ArrayAdapter<ListRow> {
    private LayoutInflater mRayoutInflater;
    private List<ListRow> mList;
    TestAdapter(Context context, int resource, List<ListRow> list) {
        super(context, resource, list);
        this.mRayoutInflater = LayoutInflater.from(context);
        this.mList = list;
    }
    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        View view;
        if (convertView != null) {
            view = convertView;
        }
        else {
            view = mRayoutInflater.inflate(R.layout.list_items, null);
        }
        ListRow item = mList.get(i);
        // サムネイル画像
        ImageView thumbnail = view.findViewById(R.id.thumbnail);
        thumbnail.setImageBitmap(item.getThumbnail());
        // タイトル
        TextView title = view.findViewById(R.id.title);
        title.setText(item.getTitle());
        return view;
    }
}

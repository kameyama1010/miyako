package com.example.kotsu5;

import android.graphics.Bitmap;
public class ListRow {
    private Bitmap mThumbnail = null;
    private String mTitle;
    public ListRow(Bitmap thumbnail, String title) {
        this.mThumbnail = thumbnail;
        this.mTitle = title;
    }
    public String getTitle(){
        return mTitle;
    }
    public void setTitle(String name){
        this.mTitle = name;
    }
    public Bitmap getThumbnail(){
        return mThumbnail;
    }
    public void setThumbnail(Bitmap thumbnail){
        this.mThumbnail = thumbnail;
    }
}

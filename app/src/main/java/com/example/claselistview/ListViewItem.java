package com.example.claselistview;

public class ListViewItem {
    private int imageResource;
    private String title;

    public ListViewItem(int imageResource, String title) {
        this.imageResource = imageResource;
        this.title = title;
    }
    public int getImageResource() {
        return imageResource;
    }

    public String getTitle() {
        return title;
    }
}

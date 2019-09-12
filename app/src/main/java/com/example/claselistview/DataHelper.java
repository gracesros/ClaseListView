package com.example.claselistview;

import java.util.ArrayList;

public class DataHelper {
    public static ArrayList<ListViewItem> provideItems() {
        ArrayList<ListViewItem> list = new ArrayList<>();
        list.add(new ListViewItem(R.drawable.ic_star_black_24dp, "android"));
        list.add(new ListViewItem(R.drawable.ic_color_lens_black_24dp, "android"));
        list.add(new ListViewItem(R.drawable.ic_language_black_24dp, "android"));
        list.add(new ListViewItem(R.drawable.ic_mouse_black_24dp, "android"));
        list.add(new ListViewItem(R.drawable.ic_portrait_black_24dp, "android"));
        list.add(new ListViewItem(R.drawable.ic_public_black_24dp, "android"));
        list.add(new ListViewItem(R.drawable.ic_remove_red_eye_black_24dp, "android"));
        list.add(new ListViewItem(R.drawable.ic_sentiment_very_dissatisfied_black_24dp, "android"));
        list.add(new ListViewItem(R.drawable.ic_shopping_cart_black_24dp, "android"));
        list.add(new ListViewItem(R.drawable.ic_sentiment_satisfied_black_24dp, "android"));
        list.add(new ListViewItem(R.drawable.ic_wb_sunny_black_24dp, "android"));
        return list;
    }
}
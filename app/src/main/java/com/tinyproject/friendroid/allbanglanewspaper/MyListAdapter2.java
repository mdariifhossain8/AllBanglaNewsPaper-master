package com.tinyproject.friendroid.allbanglanewspaper;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ABBAS on 3/2/2018.
 */

public class MyListAdapter2 extends ArrayAdapter<String> {
    private final Activity context2;
    private final String[] names2;
    private int[] images2;


    public MyListAdapter2(Activity context2,
                         String[] names2, int[] images2) {
        super(context2, R.layout.list_smaple, names2);
        this.context2 = context2;
        this.names2 = names2;
        this.images2 = images2;
    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context2.getLayoutInflater();
        @SuppressLint("ViewHolder") View rowView= inflater.inflate(R.layout.list_sample2, null, true);
        TextView txtTitle = rowView.findViewById(R.id.sampleText2);
        ImageView imageView = rowView.findViewById(R.id.imageView2);
        txtTitle.setText(names2[position]);
        imageView.setImageResource(images2[position]);
        return rowView;
    }
}

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

public class MyListAdapter extends ArrayAdapter<String> {
    private final Activity context1;
    private final String[] names1;
    private int[] images1;


    public MyListAdapter(Activity context1,
                         String[] names1, int[] images1) {
        super(context1, R.layout.list_smaple, names1);
        this.context1 = context1;
        this.names1 = names1;
        this.images1 = images1;
    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context1.getLayoutInflater();
        @SuppressLint("ViewHolder") View rowView= inflater.inflate(R.layout.list_smaple, null, true);
        TextView txtTitle = rowView.findViewById(R.id.sampleText1);
        ImageView imageView = rowView.findViewById(R.id.imageView1);
        txtTitle.setText(names1[position]);
        imageView.setImageResource(images1[position]);
        return rowView;
    }
}

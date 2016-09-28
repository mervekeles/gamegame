package com.example.mervekeles.gamegame;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by mervekeles on 9/22/16.
 */
public class GridAdapter extends BaseAdapter {


    private final int[] imageid;
    private final String[] numbers;
    private Context mContext;

    public GridAdapter(Context c,String [] numbers, int[] imageid) {
        this.mContext = c;
        this.numbers = numbers;
        this.imageid = imageid;
    }

    @Override
    public int getCount() {
        return numbers.length;
    }

    @Override
    public Object getItem(int i) {
        return numbers[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View grid;
        LayoutInflater inflater = (LayoutInflater)mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (view == null) {

            grid = new View(mContext);
            grid = inflater.inflate(R.layout.single_item, null);
            TextView textView = (TextView) grid.findViewById(R.id.grid_text);
           // ImageView imageView = (ImageView)grid.findViewById(R.id.grid_image);
            textView.setText(numbers[i]);
            textView.setBackgroundResource(R.drawable.grid_item_border);

            return textView;
           // imageView.setImageResource(Imageid[position]);
        } else {
            grid = (View) view;
        }

        return grid;
    }
}

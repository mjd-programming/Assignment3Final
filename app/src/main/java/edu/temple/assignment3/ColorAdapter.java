package edu.temple.assignment3;

import android.app.Activity;
import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ColorAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<String> colors;

    public ColorAdapter(Context context, ArrayList<String> colors) {
        super();
        this.context = context;
        this.colors = colors;
    }

    @Override
    public int getCount() {
        return colors.size();
    }

    @Override
    public Object getItem(int i) {
        return colors.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        String current_color = colors.get(i);
        LayoutInflater inflater = ((Activity) context).getLayoutInflater();
        View v = inflater.inflate(R.layout.color_item, viewGroup, false);
        TextView color_name = (TextView) v.findViewById(R.id.color_text);
        color_name.setText(current_color);
        return v;
    }
}

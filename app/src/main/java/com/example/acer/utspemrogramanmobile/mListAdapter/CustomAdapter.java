package com.example.acer.utspemrogramanmobile.mListAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.acer.utspemrogramanmobile.mData.BangunRuang;

import java.util.ArrayList;

/**
 * Created by acer on 22/11/2017.
 */

public class CustomAdapter extends BaseAdapter {

    Context context;
    ArrayList<BangunRuang> bangunRuangs;
    LayoutInflater inflater;

    public CustomAdapter(Context context, ArrayList<BangunRuang> bangunRuangs) {
        this.context = context;
        this.bangunRuangs = bangunRuangs;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return bangunRuangs.size();
    }

    @Override
    public Object getItem(int position) {
        return bangunRuangs.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView = null)
        {
            convertView = inflater.inflate();
        }

        return null;
    }
}

package com.example.acer.utspemrogramanmobile.mListAdapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.acer.utspemrogramanmobile.R;
import com.example.acer.utspemrogramanmobile.mData.BangunRuang;
import com.example.acer.utspemrogramanmobile.mDetail.Detail;
import com.example.acer.utspemrogramanmobile.mDetail.Lingkaran;
import com.example.acer.utspemrogramanmobile.mDetail.Segitiga;

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
    public View getView(final int position, View convertView, ViewGroup parent) {

        if (convertView == null)
        {
            convertView = inflater.inflate(R.layout.custom_list_view,parent,false);
        }

        TextView judHome = (TextView)convertView.findViewById(R.id.namaHome);
        ImageView imgHome = (ImageView)convertView.findViewById(R.id.imgHome);

        final String judul = bangunRuangs.get(position).getNamaBangun();
        final int gambar = bangunRuangs.get(position).getImageBangun();

        judHome.setText(judul);
        imgHome.setImageResource(gambar);

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context,Detail.class);

                switch (position)
                {
                    case 0:
                        Intent intentP = new Intent(context,Detail.class);
                        context.startActivity(intentP);
                        break;
                    case 1:
                        Intent intentL = new Intent(context,Lingkaran.class);
                        context.startActivity(intentL);
                        break;
                    case 2:
                        Intent intentS = new Intent(context,Segitiga.class);
                        context.startActivity(intentS);
                        break;
                    case 3:
                        intent.putExtra("Judul","Persegi Panjang");
                        intent.putExtra("Panjang","Panjang");
                        intent.putExtra("Lebar","Lebar");
                        intent.putExtra("Level","Persegi");
                        context.startActivity(intent);
                        break;
                    case 4:
                        intent.putExtra("Judul","Trapesium");
                        intent.putExtra("Panjang","Alas Bawah");
                        intent.putExtra("Lebar","Alas Atas");
                        intent.putExtra("Tinggi","Tinggi");
                        intent.putExtra("SisiR","Sisi Kanan");
                        intent.putExtra("Sisi","Sisi Kiri");
                        intent.putExtra("Level","Persegi");
                        context.startActivity(intent);
                        break;
                }
            }
        });

        return convertView;
    }
}

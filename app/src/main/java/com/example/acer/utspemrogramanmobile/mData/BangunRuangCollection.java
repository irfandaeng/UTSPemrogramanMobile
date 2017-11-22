package com.example.acer.utspemrogramanmobile.mData;

import com.example.acer.utspemrogramanmobile.R;

import java.util.ArrayList;

/**
 * Created by acer on 22/11/2017.
 */

public class BangunRuangCollection {
    public static ArrayList<BangunRuang> getBangunRuang()
    {
        ArrayList<BangunRuang> bangunRuangs = new ArrayList<>();
        BangunRuang bangunRuang = null;

        bangunRuang = new BangunRuang();
        bangunRuang.setNamaBangun("Persegi");
        bangunRuang.setImageBangun(R.drawable.persegi);
        bangunRuangs.add(bangunRuang);

        bangunRuang = new BangunRuang();
        bangunRuang.setNamaBangun("Lingkaran");
        bangunRuang.setImageBangun(R.drawable.lingkaran);
        bangunRuangs.add(bangunRuang);

        bangunRuang = new BangunRuang();
        bangunRuang.setNamaBangun("Segitiga");
        bangunRuang.setImageBangun(R.drawable.segitiga);
        bangunRuangs.add(bangunRuang);

        bangunRuang = new BangunRuang();
        bangunRuang.setNamaBangun("Persegi Panjang");
        bangunRuang.setImageBangun(R.drawable.persegipanjang);
        bangunRuangs.add(bangunRuang);

        bangunRuang = new BangunRuang();
        bangunRuang.setNamaBangun("Trapesium");
        bangunRuang.setImageBangun(R.drawable.trapesium);
        bangunRuangs.add(bangunRuang);

        return bangunRuangs;

    }
}

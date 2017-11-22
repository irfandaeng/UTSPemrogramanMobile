package com.example.acer.utspemrogramanmobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.acer.utspemrogramanmobile.mData.BangunRuangCollection;
import com.example.acer.utspemrogramanmobile.mListAdapter.CustomAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.list_bangun);
        CustomAdapter adapter = new CustomAdapter(this, BangunRuangCollection.getBangunRuang());
        listView.setAdapter(adapter);

    }
}

package com.example.acer.utspemrogramanmobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Hasil extends AppCompatActivity {

    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        hasil = (TextView)findViewById(R.id.EditHasil);
        String nilai = getIntent().getStringExtra("Hasil");
        hasil.setText(nilai+" cm");
    }
}

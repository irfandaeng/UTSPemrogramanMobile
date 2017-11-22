package com.example.acer.utspemrogramanmobile.mDetail;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.acer.utspemrogramanmobile.Hasil;
import com.example.acer.utspemrogramanmobile.R;

public class Lingkaran extends AppCompatActivity {

    public EditText inputPanjang;
    public Button LuasPersegi,KelilingP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);

        inputPanjang = (EditText)findViewById(R.id.editPanjang_detail);
        LuasPersegi = (Button)findViewById(R.id.LuasPersegi);
        KelilingP = (Button)findViewById(R.id.KelilingPersegi);

        LuasPersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double nilai1 = Double.parseDouble(inputPanjang.getText().toString());
                    double hasil = 3.14*(nilai1*nilai1);
                    Intent intent = new Intent(Lingkaran.this, Hasil.class);
                    intent.putExtra("Hasil",""+hasil);
                    startActivity(intent);
                }
                catch (Exception ex){

                }
            }
        });

        KelilingP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double nilai1 = Double.parseDouble(inputPanjang.getText().toString());
                    double hasil = 3.14*(2*nilai1);
                    Intent intent = new Intent(Lingkaran.this, Hasil.class);
                    intent.putExtra("Hasil",""+hasil);
                    startActivity(intent);
                }
                catch (Exception ex){

                }
            }
        });
    }
}

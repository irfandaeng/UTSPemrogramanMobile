package com.example.acer.utspemrogramanmobile.mDetail;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.acer.utspemrogramanmobile.Hasil;
import com.example.acer.utspemrogramanmobile.R;

public class KelilingSegitiga extends AppCompatActivity {

    public EditText inputPanjang,inputTinggi;
    public Button LuasPersegi,KelilingP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keliling_segitiga);


        inputPanjang = (EditText)findViewById(R.id.editPanjang_detail);
        inputTinggi = (EditText)findViewById(R.id.editTinggi_detail);

        LuasPersegi = (Button)findViewById(R.id.LuasPersegi);
        KelilingP = (Button)findViewById(R.id.KelilingPersegi);

        LuasPersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double nilai1 = Double.parseDouble(inputPanjang.getText().toString());
                    double nilai2 = Double.parseDouble(inputTinggi.getText().toString());
                    double hasil = (nilai1*nilai2)*0.5;
                    Intent intent = new Intent(Segitiga.this, Hasil.class);
                    intent.putExtra("Hasil",""+hasil);
                    startActivity(intent);
                }
                catch (Exception ex){

                }
            }
        });

    }
}

package com.si5a.uts_carissamc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Konfirmasi_daftar extends AppCompatActivity {


    String nama, nomor, jalur;
    TextView tvNama, tvNomor, tvOpt;
    Spinner sp_jalur;

    CheckBox cb_konfirmasi;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konfirmasi_daftar);

        tvNama = findViewById(R.id.tvNama);
        tvNomor = findViewById(R.id.tvNomor);
        tvOpt = findViewById(R.id.tvOpt);
        cb_konfirmasi = findViewById(R.id.cb_konfirmasi);

        Intent terima = getIntent();

        tvNama.setText(terima.getStringExtra("VarNama"));
        tvNomor.setText(terima.getStringExtra("VarNomor"));
        tvOpt.setText(terima.getStringExtra("VarJalur"));





    }
}
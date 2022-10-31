package com.si5a.uts_carissamc;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et_nama, et_nomor;
    Button btn_daftar;
    CheckBox cb_konfirmasi;
    Spinner sp_jalur;

    String nama, nomor, jalur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        et_nama = findViewById(R.id.et_nama);
        et_nomor = findViewById(R.id.et_nomor);
        btn_daftar = findViewById(R.id.btn_daftar);
        cb_konfirmasi = findViewById(R.id.cb_konfirmasi);
        sp_jalur = findViewById(R.id.sp_jalur);

//        cb_konfirmasi.setOnClickListener(MainActivity.this);

        btn_daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nama = et_nama.getText().toString();
                nomor = et_nomor.getText().toString();
                jalur = sp_jalur.getSelectedItem().toString();



                if (nama.trim().equals("")){
                    et_nama.setError("Nama tidak boleh kosong");
                }
                else if (nomor.trim().equals("")){
                    et_nomor.setError("Nomor pendaftaran tidak boleh kosong");
                } else{
                    Intent sent = new Intent(MainActivity.this, Konfirmasi_daftar.class);
                    sent.putExtra("VarNama", nama);
                    sent.putExtra("VarNomor", nomor);
                    sent.putExtra("VarJalur", jalur);
                    startActivity(sent);
                }

            }
        });


        cb_konfirmasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cb_konfirmasi.isChecked()) {
                    Toast.makeText(MainActivity.this, "Checkbox is Checked", Toast.LENGTH_SHORT).show();
                } else if (!cb_konfirmasi.isChecked()){
                    Toast.makeText(MainActivity.this, "Checkbox is not Checked", Toast.LENGTH_SHORT).show();
                }
            }
        });




    }
}
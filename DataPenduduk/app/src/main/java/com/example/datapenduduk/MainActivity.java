package com.example.datapenduduk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.text.TextUtils;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText nik;
    EditText nm;
    RadioGroup rb;
    RadioButton rb1;
    RadioButton rb2;
    EditText ttl;
    EditText alm;
    EditText eml;
    EditText tlp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        setContentView(R.layout.activity_main);
        //inputan
        nik = findViewById(R.id.nik);
        nm = findViewById(R.id.nm);
        ttl = findViewById(R.id.ttl);
        alm = findViewById(R.id.alm);
        eml = findViewById(R.id.eml);
        tlp = findViewById(R.id.tlp);

        //JenisKelamin
        rb = findViewById(R.id.rb);

//        if (!nik.getText().toString().equals("")) {
//            Toast.makeText(MainActivity.this, "gagal", Toast.LENGTH_LONG).show();
//
//        } else {
//            Intent i1 = new Intent(this, hasilActivity.class);
//            i1.putExtra("nik", nik.getText().toString());
//            i1.putExtra("nama", nm.getText().toString());
//            i1.putExtra("jenisKelamin", rb2.getText().toString());
//            i1.putExtra("ttl", ttl.getText().toString());
//            i1.putExtra("alamat", alm.getText().toString());
//            i1.putExtra("email", eml.getText().toString());
//            i1.putExtra("telepon", tlp.getText().toString());
//            startActivity(i1);
//        }

    }

    public void Simpandata(View view) {
        int idradio = rb.getCheckedRadioButtonId();
        rb2 = findViewById(idradio);

        if (!nik.getText().toString().equals("") &&
            !nm.getText().toString().equals("") &&
            !rb2.getText().toString().equals("") &&
            !ttl.getText().toString().equals("") &&
            !alm.getText().toString().equals("") &&
            !eml.getText().toString().equals("") &&
            !tlp.getText().toString().equals("")

        ) {

            Intent i1 = new Intent(this, hasilActivity.class);
            i1.putExtra("nik", nik.getText().toString());
            i1.putExtra("nama", nm.getText().toString());
            i1.putExtra("jenisKelamin", rb2.getText().toString());
            i1.putExtra("ttl", ttl.getText().toString());
            i1.putExtra("alamat", alm.getText().toString());
            i1.putExtra("email", eml.getText().toString());
            i1.putExtra("telepon", tlp.getText().toString());
            startActivity(i1);

        } else {
            Toast.makeText(MainActivity.this, "Data yang anda isi tidak lengkap", Toast.LENGTH_LONG).show();
        }

    }



}
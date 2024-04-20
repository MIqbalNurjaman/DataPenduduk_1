package com.example.datapenduduk;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class hasilActivity extends AppCompatActivity {
    TextView txt1, txt2, txt3, txt4, txt5, txt6, txt7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_hasil);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        setContentView(R.layout.activity_hasil);

        txt1 = findViewById(R.id.hnik);
        txt2 = findViewById(R.id.hnm);
        txt3 = findViewById(R.id.hjkl);
        txt4 = findViewById(R.id.httl);
        txt5 = findViewById(R.id.halm);
        txt6 = findViewById(R.id.heml);
        txt7 = findViewById(R.id.htlp);

        String nik = getIntent().getExtras().getString("nik");
        String nama = getIntent().getExtras().getString("nama");
        String jenisKelamin = getIntent().getExtras().getString("jenisKelamin");
        String ttl = getIntent().getExtras().getString("ttl");
        String alamat = getIntent().getExtras().getString("alamat");
        String email = getIntent().getExtras().getString("email");
        String telepon = getIntent().getExtras().getString("telepon");

        txt1.setText("Nik : " + nik);
        txt2.setText("Nama : " + nama);
        txt3.setText("Jenis Kelamin : " + jenisKelamin);
        txt4.setText("Tempat Tanggal Lahir : " + ttl);
        txt5.setText("Alamat : " + alamat);
        txt6.setText("Email : " + email);
        txt7.setText("Telepon : " + telepon);


    }
}

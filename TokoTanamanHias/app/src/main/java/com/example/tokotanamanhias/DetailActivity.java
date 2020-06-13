package com.example.tokotanamanhias;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    public static final String namadet="nama detail";
    public static final String hargadet="harga detail";
    public static final String deskripsi="deskripsi";
    public static final String gambardet="NULL";
    public TextView tvnamadet;
    public TextView tvhargadet;
    public TextView tvdet;
    public ImageView imgambardet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_detail );
        tvnamadet = findViewById( R.id.tv_namadet );
        tvhargadet = findViewById( R.id.tv_hargadet );
        tvdet = findViewById( R.id.tv_det );
        imgambardet = findViewById( R.id.img_gambardet );

        String simpanama = getIntent().getStringExtra(namadet);
        String simpanharga = getIntent().getStringExtra(hargadet);
        String simpandeskripsi = getIntent().getStringExtra(deskripsi);
        String simpangambar = getIntent().getStringExtra(gambardet);

        tvnamadet.setText(simpanama);
        tvhargadet.setText(simpanharga);
        tvdet.setText(simpandeskripsi);
        Glide
                .with(this)
                .load(simpangambar)
                .centerCrop()
                .into(imgambardet);
    }
}

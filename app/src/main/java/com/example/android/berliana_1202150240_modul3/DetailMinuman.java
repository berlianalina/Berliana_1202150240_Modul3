package com.example.android.berliana_1202150240_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class DetailMinuman extends AppCompatActivity {

    //untuk metode diatas adalah deklarasi seluruh variable yang digunakan didalam class
    private Button btnAdd, btnMin;
    private ImageView progress, lblImg;
    private TextView lblJudul, lblDesc, lblStats;
    private int level =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        /*inisialisasi seluruh variable atau view yang digunakan, yaitu
        * 1. btnAdd, btnMin, progress, lblJudul, lblDesc, lblImag, lblStatus
        * 2. getIntent untuk mengambil data yang dikirimkan oleh activity sebelumnya (daftarminuman.java)
        * 3. Menampilkan semua data yang didapatkan ke lblJudul, lbdDesc, activitytitle dan lblImg
        * 4. menambahkan set onClickListener untuk actionclik pada btnAdd dan btnMin
        */
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailminuman);

        btnAdd = (Button) findViewById(R.id.btnIsiTambah);
        btnMin = (Button) findViewById(R.id.btnIsiKurang);
        progress = (ImageView) findViewById(R.id.imgIsi);

        lblJudul = (TextView) findViewById(R.id.lblJudul);
        lblDesc = (TextView) findViewById(R.id.lblDeskripsi);
        lblImg = (ImageView) findViewById(R.id.lblImg);
        lblStats = (TextView) findViewById(R.id.lblStatus);

        Intent in = getIntent();
        String title=in.getStringExtra("etitle");
        String description=in.getStringExtra("edesc");
        if(description.length()<1){description="Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin ut tincidunt dui. Etiam et tincidunt dolor. Phasellus eu rhoncus sem. Suspendisse laoreet dolor eu nisi dictum congue id ut ipsum. Etiam sagittis sodales urna. Sed condimentum arcu at pretium laoreet. Nam venenatis leo sit amet sodales malesuada. Morbi quis convallis lorem, quis malesuada elit. Integer suscipit mauris et ex finibus, id aliquam nisi maximus. Quisque lacinia suscipit ipsum, in posuere elit eleifend vel. Vestibulum vehicula, est ac interdum tristique, elit odio volutpat ex, eu eleifend erat dolor a mauris.\nInterdum et malesuada fames ac ante ipsum primis in faucibus. Nunc sagittis sagittis orci, a mollis justo ultrices id. Vestibulum a neque eget magna ultricies posuere eget ut sem. Nunc egestas vestibulum metus. Praesent et mi quis dolor pellentesque mattis quis eu turpis. Nunc convallis quis elit vitae ornare. Sed venenatis sed lorem eget posuere. Nam lobortis diam dui, et sollicitudin velit faucibus quis. Donec sit amet neque non diam aliquam imperdiet.\n";}
        int imgRes = in.getIntExtra("eimg",0);

        setTitle(title);
        lblJudul.setText(title);
        lblDesc.setText(description);
        lblImg.setImageResource(imgRes);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tambahIsi();
            }
        });

        btnMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kurangIsi();
            }
        });
    }

    //method ini berfungsi untuk menambah nilai atau level pada progress level akhir
    public void tambahIsi(){
        status();
        if(level==6){
            Toast.makeText(this,"Air Penuh",Toast.LENGTH_SHORT).show();return;}
        progress.setImageLevel(++level);
    }

    // untuk mengurang nilai atau level pada progress level akhir
    public void kurangIsi(){
        status();
        if(level==0){Toast.makeText(this,"Air Kosong",Toast.LENGTH_SHORT).show();return;}
        progress.setImageLevel(--level);
    }
    //method ini menampilkan nilai dari variable level ke lblstatus
    public void status(){
        lblStats.setText(""+level+"L");
    }
}

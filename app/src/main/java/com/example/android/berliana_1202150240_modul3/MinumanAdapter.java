package com.example.android.berliana_1202150240_modul3;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;


public class MinumanAdapter extends RecyclerView.Adapter<MinumanAdapter.MinumanViewHolder>{

    public ArrayList<ItemMinuman> datas;
    //untuk metode diatas adalah deklarasi seluruh variable yang digunakan didalam class

    //konstrukter ini berfungsi untuk mendeklarasikan data pada array list
    public MinumanAdapter(ArrayList<ItemMinuman> datas) {
        this.datas = datas;


        Log.d("JUMLAH_ARRAYLIST","Items: "+getItemCount());
    }

    @Override
    //method ini berfungsi untuk menerapkan layout activity_itemminuman sebagai rowlayout
    public MinumanViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.activity_itemminuman, parent, false);
        return new MinumanViewHolder(view);
    }

    @Override
    /*Metod ini berfungsi :
    * 1. mengambil data item minuman berdasarkan posisinya
    * 2. menampilkan seluruh data ke view pada layout
    * 3. menambahkan setOncliklistener pada holde item view yang berfungsi untukmemanggil activity_detailminuman dan mengirimkan extra data ke activity tersebut */
    public void onBindViewHolder(MinumanViewHolder holder, int position) {
        final ItemMinuman item = datas.get(position);
        holder.bindTo(item);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent go = new Intent(view.getContext().getApplicationContext(),DetailMinuman.class);
                go.putExtra("etitle",item.getNama());
                go.putExtra("edesc",item.getDeskripsi());
                go.putExtra("eimg",item.getGambar());
                view.getContext().startActivity(go);
            }
        });
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }
    //method ini befungsi untuk menghitung data pada arraylist data

    class MinumanViewHolder extends RecyclerView.ViewHolder{
        //class ini berfungsi untuk menyimpan referensi dari view view yang digunakan pada sebuah item di recyclerview

        private TextView mLblMinumanJudul;
        private TextView mLblMinumanInfo;
        private ImageView mLblMinumanImg;
        private Context mContext;
        private ItemMinuman mCurrentMinuman;

        public MinumanViewHolder(View itemView) {
            super(itemView);
            mLblMinumanJudul = (TextView)itemView.findViewById(R.id.lblItemJudul);
            mLblMinumanInfo = (TextView)itemView.findViewById(R.id.lblItemDeskripsi);
            mLblMinumanImg = (ImageView)itemView.findViewById(R.id.lblItemImg);
        }

        public void bindTo(ItemMinuman minuman){
            mCurrentMinuman = minuman;
            mLblMinumanImg.setImageResource(minuman.getGambar());
            mLblMinumanJudul.setText(minuman.getNama());
            mLblMinumanInfo.setText(minuman.getInfo());
        }
    }
}

package com.example.android.berliana_1202150240_modul3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class DaftarMinuman extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MinumanAdapter mAdapter;
    public static ArrayList<ItemMinuman> DATAS;
    //untuk metode diatas adalah deklarasi seluruh variable yang digunakan didalam class

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftarminuman);
        /*inisialisasi seluruh variable yang digunakan, yaitu :
        * isi dari arraylist dimasukan ke varaible datas
        * deklarasi mAdapter dengan data pada arrayList datas
        * deklarasi setAdapter recyclerview dengan mAdapter
        * membuat variable gridColumn
        * mengatur layout recyclerview menjadi gridLayout dengan jumlah column sesuai dengan nilai pada grindColumnCount
        * */
        DATAS = isi();
        recyclerView = (RecyclerView)findViewById(R.id.RecyclerList1);
        mAdapter = new MinumanAdapter(DATAS);
        recyclerView.setAdapter(mAdapter);

        int gridColumnCount = getResources().getInteger(R.integer.grid_column_count);

        recyclerView.setLayoutManager(new GridLayoutManager(this, gridColumnCount));

    }
    //Metod untuk menambahkan data minuman ke model item minuman
    public ArrayList<ItemMinuman> isi(){
        ArrayList<ItemMinuman> data = new ArrayList<>();
        data.add(new ItemMinuman("Aqua","Ini adalah AMDK merk AQUA","Aqua adalah sebuah merek air minum dalam kemasan (AMDK) yang diproduksi oleh PT Aqua Golden Mississippi Tbk di Indonesia sejak tahun 1973. Tirto berjasa besar atas perkembangan bisnis atau usaha AMDK di Indonesia, karena sebagai seorang pionir maka Almarhum berhasil menanamkan nilai-nilai dan cara pandang bisnis AMDK di Indonesia. ",R.drawable.aqua));
        data.add(new ItemMinuman("Amidis","Ini adalah AMDK merk AMIDIS"," air minum kesehatan yang diproses melalui sistem distilasi atau penyulingan atau penguapan,melalui proses pemanasan hingga 180 derajat celcius sehingga menghasilkan air minum yang murni (NON-MINERAL) tanpa kandungan polutan, mineral anorganik maupun bahan kontaminasi lain seperti bahan kimia maupun bahan pestisida.",R.drawable.amidis));
        data.add(new ItemMinuman("Cleo","Ini adalah AMDK merk CLEAO","Cleo adalah air murni berkadar kemurnian 99,99% mengandung oksigen sampai dengan 8mg/L @ 20°C. Air Murni Cleo diambil dari mata air pegunungan dan diproses melalui hyper membrane filter 0,0001 mikron sehingga tidak mengandung mikroorganisme dan mineral anorganik, misalnya chlorine dan natrium fluoride.",R.drawable.cleo));
        data.add(new ItemMinuman("Club","Ini adalah AMDK merk CLUB","Club adalah produk perusahaan Grup Tirta Bahagia (TB) yang berdiri sejak akhir 80an. Saat ini, perusahaan itu telah di akuisisi oleh  PT Indofood CBP Sukses Makmur Tbk (ICBP) melalui dua anak usahanya PT Tirta Makmur Perkasa (TMP) dan PT Tirta Sukses Perkasa (TSP) sebesar Rp 2,2 triliun. Air minum ini awalnya hanya di pasarkan di Jawa Timur, Sekarang kita bisa melihatnya dimana-mana.",R.drawable.club));
        data.add(new ItemMinuman("Equil","Ini adalah AMDK merk EQUIL","Equil adalah air minum yang cukup terkenal di kalangan menengah atas dan ekspatriat. Morgen Sutanto adalah pendiri  PT. Equilindo Lestari dan memulai usahanya tahun 1997. Ia melihat potensi air mineral murni cukup luas terbuka lebar. Para produsen lokal saat itu hanya bermain dalam produk air minum dalam kemasan (AMDK). Untuk air mineral premium masih dikuasai produk impor. Indonesia kaya akan mata air, akan sangat ironis kalau air pun harus mengimpor. Sekarang kita bisa melihat Equil hadir di meja restoran, hotel bintang lima, hingga meja Istana Negara saat rapat kabinet.",R.drawable.equil));
        data.add(new ItemMinuman("Evian","Ini adalah AMDK merk EVIAN","Evian adalah produk minuman mineral asal Perancis, Evian bersumber dari es murni dari pegunungan Alpen yang benar2 murni dimana kandungan mineralnya gak di ragukan dan kemurniannya bener2 yang belum terjamah sama manusia",R.drawable.evian));
        data.add(new ItemMinuman("Le Minerale","Ini adalah AMDK merk LE MINERALE","alah satu produk AMDK yang hadir di Indonesia adalah Le Minerale yang diproduksi oleh PT Tirta Fresindo Jaya, yang merupakan salah satu anak perusahaan dari Mayora Group.Sumber mata air Le Minerale berasal dari sumber mata air pegunungan terpilih yang diambil dari kedalaman 100 meter di bawah tanah dan dibotolkan langsung di sumbernya menggunakan mineral protection system untuk melindungi kandungan mineral alam",R.drawable.leminerale));
        data.add(new ItemMinuman("Nestle","Ini adalah AMDK merk NESTLE","Dulu Nestle PureLife bernama Aberfoyle Springs karena diproduksinya oleh Aberfoyle Springs sejak tahun 1993. Namun pada 2002, Nestle membelinya dan mengganti namanya menjadi pun dilakukan menjadi Nestle Pure Life Natural Spring Water. Penjualan produk ini mencapai 5 juta air per hari. Hal yang menarik dari Nestle adalah dari proses pemurnian airnya. Begitupun dengan botol-botolnya, hingga mengalami 12 langkah pemurnian dan peningkatan kualitas.",R.drawable.nestle));
        data.add(new ItemMinuman("Pristine","Ini adalah AMDK merk PRISTINE","Sumber mata air PRISTINE murni dan asli berasal dari Pegunungan Pangrango Gede,30 mil dari Jakarta Selatan ( 1.5 jam dari Jakarta Pusat),berlokasi disamping “ Taman Nasional Pangrango Gede”.\n",R.drawable.pristine));
        data.add(new ItemMinuman("Vit","Ini adalah AMDK merk VIT","VIT adalah sebuah merek air minum dalam kemasan (AMDK) yang diproduksi oleh PT Tirta Investama di Indonesia. Mulai diproduksi sejak tanggal 16 November 1982 dan awalnya dimiliki oleh PT Varia Industri Tirta. Pada tanggal 17 Juli 1987 kepemilikan PT Varia Industri Tirta beralih kepada Tirto Utomo.",R.drawable.vit));
        return data;
    }
}

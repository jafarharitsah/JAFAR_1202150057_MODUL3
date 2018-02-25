package com.example.lenovog480.ead;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity { //membuat class main activity

    private List<Minuman> minumanList = new ArrayList<>();
    private RecyclerView recyclerView;
    private RecyclerViewAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) { //variable instan yg dapat diakses pada kelas sendiri dan subkelasnya
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("JAFAR_1202150057_MODUL3");

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mAdapter = new RecyclerViewAdapter(minumanList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        dataMinuman();
    }

    public void dataMinuman(){ //membuat penjelasan pada beberapa minuman
        Minuman menu = new Minuman(R.drawable.aqua, "Aqua", "Air Minum Merk Aqua Dari Pegunungan Asli", "Aqua adalah sebuah merek air minum dalam kemasan (AMDK) yang diproduksi oleh PT Aqua Golden Mississippi Tbk di Indonesia sejak tahun 1973. Selain di Indonesia, Aqua juga dijual di Malaysia, Singapura, dan Brunei. Aqua adalah merek AMDK dengan penjualan terbesar di Indonesia dan merupakan salah satu merek AMDK yang paling terkenal di Indonesia, sehingga telah menjadi seperti merek generik untuk AMDK.");
        minumanList.add(menu);
        menu = new Minuman(R.drawable.pristine, "Pristine", "Air Minum Pristine Dari Pegunungan Asli", "Water Sources of PRISTINE original come from Pangrango Gede Mountain, 30 miles from the South Jakarta (1.5 hours from Central Jakarta), located beside the \"National Park Pangrango Gede\".");
        minumanList.add(menu);
        menu = new Minuman(R.drawable.leminerale, "Leminerale", "Air Minum Leminerale Dari Pegunungan", "Le Minerale, sebanyak 60 persen atau 15 miliar liter dikonsumsi di Jabodetabek, dan sisanya menyebar di seluruh Indonesia. Maka jangan heran kalau sekarang ini makin banyak merek air mineral kemasan dijual di pasaran.");
        minumanList.add(menu);
        menu = new Minuman(R.drawable.cleo, "Cleo", "Air Minum Merk Cleo Dari Pegunungan Asli", "Cleo pure water adalah air yang kadar kemurniannya mendekati 100%. Air semacam ini tidak lagi mengandung bakteri, virus, mineral atau zat-zat lain yang akan membahayakan tubuh dalam jangka panjang. Konsumsilah air murni, sebab mengonsumsi air yang tidak murni justru mengundang risiko");
        minumanList.add(menu);
        menu = new Minuman(R.drawable.club, "Club", "Air Minum Merk Club Dari Pegunungan Asli", "Club adalah merek air minum dalam kemasan atau air mineral di Indonesia. Merek ini berasal dari Surabaya dan Pandaan, Pasuruan, Jawa Timur. Club diproduksi oleh PT Tirta Sukses Perkasa (dahulu PT Tirta Bahagia) sejak tahun 1986. Pada bulan November 2013, merek Club diakuisisi oleh PT Indofood CBP Sukses Makmur Tbk.");
        minumanList.add(menu);
        menu = new Minuman(R.drawable.vit, "Vit", "Air Minum Merk Vit Dari Pegunungan Asli", "VIT adalah sebuah merek air minum dalam kemasan (AMDK) yang diproduksi oleh PT Tirta Investama di Indonesia. Mulai diproduksi sejak tanggal 16 November 1982 dan awalnya dimiliki oleh PT Varia Industri Tirta. Pada tanggal 17 Juli 1987 kepemilikan PT Varia Industri Tirta beralih kepada Tirto Utomo. Sebelas tahun kemudian, setelah melakukan merger dengan PT Varia Industri Tirta, PT Tirta Investama menjadi pemilik merek VIT.");
        minumanList.add(menu);
        menu = new Minuman(R.drawable.ades, "Ades", "Air Minum Merk Ades Dari Pegunungan Asli", "Ades (sebelumnya pernah disebut AdeS) adalah merek air mineral atau air minum dalam kemasan (AMDK) yang diproduksi oleh PT. Coca-Cola Bottling Indonesia, Bekasi. Air mineral tersebut juga dikenal sebagai I-Lohas di Jepang");
        menu = new Minuman(R.drawable.nestle, "Nestle", "Air Minum Merk Nestle Dari Pegunungan", "Henri Nestlé’s water bottling factory was the earliest incarnation of what would eventually become the world’s leading bottled water company. Nestlé took a step onto the world stage with giants such as Perrier and Nestlé Pure Life. This is commercialized since 1998. Today this impressive portfolio encompasses 50 brands on five continents");
        minumanList.add(menu);
        menu = new Minuman(R.drawable.amidis, "Amidis", "Air Minum Amidis Dari Pegunungan Asli", "AMIDIS adalah produk Air Minum Dalam Kemasan (AMDK) yang sudah diproduksi sejak tahun 1997 dan merupakan air minum distilasi pertama di Indonesia yang telah menjadi salah satu produk AMDK yang dipercaya karena kualitas mutu dan kemurniannya.");
        minumanList.add(menu);
        menu = new Minuman(R.drawable.equil, "Equil", "Air Minum Merk Equil Dari Pegunungan", "EQUIL  was first bottled in 1998 at the source, Villa D’Equilibrium, and launched to the market which was then predominantly monopolized by few European brands. Although drinking natural mineral water is embedded in the European fine dining culture, the gourmet and exclusivity of the concept has been accepted by the local Socialites.");
        minumanList.add(menu);
        menu = new Minuman(R.drawable.evian, "Evian", "Air Minum Evian Dari Pegunungan Asli", "Evian is owned by Danone, a French multinational corporation. In addition to the mineral water, Danone Group uses the Evian name for a line of organic skin care products as well as a luxury resort in France.");
        minumanList.add(menu);
        mAdapter.notifyDataSetChanged();
    }
}

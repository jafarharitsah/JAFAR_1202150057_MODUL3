package com.example.lenovog480.ead;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity { //membuat class detail activity
    int count = 0;
    int angka, angkas;
    int counts = 6;
    TextView nama, tentang, levelbatre;
    ImageView batre, gambar, plus, minus;

    @Override
    protected void onCreate(Bundle savedInstanceState) { //variable instan yg dapat diakses pada kelas sendiri dan subkelasnya
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        getSupportActionBar().hide();


        Bundle extras = getIntent().getExtras();
        if (extras == null)
        {
            return;
        }
        nama = (TextView)findViewById(R.id.judul);
        tentang = (TextView)findViewById(R.id.tentang);
        gambar = (ImageView)findViewById(R.id.gambar2);



        int foto = extras.getInt("gambar");
        String judul = getIntent().getExtras().getString("nama");
        String about = getIntent().getExtras().getString("komposisi");

        gambar.setImageResource(foto);
        nama.setText(judul);
        tentang.setText(about);

        Toast.makeText(DetailActivity.this,"Air Masih Sedikit",Toast.LENGTH_LONG).show();

        batre = (ImageView)findViewById(R.id.gambarbatre);
        plus = (ImageView)findViewById(R.id.tambah);
        minus = (ImageView)findViewById(R.id.kurang);
        levelbatre = (TextView)findViewById(R.id.level);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { //untuk mengatur ukuran dari air pada galon
                switch (view.getId()){
                    case R.id.tambah:
                        batre.setImageLevel(count);
                        count++;
                        angka = count;
                        final String hasil = String.valueOf(angka);
                        levelbatre.setText(hasil);
                       // if(angka==count){
                         //   angka = count;
                        //}
                        if(count>=7){
                            count=6;
                            Toast.makeText(DetailActivity.this,"Air Sudah Full",Toast.LENGTH_LONG).show();
                            count=1;
                        }
                        break;


                    default:
                        break;
                }

            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { //untuk mengatur ukuran dari air
                switch (view.getId()){
                case R.id.kurang:
                batre.setImageLevel(counts);
                counts--;
                angkas = counts;
                final String hasil = String.valueOf(angkas);
                    levelbatre.setText(hasil);
                if (counts<1){
                    counts = 0;
                    Toast.makeText(DetailActivity.this,"Air Sedikit",Toast.LENGTH_LONG).show();
                    counts =6;
                }
                break;

                default:
                    break;
            }
            }
        });
    }

}


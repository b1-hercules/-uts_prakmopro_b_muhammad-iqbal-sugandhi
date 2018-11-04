package com.example.nginx.latesoccer;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.nginx.latesoccer.adapter.MainAdapter;
import com.example.nginx.latesoccer.model.MainModel;


import java.util.LinkedList;

import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    private final LinkedList<MainModel> listTim = new LinkedList<>();
    private RecyclerView recyclerView;
    private MainAdapter mainAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        changeLanguage();

        String mufc = "Manchester United Football Club adalah sebuah klub sepak bola profesional Inggris yang berbasis di Old Trafford, " +
                "Manchester Raya, yang bermain di Liga Inggris. Didirikan sebagai Newton Heath LYR Football Club pada tahun 1878, klub ini " +
                "berganti nama menjadi Manchester United pada 1902 dan pindah ke Old Trafford pada tahun 1910.";
        String mcfc = "Manchester City Football Club adalah sebuah klub sepak bola profesional dari Inggris yang bermain di Liga Premier Inggris. " +
                "Klub ini merupakaan klub sekota dengan Manchester United dan bermarkas di Stadion Etihad, Manchester. Pertandingan pertama dimainkan pada bulan November 1880.";
        String juve = "Juventus Football Club S.p.A. popular dengan nama Juve adalah klub sepak bola profesional Italia yang berbasis di Turin, Piedmont. Klub sepak bola ini adalah" +
                " yang tertua ketiga di Italia dan telah menghabiskan sebagian besar sejarahnya, dengan pengecualian pada musim 2006–07, di atas klasemen Divisi Pertama (dikenal sebagai Serie A sejak 1929).";
        String lgfc ="Lechia Gdańsk merupakan sebuah tim sepak bola Polandia yang bermain di divisi utama Ekstraklasa. Didirikan pada tahun 1945. Bermarkas di Gdańsk. " +
                "Klub ini memainkan pertandingan kandangnya di PGE Arena Gdańsk yang berkapasitas 43.615 penonton. Seragam mereka berwarna putih hijau.";
        String fcbm = "Fußball-Club Bayern München e.V., juga dikenal sebagai FC Bayern München , FC Bayern Munich, atau FC Bayern, adalah sebuah klub olahraga Jerman yang " +
                "berbasis di München, Bavaria. Hal ini terkenal karena tim sepak bola profesional, yang bermain di Bundesliga, peringkat teratas sistem liga sepak bola Jerman" +
                ", dan merupakan klub paling sukses dalam sejarah sepak bola Jerman, setelah memenangkan rekor 28 gelar nasional dan 18 piala nasional.";
        String bvb = "Ballspielverein Borussia 09 e.V. Dortmund umumnya dikenal sebagai Borussia Dortmund, Dortmund, atau BVB, adalah klub sepak bola di Jerman berbasis di kota Dortmund, Nordrhein-Westfalen. Tim ini bermain di Bundesliga dan termasuk salah satu klub yang paling sukses di sejarah Sepak Bola Jerman.";

        listTim.addLast(new MainModel("Manchester United", "Manchester, Inggris", mufc, R.drawable.mufc));
        listTim.addLast(new MainModel("Manchester City ","Manchester, Inggris", mcfc, R.drawable.mcfc));
        listTim.addLast(new MainModel("Juventus","Turin, Piedmont", juve, R.drawable.juve));
        listTim.addLast(new MainModel("Lechia Gdańsk","Gdańsk, Polandia", lgfc, R.drawable.lgfc));
        listTim.addLast(new MainModel("Bayern München","München, Bavaria", fcbm, R.drawable.fcbm));
        listTim.addLast(new MainModel("Borussia Dortmund","Dortmund, Nordrhein-Westfalen", bvb, R.drawable.bvb));

        recyclerView = findViewById(R.id.rvList_tim);
        mainAdapter = new MainAdapter(MainActivity.this,listTim);
        recyclerView.setAdapter(mainAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void changeLanguage() {
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.item, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.profile:
                startActivity(new Intent(MainActivity.this, ProfileActivity.class));
                return true;
            case R.id.pindahBahasa:
                Intent mIntent = new Intent(Settings.ACTION_LOCALE_SETTINGS);
                startActivity(mIntent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}

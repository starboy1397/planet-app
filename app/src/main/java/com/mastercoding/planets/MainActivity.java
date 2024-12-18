package com.mastercoding.planets;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.mastercoding.planets.databinding.ActivityMainBinding;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    ArrayList<PlanetModel> planetsArrayList;

    private ActivityMainBinding viewBinding;
    private static PlanetAdapter planetAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(viewBinding.getRoot());

        // 1 - AdapterView: a ListView
        // already we are use viewbinding so not needed

        // 2 - Data source : ArrayList<PlanetModel>

        planetsArrayList = new ArrayList<>();
        PlanetModel planet1 = new PlanetModel("Earth", R.drawable.earth, "1");
        PlanetModel planet2 = new PlanetModel("Mars", R.drawable.mars, "2");
        PlanetModel planet3 = new PlanetModel("Jupiter", R.drawable.jupiter, "79");
        PlanetModel planet4 = new PlanetModel("Saturn", R.drawable.saturn, "82");
        PlanetModel planet5 = new PlanetModel("Neptune", R.drawable.neptune, "14");
        PlanetModel planet6 = new PlanetModel("Uranus", R.drawable.uranus, "27");
        PlanetModel planet7 = new PlanetModel("Venus", R.drawable.venus, "0");
        PlanetModel planet8 = new PlanetModel("Mercury", R.drawable.mercury, "0");
        PlanetModel planet9 = new PlanetModel("Pluto", R.drawable.pluto, "5");

        planetsArrayList.add(planet1);
        planetsArrayList.add(planet2);
        planetsArrayList.add(planet3);
        planetsArrayList.add(planet4);
        planetsArrayList.add(planet5);
        planetsArrayList.add(planet6);
        planetsArrayList.add(planet7);
        planetsArrayList.add(planet8);
        planetsArrayList.add(planet9);

        // 3 - Adapter: PlanetAdapter
        planetAdapter = new PlanetAdapter(this, planetsArrayList);
        viewBinding.listView.setAdapter(planetAdapter);

        //handling click events
        viewBinding.listView.setOnItemClickListener((AdapterView<?> parent, View view,int position,long id) -> {

            Toast.makeText(this,
                    "Planet name : " + planetsArrayList.get(position).getPlanetName(),
                    Toast.LENGTH_SHORT).show();
        });

    }
}
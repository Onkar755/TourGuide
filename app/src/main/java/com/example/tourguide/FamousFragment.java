package com.example.tourguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class FamousFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.image_list, container, false);

        final ArrayList<Location> words = new ArrayList<>();

        words.add(new Location("Trimbakeshwar ", R.drawable.trimbak));
        words.add(new Location("Pandavleni Caves", R.drawable.pandavleni));
        words.add(new Location("Sula Vineyards", R.drawable.sula_vine));
        words.add(new Location("Kalaram Temple", R.drawable.kalaram));
        words.add(new Location("Mangi Tungi", R.drawable.mangi_tungi));
        words.add(new Location("Coin Museum", R.drawable.coin_museum));
        words.add(new Location("Anjaneri Hills", R.drawable.anjaneri));
        words.add(new Location("Ramkund", R.drawable.ramkund));
        words.add(new Location("Ramshej Fort", R.drawable.ramshej));
        words.add(new Location("Dhudsagar Falls", R.drawable.someshwar));

        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), words);

        ListView listView = rootView.findViewById(R.id.image_list);

        listView.setAdapter(locationAdapter);


        return rootView;
    }

}
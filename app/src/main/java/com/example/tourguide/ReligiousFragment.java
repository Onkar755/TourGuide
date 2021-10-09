package com.example.tourguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class ReligiousFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.image_list, container, false);

        final ArrayList<Location> words = new ArrayList<>();

        words.add(new Location(R.string.religion_trimbakeshwar, R.drawable.trimbak));
        words.add(new Location(R.string.religion_kalaram, R.drawable.kalaram));
        words.add(new Location(R.string.religion_ramkund, R.drawable.ramkund));
        words.add(new Location(R.string.religion_saptashrungi, R.drawable.saptashuringi));

        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), words);

        ListView listView = rootView.findViewById(R.id.image_list);

        listView.setAdapter(locationAdapter);

        return rootView;
    }

}

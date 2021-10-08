package com.example.tourguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class DamFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.image_list, container, false);

        final ArrayList<Location> words = new ArrayList<>();

        words.add(new Location("Gangapur", R.drawable.gangapur_dam));
        words.add(new Location("Kashyapi", R.drawable.kashyapi_dam));
        words.add(new Location("Girna", R.drawable.girna_dam));
        words.add(new Location("Karanjwan", R.drawable.karanjwan_dam));

        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), words);

        ListView listView = rootView.findViewById(R.id.image_list);

        listView.setAdapter(locationAdapter);

        return rootView;
    }
}

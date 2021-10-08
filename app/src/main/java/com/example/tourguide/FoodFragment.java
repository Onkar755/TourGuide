package com.example.tourguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class FoodFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.image_list, container, false);

        final ArrayList<Location> words = new ArrayList<>();

        words.add(new Location("Misal Pav", R.drawable.misalpav));
        words.add(new Location("Dabeli", R.drawable.dabeli));
        words.add(new Location("Sabudana Vada", R.drawable.sabudanavada));
        words.add(new Location("Vada Pav", R.drawable.vadapav));
        words.add(new Location("Pav Bhaji", R.drawable.pavbhaji));

        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), words);

        ListView listView = rootView.findViewById(R.id.image_list);

        listView.setAdapter(locationAdapter);

        return rootView;
    }
}

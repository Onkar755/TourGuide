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

        words.add(new Location(R.string.food_misal, R.drawable.misalpav));
        words.add(new Location(R.string.food_dabeli, R.drawable.dabeli));
        words.add(new Location(R.string.food_sabudana, R.drawable.sabudanavada));
        words.add(new Location(R.string.food_vada, R.drawable.vadapav));
        words.add(new Location(R.string.food_pav, R.drawable.pavbhaji));

        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), words);

        ListView listView = rootView.findViewById(R.id.image_list);

        listView.setAdapter(locationAdapter);

        return rootView;
    }
}

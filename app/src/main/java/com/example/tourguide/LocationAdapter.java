package com.example.tourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter {
    public LocationAdapter(Activity context, ArrayList<Location> location) {
        super(context, 0, location);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);

        }

        Location currentLocation = (Location) getItem(position);
        TextView name = listItemView.findViewById(R.id.name);

        name.setText(currentLocation.getName());

        ImageView imageView = listItemView.findViewById(R.id.image);
        imageView.setClipToOutline(true);

        if (currentLocation.hasImage()) {
            imageView.setImageResource(currentLocation.getImageResource());
        } else {
            imageView.setVisibility(View.GONE);
        }
        return listItemView;
    }
}

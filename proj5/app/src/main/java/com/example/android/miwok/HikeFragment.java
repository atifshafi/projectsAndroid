package com.example.android.miwok;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of family vocabulary words.
 */
public class HikeFragment extends Fragment {

    public HikeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of words
        final ArrayList<Location> hikes = new ArrayList<Location>();
        hikes.add(new Location("Grouse Mountain", "6400 Nancy Greene Way", "Amazing", R.drawable.grouse, "Hard"));
        hikes.add(new Location("Grouse Mountain", "6400 Nancy Greene Way", "Amazing", R.drawable.grouse, "Hard"));
        hikes.add(new Location("Grouse Mountain", "6400 Nancy Greene Way", "Amazing", R.drawable.grouse, "Hard"));
        hikes.add(new Location("Grouse Mountain", "6400 Nancy Greene Way", "Amazing", R.drawable.grouse, "Hard"));
        hikes.add(new Location("Grouse Mountain", "6400 Nancy Greene Way", "Amazing", R.drawable.grouse, "Hard"));
        hikes.add(new Location("Grouse Mountain", "6400 Nancy Greene Way", "Amazing", R.drawable.grouse, "Hard"));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        LocationAdapter adapter = new LocationAdapter(getActivity(), hikes, R.color.category_hike);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }

}
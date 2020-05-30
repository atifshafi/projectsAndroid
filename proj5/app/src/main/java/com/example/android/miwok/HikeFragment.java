package com.example.android.miwok;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of hiking locations.
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
        hikes.add(new Location(getString(R.string.hike_location_1_name), getString(R.string.hike_location_1_address), getString(R.string.hike_location_1_description), R.drawable.grouse, getString(R.string.hike_location_1_difficulty)));
        hikes.add(new Location(getString(R.string.hike_location_2_name), getString(R.string.hike_location_2_address), getString(R.string.hike_location_2_description), R.drawable.cypress, getString(R.string.hike_location_2_difficulty)));
        hikes.add(new Location(getString(R.string.hike_location_3_name), getString(R.string.hike_location_3_address), getString(R.string.hike_location_3_description), R.drawable.seymour, getString(R.string.hike_location_3_difficulty)));
        hikes.add(new Location(getString(R.string.hike_location_4_name), getString(R.string.hike_location_4_address), getString(R.string.hike_location_4_description), R.drawable.deep_cove, getString(R.string.hike_location_4_difficulty)));


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
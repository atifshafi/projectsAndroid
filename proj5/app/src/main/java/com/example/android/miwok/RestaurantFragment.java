package com.example.android.miwok;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of restaurants.
 */
public class RestaurantFragment extends Fragment {

    public RestaurantFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of words
        final ArrayList<Location> restautants = new ArrayList<Location>();
        restautants.add(new Location(getString(R.string.restaurant_location_1_name), getString(R.string.restaurant_location_1_address), getString(R.string.restaurant_location_1_description)));
        restautants.add(new Location(getString(R.string.restaurant_location_2_name), getString(R.string.restaurant_location_2_address), getString(R.string.restaurant_location_2_description)));
        restautants.add(new Location(getString(R.string.restaurant_location_3_name), getString(R.string.restaurant_location_3_address), getString(R.string.restaurant_location_3_description)));
        restautants.add(new Location(getString(R.string.restaurant_location_4_name), getString(R.string.restaurant_location_4_address), getString(R.string.restaurant_location_4_description)));
        restautants.add(new Location(getString(R.string.restaurant_location_1_name), getString(R.string.restaurant_location_1_address), getString(R.string.restaurant_location_1_description)));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        LocationAdapter adapter = new LocationAdapter(getActivity(), restautants, R.color.category_restaurants);

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

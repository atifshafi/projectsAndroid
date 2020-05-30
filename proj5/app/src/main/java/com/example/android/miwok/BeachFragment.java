package com.example.android.miwok;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of beaches.
 */
public class BeachFragment extends Fragment {

    public BeachFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);


        // Create a list of words
        final ArrayList<Location> beaches = new ArrayList<Location>();
        beaches.add(new Location(getString(R.string.beach_location_1_name), getString(R.string.beach_location_1_address), getString(R.string.beach_location_1_description), R.drawable.kitsilano_beach));
        beaches.add(new Location(getString(R.string.beach_location_2_name), getString(R.string.beach_location_2_address), getString(R.string.beach_location_2_description), R.drawable.english_bay));
        beaches.add(new Location(getString(R.string.beach_location_3_name), getString(R.string.beach_location_3_address), getString(R.string.beach_location_3_description), R.drawable.jericho_beach));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        LocationAdapter adapter = new LocationAdapter(getActivity(), beaches, R.color.category_beached);

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

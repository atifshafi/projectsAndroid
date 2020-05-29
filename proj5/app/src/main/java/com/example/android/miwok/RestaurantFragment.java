package com.example.android.miwok;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of color vocabulary words.
 */
public class RestaurantFragment extends Fragment {


    /**
     * This listener gets triggered whenever the audio focus changes
     * (i.e., we gain or lose audio focus because of another app or device).
     */


    public RestaurantFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);


        // Create a list of words
        final ArrayList<Location> restautants = new ArrayList<Location>();
        restautants.add(new Location("Au Comptoir", "2278 W 4th Ave, Vancouver", "Take a trip to an excellent Parisian bistro by way of the city’s beachside Kitsilano neighborhood, where up-and-comer chef Dan McGee and team are whipping up French standards with B.C.’s finest produce. The stunning custom-made bar comes from France, and even the serving staff are mostly French, although with the happy addition of Canadian manners. With buttery croissants in the morning, gooey croque-monsieur at lunch, and juicy entrecôte-frites with a mouthwatering crisp char at dinner, anytime is a good time for Au Comptoir. [$$]"));
        restautants.add(new Location("Au Comptoir", "2278 W 4th Ave, Vancouver", "Take a trip to an excellent Parisian bistro by way of the city’s beachside Kitsilano neighborhood, where up-and-comer chef Dan McGee and team are whipping up French standards with B.C.’s finest produce. The stunning custom-made bar comes from France, and even the serving staff are mostly French, although with the happy addition of Canadian manners. With buttery croissants in the morning, gooey croque-monsieur at lunch, and juicy entrecôte-frites with a mouthwatering crisp char at dinner, anytime is a good time for Au Comptoir. [$$]"));
        restautants.add(new Location("Au Comptoir", "2278 W 4th Ave, Vancouver", "Take a trip to an excellent Parisian bistro by way of the city’s beachside Kitsilano neighborhood, where up-and-comer chef Dan McGee and team are whipping up French standards with B.C.’s finest produce. The stunning custom-made bar comes from France, and even the serving staff are mostly French, although with the happy addition of Canadian manners. With buttery croissants in the morning, gooey croque-monsieur at lunch, and juicy entrecôte-frites with a mouthwatering crisp char at dinner, anytime is a good time for Au Comptoir. [$$]"));
        restautants.add(new Location("Au Comptoir", "2278 W 4th Ave, Vancouver", "Take a trip to an excellent Parisian bistro by way of the city’s beachside Kitsilano neighborhood, where up-and-comer chef Dan McGee and team are whipping up French standards with B.C.’s finest produce. The stunning custom-made bar comes from France, and even the serving staff are mostly French, although with the happy addition of Canadian manners. With buttery croissants in the morning, gooey croque-monsieur at lunch, and juicy entrecôte-frites with a mouthwatering crisp char at dinner, anytime is a good time for Au Comptoir. [$$]"));
        restautants.add(new Location("Au Comptoir", "2278 W 4th Ave, Vancouver", "Take a trip to an excellent Parisian bistro by way of the city’s beachside Kitsilano neighborhood, where up-and-comer chef Dan McGee and team are whipping up French standards with B.C.’s finest produce. The stunning custom-made bar comes from France, and even the serving staff are mostly French, although with the happy addition of Canadian manners. With buttery croissants in the morning, gooey croque-monsieur at lunch, and juicy entrecôte-frites with a mouthwatering crisp char at dinner, anytime is a good time for Au Comptoir. [$$]"));
        restautants.add(new Location("Au Comptoir", "2278 W 4th Ave, Vancouver", "Take a trip to an excellent Parisian bistro by way of the city’s beachside Kitsilano neighborhood, where up-and-comer chef Dan McGee and team are whipping up French standards with B.C.’s finest produce. The stunning custom-made bar comes from France, and even the serving staff are mostly French, although with the happy addition of Canadian manners. With buttery croissants in the morning, gooey croque-monsieur at lunch, and juicy entrecôte-frites with a mouthwatering crisp char at dinner, anytime is a good time for Au Comptoir. [$$]"));

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

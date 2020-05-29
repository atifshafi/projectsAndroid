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
public class BeachFragment extends Fragment {


    /**
     * This listener gets triggered whenever the audio focus changes
     * (i.e., we gain or lose audio focus because of another app or device).
     */


    public BeachFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);


        // Create a list of words
        final ArrayList<Location> beaches = new ArrayList<Location>();
        beaches.add(new Location("Kitsilano Beach", "2278 W 4th Ave, Vancouver", "If Vancouver is \"Hollywood North,\" then Kitsilano Beach, known as \"Kits Beach\" to locals, is our Venice Beach. Buff and bronzed bodies are sure to make their rounds, but don't be worry, you're sure to fit in somewhere among the mix of joggers, stroller-pushing families, sun-worshippers and your everyday loungers. Grassy patches above the tide line are perfect for tossing the disc, the tennis courts are always popular, and the beach attracts volleyball players from all over the city. And don't forget Kits Pool where kids and adults can splash away the day in an outdoor, heated salt-water pool with a wrap-around view of the city, ocean and mountains. It's almost three times the size of an Olympic pool.", R.drawable.kitsilano_beach));
        beaches.add(new Location("Kitsilano Beach", "2278 W 4th Ave, Vancouver", "If Vancouver is \"Hollywood North,\" then Kitsilano Beach, known as \"Kits Beach\" to locals, is our Venice Beach. Buff and bronzed bodies are sure to make their rounds, but don't be worry, you're sure to fit in somewhere among the mix of joggers, stroller-pushing families, sun-worshippers and your everyday loungers. Grassy patches above the tide line are perfect for tossing the disc, the tennis courts are always popular, and the beach attracts volleyball players from all over the city. And don't forget Kits Pool where kids and adults can splash away the day in an outdoor, heated salt-water pool with a wrap-around view of the city, ocean and mountains. It's almost three times the size of an Olympic pool.", R.drawable.grouse));
        beaches.add(new Location("Kitsilano Beach", "2278 W 4th Ave, Vancouver", "If Vancouver is \"Hollywood North,\" then Kitsilano Beach, known as \"Kits Beach\" to locals, is our Venice Beach. Buff and bronzed bodies are sure to make their rounds, but don't be worry, you're sure to fit in somewhere among the mix of joggers, stroller-pushing families, sun-worshippers and your everyday loungers. Grassy patches above the tide line are perfect for tossing the disc, the tennis courts are always popular, and the beach attracts volleyball players from all over the city. And don't forget Kits Pool where kids and adults can splash away the day in an outdoor, heated salt-water pool with a wrap-around view of the city, ocean and mountains. It's almost three times the size of an Olympic pool.", R.drawable.grouse));
        beaches.add(new Location("Kitsilano Beach", "2278 W 4th Ave, Vancouver", "If Vancouver is \"Hollywood North,\" then Kitsilano Beach, known as \"Kits Beach\" to locals, is our Venice Beach. Buff and bronzed bodies are sure to make their rounds, but don't be worry, you're sure to fit in somewhere among the mix of joggers, stroller-pushing families, sun-worshippers and your everyday loungers. Grassy patches above the tide line are perfect for tossing the disc, the tennis courts are always popular, and the beach attracts volleyball players from all over the city. And don't forget Kits Pool where kids and adults can splash away the day in an outdoor, heated salt-water pool with a wrap-around view of the city, ocean and mountains. It's almost three times the size of an Olympic pool.", R.drawable.grouse));
        beaches.add(new Location("Kitsilano Beach", "2278 W 4th Ave, Vancouver", "If Vancouver is \"Hollywood North,\" then Kitsilano Beach, known as \"Kits Beach\" to locals, is our Venice Beach. Buff and bronzed bodies are sure to make their rounds, but don't be worry, you're sure to fit in somewhere among the mix of joggers, stroller-pushing families, sun-worshippers and your everyday loungers. Grassy patches above the tide line are perfect for tossing the disc, the tennis courts are always popular, and the beach attracts volleyball players from all over the city. And don't forget Kits Pool where kids and adults can splash away the day in an outdoor, heated salt-water pool with a wrap-around view of the city, ocean and mountains. It's almost three times the size of an Olympic pool.", R.drawable.grouse));


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

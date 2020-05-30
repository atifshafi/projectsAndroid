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
        beaches.add(new Location("Kitsilano Beach", "2278 W 4th Ave, Vancouver", "If Vancouver is \"Hollywood North,\" then Kitsilano Beach, known as \"Kits Beach\" to locals, is our Venice Beach. Buff and bronzed bodies are sure to make their rounds, but don't be worry, you're sure to fit in somewhere among the mix of joggers, stroller-pushing families, sun-worshippers and your everyday loungers. Grassy patches above the tide line are perfect for tossing the disc, the tennis courts are always popular, and the beach attracts volleyball players from all over the city. And don't forget Kits Pool where kids and adults can splash away the day in an outdoor, heated salt-water pool with a wrap-around view of the city, ocean and mountains. It's almost three times the size of an Olympic pool.", R.drawable.kitsilano_beach));
        beaches.add(new Location("English Bay Beach", "Beach Ave, Vancouver, BC V6C 3C1", "Overlooking the eponymous English Bay, English Bay Beach offers an oceanside sanctuary in the otherwise busy West End of downtown Vancouver. With Stanley Park to one side, the hustle and bustle of downtown life on the other, and the Stanley Park Seawall running right along it, English Bay Beach is a lively beach with plenty of people watching. If you're staying downtown, English Bay Beach is one of the easiest of Vancouver's beaches to access by foot, bike, or public transit. On a blazing summer day, it sometimes feels like half of the city is at English Bay Beach, and finding a spot to set out a towel or picnic blanket can get a little competitive. Arrive early, or be prepared to make new friends. There are plenty of reasons to visit in the winter months, too—one in particular is the Polar Bear Swim. For many Vancouverites, this traditional dip in not-so-warm waters is the preferred way to ring in the New Year. Up for the challenge?", R.drawable.english_bay));
        beaches.add(new Location("Jericho Beach", "Point Grey Rd, Vancouver, BC V6R 1B5", "Jericho Beach is a lovely stretch of sandy oceanfront between the Kitsilano and West Point Grey neighborhoods—but it's so much more than that. It's home to some of Vancouver's posher facilities, like the members-only Royal Vancouver Yacht Club and Jericho Tennis Club, as well as tennis courts that are open to the public. While Vancouver's beaches can be enjoyed from shore or by taking a dip in the ocean, one of the most exciting ways to experience them is to get way out in the water. Jericho Beach hosts the non-profit Jericho Sailing Centre, where anyone can access sailing, windsurfing, stand up paddleboarding, and skimboarding lessons and rentals. The adjacent park area features a network of winding trails—the ideal place for a dog walk or trail run. Just keep your eyes on Fido—there is a considerable rabbit population in the area that might spark a spirited chase.", R.drawable.jericho_beach));


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

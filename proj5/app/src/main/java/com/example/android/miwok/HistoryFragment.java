package com.example.android.miwok;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of historical monuments.
 */
public class HistoryFragment extends Fragment {

    public HistoryFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);


        // Create a list of words
        final ArrayList<Location> historicalMonuments = new ArrayList<Location>();
        historicalMonuments.add(new Location("Brock House", "3875 Point Grey Road", "This Tudor Revival house was originally a private residence and at one time a Royal Canadian Mounted Police detachment. This is now a seniors activity centre, Brock House Society, and a restaurant open to the public. Brock House Restaurant stages over 200 weddings per year."));
        historicalMonuments.add(new Location("Holy Rosary Cathedral", "646 Richards St", "Built in 1899, this French Gothic style Roman Catholic church is a sight to behold. It stands out in Vancouver in its uniqueness from any other church in the city."));
        historicalMonuments.add(new Location("Hycroft", "1489 McRae Ave", "Built in 1909, this lavish mansion was once the gathering point for all of Vancouver's more important socialites. The owner, General Alexander Duncan McRae, often hosted extraordinary parties and later donated the property to the government of Canada. It is currently one of the most-used filming locations in Vancouver."));
        historicalMonuments.add(new Location("Hastings Mill Store", "1575 Alma Rd", "The oldest building in Vancouver, built in 1865, sits proudly on the shore next to Jericho Beach. The building was moved by barge from its original location. It now functions as a museum and is surrounded by a beautiful park."));

        // Create an {@link LocationAdapter}, whose data source is a list of {@link Location}s. The
        // adapter knows how to create list items for each item in the list.
        LocationAdapter adapter = new LocationAdapter(getActivity(), historicalMonuments, R.color.category_history);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link LocationAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Location} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}

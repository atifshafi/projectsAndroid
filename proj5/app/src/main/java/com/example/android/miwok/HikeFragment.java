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
        hikes.add(new Location("Grouse Mountain", "6400 Nancy Greene Way", "Amazing", R.drawable.grouse, "Difficulty: Hard"));
        hikes.add(new Location("Cypress Provincial Park", "6000 Cypress Bowl Rd, West Vancouver", "On clear days, the summit of this hike offers unparalleled views of Howe Sound. Even on overcast days, you’ll feel like a conqueror above the clouds. The trail first follows ski runs with steep and rocky sections, before heading into a pretty forest. Continue along before gaining some elevation over a steep set of switchbacks. The forest eventually thins out before you reach St. Mark's Summit. Note: hikers will not find clear signage for St. Mark's Summit; it is a lookout located along the Howe Sound Crest Trail. However, the Summit is marked with a sign post, so you won't miss it. ", R.drawable.cypress, "Difficulty: Moderate"));
        hikes.add(new Location("Seymour Provincial Park", "6400 Nancy Greene Way", "You’ll be greeted with a stunning view of Metro Vancouver at the top of Dog Mountain. Although it’s a glorious sight any time of day, in our opinion, the sparkling city is most striking at night. However, the trail can be muddy, slippery, rocky and rooted, so if you do venture out for a night hike, don’t forget your headlamp! In winter, Dog Mountain can be done on snowshoes. But in our opinion, it's pretty miserable after rainfall or during spring melt.", R.drawable.seymour, "Difficulty: Easy"));
        hikes.add(new Location("Deep Cove", "2156 Banbury Rd, North Vancouver, BC V7G 2T1", "This long, rugged trail crosses the North Shore mountains and branches off in several spots. Although some extreme hikers and runners tackle the entire length in the Knee-Knacker Race, it’s more common to choose a section of the trail to complete, such as Lynn Canyon Suspension Bridges or Black Mountain.", R.drawable.deep_cove, "Difficulty: Extreme"));

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
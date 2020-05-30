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
        restautants.add(new Location("Au Comptoir", "2278 W 4th Ave, Vancouver", "Take a trip to an excellent Parisian bistro by way of the city’s beachside Kitsilano neighborhood, where up-and-comer chef Dan McGee and team are whipping up French standards with B.C.’s finest produce. The stunning custom-made bar comes from France, and even the serving staff are mostly French, although with the happy addition of Canadian manners. With buttery croissants in the morning, gooey croque-monsieur at lunch, and juicy entrecôte-frites with a mouthwatering crisp char at dinner, anytime is a good time for Au Comptoir. [$$]"));
        restautants.add(new Location("Maenam", "1938 W 4th Ave, Vancouver", "One of the city’s most exceptional (and hardest-working) chefs, Angus An has three other spots dotted across the city, including the noodle bliss of Fat Mao and Freebird Chicken Shack, which excels in Asian-style rotisserie. But if you only have time for one, go to Maenam to experience An’s deft flavor-balancing act of sweet, aromatic, citrus, heat, and spice, which creates plate-lickingly great Thai dishes with a B.C. twist. With terrific value, attentive service, and a killer cocktail and wine list, the restaurant is open for lunch and dinner — and is even good for takeaway to nearby Kitsilano beach. [$$]"));
        restautants.add(new Location("Kingyo Izakaya", "871 Denman St, Vancouver", "Kingyo Izakaya is perfect for a quick lunch after checking out Stanley Park and English Bay, but arrive early to bag one of the deluxe bento boxes (only 10 made each day) and eat your way through the menu’s high points. At nighttime, enjoy the exuberant atmosphere and over-order from the far-too-tempting, daily-changing fresh menu. Seafood favorites such as tuna tataki shine alongside sizzling stone-grilled beef tongue and crisp chicken karaage served with three kinds of salt. [$$]"));
        restautants.add(new Location("Golden Paramount Seafood Restaurant", "8071 Park Rd, Richmond", "Take a 20-minute trip on the Skytrain from downtown to the neighboring city of Richmond, which Eater’s former roving critic, Bill Addison, called “one of the cultural marvels of North America” for having some of the finest Asian food in the world. At this award-winning favorite, the dim sum is handmade by chef-owner May Chau, who focuses on Hong Kong classics: steamed pork and crab dumplings, pan-fried pork buns, and deep-fried wontons — all must-orders. [$-$$]"));

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

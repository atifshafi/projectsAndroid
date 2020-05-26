/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Create a list of songs
        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song("Perfect", "Divide", R.drawable.music300));
        songs.add(new Song("Bibia Be Ye Ye", "Divide"));
        songs.add(new Song("Shape of You", "Divide"));
        songs.add(new Song("Thinking Out Loud", "x"));
        songs.add(new Song("Bad", "Bad"));
        songs.add(new Song("I want it that way", "Millennium"));
        songs.add(new Song("Call", "Millennium"));
        songs.add(new Song("Shape of heart", "Millennium"));
        songs.add(new Song("TLarger than life", "Backstreet Back"));
        songs.add(new Song("Dangerous", "Dangerous"));
        songs.add(new Song("Thriller", "Thriller"));
        songs.add(new Song("Jam", "Dangerous"));
        songs.add(new Song("Why You Wanna Trip on Me", "Dangerous"));
        songs.add(new Song("In the Closet", "Dangerous"));
        songs.add(new Song("Heal the world", "Dangerous"));
        songs.add(new Song("Black or white", "Dangerous"));
        songs.add(new Song("Lose yourself", "8 miles"));
        songs.add(new Song("Lucky You", "Kamikaze"));
        songs.add(new Song("Greatest", "Kamikaze"));
        songs.add(new Song("The Ringer", "Kamikaze"));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        SongAdapter Adapter = new SongAdapter(this, songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_now_playing.xml layout file.
        final ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(Adapter);


        // Find the View for Now Playing
        TextView now_playing = (TextView) findViewById(R.id.now_playing_text);

        // Set a click listener on that View
        now_playing.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);

                // Start the new activity
                startActivity(nowPlayingIntent);
            }
        });

        // Find the View that shows the list of songs category
        final ListView song = (ListView) findViewById(R.id.list);

        // Set a click listener on that View. Needs to be 'Item' to interact with ListView object types
        song.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                // Create a new intent to open the {@link ColorsActivity}
                Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);
                // Start the new activity
                startActivity(nowPlayingIntent);
            }
        });
    }
}


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
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers category
        TextView numbers = (TextView) findViewById(R.id.playlist_text);

        // Set a click listener on that View
        numbers.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(numbersIntent);
            }
        });


        // Create a list of words
        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song("Perfect","Divide"));
        songs.add(new Song("Bibia Be Ye Ye","Divide"));
        songs.add(new Song("Shape of You","Divide"));
        songs.add(new Song("Thinking Out Loud","x"));
        songs.add(new Song("Bad","Bad"));
        songs.add(new Song("Perfect","Divide"));
        songs.add(new Song("Bibia Be Ye Ye","Divide"));
        songs.add(new Song("Shape of You","Divide"));
        songs.add(new Song("Thinking Out Loud","x"));
        songs.add(new Song("Bad","Bad"));
        songs.add(new Song("Perfect","Divide"));
        songs.add(new Song("Bibia Be Ye Ye","Divide"));
        songs.add(new Song("Shape of You","Divide"));
        songs.add(new Song("Thinking Out Loud","x"));
        songs.add(new Song("Bad","Bad"));
        songs.add(new Song("Perfect","Divide"));
        songs.add(new Song("Bibia Be Ye Ye","Divide"));
        songs.add(new Song("Shape of You","Divide"));
        songs.add(new Song("Thinking Out Loud","x"));
        songs.add(new Song("Bad","Bad"));

//        words.add("two");
//        words.add("three");
//        words.add("four");
//        words.add("five");
//        words.add("six");
//        words.add("seven");
//        words.add("eight");
//        words.add("nine");
//        words.add("ten");

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        SongAdapter Adapter = new SongAdapter(this, songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(Adapter);
    }




        // Find the View with song's details
        TextView family = (TextView) findViewById(R.id.song_view);

        // Set a click listener on that View
        family.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);

                // Start the new activity
                startActivity(familyIntent);
            }
        });

//        // Find the View that shows the colors category
//        TextView colors = (TextView) findViewById(R.id.colors);
//
//        // Set a click listener on that View
//        colors.setOnClickListener(new View.OnClickListener() {
//            // The code in this method will be executed when the colors category is clicked on.
//            @Override
//            public void onClick(View view) {
//                // Create a new intent to open the {@link ColorsActivity}
//                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
//
//                // Start the new activity
//                startActivity(colorsIntent);
//            }
//        });
//
//        // Find the View that shows the phrases category
//        TextView phrases = (TextView) findViewById(R.id.phrases);

        // Set a click listener on that View
//        phrases.setOnClickListener(new View.OnClickListener() {
//            // The code in this method will be executed when the phrases category is clicked on.
//            @Override
//            public void onClick(View view) {
//                // Create a new intent to open the {@link PhrasesActivity}
//                Intent phrasesIntent = new Intent(MainActivity.this, PhraseActivity.class);
//
//                // Start the new activity
//                startActivity(phrasesIntent);
//            }
//        });
    }


package com.example.android.samplemusic;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Find the View for Now Playing
        Button now_playing = (Button) findViewById(R.id.play);

        // Find the View for Now Playing
        Button pause = (Button) findViewById(R.id.pause);

        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.color_black);



        // Set a click listener on that View
        now_playing.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FamilyActivity}

                // Start the new activity
                mediaPlayer.start();

                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        Toast.makeText(MainActivity.this, "I'm Done!", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });

        // Set a click listener on that View
        pause.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FamilyActivity}

                // Pause the new activity
                mediaPlayer.pause();
            }
        });

    }
}

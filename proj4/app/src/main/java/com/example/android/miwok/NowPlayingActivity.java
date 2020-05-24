package com.example.android.miwok;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class NowPlayingActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        TextView playlist = (TextView) findViewById(R.id.playlist_text);

        playlist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PhrasesActivity}
                Intent phrasesIntent = new Intent(NowPlayingActivity.this, MainActivity.class);

                // Start the new activity
                startActivity(phrasesIntent);
            }
        });


        // Handle song and album name on the display
        TextView songTextView = (TextView) findViewById(R.id.song_text_now_playing);
        songTextView.setText("coming soon on the next release");

        TextView albumTextView = (TextView) findViewById(R.id.album_text_now_playing);
        albumTextView.setText("coming soon on the next release");


        final TextView play_button = (TextView) findViewById(R.id.play_text);

        play_button.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                if (play_button.getText() == "Play") {
                    play_button.setText("Pause");
                } else {
                    play_button.setText("Play");
                }
            }
        });

        final TextView next_button = (TextView) findViewById(R.id.next_text);

        next_button.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                toast_status("Next Song");
            }
        });

        final TextView prev_button = (TextView) findViewById(R.id.prev_text);

        prev_button.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                toast_status("Prev Song");
            }
        });


    }

    private void toast_status(String btn_status) {
        Toast toast = Toast.makeText(NowPlayingActivity.this,
                btn_status, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER | Gravity.CENTER_HORIZONTAL, 0, 0);
        toast.show();
    }

}

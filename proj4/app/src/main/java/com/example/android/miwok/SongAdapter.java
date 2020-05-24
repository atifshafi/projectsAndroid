package com.example.android.miwok;

//Since we are modifying behavior of a method inside ArrayAdapter class
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {


    public SongAdapter(Activity context, ArrayList<Song> songs) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Song currentSong = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView songTextView = (TextView) listItemView.findViewById(R.id.song_view);
        // Get the song name from the current Song object and
        // set this text on the name TextView
        songTextView.setText(currentSong.getSongName());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView albumTextView = (TextView) listItemView.findViewById(R.id.album_view);
        // Get the album name from the current Song object and
        // set this text on the number TextView
        albumTextView.setText(currentSong.getAlbumName());

        // Return the whole list item layout (containing 2 TextViews)
        // so that it can be shown in the ListView
        return listItemView;
    }

}

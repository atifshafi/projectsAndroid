package com.example.android.miwok;

public class Song {

    /* Default translation for the word */
    private String mSongName;

    /* Miwok translation for the word */
    private String mAlbumName;

    /* Constructor. They have to look like method declaration.*/
    public Song(String songname, String albumname) {
        mSongName = songname;
        mAlbumName = albumname;
    }

    /**
     * Get the song name.
     */
    public String getSongName() {
        return mSongName;
    }

    /**
     * Get the Album name of that song.
     */
    public String getAlbumName() {
        return mAlbumName;
    }

}

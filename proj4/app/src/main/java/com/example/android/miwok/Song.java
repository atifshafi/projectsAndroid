package com.example.android.miwok;

public class Song {

    /* Default translation for the word */
    private String mSongName;

    /* Name of the word */
    private String mAlbumName;

    /* Declaration of the image variable */
    private Integer mImageResourceID;

    /* Constructor. They have to look like method declaration.*/
    public Song(String songname, String albumname, int imageid) {
        mSongName = songname;
        mAlbumName = albumname;
        mImageResourceID = imageid;
    }

    /* Constructor. In Java, if you want to make a parameter optional, you define another constructor */
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


    /**
     * Get the Album name of that song.
     */
    public Integer getmImageResourceID() {
        return mImageResourceID;
    }

}

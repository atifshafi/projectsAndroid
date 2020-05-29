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

/**
 * {@link Hike} represents a hiking location in Vancouver area.
 * It contains the address of the hiking places, difficulty of the hike and a picture of the location.
 */

public class Hike {

    /** Hike location (name)*/
    private String mHikeName;

    /** Hike location (address)*/
    private String mHikeAddress;

    /** Difficulty of the hike */
    private String mDifficulty;

    /** Image resource ID for the hiking area */
    private int mImageResourceId;


    /**
     * Create a new Hikes object.
     *
     * @param mHikeName is the name of the location of the hiking area
     * @param mHikeAddress is the address of the location of the hiking area
     * @param mDifficulty is the difficulty of the hike
     * @param mImageResourceId is the resource ID for the image file associated with this location
     */
    public Hike(String hikeName, String hikeAddress, String Difficulty, int imageResourceId) {
        mHikeName = hikeName;
        mHikeAddress = hikeAddress;
        mDifficulty = Difficulty;
        mImageResourceId = imageResourceId;
    }


    /**
     * Get the  name of the location of the hiking area.
     */
    public String getHikeName() {
        return mHikeName;
    }

    /**
     * Get the  address of the location of the hiking area.
     */
    public String getHikeAddress() {
        return mHikeAddress;
    }

    /**
     * Get the difficulty of the hike.
     */
    public String getDifficulty() {
        return mDifficulty;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

}
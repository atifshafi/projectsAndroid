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
 * {@link Location} represents a location in Vancouver area.
 * It contains the address of the location, difficulty of the hike (if applicable), description of the location and a picture of the location.
 */

public class Location {

    /**
     * location (name)
     */
    private String mLocationName;

    /**
     * location (address)
     */
    private String mLocationAddress;

    /**
     * location (description)
     */
    private String mLocationDescription;

    /**
     * Difficulty of the hike
     */
    private String mDifficulty = NO_DIFFICULTY_PROVIDED;

    /**
     * Constant value that represents no difficulty associated with it
     */
    private static final String NO_DIFFICULTY_PROVIDED = "N/A";

    /**
     * Image resource ID for the location
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Constant value that represents no image was provided for this location
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Location object.
     *
     * @param mLocationName        is the name of the location of the hiking area
     * @param mLocationAddress     is the address of the location of the hiking area
     * @param mLocationDescription is the description of the location
     * @param mDifficulty          is the difficulty of the hike
     * @param mImageResourceId     is the resource ID for the image file associated with this location
     */

    public Location(String locationName, String locationAddress, String locationDescription, int imageResourceId, String difficulty) {
        mLocationName = locationName;
        mLocationAddress = locationAddress;
        mLocationDescription = locationDescription;
        mDifficulty = difficulty;
        mImageResourceId = imageResourceId;
    }


    /**
     * Create a new Location object.
     *
     * @param mLocationName        is the name of the location of the hiking area
     * @param mLocationAddress     is the address of the location of the hiking area
     * @param mLocationDescription is the description of the location
     * @param mImageResourceId     is the resource ID for the image file associated with this location
     */

    public Location(String locationName, String locationAddress, String locationDescription, int imageResourceId) {
        mLocationName = locationName;
        mLocationAddress = locationAddress;
        mLocationDescription = locationDescription;
        mImageResourceId = imageResourceId;
    }


    /**
     * Create a new Location object.
     *
     * @param mLocationName        is the name of the location of the hiking area
     * @param mLocationAddress     is the address of the location of the hiking area
     * @param mLocationDescription is the description of the location
     */

    public Location(String locationName, String locationAddress, String locationDescription) {
        mLocationName = locationName;
        mLocationAddress = locationAddress;
        mLocationDescription = locationDescription;
    }

    /**
     * Get the  name of the location.
     */
    public String getLocationName() {
        return mLocationName;
    }

    /**
     * Get the  address of the location.
     */
    public String getLocationAddress() {
        return mLocationAddress;
    }

    /**
     * Get the  address of the location.
     */
    public String getLocationDescription() {
        return mLocationDescription;
    }

    /**
     * Get the difficulty of the hike.
     */
    public String getDifficulty() {
        return mDifficulty;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasDifficulty() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
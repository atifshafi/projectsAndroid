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
package com.example.android.news;

/**
 * An {@link News} object contains information related to a single news articles.
 */
public class News {

    /** Name of the section */
    private String mSection;

    /** Magnitude of the earthquake */
    private String mDate;

    /** Name of the title */
    private String mTitle;

    /** Website URL of the earthquake */
    private String mUrl;

    /**
     * Constructs a new {@link News} object.
     *
     * @param date is the magnitude (size) of the earthquake
     * @param title is the location where the earthquake happened
     * @param url is the website URL to find more details about the earthquake
     */
    public News(String section, String date, String title, String url) {
        mSection = section;
        mDate = date;
        mTitle = title;
        mUrl = url;
    }

    /**
     * Returns the name of the section.
     * @return
     */
    public String getSection() {
        return mSection;
    }

    /**
     * Returns date of the publication.
     * @return
     */
    public String getDate() {
        return mDate;
    }

    /**
     * Returns title of the article.
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * Returns the website URL to find more information about the article.
     */
    public String getUrl() {
        return mUrl;
    }
}

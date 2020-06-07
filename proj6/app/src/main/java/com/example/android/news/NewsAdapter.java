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

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.android.news.News;
import com.example.android.news.R;

import java.util.List;

/**
 * An {@link NewsAdapter} knows how to create a list item layout for each news
 * in the data source (a list of {@link News} objects).
 * <p>
 * These list item layouts will be provided to an adapter view like ListView
 * to be displayed to the user.
 */
public class NewsAdapter extends ArrayAdapter<News> {

    /**
     * Constructs a new {@link NewsAdapter}.
     *
     * @param context of the app
     * @param news    is the list of articles, which is the data source of the adapter
     */
    public NewsAdapter(Context context, List<News> news) {
        super(context, 0, news);
    }

    /**
     * Returns a list item view that displays information about the news at the given position
     * in the list of news.
     */
    @SuppressLint("SetTextI18n")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_item, parent, false);
        }

        // Find the news at the given position in the list of news
        News currentNews = getItem(position);


        assert currentNews != null;
        String section_title = currentNews.getSection();
        // Find the TextView with view ID magnitude
        TextView sectionView = (TextView) listItemView.findViewById(R.id.section);
        sectionView.setText(section_title);


        String date_time = currentNews.getDate().substring(0, 10);
        // Find the TextView with view ID date
        TextView magnitudeView = (TextView) listItemView.findViewById(R.id.date);
        magnitudeView.setText(date_time);

        // Get the original title string from the News object,
        String article_title = currentNews.getTitle();

        // Find the TextView with view ID location
        TextView articleView = (TextView) listItemView.findViewById(R.id.article_title);
        // Display the location of the current news in that TextView
        articleView.setText(article_title);

        // Get author name from the News object
        String author_name = currentNews.getAuthor();

        // Find the TextView with view ID
        TextView authorView = (TextView) listItemView.findViewById(R.id.author);
        // Display the author of the current news in that TextView
        authorView.setText(author_name);

        return listItemView;
    }

}

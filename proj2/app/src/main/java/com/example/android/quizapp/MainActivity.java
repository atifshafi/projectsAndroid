package com.example.android.quizapp;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    int teamA_score = 0;
    int teamA_fouls = 0;
    int teamB_score = 0;
    int teamB_fouls = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void teamA_add_goal(View view) {
        teamA_score = teamA_score + 1;
        display(teamA_score, "teamA");
    }

    public void teamA_add_foul(View view) {
        teamA_fouls = teamA_fouls + 1;
        display_fouls(teamA_fouls, "teamA");
    }

    public void teamB_add_goal(View view) {
        teamB_score = teamB_score + 1;
        display(teamB_score, "teamB");
    }

    public void teamB_add_foul(View view) {
        teamB_fouls = teamB_fouls + 1;
        display_fouls(teamB_fouls, "teamB");
    }

    public void reset(View view) {
        teamA_score = 0;
        teamA_fouls = 0;
        teamB_score = 0;
        teamB_fouls = 0;
        display(teamA_score, "teamA");
        display(teamB_score, "teamB");
        display_fouls(teamA_fouls, "teamA");
        display_fouls(teamB_fouls, "teamB");
    }


    /**
     * This method displays the given quantity value on the screen.
     */
    @SuppressLint("SetTextI18n")
    private void display(int number, String team) {
        if (team.equals("teamA")) {
            TextView goalTextView = (TextView) findViewById(R.id.teamA_score_view);
            goalTextView.setText("" + number);
        } else {
            TextView goalTextView = (TextView) findViewById(R.id.teamB_score_view);
            goalTextView.setText("" + number);
        }
    }

    @SuppressLint("SetTextI18n")
    private void display_fouls(int number, String team) {
        if (team.equals("teamA")) {
            TextView goalTextView = (TextView) findViewById(R.id.teamA_foul_view);
            goalTextView.setText("" + number);
        } else {
            TextView goalTextView = (TextView) findViewById(R.id.teamB_foul_view);
            goalTextView.setText("" + number);
        }
    }
}






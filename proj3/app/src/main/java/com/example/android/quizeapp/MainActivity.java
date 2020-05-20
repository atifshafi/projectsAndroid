package com.example.android.quizeapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

import java.util.ArrayList;

import android.widget.TextView;

import java.util.List;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    int ans2;
    List<String> ans3 = new ArrayList<>();
    int ans4;
    int score;

    public void setQ3_ans(List q3_ans) {
        q3_ans.add("1");
        q3_ans.add("3");
        q3_ans.add("4");
    }

    // To handle radio buttons
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            // Question number 2
            case R.id.radio_q2_op1:
                if (checked)
                    ans2 = 1;
                break;
            case R.id.radio_q2_op2:
                if (checked)
                    ans2 = 2;
                break;
            case R.id.radio_q2_op3:
                if (checked)
                    ans2 = 3;
                break;
            case R.id.radio_q2_op4:
                if (checked)
                    ans2 = 4;
                break;

            // Question number 4
            case R.id.radio_q4_op1:
                if (checked)
                    ans4 = 1;
                break;
            case R.id.radio_q4_op2:
                if (checked)
                    ans4 = 2;
                break;
            case R.id.radio_q4_op3:
                if (checked)
                    ans4 = 3;
                break;
            case R.id.radio_q4_op4:
                if (checked)
                    ans4 = 4;
                break;
        }
    }

    // To handle checkboxes
    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.checkbox_q3_op1:
                if (checked)
                    ans3.add("1");
                else
                    ans3.remove("1");
                break;
            case R.id.checkbox_q3_op2:
                if (checked)
                    ans3.add("2");
                else
                    ans3.remove("2");
                break;
            case R.id.checkbox_q3_op3:
                if (checked)
                    ans3.add("3");
                else
                    ans3.remove("3");
                break;
            case R.id.checkbox_q3_op4:
                if (checked)
                    ans3.add("4");
                else
                    ans3.remove("4");
                break;
        }
    }


    /**
     * This method is called when the submit button is clicked.
     */

    public void submit(View view) {
        // Initializing the list to store answers for q3
        List<String> q3_ans = new ArrayList<>();
        setQ3_ans(q3_ans);
        EditText editText = (EditText) findViewById(R.id.q1_text_ans);
        String ans1 = editText.getText().toString();

        if (evalAns1(ans1)) {
            score = score + 1;
        }
        if (ans2 == 2) {
            score = score + 1;
        }
        if (ans3.containsAll(q3_ans) && (!ans3.contains("2"))) {
            score = score + 1;
        }
        if (ans4 == 1) {
            score = score + 1;
        }
        display(score);
        score = 0;

    }

    private boolean evalAns1(String ans) {
        return "La La Land".equalsIgnoreCase(ans);
    }

    @SuppressLint("SetTextI18n")
    private void display(int number) {
        TextView scoreTextView = (TextView) findViewById(R.id.score_num);
        scoreTextView.setText("" + number);
    }

}

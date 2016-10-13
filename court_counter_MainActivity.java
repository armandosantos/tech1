package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeam(8);
        displayForTeamB(12);
    }

    /**
     * Displays the score for Team A.
     */
    public void displayForTeam(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method adds three points for Team A.
     */
    public void threePoints(View view) {
        scoreTeamA += 3;
        displayForTeam(scoreTeamA);
    }

    /**
     * This method adds three points for Team B.
     */
    public void threePointsB(View view) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * This method adds two points for Team A.
     */
    public void twoPoints(View view) {
        scoreTeamA += 2;
        displayForTeam(scoreTeamA);
    }

    /**
     * This method adds two points for Team B.
     */
    public void twoPointsB(View view) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * This method adds one point for Team A.
     */
    public void freeThrow(View view) {
        scoreTeamA += 1;
        displayForTeam(scoreTeamA);
    }

    /**
     * This method adds one point for Team B.
     */
    public void freeThrowB(View view) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    public void reset(View view) {
        scoreTeamA = scoreTeamB = 0;
        displayForTeam(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}

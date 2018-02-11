package com.example.cesar.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Integer teamAscore = 0;
    private Integer teamBscore = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addPoints(View view, Integer p){

    }

    public void addPointsTeamA(View view){
        int score = Integer.parseInt(view.getTag().toString());
        teamAscore += score;
        displayForTeamA(teamAscore);
    }

    public void addPointsTeamB(View view){
        int score = Integer.parseInt(view.getTag().toString());
        teamBscore += score;
        displayForTeamB(teamBscore);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.tema_A_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_B_score);
        scoreView.setText(String.valueOf(score));
    }

    public void resetScores(View view){
        teamAscore = 0;
        teamBscore = 0;
        displayForTeamA(0);
        displayForTeamB(0);
    }
}

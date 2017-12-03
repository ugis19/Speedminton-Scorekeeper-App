package com.example.android.speedmintonscorekeeper;

import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreP1=0;
    int scoreP2=0;
    int servesP1=3;
    int servesP2=0;
    int gamesWonP1=0;
    int gamesWonP2=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addPointP1 (View view){
        scoreP1=scoreP1+1;
        servesP1=servesP1-1;
        displayScoreP1(scoreP1);

        if (servesP1 = 0) {
            servesP2 = servesP2 + 3;
        }

        String servesMessageP1="SERVES LEFT "+(servesP1)+" OF 3";
        displayServesP1(servesMessageP1);

        String gamesMessageP1="GAMES WON "+(gamesWonP1)+" OF 5";
        displayGamesP1(gamesMessageP1);

    }

    public void addPointP2 (View view){
        scoreP2=scoreP2+1;
        displayScoreP2(scoreP2);




    }






    public void displayScoreP1(int number) {
        TextView scoreView = (TextView) findViewById(R.id.score_p1);
        scoreView.setText(String.valueOf(""+number));
    }

    public void displayScoreP2(int number) {
        TextView scoreView = (TextView) findViewById(R.id.score_p2);
        scoreView.setText(String.valueOf(""+number));
    }

    public void displayServesP1(String servesMessageP1) {
        TextView t = (TextView) findViewById(R.id.serves_left_p1);
        t.setText(servesMessageP1);
    }

    public void displayServesP2(String servesMessageP2) {
        TextView t = (TextView) findViewById(R.id.serves_left_p2);
        t.setText(servesMessageP2);
    }

    public void displayGamesP1(String gamesMessageP1) {
        TextView t = (TextView) findViewById(R.id.games_won_p1);
        t.setText(gamesMessageP1);
    }

    public void displayGamesP2(String gamesMessageP2) {
        TextView t = (TextView) findViewById(R.id.games_won_p2);
        t.setText(gamesMessageP2);
    }
}

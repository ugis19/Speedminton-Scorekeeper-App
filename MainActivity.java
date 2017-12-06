package com.example.android.speedmintonscorekeeper;

import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreP1 = 0;
    int scoreP2 = 0;
    int servesP1 = 3;
    int servesP2 = 0;
    int gamesWonP1 = 0;
    int gamesWonP2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addPointP1(View view) {

        scoreP1 = scoreP1 + 1;
        displayScoreP1(scoreP1);
        displayScoreP2(scoreP2);

        if (servesP1 > 0) {
            servesP1 = servesP1 - 1;
            String servesMessageP1 = "SERVES LEFT " + (servesP1) + " OF 3";
            displayServesP1(servesMessageP1);
        }

        if (servesP2 > 0) {
            servesP2 = servesP2 - 1;
            displayScoreP1(scoreP1);
            String servesMessageP2 = "SERVES LEFT " + (servesP2) + " OF 3";
            displayServesP2(servesMessageP2);
        }

        if (servesP1 == 1) {
            servesP2 = servesP2 + 4;
            String servesMessageP1 = "SERVES LEFT " + (servesP1) + " OF 3";
            displayServesP1(servesMessageP1);
            String servesMessageP2 = "SERVES LEFT " + (servesP2 - 4) + " OF 3";
            displayServesP2(servesMessageP2);
        }

        if (servesP2 == 1) {
            servesP1 = servesP1 + 4;
            displayScoreP1(scoreP1);
            String servesMessageP1 = "SERVES LEFT " + (servesP1 - 4) + " OF 3";
            displayServesP1(servesMessageP1);
            String servesMessageP2 = "SERVES LEFT " + (servesP2) + " OF 3";
            displayServesP2(servesMessageP2);
        }

        if (scoreP1 == 16 && scoreP2 <= 14) {
            displayScoreP1(scoreP1);
            displayScoreP2(scoreP2);
            scoreP1 = 0;
            scoreP2 = 0;
            servesP1 = 0;
            servesP2 = 3;
            String servesMessageP1 = "SERVES LEFT " + (servesP1) + " OF 3";
            displayServesP1(servesMessageP1);
            String servesMessageP2 = "SERVES LEFT " + (servesP2) + " OF 3";
            displayServesP2(servesMessageP2);
            gamesWonP1 = gamesWonP1 + 1;
            String gamesMessageP1 = "GAMES WON " + (gamesWonP1) + " OF 3";
            displayGamesP1(gamesMessageP1);
            String numberMessage = "GAME " + (gamesWonP1 + gamesWonP2 + 1) + " OF 5";
            displayNumberGames(numberMessage);
        }

        if (scoreP1 >= 15 && scoreP2 >= 15 && scoreP1 > (scoreP2 + 1)) {
            displayScoreP1(scoreP1);
            displayScoreP2(scoreP2);
            scoreP1 = 0;
            scoreP2 = 0;
            servesP1 = 0;
            servesP2 = 3;
            String servesMessageP1 = "SERVES LEFT " + (servesP1) + " OF 3";
            displayServesP1(servesMessageP1);
            String servesMessageP2 = "SERVES LEFT " + (servesP2) + " OF 3";
            displayServesP2(servesMessageP2);
            gamesWonP1 = gamesWonP1 + 1;
            String gamesMessageP1 = "GAMES WON " + (gamesWonP1) + " OF 3";
            displayGamesP1(gamesMessageP1);
            String numberMessage = "GAME " + (gamesWonP1 + gamesWonP2 + 1) + " OF 5";
            displayNumberGames(numberMessage);
        }

        if (gamesWonP1 == 3) {
            String winMessage = "Match is won by player 1 \n Press resset to start new match";
            displayWinText(winMessage);
        }
    }

    public void addPointP2(View view) {

        scoreP2 = scoreP2 + 1;
        displayScoreP1(scoreP1);
        displayScoreP2(scoreP2);


        if (servesP1 > 0) {
            servesP1 = servesP1 - 1;
            String servesMessageP1 = "SERVES LEFT " + (servesP1) + " OF 3";
            displayServesP1(servesMessageP1);
        }

        if (servesP2 > 0) {
            servesP2 = servesP2 - 1;
            displayScoreP1(scoreP1);
            String servesMessageP2 = "SERVES LEFT " + (servesP2) + " OF 3";
            displayServesP2(servesMessageP2);
        }

        if (servesP1 == 1) {
            servesP2 = servesP2 + 4;
            String servesMessageP1 = "SERVES LEFT " + (servesP1) + " OF 3";
            displayServesP1(servesMessageP1);
            String servesMessageP2 = "SERVES LEFT " + (servesP2 - 4) + " OF 3";
            displayServesP2(servesMessageP2);
        }

        if (servesP2 == 1) {
            servesP1 = servesP1 + 4;
            displayScoreP1(scoreP1);
            String servesMessageP1 = "SERVES LEFT " + (servesP1 - 4) + " OF 3";
            displayServesP1(servesMessageP1);
            String servesMessageP2 = "SERVES LEFT " + (servesP2) + " OF 3";
            displayServesP2(servesMessageP2);
        }

        if (scoreP2 == 16 && scoreP1 <= 14) {
            displayScoreP1(scoreP1);
            displayScoreP2(scoreP2);
            scoreP1 = 0;
            scoreP2 = 0;
            servesP1 = 3;
            servesP2 = 0;
            String servesMessageP1 = "SERVES LEFT " + (servesP1) + " OF 3";
            displayServesP1(servesMessageP1);
            String servesMessageP2 = "SERVES LEFT " + (servesP2) + " OF 3";
            displayServesP2(servesMessageP2);
            gamesWonP2 = gamesWonP2 + 1;
            String gamesMessageP2 = "GAMES WON " + (gamesWonP2) + " OF 3";
            displayGamesP2(gamesMessageP2);
            String numberMessage = "GAME " + (gamesWonP1 + gamesWonP2 + 1) + " OF 5";
            displayNumberGames(numberMessage);
        }

        if (scoreP1 >= 15 && scoreP2 >= 15 && scoreP2 > (scoreP1 + 1)) {
            displayScoreP1(scoreP1);
            displayScoreP2(scoreP2);
            scoreP1 = 0;
            scoreP2 = 0;
            servesP1 = 3;
            servesP2 = 0;
            String servesMessageP1 = "SERVES LEFT " + (servesP1) + " OF 3";
            displayServesP1(servesMessageP1);
            String servesMessageP2 = "SERVES LEFT " + (servesP2) + " OF 3";
            displayServesP2(servesMessageP2);
            gamesWonP2 = gamesWonP2 + 1;
            String gamesMessageP2 = "GAMES WON " + (gamesWonP2) + " OF 3";
            displayGamesP2(gamesMessageP2);
            String numberMessage = "GAME " + (gamesWonP1 + gamesWonP2 + 1) + " OF 5";
            displayNumberGames(numberMessage);
        }

        if (gamesWonP2 == 3) {
            String winMessage = "Match is won by player 2 \n Press resset to start new match";
            displayWinText(winMessage);
        }


    }

    public void reset(View view) {
        scoreP1 = 0;
        scoreP2 = 0;
        servesP1 = 3;
        servesP2 = 0;
        gamesWonP1 = 0;
        gamesWonP2 = 0;
        displayScoreP1(scoreP1);
        displayScoreP2(scoreP2);

        String servesMessageP1 = "SERVES LEFT " + (servesP1) + " OF 3";
        displayServesP1(servesMessageP1);

        String servesMessageP2 = "SERVES LEFT " + (servesP2) + " OF 3";
        displayServesP2(servesMessageP2);

        String gamesMessageP1 = "GAMES WON " + (gamesWonP1) + " OF 3";
        displayGamesP1(gamesMessageP1);

        String gamesMessageP2 = "GAMES WON " + (gamesWonP2) + " OF 3";
        displayGamesP2(gamesMessageP2);

        String numberMessage = "GAME " + (gamesWonP1 + gamesWonP2 + 1) + " OF 5";
        displayNumberGames(numberMessage);

        String winMessage = "Add point to payer";
        displayWinText(winMessage);
    }


    public void displayScoreP1(int number) {
        TextView scoreView = (TextView) findViewById(R.id.score_p1);
        scoreView.setText(String.valueOf("" + number));
    }

    public void displayScoreP2(int number) {
        TextView scoreView = (TextView) findViewById(R.id.score_p2);
        scoreView.setText(String.valueOf("" + number));
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

    public void displayNumberGames(String numberMessage) {
        TextView t = (TextView) findViewById(R.id.number_of_game);
        t.setText(numberMessage);
    }

    public void displayWinText(String winMessage) {
        TextView t = (TextView) findViewById(R.id.win_text);
        t.setText(winMessage);
    }

}

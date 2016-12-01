package com.example.android.sportscounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreArcher1 = 0;
    int scoreArcher2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //@Override
    // public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    // getMenuInflater().inflate(R.menu.menu_main, menu);
    // return true;
    // }

    // @Override
    //public boolean onOptionsItemSelected(MenuItem item) {
    // Handle action bar item clicks here. The action bar will
    // automatically handle clicks on the Home/Up button, so long
    // as you specify a parent activity in AndroidManifest.xml.
    // int id = item.getItemId();

    //noinspection SimplifiableIfStatement
    //if (id == R.id.action_settings) {
    // return true;
    //}

    // return super.onOptionsItemSelected(item);
    // }


    /**
     * Increase the score for Archer #1 by 1 point.
     */
    public void addOneForArcher1(View v) {
        scoreArcher1 = scoreArcher1 + 1;
        displayForArcher1(scoreArcher1);
    }

    /**
     * Increase the score for Archer 1 by 3 points.
     */
    public void addThreeForArcher1(View v) {
        scoreArcher1 = scoreArcher1 + 3;
        displayForArcher1(scoreArcher1);
    }

    /**
     * Increase the score for Archer 1 by 5 points.
     */
    public void addFiveForArcher1(View v) {
        scoreArcher1 = scoreArcher1 + 5;
        displayForArcher1(scoreArcher1);


    }

    /**
     * Increase the score for Archer 1 by 7 points.
     */
    public void addSevenForArcher1(View v) {
        scoreArcher1 = scoreArcher1 + 7;
        displayForArcher1(scoreArcher1);

    }

    /**
     * Increase the score for Archer 1 by 9 points.
     */
    public void addNineForArcher1(View v) {
        scoreArcher1 = scoreArcher1 + 9;
        displayForArcher1(scoreArcher1);


    }

    /**
     * Displays the given score for Archer #1.
     */
    public void displayForArcher1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.archer_1_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Archer 2 by 1 point.
     */
    public void addOneForArcher2(View v) {
        scoreArcher2 = scoreArcher2 + 1;
        displayForArcher2(scoreArcher2);
    }

    /**
     * Increase the score for Archer 2 by 3 points.
     */
    public void addThreeForArcher2(View v) {
        scoreArcher2 = scoreArcher2 + 3;
        displayForArcher2(scoreArcher2);
    }

    /**
     * Increase the score for Archer 2 by 5 points.
     */
    public void addFiveForArcher2(View v) {
        scoreArcher2 = scoreArcher2 + 5;
        displayForArcher2(scoreArcher2);


    }

    /**
     * Increase the score for Archer 2 by 7 points.
     */
    public void addSevenForArcher2(View v) {
        scoreArcher2 = scoreArcher2 + 7;
        displayForArcher2(scoreArcher2);


    }

    /**
     * Increase the score for Archer 2 by 9 points.
     */
    public void addNineForArcher2(View v) {
        scoreArcher2 = scoreArcher2 + 9;
        displayForArcher2(scoreArcher2);


    }

    /**
     * Displays the given score for Archer 2.
     */
    public void displayForArcher2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.archer_2_score);
        scoreView.setText(String.valueOf(score));
    }

    //Resets the code for both teams back to 0//
    public void scoreReset(View v) {
        scoreArcher1 = 0;
        scoreArcher2 = 0;
        displayForArcher1(scoreArcher1);
        displayForArcher2(scoreArcher2);
    }

}

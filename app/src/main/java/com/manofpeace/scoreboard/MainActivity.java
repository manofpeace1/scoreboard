package com.manofpeace.scoreboard;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    // top_score: increase by 1
    public void topScoreCount1 (View view) {

        // Get the text view
        TextView showCountTextView =
                (TextView) findViewById(R.id.top_score);

        // Get the value of the text view.
        String countString = showCountTextView.getText().toString();

        // Convert value to a number and increment it
        Integer count = Integer.parseInt(countString);
        count++;

        //Display the new value in the text view.
        showCountTextView.setText(count.toString());
    }

    // top_score: increase by 10
    public void topScoreCount10 (View view) {

        // Get the text view
        TextView showCountTextView =
                (TextView) findViewById(R.id.top_score);

        // Get the value of the text view.
        String countString = showCountTextView.getText().toString();

        // Convert value to a number and increment it
        Integer count = Integer.parseInt(countString);
        count+=10;

        //Display the new value in the text view.
        showCountTextView.setText(count.toString());
    }

    // top_score: increase by -1
    public void topScoreCount_minus1 (View view) {

        // Get the text view
        TextView showCountTextView =
                (TextView) findViewById(R.id.top_score);

        // Get the value of the text view.
        String countString = showCountTextView.getText().toString();

        // Convert value to a number and increment it
        Integer count = Integer.parseInt(countString);
        count--;

        //Display the new value in the text view.
        showCountTextView.setText(count.toString());
    }

    // bottom_score: increase by 1
    public void bottomScoreCount1 (View view) {

        // Get the text view
        TextView showCountTextView =
                (TextView) findViewById(R.id.bottom_score);

        // Get the value of the text view.
        String countString = showCountTextView.getText().toString();

        // Convert value to a number and increment it
        Integer count = Integer.parseInt(countString);
        count++;

        //Display the new value in the text view.
        showCountTextView.setText(count.toString());
    }

    // bottom_score: increase by 10
    public void bottomScoreCount10 (View view) {

        // Get the text view
        TextView showCountTextView =
                (TextView) findViewById(R.id.bottom_score);

        // Get the value of the text view.
        String countString = showCountTextView.getText().toString();

        // Convert value to a number and increment it
        Integer count = Integer.parseInt(countString);
        count+=10;

        //Display the new value in the text view.
        showCountTextView.setText(count.toString());
    }

    // bottom_score: increase by -1
    public void bottomScoreCount_minus1 (View view) {

        // Get the text view
        TextView showCountTextView =
                (TextView) findViewById(R.id.bottom_score);

        // Get the value of the text view.
        String countString = showCountTextView.getText().toString();

        // Convert value to a number and increment it
        Integer count = Integer.parseInt(countString);
        count--;

        //Display the new value in the text view.
        showCountTextView.setText(count.toString());
    }

    // Reset: sets both top_score and bottom_score to 0
    public void resetScore (View view) {

        // top_score: Get the text view -> Get the Value -> Convert value to a number and increment it -> Display the new value in the text view.
        TextView showCountTextViewTop = (TextView) findViewById(R.id.top_score);
        String countStringTop = showCountTextViewTop.getText().toString();
        Integer countTop = Integer.parseInt(countStringTop);
        countTop = 0;
        showCountTextViewTop.setText(countTop.toString());

        // bottom_score: Get the text view -> Get the Value -> Convert value to a number and increment it -> Display the new value in the text view.
        TextView showCountTextViewBottom = (TextView) findViewById(R.id.bottom_score);
        String countStringBottom = showCountTextViewBottom.getText().toString();
        Integer countBottom = Integer.parseInt(countStringBottom);
        countBottom = 0;
        showCountTextViewBottom.setText(countBottom.toString());

    }






}

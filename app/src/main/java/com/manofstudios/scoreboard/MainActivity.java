package com.manofstudios.scoreboard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

//Admob import
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

public class MainActivity extends AppCompatActivity {

    //Admob Interstitial Class
    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //initialize AdMob AppID
        MobileAds.initialize(this, "ca-app-pub-3278806895948346~1695371659");

        //Load Admob Interstitial (loads new one when closed)
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-3278806895948346/4506487387");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                // Load the next interstitial.
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }

        });
    }

        // Show Interstitial Ad
        public void ShowInterstitial (View view){
            if (mInterstitialAd.isLoaded()) {
                mInterstitialAd.show();
            } else {
                Toast interstitialToast = Toast.makeText(this, "Interstitial Ad is not ready yet", Toast.LENGTH_SHORT);
                interstitialToast.show();
            }
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

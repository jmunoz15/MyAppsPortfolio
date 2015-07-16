package com.jmunoz.nanodegree.project0;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;


public class PortfolioActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);
    }

    private void displayToast(int appName){
        StringBuilder message = new StringBuilder(getString(R.string.launch_app)).append(" ")
                .append(getString(appName));
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    public void openStreamer(View view){
        displayToast(R.string.spotify_streamer);
    }

    public void openScores(View view){
        displayToast(R.string.scores_app);
    }

    public void openLibrary(View view){
        displayToast(R.string.library_app);
    }

    public void openBuildIt(View view){
        displayToast(R.string.build_it);
    }

    public void openReader(View view){
        displayToast(R.string.xyz_reader);
    }

    public void openCapstone(View view){
        displayToast(R.string.capstone);
    }
}

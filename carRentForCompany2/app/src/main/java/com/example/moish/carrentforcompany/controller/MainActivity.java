package com.example.moish.carrentforcompany.controller;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.moish.carrentforcompany.R;

public class MainActivity extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    private Button ClientButton;
    private Button CarButton;
    private Button CarModelButton;
    private Button ReserveCarButton;
    private Button BranchButton;

    /**
     * Find the Views in the layout<br />
     * <br />
     * Auto-created on 2017-11-23 18:26:29 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    private void findViews() {
        ClientButton = (Button)findViewById( R.id.ClientButton );
        CarButton = (Button)findViewById( R.id.CarButton );
        CarModelButton = (Button)findViewById( R.id.CarModelButton );
        ReserveCarButton = (Button)findViewById( R.id.ReserveCarButton );
        BranchButton = (Button)findViewById( R.id.BranchButton );

        ClientButton.setOnClickListener( this );
        CarButton.setOnClickListener( this );
        CarModelButton.setOnClickListener( this );
        ReserveCarButton.setOnClickListener( this );
        BranchButton.setOnClickListener( this );
    }

    /**
     * Handle button click events<br />
     * <br />
     * Auto-created on 2017-11-23 18:26:29 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    @Override
    public void onClick(View v) {
        if ( v == ClientButton ) {
            // Handle clicks for ClientButton
        } else if ( v == CarButton ) {
            // Handle clicks for CarButton
        } else if ( v == CarModelButton ) {
            // Handle clicks for CarModelButton
        } else if ( v == ReserveCarButton ) {
            // Handle clicks for SCarButton
        } else if ( v == BranchButton ) {
            // Handle clicks for BranchButton
        }
    }

}

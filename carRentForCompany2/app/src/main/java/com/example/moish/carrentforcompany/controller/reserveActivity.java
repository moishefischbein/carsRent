package com.example.moish.carrentforcompany.controller;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.moish.carrentforcompany.R;

public class reserveActivity extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reserve);
    }

    private Button addReserveButton;
    private Button removeReserveButton;
    private Button updateReserveButton;
    private Button showReservesButton;

    private void findViews() {
        addReserveButton = (Button)findViewById( R.id.addReserveButton );
        removeReserveButton = (Button)findViewById( R.id.removeReserveButton );
        updateReserveButton = (Button)findViewById( R.id.updateReserveButton );
        showReservesButton = (Button)findViewById( R.id.showReservesButton );

        addReserveButton.setOnClickListener(this);
        removeReserveButton.setOnClickListener( this );
        updateReserveButton.setOnClickListener( this );
        showReservesButton.setOnClickListener( this );
    }

    /**
     * Handle button click events<br />
     * <br />
     * Auto-created on 2017-11-23 19:36:27 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    @Override
    public void onClick(View v) {
        if ( v == addReserveButton ) {
            // Handle clicks for addReserveButton
        } else if ( v == removeReserveButton ) {
            // Handle clicks for removeReserveButton
        } else if ( v == updateReserveButton ) {
            // Handle clicks for updateReserveButton
        } else if ( v == showReservesButton ) {
            // Handle clicks for showReservesButton
        }
    }

}

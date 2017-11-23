package com.example.moish.carrentforcompany.controller;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.moish.carrentforcompany.R;

public class carActivity extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car);
    }
    private Button addCarButton;
    private Button removeCarButton;
    private Button updateCarButton;
    private Button showcarsButton;

    /**
     * Find the Views in the layout<br />
     * <br />
     * Auto-created on 2017-11-23 19:40:31 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    private void findViews() {
        addCarButton = (Button)findViewById( R.id.addCarButton );
        removeCarButton = (Button)findViewById( R.id.removeCarButton );
        updateCarButton = (Button)findViewById( R.id.updateCarButton );
        showcarsButton = (Button)findViewById( R.id.showcarsButton );

        addCarButton.setOnClickListener( this );
        removeCarButton.setOnClickListener( this );
        updateCarButton.setOnClickListener( this );
        showcarsButton.setOnClickListener( this );
    }

    /**
     * Handle button click events<br />
     * <br />
     * Auto-created on 2017-11-23 19:40:31 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    @Override
    public void onClick(View v) {
        if ( v == addCarButton ) {
            // Handle clicks for addCarButton
        } else if ( v == removeCarButton ) {
            // Handle clicks for removeCarButton
        } else if ( v == updateCarButton ) {
            // Handle clicks for updateCarButton
        } else if ( v == showcarsButton ) {
            // Handle clicks for showcarsButton
        }
    }

}

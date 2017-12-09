package com.example.moish.carrentforcompany.controller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.moish.carrentforcompany.R;

public class AddCarActivity extends AppCompatActivity implements View.OnClickListener  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_car);
        findViews();
    }
    private EditText CarCodeIdText;
    private EditText CarModelText;
    private EditText KilometersTraveledText;
    private EditText CarsFixedBranchText;
    private Button addCarModelButton;

    /**
     * Find the Views in the layout<br />
     * <br />
     * Auto-created on 2017-12-04 13:49:01 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    private void findViews() {
        CarCodeIdText = (EditText)findViewById( R.id.CarCode_idText );
        CarModelText = (EditText)findViewById( R.id.CarModelText );
        KilometersTraveledText = (EditText)findViewById( R.id.KilometersTraveledText );
        CarsFixedBranchText = (EditText)findViewById( R.id.CarsFixedBranchText );
        addCarModelButton = (Button)findViewById( R.id.addCarModelButton );

        addCarModelButton.setOnClickListener( this );
    }

    /**
     * Handle button click events<br />
     * <br />
     * Auto-created on 2017-12-04 13:49:01 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    @Override
    public void onClick(View v) {
        if ( v == addCarModelButton ) {
            // Handle clicks for addCarModelButton
        }
    }

}

///



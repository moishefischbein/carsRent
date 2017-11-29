package com.example.moish.carrentforcompany.controller;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.moish.carrentforcompany.R;

public class AddCarModelActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_car_model);
    }
    private EditText ModelCodeIdText;
    private EditText CompanyNameText;
    private EditText ModelNameEditText;
    private EditText MotorVolumeEditText;
    private EditText IsAutomaticEditText;
    private EditText NumberOfSeatsEditText;
    private Button addCarModelButton;

    /**
     * Find the Views in the layout<br />
     * <br />
     * Auto-created on 2017-11-29 09:59:50 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    private void findViews() {
        ModelCodeIdText = (EditText)findViewById( R.id.ModelCode_idText );
        CompanyNameText = (EditText)findViewById( R.id.CompanyNameText );
        ModelNameEditText = (EditText)findViewById( R.id.ModelNameEditText );
        MotorVolumeEditText = (EditText)findViewById( R.id.MotorVolumeEditText );
        IsAutomaticEditText = (EditText)findViewById( R.id.IsAutomaticEditText );
        NumberOfSeatsEditText = (EditText)findViewById( R.id.NumberOfSeatsEditText );
        addCarModelButton = (Button)findViewById( R.id.addCarModelButton );

        addCarModelButton.setOnClickListener( this );
    }

    /**
     * Handle button click events<br />
     * <br />
     * Auto-created on 2017-11-29 09:59:50 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    @Override
    public void onClick(View v) {
        if ( v == addCarModelButton ) {
            // Handle clicks for addCarModelButton
        }
    }

}

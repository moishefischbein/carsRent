package com.example.moish.carrentforcompany.controller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.moish.carrentforcompany.R;

public class AddReserveActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_reserve);
        findViews();
    }

    private EditText ReserveNumberId;
    private EditText ClientNumber;
    private EditText IsOpened;
    private EditText RentBegginning;
    private EditText RentEnd;
    private EditText StartKilometers;
    private EditText EndKilometers;
    private EditText IsFueled;
    private EditText LitersFueled;
    private EditText TotalToPay;
    private Button addCarModelButton;

    /**
     * Find the Views in the layout<br />
     * <br />
     * Auto-created on 2017-12-04 14:21:35 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    private void findViews() {
        ReserveNumberId = (EditText)findViewById( R.id.ReserveNumber_id );
        ClientNumber = (EditText)findViewById( R.id.ClientNumber );
        IsOpened = (EditText)findViewById( R.id.IsOpened );
        RentBegginning = (EditText)findViewById( R.id.RentBegginning );
        RentEnd = (EditText)findViewById( R.id.RentEnd );
        StartKilometers = (EditText)findViewById( R.id.StartKilometers );
        EndKilometers = (EditText)findViewById( R.id.EndKilometers );
        IsFueled = (EditText)findViewById( R.id.IsFueled );
        LitersFueled = (EditText)findViewById( R.id.LitersFueled );
        TotalToPay = (EditText)findViewById( R.id.TotalToPay );
        addCarModelButton = (Button)findViewById( R.id.addCarModelButton );

        addCarModelButton.setOnClickListener( this );
    }

    /**
     * Handle button click events<br />
     * <br />
     * Auto-created on 2017-12-04 14:21:35 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    @Override
    public void onClick(View v) {
        if ( v == addCarModelButton ) {
            // Handle clicks for addCarModelButton
        }
    }

}

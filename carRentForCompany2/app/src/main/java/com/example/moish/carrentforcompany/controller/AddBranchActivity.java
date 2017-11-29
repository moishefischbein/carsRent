package com.example.moish.carrentforcompany.controller;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.moish.carrentforcompany.R;

public class AddBranchActivity extends Activity implements View.OnClickListener  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_branch);
        findViews();
    }
    private EditText CitytText;
    private EditText StreetEditText;
    private EditText AdressNumberEditText;
    private EditText NumberOfParkingAvailableEditText;
    private EditText BranchNumberIdEditText;
    private Button addBranchButton;

    /**
     * Find the Views in the layout<br />
     * <br />
     * Auto-created on 2017-11-29 09:31:43 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    private void findViews() {
        CitytText = (EditText)findViewById( R.id.CitytText );
        StreetEditText = (EditText)findViewById( R.id.StreetEditText );
        AdressNumberEditText = (EditText)findViewById( R.id.AdressNumberEditText );
        NumberOfParkingAvailableEditText = (EditText)findViewById( R.id.NumberOfParkingAvailableEditText );
        BranchNumberIdEditText = (EditText)findViewById( R.id.BranchNumber_idEditText );
        addBranchButton = (Button)findViewById( R.id.addBranchButton );

        addBranchButton.setOnClickListener( this );
    }

    /**
     * Handle button click events<br />
     * <br />
     * Auto-created on 2017-11-29 09:31:43 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    @Override
    public void onClick(View v) {
        if ( v == addBranchButton ) {
            // Handle clicks for addBranchButton
        }
    }

}

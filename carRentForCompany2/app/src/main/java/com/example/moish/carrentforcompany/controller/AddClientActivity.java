package com.example.moish.carrentforcompany.controller;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.moish.carrentforcompany.R;

public class AddClientActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_client);
    }
    private EditText IdEditText;
    private EditText NameEditText;
    private EditText PhoneEditText;
    private EditText SeniorityEditText;
    private Button addLecturerButton;

    /**
     * Find the Views in the layout<br />
     * <br />
     * Auto-created on 2017-11-24 11:54:56 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    private void findViews() {
        IdEditText = (EditText)findViewById( R.id.IdEditText );
        NameEditText = (EditText)findViewById( R.id.NameEditText );
        PhoneEditText = (EditText)findViewById( R.id.PhoneEditText );
        SeniorityEditText = (EditText)findViewById( R.id.SeniorityEditText );
        addLecturerButton = (Button)findViewById( R.id.addLecturerButton );

        addLecturerButton.setOnClickListener( this );
    }

    /**
     * Handle button click events<br />
     * <br />
     * Auto-created on 2017-11-24 11:54:56 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    @Override
    public void onClick(View v) {
        if ( v == addLecturerButton ) {
            // Handle clicks for addLecturerButton
        }
    }

}

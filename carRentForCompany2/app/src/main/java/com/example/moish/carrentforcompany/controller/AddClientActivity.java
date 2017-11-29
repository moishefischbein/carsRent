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
        findViews();
    }
    private EditText IdEditText;
    private EditText FirstNameEditText;
    private EditText LastNameEditText;
    private EditText EmailEditText;
    private EditText PhoneEditText;
    private EditText creditCardNumberEditText;
    private Button addClientButton;

    /**
     * Find the Views in the layout<br />
     * <br />
     * Auto-created on 2017-11-29 09:42:45 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    private void findViews() {
        IdEditText = (EditText)findViewById( R.id.IdEditText );
        FirstNameEditText = (EditText)findViewById( R.id.FirstNameEditText );
        LastNameEditText = (EditText)findViewById( R.id.LastNameEditText );
        EmailEditText = (EditText)findViewById( R.id.EmailEditText );
        PhoneEditText = (EditText)findViewById( R.id.PhoneEditText );
        creditCardNumberEditText = (EditText)findViewById( R.id.creditCardNumberEditText );
        addClientButton = (Button)findViewById( R.id.addClientButton );

        addClientButton.setOnClickListener( this );
    }

    /**
     * Handle button click events<br />
     * <br />
     * Auto-created on 2017-11-29 09:42:45 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    @Override
    public void onClick(View v) {
        if ( v == addClientButton ) {
            // Handle clicks for addClientButton
        }
    }


}

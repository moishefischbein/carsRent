package com.example.moish.carrentforcompany.controller;

import android.app.Activity;
import android.content.ContentValues;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.moish.carrentforcompany.R;
import com.example.moish.carrentforcompany.model.backend.DBManagerFactory;
import com.example.moish.carrentforcompany.model.backend.Functions;

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
            addBranch();
        }
    }

    private void addBranch() {
        final ContentValues contentValues = new ContentValues();
        try {


            int branchNumberId = Integer.valueOf(this.BranchNumberIdEditText.toString());
            contentValues.put(Functions.BranchConst.BRANCHNUMBER, branchNumberId);

            int numberOfParkingAvailable = Integer.valueOf(this.NumberOfParkingAvailableEditText.getText().toString());
            contentValues.put(Functions.BranchConst.NUMBEROFPARKINGAVAILABLE,numberOfParkingAvailable);

            contentValues.put(Functions.BranchConst.CITY, this.CitytText.getText().toString());
            contentValues.put(Functions.BranchConst.STREET, this.StreetEditText.getText().toString());
            contentValues.put(Functions.BranchConst.ADESSNUMBER, this.AdressNumberEditText.getText().toString());





            new AsyncTask<Void, Void, Long>() {
                @Override
                protected void onPostExecute(Long idResult) {
                    super.onPostExecute(idResult);
                    if (idResult > 0)
                        Toast.makeText(getBaseContext(), "insert id: " + idResult, Toast.LENGTH_LONG).show();
                }

                @Override
                protected Long doInBackground(Void... params) {
                    return DBManagerFactory.getManager().addBranch(contentValues);
                }
            }.execute();




        } catch (Exception e) {
        }
    }

}

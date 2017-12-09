/*
package com.example.moish.carrentforcompany.controller;

import android.app.Activity;
import android.content.ContentValues;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.moish.carrentforcompany.R;
import com.example.moish.carrentforcompany.model.backend.DBManagerFactory;
import com.example.moish.carrentforcompany.model.backend.Functions;

import static com.example.moish.carrentforcompany.R.id.IdEditText;

public class AddBranchActivity extends Activity implements View.OnClickListener {

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


    private void findViews() {
        CitytText = (EditText) findViewById(R.id.CitytText);
        StreetEditText = (EditText) findViewById(R.id.StreetEditText);
        AdressNumberEditText = (EditText) findViewById(R.id.AdressNumberEditText);
        NumberOfParkingAvailableEditText = (EditText) findViewById(R.id.NumberOfParkingAvailableEditText);
        BranchNumberIdEditText = (EditText) findViewById(R.id.BranchNumber_idEditText);
        addBranchButton = (Button) findViewById(R.id.addBranchButton);

        addBranchButton.setOnClickListener(this);
    }


    private void addBranch() {
        final ContentValues values = new ContentValues();
        try {
            long id = Long.valueOf(BranchNumberIdEditText.getText().toString());


            values.put(Functions.BranchConst.ADESSNUMBER, AdressNumberEditText.getText().toString());
            values.put(Functions.BranchConst.STREET, StreetEditText.getText().toString());
            values.put(Functions.BranchConst.CITY, CitytText.getText().toString());
            values.put(Functions.BranchConst.NUMBEROFPARKINGAVAILABLE, NumberOfParkingAvailableEditText.getText().toString());
            values.put(Functions.BranchConst.BRANCHNUMBER, BranchNumberIdEditText.getText().toString());


            new AsyncTask<Void, Void, Long>() {
                @Override
                protected void onPostExecute(Long aLong) {
                    Toast.makeText(getBaseContext(), "ID: " + aLong, Toast.LENGTH_LONG).show();
                    Log.d("branch", values.toString());
                }

                @Override
                protected Long doInBackground(Void... voids) {
                    return DBManagerFactory.getManager().addBranch(values);
                }
            }.execute();
        } catch (Exception e) {
            e.toString();
        } finally {
            this.finish();
        }
    }


    @Override
    public void onClick(View v) {
        if (v == addBranchButton) {
            addBranch();
        }
    }
}*/
/* if(isFullTheAllTexBox()== true)

            else { Toast.makeText(getBaseContext(), "There is an empty field, please fill in: ", Toast.LENGTH_LONG).show();}*//*

        }
    }



    private void clearEditTexts(EditText[] editTexts){
        for (EditText editText : editTexts){
            editText.setText("");
        }
    }

   */
/* //this funcion check if the all field are filled
    boolean isFullTheAllTexBox(){
        String LN = lastNameEditText.getText().toString();
        String FN = firstNameEditText.getText().toString();
        String CI = clientIdEditText.getText().toString();
        String TL = telephoneEditText.getText().toString();
        String EM = emailEditText.getText().toString();
        String CC = creditCardEditText.getText().toString();
        if(LN.isEmpty()|| FN.isEmpty() || CI.isEmpty() || TL.isEmpty() || EM.isEmpty() || CC.isEmpty()){
            return false;
        }
        return true;

    }*/

//}



package com.example.moish.carrentforcompany.controller;

import android.app.Activity;
import android.content.ContentValues;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.moish.carrentforcompany.R;
import com.example.moish.carrentforcompany.model.backend.DBManagerFactory;
import com.example.moish.carrentforcompany.model.backend.Functions;


public class AddBranchActivity extends Activity implements View.OnClickListener{


    private EditText citytText;
    private EditText streetEditText;
    private EditText adressNumberEditText;
    private EditText numberOfParkingAvailableEditText;
    private EditText branchNumberIdEditText;
    private Button   addBranchButton;


    private void findViews() {
        citytText = (EditText)findViewById( R.id.CitytText);
        streetEditText = (EditText)findViewById( R.id.StreetEditText );
        adressNumberEditText = (EditText)findViewById( R.id.AdressNumberEditText);
        numberOfParkingAvailableEditText = (EditText)findViewById( R.id.NumberOfParkingAvailableEditText );
        branchNumberIdEditText = (EditText)findViewById( R.id.BranchNumber_idEditText );
        addBranchButton = (Button)findViewById( R.id.addBranchButton);

        addBranchButton.setOnClickListener( this );
    }


    private void addBranch(){
        final ContentValues values = new ContentValues();
        try{
            long id = Long.valueOf(branchNumberIdEditText.getText().toString());


            values.put(Functions.BranchConst.ADESSNUMBER, adressNumberEditText.getText().toString());
            values.put(Functions.BranchConst.STREET, streetEditText.getText().toString());
            values.put(Functions.BranchConst.CITY, citytText.getText().toString());
            values.put(Functions.BranchConst.NUMBEROFPARKINGAVAILABLE, numberOfParkingAvailableEditText.getText().toString());
            values.put(Functions.BranchConst.BRANCHNUMBER, branchNumberIdEditText.getText().toString());

            new AsyncTask<Void, Void, Long>(){
                @Override
                protected void onPostExecute(Long aLong) {
                    Toast.makeText(getBaseContext(), "ID: " + aLong, Toast.LENGTH_LONG).show();
                    Log.d("client", values.toString());
                }

                @Override
                protected Long doInBackground(Void... voids) {
                    return DBManagerFactory.getManager().addBranch(values);
                }
            }.execute();
        }
        catch (Exception e){e.toString();
        }
        finally{
            this.finish();
        }
    }


    @Override
    public void onClick(View v) {
        if ( v == addBranchButton ) {
            if(isFullTheAllTexBox()== true)
                addBranch();
            else { Toast.makeText(getBaseContext(), "There is an empty field, please fill in: ", Toast.LENGTH_LONG).show();}
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_branch);
        findViews();
    }

    private void clearEditTexts(EditText[] editTexts){
        for (EditText editText : editTexts){
            editText.setText("");
        }
    }

    //this funcion check if the all field are filled
    boolean isFullTheAllTexBox(){
        String LN = citytText  . getText().toString();
        String FN = streetEditText . getText().toString();
        String CI = adressNumberEditText   .getText().toString();
        String TL = numberOfParkingAvailableEditText    .getText().toString();
        String EM = branchNumberIdEditText   .getText().toString();

        if(LN.isEmpty()|| FN.isEmpty() || CI.isEmpty() || TL.isEmpty() || EM.isEmpty()){
            return false;
        }
        return true;

    }
}


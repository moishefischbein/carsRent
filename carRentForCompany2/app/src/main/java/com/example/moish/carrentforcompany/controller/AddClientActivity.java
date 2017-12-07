package com.example.moish.carrentforcompany.controller;

import android.app.Activity;
import android.content.ContentUris;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
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

/*
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

    */
/**
     * Find the Views in the layout<br />
     * <br />
     * Auto-created on 2017-11-29 09:42:45 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     *//*

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

    */
/**
     * Handle button click events<br />
     * <br />
     * Auto-created on 2017-11-29 09:42:45 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     *//*

    @Override
    public void onClick(View v) {
        if ( v == addClientButton ) {
            addClient();
        }
    }

    private void addClient() {
        final ContentValues contentValues = new ContentValues();
        try {
            int id = Integer.valueOf(this.IdEditText.getText().toString());
            contentValues.put(Functions.ClientConst.ID, id);

            contentValues.put(Functions.ClientConst.FIRSTNAME, this.FirstNameEditText.getText().toString());
            contentValues.put(Functions.ClientConst.PHONE, this.PhoneEditText.getText().toString());

            contentValues.put(Functions.ClientConst.LASTTNAME, this.LastNameEditText.getText().toString());
            contentValues.put(Functions.ClientConst.EMAIL, this.EmailEditText.getText().toString());

            long creditCardNumber = Long.valueOf(this.creditCardNumberEditText.getText().toString());
            contentValues.put(Functions.ClientConst.CREDITCARDNUMBER, creditCardNumber);



            new AsyncTask<Void, Void, Long>() {
                @Override
               protected void onPostExecute(Long idResult) {
                    super.onPostExecute(idResult);
                    if (idResult > 0) {
                        Toast.makeText(getBaseContext(), "insert id: " + idResult, Toast.LENGTH_LONG).show();
                        Log.d("client", contentValues.toString());
                    }

                }

                @Override
                protected Long doInBackground(Void... params) {

                    return DBManagerFactory.getManager().addClient(contentValues);
                }
            }.execute();




        } catch (Exception e) {
        }
        finally {
            this.finish();
        }
    }



}
*/


////////////////////////


public class AddClientActivity extends Activity implements View.OnClickListener{


    private EditText lastNameEditText;
    private EditText firstNameEditText;
    private EditText clientIdEditText;
    private EditText telephoneEditText;
    private EditText emailEditText;
    private EditText creditCardEditText;
    private Button addClientButton;


    private void findViews() {
        lastNameEditText = (EditText)findViewById( R.id.LastNameEditText);
        firstNameEditText = (EditText)findViewById( R.id.FirstNameEditText );
        clientIdEditText = (EditText)findViewById( R.id.IdEditText);
        telephoneEditText = (EditText)findViewById( R.id.PhoneEditText );
        emailEditText = (EditText)findViewById( R.id.EmailEditText );
        creditCardEditText = (EditText)findViewById( R.id.creditCardNumberEditText );
        addClientButton = (Button)findViewById( R.id.addClientButton);

        addClientButton.setOnClickListener( this );
    }


    private void addClient(){
        final ContentValues values = new ContentValues();
        try{
            long id = Long.valueOf(clientIdEditText.getText().toString());

            values.put(Functions.ClientConst.ID, id);
            values.put(Functions.ClientConst.FIRSTNAME, firstNameEditText.getText().toString());
            values.put(Functions.ClientConst.LASTTNAME, lastNameEditText.getText().toString());
            values.put(Functions.ClientConst.PHONE, telephoneEditText.getText().toString());
            values.put(Functions.ClientConst.EMAIL, emailEditText.getText().toString());
            values.put(Functions.ClientConst.CREDITCARDNUMBER, creditCardEditText.getText().toString());

            new AsyncTask<Void, Void, Long>(){
                @Override
                protected void onPostExecute(Long aLong) {
                    Toast.makeText(getBaseContext(), "ID: " + aLong, Toast.LENGTH_LONG).show();
                    Log.d("client", values.toString());
                }

                @Override
                protected Long doInBackground(Void... voids) {
                    return DBManagerFactory.getManager().addClient(values);
                }
            }.execute();
        }
        catch (Exception e){
        }
        finally{
            this.finish();
        }
    }


    @Override
    public void onClick(View v) {
        if ( v == addClientButton ) {
            addClient();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_client);
        findViews();
    }

    private void clearEditTexts(EditText[] editTexts){
        for (EditText editText : editTexts){
            editText.setText("");
        }
    }

}

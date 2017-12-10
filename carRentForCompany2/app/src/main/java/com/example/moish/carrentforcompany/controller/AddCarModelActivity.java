/*
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

    */
/**
     * Find the Views in the layout<br />
     * <br />
     * Auto-created on 2017-11-29 09:59:50 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     *//*

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

    */
/**
     * Handle button click events<br />
     * <br />
     * Auto-created on 2017-11-29 09:59:50 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     *//*

    @Override
    public void onClick(View v) {
        if ( v == addCarModelButton ) {
            addCarModel();

        }
    }

    private void addCarModel() {
        final ContentValues contentValues = new ContentValues();
        try {
            int id = Integer.valueOf(this.ModelCodeIdText.getText().toString());
            contentValues.put(Functions.CarModelConst.MODEL_ID, id);

            int numberOfSeats = Integer.valueOf(this.NumberOfSeatsEditText.toString());
            contentValues.put(Functions.CarModelConst.SEATING, numberOfSeats);

            int motorVolume = Integer.valueOf(this.MotorVolumeEditText.getText().toString());
            contentValues.put(Functions.CarModelConst.ENGINE_VOLUME,motorVolume);

            contentValues.put(Functions.CarModelConst.COMPANY_NAME, this.CompanyNameText.getText().toString());
            contentValues.put(Functions.CarModelConst.MODEL_NAME, this.ModelNameEditText.getText().toString());

            boolean isAutomatic = Boolean.valueOf(this.IsAutomaticEditText.toString());
            contentValues.put(Functions.CarModelConst.ISAUTOMATIC, isAutomatic);



            new AsyncTask<Void, Void, Long>() {
                @Override
                protected void onPostExecute(Long idResult) {
                    super.onPostExecute(idResult);
                    if (idResult > 0)
                        Toast.makeText(getBaseContext(), "insert id: " + idResult, Toast.LENGTH_LONG).show();
                }

                @Override
                protected Long doInBackground(Void... params) {
                    return DBManagerFactory.getManager().addCarModel(contentValues);
                }
            }.execute();




        } catch (Exception e) {
        }
    }

}
*/
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

public class AddCarModelActivity extends Activity implements View.OnClickListener {



    private EditText modelCodeIdText;
    private EditText companyNameText;
    private EditText modelNameEditText;
    private EditText motorVolumeEditText;
    private EditText isAutomaticEditText;
    private EditText numberOfSeatsEditText;
    private Button addCarModelButton;


    private void findViews() {
        modelCodeIdText = (EditText)findViewById( R.id.ModelCode_idText);
        companyNameText = (EditText)findViewById( R.id.CompanyNameText );
        modelNameEditText = (EditText)findViewById( R.id.ModelNameEditText);
        motorVolumeEditText = (EditText)findViewById( R.id.MotorVolumeEditText );
        isAutomaticEditText = (EditText)findViewById( R.id.IsAutomaticEditText);
        numberOfSeatsEditText = (EditText)findViewById( R.id.NumberOfSeatsEditText);
        addCarModelButton = (Button)findViewById( R.id.addCarModelButton);

        addCarModelButton.setOnClickListener( this );
    }


    private void addCarModel(){
        final ContentValues values = new ContentValues();
        try{
            long id = Long.valueOf(modelCodeIdText.getText().toString());



            values.put(Functions.CarModelConst.ISAUTOMATIC, isAutomaticEditText.getText().toString());
            values.put(Functions.CarModelConst.ENGINE_VOLUME, motorVolumeEditText.getText().toString());
            values.put(Functions.CarModelConst.MODEL_NAME, modelNameEditText.getText().toString());
            values.put(Functions.CarModelConst.SEATING, numberOfSeatsEditText.getText().toString());
            values.put(Functions.CarModelConst.COMPANY_NAME, companyNameText.getText().toString());
            values.put(Functions.CarModelConst.MODEL_ID, modelCodeIdText.getText().toString());

            new AsyncTask<Void, Void, Long>(){
                @Override
                protected void onPostExecute(Long aLong) {
                    Toast.makeText(getBaseContext(), "ID: " + aLong, Toast.LENGTH_LONG).show();
                    Log.d("client", values.toString());
                }

                @Override
                protected Long doInBackground(Void... voids) {
                    return DBManagerFactory.getManager().addCarModel(values);
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
        if ( v == addCarModelButton ) {
            if(isFullTheAllTexBox()== true)
                addCarModel();
            else { Toast.makeText(getBaseContext(), "There is an empty field, please fill in: ", Toast.LENGTH_LONG).show();}
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_car_model);
        findViews();
    }

    private void clearEditTexts(EditText[] editTexts){
        for (EditText editText : editTexts){
            editText.setText("");
        }
    }

    //this funcion check if the all field are filled
    boolean isFullTheAllTexBox(){
        String LN = modelCodeIdText.getText().toString();
        String FN = numberOfSeatsEditText.getText().toString();
        String CI = modelNameEditText.getText().toString();
        String TL = motorVolumeEditText.getText().toString();
        String EM = isAutomaticEditText.getText().toString();
        String CC = numberOfSeatsEditText.getText().toString();
        if(LN.isEmpty()|| FN.isEmpty() || CI.isEmpty() || TL.isEmpty() || EM.isEmpty() || CC.isEmpty()){
            return false;
        }
        return true;

    }
}



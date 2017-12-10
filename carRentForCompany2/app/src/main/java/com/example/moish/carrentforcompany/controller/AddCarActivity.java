package com.example.moish.carrentforcompany.controller;

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
    private Button addCarButton;

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
        addCarButton = (Button)findViewById( R.id.addCarModelButton );

        addCarButton.setOnClickListener( this );
    }

    private void addCar(){
        final ContentValues values = new ContentValues();
        try{
            long id = Long.valueOf(CarCodeIdText.getText().toString());


            values.put(Functions.CarConst.MODEL, CarModelText.getText().toString());

            int kilometers = Integer.valueOf(this.KilometersTraveledText.toString());
            values.put(Functions.CarConst.KILOMETERS_TRAVELED, kilometers);

            int fixedBranch = Integer.valueOf(this.CarsFixedBranchText.getText().toString());
            values.put(Functions.CarConst.FIXED_BRANCH, fixedBranch);

            int carNumber = Integer.valueOf(this.CarCodeIdText.getText().toString());
            values.put(Functions.CarConst.CAR_NUMBER, carNumber);

            new AsyncTask<Void, Void, Long>(){
                @Override
                protected void onPostExecute(Long aLong) {
                    Toast.makeText(getBaseContext(), "ID: " + aLong, Toast.LENGTH_LONG).show();
                    Log.d("car", values.toString());
                }

                @Override
                protected Long doInBackground(Void... voids) {
                    return DBManagerFactory.getManager().addCar(values);
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
        if ( v == addCarButton ) {
            if(isFullTheAllTexBox())
                addCar();
            else { Toast.makeText(getBaseContext(), "There is an empty field, please fill in: ", Toast.LENGTH_LONG).show();}
        }
    }


    private void clearEditTexts(EditText[] editTexts){
        for (EditText editText : editTexts){
            editText.setText("");
        }
    }

    //this funcion check if the all field are filled
    boolean isFullTheAllTexBox(){
        String CC = CarCodeIdText.getText().toString();
        String CM = CarModelText.getText().toString();
        String KT = KilometersTraveledText.getText().toString();
        String CF = CarsFixedBranchText.getText().toString();
        if(CC.isEmpty()|| CM.isEmpty() || KT.isEmpty() || CF.isEmpty()){
            return false;
        }
        return true;

    }

}

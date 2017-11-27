package com.example.moish.carrentforcompany.controller;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.moish.carrentforcompany.R;

public class BranchActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_branch);
    }
    private Button RemoveBranchButton;
    private Button AddBranchtButton;
    private Button UpdateBranchButton;
    private Button ShowBranchButton;

    /**
     * Find the Views in the layout<br />
     * <br />
     * Auto-created on 2017-11-23 19:39:41 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    private void findViews() {
        AddBranchtButton = (Button)findViewById( R.id.AddBranchtButton );
        RemoveBranchButton = (Button)findViewById( R.id.RemoveBranchButton );
        UpdateBranchButton = (Button)findViewById( R.id.UpdateBranchButton );
        ShowBranchButton = (Button)findViewById( R.id.ShowBranchButton );

        AddBranchtButton.setOnClickListener( this );
        RemoveBranchButton.setOnClickListener( this );
        UpdateBranchButton.setOnClickListener( this );
        ShowBranchButton.setOnClickListener( this );
    }

    /**
     * Handle button click events<br />
     * <br />
     * Auto-created on 2017-11-23 19:39:41 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    @Override
    public void onClick(View v) {
        if ( v == AddBranchtButton ) {
            // Handle clicks for AddBranchtButton
        } else if ( v == RemoveBranchButton ) {
            // Handle clicks for RemoveBranchButton
        } else if ( v == UpdateBranchButton ) {
            // Handle clicks for UpdateBranchButton
        } else if ( v == ShowBranchButton ) {
            // Handle clicks for ShowBranchButton
        }
    }

}

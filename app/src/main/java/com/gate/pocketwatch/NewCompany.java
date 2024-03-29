package com.gate.pocketwatch;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

/*
 *
 * This screen is for an admin to make a new team or company.
 * It needs input for Company Username, Team Name (if applicable?), Company (Team?) Login Password,
 *
 * After succefully putting information into a Google Cloud Endpoint
 * it will move to either:
 *
 *  NewMember.java (for if the admin wishes to create a standard user)
 *  ManageMembers.java  (perhaps this should be the default)
 *
 */

public class NewCompany extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_company);


        Button addscompany = (Button) findViewById(R.id.addscompanyb);

        addscompany.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), ManageMembers.class);

                startActivity(i);
            }
        }

        );


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.new_company, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

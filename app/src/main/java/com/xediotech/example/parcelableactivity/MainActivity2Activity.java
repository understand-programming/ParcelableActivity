package com.xediotech.example.parcelableactivity;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;


public class MainActivity2Activity extends Activity {


    EditText text_from_mainactivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2);

        text_from_mainactivity = (EditText) findViewById(R.id.textfrommainactivity);

        Student student = getIntent().getParcelableExtra("student");

        String firstname = student.getFirstName();
        String lastname = student.getLastName();

        text_from_mainactivity.setText("First Name: "+firstname + " Last Name: " + lastname);

    }
}

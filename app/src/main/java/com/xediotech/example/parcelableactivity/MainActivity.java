package com.xediotech.example.parcelableactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends Activity implements OnClickListener {


    Button btnTransfer;
    EditText editTextid;
    EditText editTextname;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnTransfer = (Button) findViewById(R.id.btntransfer);
        editTextid = (EditText) findViewById(R.id.studentname);
        editTextname = (EditText) findViewById(R.id.studentid);

    }

    @Override
    public void onClick(View v) {

        String firstname = editTextid.getText().toString().trim();
        String lastname = editTextname.getText().toString().trim();

        if(!firstname.isEmpty() && !lastname.isEmpty()){

            Student student = new Student();

            student.setFirstName(firstname);
            student.setLastName(lastname);

            Intent intent  = new Intent(this,MainActivity2Activity.class);
            intent.putExtra("student",student);

            startActivity(intent);
        }else {
            Toast.makeText(this, " Enter first name and last name", Toast.LENGTH_SHORT).show();
        }
    }
}

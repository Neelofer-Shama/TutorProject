package com.example.tutorproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SearchTutorActivity extends Activity {

    EditText locationTxt, subjectTxt, classTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_tutor);
        setReference();
    }

    private void setReference() {
        locationTxt = (EditText) findViewById(R.id.locationTxt);
        subjectTxt = (EditText) findViewById(R.id.subjectTxt);
        classTxt = (EditText) findViewById(R.id.classTxt);

    }

    public void clickHandler(View view) {
        if (view.getId() == R.id.submit) {

            if (locationTxt.getText() != null && classTxt.getText() != null && subjectTxt.getText() != null) {
                startActivity(new Intent(this, ListOfTutorsActivity.class).putExtra("location", locationTxt.getText().toString())
                        .putExtra("class", classTxt.getText().toString())
                        .putExtra("subject", subjectTxt.getText().toString()));

                //here we need to pass the value of the edittext in intent
            }
            else{
                Toast.makeText(this,"Please fill the form correctly",Toast.LENGTH_SHORT).show();
            }
        }
    }
}

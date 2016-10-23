package com.example.tutorproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ProfileOfTutor extends Activity {

    TextView name, age, address, contact;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profie_of_tutor);
        setReferences();
        getIntentData();

    }

    private void setReferences() {
        name = (TextView) findViewById(R.id.name);
        age = (TextView) findViewById(R.id.age);
        contact = (TextView) findViewById(R.id.contact);
        address = (TextView) findViewById(R.id.address);

    }

    private void getIntentData() {

        if (getIntent().getExtras() != null) {

            if ((getIntent().getExtras().get("name") != null)) {
                name.setText(getIntent().getExtras().get("name").toString());
            }

            if ((getIntent().getExtras().get("age") != null)) {
                age.setText(getIntent().getExtras().get("age").toString());
            }
            if ((getIntent().getExtras().get("contact") != null)) {
                contact.setText(getIntent().getExtras().get("contact").toString());
            }
            if ((getIntent().getExtras().get("address") != null)) {
                address.setText(getIntent().getExtras().get("address").toString());
            }
        }
    }

    public void clickHandler(View view) {

        startActivity(new Intent(this, HiringActivity.class));

    }

}

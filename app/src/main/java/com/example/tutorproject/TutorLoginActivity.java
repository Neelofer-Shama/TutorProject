package com.example.tutorproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TutorLoginActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tutor_registration);


    }

    public void clickHandler(View view) {

        if (view.getId() == R.id.createNewOne) {
            startActivity(new Intent(this, SignUpActivity.class));
        }
    }
}

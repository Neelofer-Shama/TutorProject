package com.example.tutorproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ListOfTutorsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_of_tutors);
    }


    //upon selecting the text we need to navigate form this activity to profile activity.

    //this code shows you how to navigate flow.

    //currently upon clicking any where the page is navigating to the next page

    //please change to our logic.

    public void clickHandler(View view) {
        startActivity(new Intent(this, ProfileOfTutor.class).putExtra("name", "asfd")
                .putExtra("age", "55")
                .putExtra("contact", "9876543210")
                .putExtra("address", "hyd"));


    }

}

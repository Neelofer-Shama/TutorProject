package com.example.tutorproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ParentActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.parent);
    }


    public void clickHandler(View view) {
        if (view.getId() == R.id.search) {
            startActivity(new Intent(this, SearchTutorActivity.class));
        }
    }
}

package com.example.tutorproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Welcome extends Activity {

    Button p1;
    Button t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
        p1=(Button)findViewById(R.id.parent1);
        t2=(Button)findViewById(R.id.tutor1);
        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(), ParentActivity.class);
                startActivity(i);


            }
        });
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(), TutorLoginActivity.class);
                startActivity(i);


            }
        });
    }


}

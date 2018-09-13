package com.example.laptop.voyagetobangladesh;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity  {

    private Button voyageToBangladeshButton, aboutButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        voyageToBangladeshButton = findViewById(R.id.voyageToBangladeshButtonId);

        aboutButton = findViewById( R.id.aboutButtonId );



        voyageToBangladeshButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this,DistricListActivity.class);

                MainActivity.this.startActivity(myIntent);


            }
        });

        aboutButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent aboutIntent = new Intent( MainActivity.this,DevelopeDetails.class );
                MainActivity.this.startActivity( aboutIntent );
            }
        } );




    }
}

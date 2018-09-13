package com.example.laptop.voyagetobangladesh;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class DevelopeDetails extends AppCompatActivity {

    private ImageButton facebookButton,twitterButton,linkedinButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_develope_details );

        facebookButton = findViewById(R.id.facebookButtonId);
        twitterButton = findViewById(R.id.twitterButtonId);
        linkedinButton = findViewById(R.id.linkedidButtonId);



        facebookButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData( Uri.parse("http://www.facebook.com/fazla.sykat"));
                startActivity(intent);

            }
        });


        twitterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://twitter.com/fazlasykat"));
                startActivity(intent);

            }
        });

        linkedinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.linkedin.com/in/fazla-karim-sykat-b6543876/"));
                startActivity(intent);

            }
        });

    }
}

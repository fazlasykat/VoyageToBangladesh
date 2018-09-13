package com.example.laptop.voyagetobangladesh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class DhakaDivitionActivity extends AppCompatActivity {

    private ListView dhakaListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhaka_divition);


        dhakaListView = findViewById(R.id.dhakaListViewId);

        final String[] dhakaDivisonString = getResources().getStringArray(R.array.dhaka_divison_plase);
        String[] dhakaDivisonStringDetils = getResources().getStringArray(R.array.dhaka_divison_ditiles_arry);

        int[] dhakaDivisonImage ={R.drawable.liberation_war_museum,R.drawable.shaid_minar,
                R.drawable.national_parliament_house,R.drawable.ahsan_monjil};

        ArrayAdapter<String> adapter = new ArrayAdapter <>(DhakaDivitionActivity.this,
                R.layout.semple_view_divison_list,R.id.sempleViewDevitisonTextViewId,dhakaDivisonString);

        dhakaListView.setAdapter(adapter);

        dhakaListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView <?> parent, View view, int position, long id) {

//                String value = dhakaDivisonString[position];

                int p_value = position;

                Intent intent = new Intent( getApplicationContext(),SampleDetailsActivity.class );


                intent.putExtra("key",String.valueOf( p_value ));
                intent.putExtra("division","Dhaka");

                startActivity( intent );;
            }
        });
    }
}

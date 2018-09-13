package com.example.laptop.voyagetobangladesh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class SylhetDivisonActivity extends AppCompatActivity {

    private ListView sylhetListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sylhet_divison);

        sylhetListView = findViewById(R.id.sylhetListViewId);

        final String[] sylhetDivisonString = getResources().getStringArray(R.array.sylhet_divison_plase);

        String[] sylhetDivisonStringDetils = getResources().getStringArray(R.array.sylhet_divison_details_string_arry);


        int[] sylhetDivisonImage ={R.drawable.ratargul_swamp_forest,R.drawable.jaflong,
                R.drawable.bisnakandi,R.drawable.shahjalal_dorgha};

        ArrayAdapter<String> adapter = new ArrayAdapter <>(SylhetDivisonActivity.this,R.layout.semple_view_divison_list,
                R.id.sempleViewDevitisonTextViewId,sylhetDivisonString);

        sylhetListView.setAdapter(adapter);

        sylhetListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView <?> parent, View view, int position, long id) {

                //String value = sylhetDivisonString[position];

                int p_value = position;

                Intent intent = new Intent( getApplicationContext(),SampleDetailsActivity.class );



                intent.putExtra("key",String.valueOf( p_value ));
                intent.putExtra("division","Sylhet");

                startActivity( intent );
            }
        });
    }
}

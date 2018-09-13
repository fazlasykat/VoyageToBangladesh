package com.example.laptop.voyagetobangladesh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MymensinghDivisonActivity extends AppCompatActivity {

    private ListView maymensinghaListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mymensingh_divison);

        maymensinghaListView = findViewById(R.id.mymensinghListViewId);

        final String[] mymenshinghaDivisonString = getResources().getStringArray(R.array.mymensingh_divison_plase);
        String[] mymenshinghaDivisonStringDetils = getResources().getStringArray(R.array.mymensingh_divison_string_arry);

        int[] mymenshinghaDivisonImage ={R.drawable.dewanganj_sugar_mill,R.drawable.doyamoye_temple,
                R.drawable.gandhi_asrom,R.drawable.jamuna_fertilizer_factory,
                };

        ArrayAdapter<String> adapter = new ArrayAdapter <>(MymensinghDivisonActivity.this,R.layout.semple_view_divison_list,
                R.id.sempleViewDevitisonTextViewId,mymenshinghaDivisonString);
        maymensinghaListView.setAdapter(adapter);

        maymensinghaListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView <?> parent, View view, int position, long id) {

                //String value = mymenshinghaDivisonString[position];

                int p_value = position;

                Intent intent = new Intent( getApplicationContext(),SampleDetailsActivity.class );


                intent.putExtra("key",String.valueOf( p_value ));

                intent.putExtra("division","Mymensingh");

                startActivity( intent );
            }
        });
    }
}

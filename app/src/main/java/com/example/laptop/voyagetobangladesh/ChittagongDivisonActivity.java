package com.example.laptop.voyagetobangladesh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ChittagongDivisonActivity extends AppCompatActivity {

    private ListView chittagongListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chittagong_divison);

        chittagongListView = findViewById(R.id.chittagongListViewId);

        final String[] chittagongDivisonString = getResources().getStringArray(R.array.chittagong_divison_pleas);
        String[]chittagongDivisonStringDetils = getResources().getStringArray(R.array.chittagong_divison_string_arry);

        int[] chittagongDivisonImage ={R.drawable.boga_lake,R.drawable.neval_beach,
                R.drawable.foyz_lake,R.drawable.chittagong_commonwealth_war_cemetery};

        ArrayAdapter<String> adapter = new ArrayAdapter <>(ChittagongDivisonActivity.this,R.layout.semple_view_divison_list,
                R.id.sempleViewDevitisonTextViewId,chittagongDivisonString);

        chittagongListView.setAdapter(adapter);

        chittagongListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView <?> parent, View view, int position, long id) {

//                String value = chittagongDivisonString[position];


                int p_value = position;

                Intent intent = new Intent( getApplicationContext(),SampleDetailsActivity.class );



                intent.putExtra("key",String.valueOf( p_value ));
                intent.putExtra("division","Chittagong");

                startActivity( intent );
            }
        });

    }
}

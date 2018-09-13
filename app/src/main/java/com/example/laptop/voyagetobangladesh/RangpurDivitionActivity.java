package com.example.laptop.voyagetobangladesh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class RangpurDivitionActivity extends AppCompatActivity {

    private ListView rangpurListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rangpur_divition);

        rangpurListView = findViewById(R.id.rangpurListViewId);

        String[]  rangpurDivisonString = getResources().getStringArray(R.array.rangpur_divison_plase);
        String[] rangpurDivisonStringDetils = getResources().getStringArray(R.array.rangpur_divison_detils_string_arry);


        int[] rangpurDivisonImage ={R.drawable.tajhat_palac,R.drawable.vinnya_jagat,
                R.drawable.ramsagar_national_park,R.drawable.nayabad_mosque
        };

        ArrayAdapter<String> adapter = new ArrayAdapter <>(RangpurDivitionActivity.this,R.layout.semple_view_divison_list,
                R.id.sempleViewDevitisonTextViewId,rangpurDivisonString);

        rangpurListView.setAdapter(adapter);

        rangpurListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView <?> parent, View view, int position, long id) {


                int p_value = position;

                Intent intent = new Intent( getApplicationContext(),SampleDetailsActivity.class );



                intent.putExtra("key",String.valueOf( p_value ));
                intent.putExtra("division","Rangpur");

                startActivity( intent );
            }
        });
    }
}

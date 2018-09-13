package com.example.laptop.voyagetobangladesh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class RajshahiDivisonActivity extends AppCompatActivity {

    private ListView rajshaiListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rajshahi_divison);

        rajshaiListView = findViewById(R.id.rajshaiListViewId);

        final String[] rajshaiDivisonString = getResources().getStringArray(R.array.rajshai_divison_plase);
        String[] rajshaiDivisonStringDetils = getResources().getStringArray(R.array.rajshai_divison_detils_arry);


        int[] rajshaiDivisonImage ={R.drawable.puthia_temple_complex,R.drawable.kantajew_temple,
                R.drawable.manasthangarh,R.drawable.ruins_ofthe_buddhist_vihara_at_paharpur
                };

        ArrayAdapter<String> adapter = new ArrayAdapter <>(RajshahiDivisonActivity.this,R.layout.semple_view_divison_list,
                R.id.sempleViewDevitisonTextViewId,rajshaiDivisonString);

        rajshaiListView.setAdapter(adapter);

        rajshaiListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView <?> parent, View view, int position, long id) {

                //String value = rajshaiDivisonString[position];

                int p_value = position;

                Intent intent = new Intent( getApplicationContext(),SampleDetailsActivity.class );



                intent.putExtra("key",String.valueOf( p_value ));
                intent.putExtra("division","Rajshai");

                startActivity( intent );
            }
        });
    }
}

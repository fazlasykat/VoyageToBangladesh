package com.example.laptop.voyagetobangladesh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class KhulnaDivisionActivity extends AppCompatActivity {

    private ListView khulnaListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khulna_division);

        khulnaListView = findViewById(R.id.khulnaListViewId);


        final String[] khulnaDivisonString = getResources().getStringArray(R.array.khulna_division_plase);
        String[] khulnaDivisonStringDetils = getResources().getStringArray(R.array.khulna_divison_ditels_string);

        int[] khulnaDivisonImage ={R.drawable.shait_gumbad_mosque,R.drawable.sundarban,
                R.drawable.fakir_lalon_shahs_mazaar,R.drawable.shilaidaha_kuthibari_rabindranath_tagores_esidence,
                R.drawable.genocide_torture_archive_and_museum};

        ArrayAdapter<String> adapter = new ArrayAdapter <>(KhulnaDivisionActivity.this,
                R.layout.semple_view_divison_list,R.id.sempleViewDevitisonTextViewId,khulnaDivisonString);

        khulnaListView.setAdapter(adapter);

        khulnaListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView <?> parent, View view, int position, long id) {

                //String value = khulnaDivisonString[position];

                int p_value = position;

                Intent intent = new Intent( getApplicationContext(),SampleDetailsActivity.class );


                intent.putExtra("key",String.valueOf( p_value ));
                intent.putExtra("division","Khulna");

                startActivity( intent );
            }
        });
    }
}

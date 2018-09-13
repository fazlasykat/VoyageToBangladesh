package com.example.laptop.voyagetobangladesh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class BarisalDivisionActivity extends AppCompatActivity {

    private ListView barisalListView;
    private Intent intent;









    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barisal_division);

        barisalListView = findViewById(R.id.barisalListViewId);

      String[] barisalDivisonString = getResources().getStringArray(R.array.barisal_divison_pleas);
      String[] barisalDivisonStringDetils = getResources().getStringArray(R.array.barisal_divison_string_arry);

      int[] barisalDivisonImage ={R.drawable.kuakata_beach_image,R.drawable.guthia_mosque_image,
                R.drawable.durga_sagar_image,R.drawable.lebur_char_image,R.drawable.lebur_char_image,
                R.drawable.guava_market_image,R.drawable.kuakata_buddhist_temple_image,R.drawable.fatrar_char_image,
                R.drawable.fatrar_char_image,R.drawable.gangamati_reserved_forest};






        ArrayAdapter<String> adapter = new ArrayAdapter <>(BarisalDivisionActivity.this,
                R.layout.semple_view_divison_list,R.id.sempleViewDevitisonTextViewId,barisalDivisonString);

        barisalListView.setAdapter(adapter);

        barisalListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView <?> parent, View view, int position, long id) {

            String[] barisalDivisonString = getResources().getStringArray(R.array.barisal_divison_pleas);


//                String value = barisalDivisonString[position];


                int p_value = position;

                Intent intent = new Intent( getApplicationContext(),SampleDetailsActivity.class );

                intent.putExtra("key",String.valueOf( p_value ));
                intent.putExtra("division","Barisal");

                startActivity( intent );


            }
        });

        BarisalCustomAdapter barisalCusttomAdapter = new BarisalCustomAdapter(getApplicationContext(),barisalDivisonImage,
                barisalDivisonString, barisalDivisonStringDetils);
    }
}

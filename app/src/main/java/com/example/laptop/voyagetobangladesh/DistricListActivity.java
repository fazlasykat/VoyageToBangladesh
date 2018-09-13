package com.example.laptop.voyagetobangladesh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class DistricListActivity extends AppCompatActivity {

    private ListView divitionNameListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distric_list);

        divitionNameListView = findViewById(R.id.listViewId);

        final String[] divitionName = getResources().getStringArray(R.array.devison_names);

        ArrayAdapter<String> adapter = new ArrayAdapter <>(DistricListActivity.this,R.layout.semple_view_divison_list,
                R.id.sempleViewDevitisonTextViewId,divitionName);

        divitionNameListView.setAdapter(adapter);

        divitionNameListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView <?> parent, View view, int position, long id) {


                //String value = divitionName[position];

                if(position == 0){

                    Intent intent = new Intent(DistricListActivity.this,BarisalDivisionActivity.class);
                    startActivity(intent);
                }

                else if(position == 1){

                    Intent intent = new Intent(DistricListActivity.this,ChittagongDivisonActivity.class);
                    startActivity(intent);

                }

                else if(position == 2){

                    Intent intent = new Intent(DistricListActivity.this,DhakaDivitionActivity.class);
                    startActivity(intent);

                }

                else if (position == 3){

                    Intent intent = new Intent(DistricListActivity.this,KhulnaDivisionActivity.class);
                    startActivity(intent);
                }

                else if (position == 4){

                    Intent intent = new Intent(DistricListActivity.this,MymensinghDivisonActivity.class);
                    startActivity(intent);
                }

                else if (position == 5){

                    Intent intent = new Intent(DistricListActivity.this,RajshahiDivisonActivity.class);
                    startActivity(intent);


                }

                else if (position == 6){

                    Intent intent = new Intent(DistricListActivity.this,RangpurDivitionActivity.class);
                    startActivity(intent);
                }

                else if (position == 7){

                    Intent intent = new Intent(DistricListActivity.this,SylhetDivisonActivity.class);
                    startActivity(intent);
                }





            }
        });
    }
}

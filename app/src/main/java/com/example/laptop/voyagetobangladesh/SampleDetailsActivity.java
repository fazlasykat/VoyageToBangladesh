package com.example.laptop.voyagetobangladesh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;


public class SampleDetailsActivity extends AppCompatActivity {

    private ImageView sampleImage;
    private TextView nameTextView,detilsTextView;
    String pos,mDivision;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample_details);


        sampleImage = findViewById( R.id.sampleImageViewId );
        nameTextView = findViewById( R.id.sampleTitleTextViewId );
        detilsTextView = findViewById( R.id.sampleDetailsTextViewId );


        Intent in = getIntent();
        pos = in.getStringExtra("key");
        mDivision = in.getStringExtra("division");
        Log.d("TAGPOSITION",pos);


        if(mDivision.equals( "Barisal" )){
            barisal();
        }
        else if(mDivision.equals( "Chittagong" )){

            chittagong();

        }

        else if(mDivision.equals( "Dhaka" )){

            dhaka();

        }

        else if (mDivision.equals( "Khulna" )) {
            khulna();
        } else if (mDivision.equals( "Mymensingh" )){
            mymensingh();


        }

        else if (mDivision.equals( "Rajshai" )){

            rajshai();


        }

        else if (mDivision.equals( "Rangpur" )){

            rangpur();


        }

        else if (mDivision.equals( "Sylhet" )){
            sylhet();

        }


    }

    public void barisal(){





        String[] barisalDivisonString = getResources().getStringArray(R.array.barisal_divison_pleas);
        String[] barisalDivisonStringDetils = getResources().getStringArray(R.array.barisal_divison_string_arry);

        int[] barisalDivisonImageint ={R.drawable.kuakata_beach_image,R.drawable.guthia_mosque_image,
                R.drawable.durga_sagar_image,R.drawable.lebur_char_image,R.drawable.lebur_char_image,
                R.drawable.guava_market_image,R.drawable.kuakata_buddhist_temple_image,R.drawable.fatrar_char_image,
                R.drawable.fatrar_char_image,R.drawable.gangamati_reserved_forest};





        Intent intent = getIntent();
        int barisalPos = intent.getIntExtra("key", 0);


        nameTextView.setText( barisalDivisonString[Integer.valueOf(pos)] );
        detilsTextView.setText(barisalDivisonStringDetils[Integer.valueOf(pos)] );
        sampleImage.setImageResource( barisalDivisonImageint[Integer.valueOf(pos)]);




    }


    public void chittagong(){





        String[] chittagongDivisonString = getResources().getStringArray(R.array.chittagong_divison_pleas);
        String[] chittagongDivisonStringDetils = getResources().getStringArray(R.array.chittagong_divison_string_arry);

        int[] chittagongDivisonImage ={R.drawable.boga_lake,R.drawable.neval_beach,
                R.drawable.foyz_lake,R.drawable.chittagong_commonwealth_war_cemetery};






        Intent intent = getIntent();
        int chittagongPos = intent.getIntExtra("key", 0);


        nameTextView.setText( chittagongDivisonString[Integer.valueOf(pos)] );
        detilsTextView.setText(chittagongDivisonStringDetils[Integer.valueOf(pos)] );
        sampleImage.setImageResource( chittagongDivisonImage[Integer.valueOf(pos)]);




    }

       public void dhaka(){





           String[] dhakaDivisonString = getResources().getStringArray(R.array.dhaka_divison_plase);
           String[] dhakaDivisonStringDetils = getResources().getStringArray(R.array.dhaka_divison_ditiles_arry);

           int[] dhakaDivisonImage ={R.drawable.liberation_war_museum,R.drawable.shaid_minar,
                   R.drawable.national_parliament_house,R.drawable.ahsan_monjil};






        Intent intent = getIntent();
        int dhakaPos = intent.getIntExtra("key", 0);


        nameTextView.setText( dhakaDivisonString[Integer.valueOf(pos)] );
        detilsTextView.setText(dhakaDivisonStringDetils[Integer.valueOf(pos)] );
        sampleImage.setImageResource( dhakaDivisonImage[Integer.valueOf(pos)]);
    }
    public void khulna(){





        String[] khulnaDivisonString = getResources().getStringArray(R.array.khulna_division_plase);
        String[] khulnaDivisonStringDetils = getResources().getStringArray(R.array.khulna_divison_ditels_string);

        int[] khulnaDivisonImage ={R.drawable.shait_gumbad_mosque,R.drawable.sundarban,
                R.drawable.fakir_lalon_shahs_mazaar,R.drawable.shilaidaha_kuthibari_rabindranath_tagores_esidence,
                R.drawable.genocide_torture_archive_and_museum};






        Intent intent = getIntent();
        int khulnaPos = intent.getIntExtra("key", 0);


        nameTextView.setText( khulnaDivisonString[Integer.valueOf(pos)] );
        detilsTextView.setText(khulnaDivisonStringDetils[Integer.valueOf(pos)] );
        sampleImage.setImageResource( khulnaDivisonImage[Integer.valueOf(pos)]);
    }


 public void mymensingh(){





     String[] mymenshinghaDivisonString = getResources().getStringArray(R.array.mymensingh_divison_plase);
     String[] mymenshinghaDivisonStringDetils = getResources().getStringArray(R.array.mymensingh_divison_string_arry);

     int[] mymenshinghaDivisonImage ={R.drawable.dewanganj_sugar_mill,R.drawable.doyamoye_temple,
             R.drawable.gandhi_asrom,R.drawable.jamuna_fertilizer_factory,
     };






        Intent intent = getIntent();
        int mymensinghPos = intent.getIntExtra("key", 0);


        nameTextView.setText( mymenshinghaDivisonString[Integer.valueOf(pos)] );
        detilsTextView.setText(mymenshinghaDivisonStringDetils[Integer.valueOf(pos)] );
        sampleImage.setImageResource( mymenshinghaDivisonImage[Integer.valueOf(pos)]);
    }
public void rajshai(){





    String[] rajshaiDivisonString = getResources().getStringArray(R.array.rajshai_divison_plase);
    String[] rajshaiDivisonStringDetils = getResources().getStringArray(R.array.rajshai_divison_detils_arry);


    int[] rajshaiDivisonImage ={R.drawable.puthia_temple_complex,R.drawable.kantajew_temple,
            R.drawable.manasthangarh,R.drawable.ruins_ofthe_buddhist_vihara_at_paharpur
     };






        Intent intent = getIntent();
        int rajshaiPos = intent.getIntExtra("key", 0);


        nameTextView.setText( rajshaiDivisonString[Integer.valueOf(pos)] );
        detilsTextView.setText(rajshaiDivisonStringDetils[Integer.valueOf(pos)] );
        sampleImage.setImageResource( rajshaiDivisonImage[Integer.valueOf(pos)]);
    }
public void rangpur(){





    String[] rangpurDivisonString = getResources().getStringArray(R.array.rangpur_divison_plase);
    String[] rangpurDivisonStringDetils = getResources().getStringArray(R.array.rangpur_divison_detils_string_arry);


    int[] rangpurDivisonImage ={R.drawable.tajhat_palac,R.drawable.vinnya_jagat,
            R.drawable.ramsagar_national_park,R.drawable.nayabad_mosque

     };






        Intent intent = getIntent();
        int rangpurPos = intent.getIntExtra("key", 0);


        nameTextView.setText( rangpurDivisonString[Integer.valueOf(pos)] );
        detilsTextView.setText(rangpurDivisonStringDetils[Integer.valueOf(pos)] );
        sampleImage.setImageResource( rangpurDivisonImage[Integer.valueOf(pos)]);
    }
public void sylhet(){





    String[] sylhetDivisonString = getResources().getStringArray(R.array.sylhet_divison_plase);

    String[] sylhetDivisonStringDetils = getResources().getStringArray(R.array.sylhet_divison_details_string_arry);


    int[] sylhetDivisonImage ={R.drawable.ratargul_swamp_forest,R.drawable.jaflong,
            R.drawable.bisnakandi,R.drawable.shahjalal_dorgha};



        Intent intent = getIntent();
        int sylhetPos = intent.getIntExtra("key", 0);


        nameTextView.setText( sylhetDivisonString[Integer.valueOf(pos)] );
        detilsTextView.setText(sylhetDivisonStringDetils[Integer.valueOf(pos)] );
        sampleImage.setImageResource( sylhetDivisonImage[Integer.valueOf(pos)]);
    }


    }


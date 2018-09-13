package com.example.laptop.voyagetobangladesh;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


class BarisalCustomAdapter extends BaseAdapter {

    private Context context;
    private int[] barisalDivisonImage;
    private String[] barisalDivisonNameString,barisalDivisonDetilsString;
    LayoutInflater inflter;






    public BarisalCustomAdapter(Context applicationContext, int[] barisalDivisonImage,
                                String[] barisalDivisonString, String[] barisalDivisonStringDetils) {


        this.context = context;
        this.barisalDivisonNameString = barisalDivisonNameString;
        this.barisalDivisonDetilsString = barisalDivisonDetilsString;
        this.barisalDivisonImage = barisalDivisonImage;
        inflter = (LayoutInflater.from(applicationContext));



    }

    @Override
    public int getCount() {
        return barisalDivisonNameString.length ;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        if (convertView==null){

            inflter = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

            convertView = inflter.inflate(R.layout.sample_details_activity,null);


        }



        ImageView barisalDivisonImageView = convertView.findViewById(R.id.sampleImageViewId);
        TextView barisalDivisonName = convertView.findViewById(R.id.sampleTitleTextViewId);
        TextView barisalDivisonDetails = convertView.findViewById(R.id.sampleDetailsTextViewId);



        barisalDivisonImageView.setImageResource( barisalDivisonImage[position] );
        barisalDivisonName.setText( barisalDivisonNameString[position]);
        barisalDivisonDetails.setText( barisalDivisonDetilsString[position]);





        return convertView;
    }
}

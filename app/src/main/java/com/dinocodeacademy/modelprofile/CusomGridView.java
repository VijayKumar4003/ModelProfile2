package com.dinocodeacademy.modelprofile;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class CusomGridView extends BaseAdapter {


    private Context mContext;
    private  String[] text;
    private int[] imageid;


    @Override
    public int getCount() {
        return text.length;
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

       View vgird;
        LayoutInflater inflaterob = (LayoutInflater) mContext.getSystemService(mContext.LAYOUT_INFLATER_SERVICE);


        if (convertView == null){

            vgird = new View(mContext);
            vgird = inflaterob.inflate(R.layout.grid_layout,null);

            ImageView imageView = (ImageView) vgird.findViewById(R.id.imageViewGridItem);

            imageView.setImageResource(imageid[position]);


        }else {

            vgird = (View) convertView;
        }

        return vgird;
    }
}

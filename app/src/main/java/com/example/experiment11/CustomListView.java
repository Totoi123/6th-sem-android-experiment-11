package com.example.experiment11;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CustomListView extends ArrayAdapter<String> {
    private String[] carname;

    private Integer[] imgid;
    private Activity context;

    public CustomListView(Activity context, String[] carname, Integer[] imgid) {
        super(context, R.layout.listview_layout, carname);

    this.context = context;
        this.carname = carname;
        this.imgid = imgid;


    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View r = convertView;
        ViewHolder viewHolder = null;
        if (r == null){
            LayoutInflater layoutInflater = context.getLayoutInflater();
            r = layoutInflater.inflate(R.layout.listview_layout,null,true);
            viewHolder = new ViewHolder(r);
            r.setTag(viewHolder);
        }
        else {
            viewHolder = (ViewHolder) r.getTag();
        }
        viewHolder.ivw.setImageResource(imgid[position]);
        viewHolder.tvw1.setText(carname[position]);

        return r;



    }
    class ViewHolder
    {
        TextView tvw1;
        ImageView ivw;
        ViewHolder(View v){
            tvw1 = v.findViewById(R.id.car_name);
            ivw = v.findViewById(R.id.image_view);
        }
    }

}

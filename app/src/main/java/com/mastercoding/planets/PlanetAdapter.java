package com.mastercoding.planets;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class PlanetAdapter extends ArrayAdapter<PlanetModel> {



    //using custom layout --> PlaneAdapter
    //using custom objects --> extends ArrayAdapter<PlanetModel>

    private ArrayList<PlanetModel> planetsArrayList;
    private Context context;

    public PlanetAdapter(@NonNull Context context, @NonNull ArrayList<PlanetModel> planetsArrayList) {
        super(context, R.layout.item_list_layout, planetsArrayList);
        this.planetsArrayList = planetsArrayList;
        this.context = context;

    }

    private static class ViewHolder{
        TextView planetName;
        TextView moonCount;
        ImageView planetImg;

    }

    // getView(): used to create and return a view for a specific
    //            item in the list.


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // 1 -  Get the planet object from current position
        PlanetModel planets = getItem(position);
        // 2 - Inflate layout
        ViewHolder viewHolder;
        final View result;

        if (convertView == null){
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.item_list_layout, parent, false);

            //Finding views:
            viewHolder.planetName = convertView.findViewById(R.id.planetName);
            viewHolder.moonCount = convertView.findViewById(R.id.moon);
            viewHolder.planetImg = convertView.findViewById(R.id.imageView);

            result = convertView;
            convertView.setTag(viewHolder);
        }else {
            // the view is recycled
            viewHolder = (ViewHolder) convertView.getTag();
            result = convertView;
        }
        // getting the dat from model class PlanetModel
        viewHolder.planetName.setText(planets.getPlanetName());
        viewHolder.moonCount.setText(planets.getMoonCount());
        viewHolder.planetImg.setImageResource(planets.getPlanetImage());

        return convertView;

    }
}

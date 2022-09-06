package com.example.recyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class myadapter extends RecyclerView.Adapter {


    class holder extends RecyclerView.ViewHolder{
        ImageView img;
        TextView txt;


        public holder(@NonNull View itemView) {
            super(itemView);
            img = (ImageView) itemView.findViewById(R.id.img1);
            txt=(TextView) itemView.findViewById(R.id.t1);
            
        }
    }

}

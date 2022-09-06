package com.example.recyclerview;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class myadapter extends RecyclerView.Adapter {


    class holder extends RecyclerView.ViewHolder{
        

        public holder(@NonNull View itemView) {
            super(itemView);
        }
    }

}

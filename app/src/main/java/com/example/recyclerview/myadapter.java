package com.example.recyclerview;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class myadapter extends RecyclerView.Adapter<myadapter.holder> {

String data[];

    public myadapter(String[] data) {
        this.data = data;
    }

    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

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

package com.example.youssef.ar_foods;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.youssef.ar_foods.egyptadapter.adapteraklat;

import java.util.ArrayList;

public class typeadapter extends RecyclerView.Adapter<typeadapter.viewholder> {

    Context context;
    ArrayList<foodtypes> listtypes,main,side;
    Activity activity;

    public typeadapter(Context con, ArrayList<foodtypes> mytype)
    {
        this.context=con;
        this.listtypes=mytype;


    }


    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View myview=LayoutInflater.from(context.getApplicationContext()).inflate(R.layout.typerow,parent,false);
        return new viewholder(myview);
    }

    @Override
    public void onBindViewHolder(@NonNull final viewholder holder, final int position) {

        holder.texttype.setText(listtypes.get(position).getTypename());
        holder.favourit.setVisibility(View.GONE);

       GlideApp
               .with(context)
               .load(listtypes.get(position).getImageView())
               .centerCrop()
               .into(holder.imagetype);
        holder.mycard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                foodsnames name=new foodsnames();
                RecyclerView recyclerView;

                adapteraklat adapter;

                int pos=holder.getAdapterPosition();
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("position",pos);
                editor.apply();


                switch (pos)
                {
                    case 0:{
                        Intent myintent=new Intent(context,foodsnames.class);
                        myintent.putExtra("content",11);
                        context.startActivity(myintent);
                        break;
                    }

                    case 1:{
                        Intent mintent=new Intent(context,foodsnames.class);
                        mintent.putExtra("content",12);
                        context.startActivity(mintent);
                        break;
                    }
                    case 2:{
                        Intent mintent=new Intent(context,foodsnames.class);
                        mintent.putExtra("content",13);
                        context.startActivity(mintent);
                        break;
                    }
                    case 3:{
                        Intent mintent=new Intent(context,foodsnames.class);
                        mintent.putExtra("content",14);
                        context.startActivity(mintent);
                        break;

                    }
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return listtypes.size();
    }

    class viewholder extends RecyclerView.ViewHolder{

        ImageView imagetype;
        TextView texttype;
        CardView mycard;
        ImageView favourit;

        public viewholder(View itemView) {
            super(itemView);

            imagetype=itemView.findViewById(R.id.imgty);
            texttype=itemView.findViewById(R.id.textty);
            mycard=itemView.findViewById(R.id.cardtype);
            favourit=itemView.findViewById(R.id.favourt);

        }
    }
}

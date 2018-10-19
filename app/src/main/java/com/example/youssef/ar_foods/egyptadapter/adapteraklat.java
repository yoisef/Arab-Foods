package com.example.youssef.ar_foods.egyptadapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.youssef.ar_foods.GlideApp;
import com.example.youssef.ar_foods.R;
import com.example.youssef.ar_foods.fooddetail;
import com.example.youssef.ar_foods.foodsnames;
import com.example.youssef.ar_foods.foodtypes;

import java.util.ArrayList;

public class adapteraklat extends RecyclerView.Adapter<adapteraklat.viewholder>{
    Context context;



    ArrayList<foodtypes> listtypes,main,side;
    Activity activity;

    public adapteraklat(Context con,ArrayList<foodtypes> myliste)
    {
        this.context=con;
        this.listtypes=myliste;

        main=new ArrayList<>();
        side=new ArrayList<>();
        /*

*/
        side.add(new foodtypes(R.drawable.soup,"be"));
        side.add(new foodtypes(R.drawable.soup,"be"));
        side.add(new foodtypes(R.drawable.soup,"be"));
        side.add(new foodtypes(R.drawable.soup,"be"));




    }



    @NonNull
    @Override
    public adapteraklat.viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View myview= LayoutInflater.from(context.getApplicationContext()).inflate(R.layout.typerow,parent,false);
        return new adapteraklat.viewholder(myview);
    }

    @Override
    public void onBindViewHolder(@NonNull final adapteraklat.viewholder holder, int position) {

       // holder.imagetype.setImageDrawable(context.getResources().getDrawable(listtypes.get(position).getImageView()));
        GlideApp
                .with(context)
                .load(listtypes.get(position).getImageView())
                .centerCrop()
                .into(holder.imagetype);
        holder.texttype.setText(listtypes.get(position).getTypename());
        holder.mycard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                int pos=holder.getAdapterPosition();

                switch (pos)
                {
                    case 0:{
                        Intent intent=new Intent(context,fooddetail.class);
                        intent.putExtra("content",11);
                        context.startActivity(intent);
                        break;
                    }

                    case 1:{
                        Intent intent=new Intent(context,fooddetail.class);
                        intent.putExtra("content",12);
                        context.startActivity(intent);
                        break;

                    }
                    case 2:{
                        Intent intent=new Intent(context,fooddetail.class);
                        intent.putExtra("content",13);
                        context.startActivity(intent);
                        break;

                    }
                    case 3:{
                        Intent intent=new Intent(context,fooddetail.class);
                        intent.putExtra("content",14);
                        context.startActivity(intent);
                        break;

                    }
                    case 4:{
                        Intent intent=new Intent(context,fooddetail.class);
                        intent.putExtra("content",15);
                        context.startActivity(intent);
                        break;

                    }
                    case 5:{
                        Intent intent=new Intent(context,fooddetail.class);
                        intent.putExtra("content",16);
                        context.startActivity(intent);
                        break;

                    }
                    case 6:{
                        Intent intent=new Intent(context,fooddetail.class);
                        intent.putExtra("content",17);
                        context.startActivity(intent);
                        break;

                    }
                    case 7:{
                        Intent intent=new Intent(context,fooddetail.class);
                        intent.putExtra("content",18);
                        context.startActivity(intent);
                        break;

                    }
                    case 8:{
                        Intent intent=new Intent(context,fooddetail.class);
                        intent.putExtra("content",19);
                        context.startActivity(intent);
                        break;

                    }
                    case 9:{
                        Intent intent=new Intent(context,fooddetail.class);
                        intent.putExtra("content",110);
                        context.startActivity(intent);
                        break;

                    }
                    case 10:{
                        Intent intent=new Intent(context,fooddetail.class);
                        intent.putExtra("content",111);
                        context.startActivity(intent);
                        break;

                    }
                    case 11:{
                        Intent intent=new Intent(context,fooddetail.class);
                        intent.putExtra("content",112);
                        context.startActivity(intent);
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

        public viewholder(View itemView) {
            super(itemView);

            imagetype=itemView.findViewById(R.id.imgty);
            texttype=itemView.findViewById(R.id.textty);
            mycard=itemView.findViewById(R.id.cardtype);

        }
    }
}

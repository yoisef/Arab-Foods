package com.example.youssef.ar_foods;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class egyptfragment extends Fragment {

    ArrayList<foodtypes> typelist;
    RecyclerView myrecycle;
    Context context;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.egylayout,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        context=getActivity();

        myrecycle=view.findViewById(R.id.recycleegy);
        myrecycle.setHasFixedSize(true);
        myrecycle.setLayoutManager(new LinearLayoutManager(context));

        typelist=new ArrayList<>();
        typelist.add(new foodtypes(R.drawable.mainegypt,"Main Dishes"));
        typelist.add(new foodtypes(R.drawable.saladegypt,"Salad"));
        typelist.add(new foodtypes(R.drawable.soupegypt,"Soup"));
        typelist.add(new foodtypes(R.drawable.entrees,"Dessert"));



        myrecycle.setAdapter(new typeadapter(context,typelist));
    }
}

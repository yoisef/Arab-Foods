package com.example.youssef.ar_foods;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.youssef.ar_foods.egyptadapter.adapteraklat;
import com.example.youssef.ar_foods.egyptadapter.adapteraklat2;
import com.example.youssef.ar_foods.egyptadapter.adapteraklat3;
import com.example.youssef.ar_foods.egyptadapter.adapteraklat4;
import com.example.youssef.ar_foods.gulfadapters.adapteraklat9;
import com.example.youssef.ar_foods.syriaadapter.adapteraklat5;

import java.util.ArrayList;

public class foodsnames extends AppCompatActivity {


    RecyclerView foodtypesre;


    ArrayList<foodtypes> main,side,entreess,saladd,soupp, main1,side1,entreess1,saladd1,soupp1, main2,side2,entreess2,saladd2,soupp2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodsnames);



        foodtypesre=findViewById(R.id.foodrecycle);
        foodtypesre.setHasFixedSize(true);
        foodtypesre.setLayoutManager(new GridLayoutManager(this,2));
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        int highScore = preferences.getInt("position", 0);
        int pos1=preferences.getInt("position1",0);
        int pos2=preferences.getInt("position2",0);


        main=new ArrayList<>();
        side=new ArrayList<>();
        entreess=new ArrayList<>();
        saladd=new ArrayList<>();
        soupp=new ArrayList<>();
        main1=new ArrayList<>();
        side1=new ArrayList<>();
        entreess1=new ArrayList<>();
        saladd1=new ArrayList<>();
        soupp1=new ArrayList<>();
        main2=new ArrayList<>();
        side2=new ArrayList<>();
        entreess2=new ArrayList<>();
        saladd2=new ArrayList<>();
        soupp2=new ArrayList<>();

        main.add(new foodtypes(R.drawable.egyptf,"Alex sausage"));
        main.add(new foodtypes(R.drawable.egyptf,"Bean with fried eggs"));
        main.add(new foodtypes(R.drawable.egyptf,"Stuffed Chicken Roll"));
        main.add(new foodtypes(R.drawable.egyptf,"Green Mallochia"));
        main.add(new foodtypes(R.drawable.egyptf,"Egyptian Koshri"));
        main.add(new foodtypes(R.drawable.egyptf,"Zucchini with Bechamel"));
        main.add(new foodtypes(R.drawable.egyptf,"Torley Casserole with Meat"));
        main.add(new foodtypes(R.drawable.egyptf,"Chili prawns"));
        main.add(new foodtypes(R.drawable.egyptf,"Besara"));
        main.add(new foodtypes(R.drawable.egyptf,"Artichoke baked with spinach and cream"));
        main.add(new foodtypes(R.drawable.egyptf,"Nersco"));
        main.add(new foodtypes(R.drawable.egyptf,"Crispy Chicken Balls"));

        saladd.add(new foodtypes(R.drawable.egyptf,"Baba Ghanoug (Spiced Eggplant)"));
        saladd.add(new foodtypes(R.drawable.egyptf,"Salad flour"));
        saladd.add(new foodtypes(R.drawable.egyptf,"Spicy potato salad"));
        saladd.add(new foodtypes(R.drawable.egyptf,"Hummus salad"));
        saladd.add(new foodtypes(R.drawable.egyptf,"Salad od cool slo"));
        saladd.add(new foodtypes(R.drawable.egyptf,"Tabouleh salad with pomegranate seeds"));
        saladd.add(new foodtypes(R.drawable.egyptf,"Pie salad"));
        saladd.add(new foodtypes(R.drawable.egyptf,"Caesar salad with pastao"));
        saladd.add(new foodtypes(R.drawable.egyptf,"Beet salad"));
        saladd.add(new foodtypes(R.drawable.egyptf,"Eggplant salad"));
        saladd.add(new foodtypes(R.drawable.egyptf,"Watercress salad"));
        saladd.add(new foodtypes(R.drawable.egyptf,"Pasta salad with tuna"));
        saladd.add(new foodtypes(R.drawable.egyptf,"Tuna salad with potatoes"));

        soupp.add(new foodtypes(R.drawable.egyptf," lentil soup with green onions"));
        soupp.add(new foodtypes(R.drawable.egyptf," rice soup works with oatmeal and chicken strips"));
        soupp.add(new foodtypes(R.drawable.egyptf," cabbage soup and basil"));
        soupp.add(new foodtypes(R.drawable.egyptf,"  Soup of a bird with vegetables"));
        soupp.add(new foodtypes(R.drawable.egyptf," garlic soup"));
        soupp.add(new foodtypes(R.drawable.egyptf," rice soup works with oatmeal and chicken strips"));
        soupp.add(new foodtypes(R.drawable.egyptf," rice soup works with oatmeal and chicken strips"));
        soupp.add(new foodtypes(R.drawable.egyptf," rice soup works with oatmeal and chicken strips"));
        soupp.add(new foodtypes(R.drawable.egyptf," rice soup works with oatmeal and chicken strips"));
        soupp.add(new foodtypes(R.drawable.egyptf," rice soup works with oatmeal and chicken strips"));

        entreess.add(new foodtypes(R.drawable.egyptf,"Basbousa stuffed with cream"));
        entreess.add(new foodtypes(R.drawable.egyptf,"Rice with milk"));
        entreess.add(new foodtypes(R.drawable.egyptf,"Bullying with puddles"));
        entreess.add(new foodtypes(R.drawable.egyptf,"Basbousa Orio"));
        entreess.add(new foodtypes(R.drawable.egyptf,"Spice is stuffed with cream"));
        entreess.add(new foodtypes(R.drawable.egyptf,"Spice is stuffed with cream"));







        main1.add(new foodtypes(R.drawable.gulffood,"Saudi Kabsa"));
        main1.add(new foodtypes(R.drawable.gulffood,"Steam rice"));
        main1.add(new foodtypes(R.drawable.gulffood,"Rice with chicken"));
        main1.add(new foodtypes(R.drawable.gulffood,"Chicken Kabsa"));
        main1.add(new foodtypes(R.drawable.gulffood,"Yagmsh"));
        main1.add(new foodtypes(R.drawable.gulffood,"Masooub"));

        main2.add(new foodtypes(R.drawable.syri,"Saudi Kabsa"));
        main2.add(new foodtypes(R.drawable.syri,"Steam rice"));
        main2.add(new foodtypes(R.drawable.syri,"Rice with chicken"));
        main2.add(new foodtypes(R.drawable.syri,"Chicken Kabsa"));
        main2.add(new foodtypes(R.drawable.syri,"Yagmsh"));
        main2.add(new foodtypes(R.drawable.syri,"Masooub"));

        Intent intent=getIntent();
        int value=   intent.getIntExtra("content",0);

        switch (value)
        {
            case 11:{
                foodtypesre.setAdapter(new adapteraklat(this,main));
                break;

            }
            case 21:{
                foodtypesre.setAdapter(new adapteraklat9(this,main1));
                break;
            }
            case 31:{
                foodtypesre.setAdapter(new adapteraklat5(this,main2));
                break;
            }
            case 12:{
                foodtypesre.setAdapter(new adapteraklat2(this,saladd));
                break;
            }
            case 13:{
                foodtypesre.setAdapter(new adapteraklat3(this,soupp));
                break;

            }
            case 14:{
                foodtypesre.setAdapter(new adapteraklat4(this,entreess));
                break;

            }

        }





    }


}

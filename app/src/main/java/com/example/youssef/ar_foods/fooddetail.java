package com.example.youssef.ar_foods;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class fooddetail extends AppCompatActivity {

    TextView way,ingredients;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fooddetail);

        way=findViewById(R.id.theway);
        ingredients=findViewById(R.id.ingred);

        Intent intent=getIntent();
        int i=intent.getIntExtra("content",0);
        switch (i)
        {
            case 11:{
                way.setText(getResources().getString(R.string.alexsusagway));
                ingredients.setText(getResources().getString(R.string.alexsusageintegr));
                break;
            }
            case 12:{
                way.setText(getResources().getString(R.string.beanwitheggway));
                ingredients.setText(getResources().getString(R.string.beanwithegginteg));
                break;
            }
            case 13:{
                way.setText(getResources().getString(R.string.chickenrollway));
                ingredients.setText(getResources().getString(R.string.chickenrollinteg));
                break;
            }
            case 14: {
                way.setText(getResources().getString(R.string.molokhiway));
                ingredients.setText(getResources().getString(R.string.molokhiinteg));
                break;
            }
            case 15:{
                way.setText(getResources().getString(R.string.koshriway));
                ingredients.setText(getResources().getString(R.string.koshriinteg));
                break;
            }
            case 16:{
                way.setText(getResources().getString(R.string.kosabashamelway));
                ingredients.setText(getResources().getString(R.string.kosabashamelinteg));
                break;
            }
            case 17:{
                way.setText(getResources().getString(R.string.torlimeatway));
                ingredients.setText(getResources().getString(R.string.torlimeatinteg));
                break;
            }
            case 18:{
                way.setText(getResources().getString(R.string.gmbrehameway));
                ingredients.setText(getResources().getString(R.string.gmbrehameinteg));
                break;
            }
            case 19:{
                way.setText(getResources().getString(R.string.besaraway));
                ingredients.setText(getResources().getString(R.string.bsarainteg));
                break;
            }
            case 110:{
                way.setText(getResources().getString(R.string.negrscoway));
                ingredients.setText(getResources().getString(R.string.negrscointeg));
                break;
            }
            case 111:{
                way.setText(getResources().getString(R.string.chickenballway));
                ingredients.setText(getResources().getString(R.string.chickenballinteg));
                break;
            }
            case 112:{
                way.setText(getResources().getString(R.string.kosabashamelway));
                ingredients.setText(getResources().getString(R.string.kosabashamelinteg));
                break;
            }
            case 21:{
                way.setText(getResources().getString(R.string.babaganougway));
                ingredients.setText(getResources().getString(R.string.babaganoginteg));
                break;
            }
            case 22:{
                way.setText(getResources().getString(R.string.floursaladway));
                ingredients.setText(getResources().getString(R.string.floursaladinteg));
                break;
            }
            case 23:{
                way.setText(getResources().getString(R.string.potatosaladway));
                ingredients.setText(getResources().getString(R.string.potatosaladinteg));
                break;
            }
            case 24:{
                way.setText(getResources().getString(R.string.homussaladway));
                ingredients.setText(getResources().getString(R.string.hmoussaladinteg));
                break;
            }
            case 25:{
                way.setText(getResources().getString(R.string.coolsloway));
                ingredients.setText(getResources().getString(R.string.collslosaladinteg));
                break;
            }
            case 26:{
                way.setText(getResources().getString(R.string.taboulasaladway));
                ingredients.setText(getResources().getString(R.string.taboulasaladinteg));
                break;
            }
            case 27:{
                way.setText(getResources().getString(R.string.piesaladway));
                ingredients.setText(getResources().getString(R.string.piesaladinteg));
                break;
            }
            case 28:{
                way.setText(getResources().getString(R.string.sezarsaladway));
                ingredients.setText(getResources().getString(R.string.sezarsaladinteg));
                break;
            }
            case 29:{
                way.setText(getResources().getString(R.string.homussaladway));
                ingredients.setText(getResources().getString(R.string.hmoussaladinteg));
                break;
            }
            case 210:{
                way.setText(getResources().getString(R.string.egglphantway));
                ingredients.setText(getResources().getString(R.string.egglphantinteg));
                break;
            }
            case 211:{
                way.setText(getResources().getString(R.string.watercressway));
                ingredients.setText(getResources().getString(R.string.watercressinteg));
                break;
            }
            case 212:{
                way.setText(getResources().getString(R.string.pastatunaway));
                ingredients.setText(getResources().getString(R.string.pastatunainteg));
                break;
            }
            case 213:{
                way.setText(getResources().getString(R.string.tunabtatsway));
                ingredients.setText(getResources().getString(R.string.tunabtatasinteg));
                break;
            }
            case 31:{
                way.setText(getResources().getString(R.string.greenonionsoupway));
                ingredients.setText(getResources().getString(R.string.greenoninonsoupinte));
                break;
            }
            case 32:{
                way.setText(getResources().getString(R.string.shofansoupway));
                ingredients.setText(getResources().getString(R.string.shofansoupinteg));
                break;
            }
            case 33:{
                way.setText(getResources().getString(R.string.ryhansoupway));
                ingredients.setText(getResources().getString(R.string.ryhansoupinteg));
                break;
            }
            case 34:{
                way.setText(getResources().getString(R.string.lsanasforway));
                ingredients.setText(getResources().getString(R.string.lsanasforinteg));
                break;
            }
            case 35:{
                way.setText(getResources().getString(R.string.garlicsoupway));
                ingredients.setText(getResources().getString(R.string.GarlicSoupinteg));
                break;
            }
            case 41:{
                way.setText(getResources().getString(R.string.basbosaeshtaway));
                ingredients.setText(getResources().getString(R.string.basbousaeshtainteg));
                break;
            }
            case 42:{
                way.setText(getResources().getString(R.string.ricemilkway));
                ingredients.setText(getResources().getString(R.string.ricemilkinteg));
                break;
            }
            case 43:{
                way.setText(getResources().getString(R.string.blozaway));
                ingredients.setText(getResources().getString(R.string.blozamhlbeainteg));
                break;
            }







        }

    }
}

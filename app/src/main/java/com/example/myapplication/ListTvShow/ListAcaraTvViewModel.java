package com.example.myapplication.ListTvShow;

import androidx.lifecycle.ViewModel;

import com.example.myapplication.ListFilm2.Watch;

import java.util.ArrayList;

public class ListAcaraTvViewModel extends ViewModel {
    private ArrayList<Watch> modelist =new ArrayList<>();

    public void acaratv(String title,String overview,Integer poster){
        this.modelist.add(new Watch(title,overview,poster));
    }
    public ArrayList<Watch> getacaratv(){
        return modelist;
    }

}


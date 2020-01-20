package com.example.myapplication.ListFilm2;

import androidx.constraintlayout.widget.Guideline;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

public class ListFilmViewModel extends ViewModel {

    private ArrayList<Watch> ModeList = new ArrayList<>();

    public void addWatch(String title, String overview, Integer poster) {
        this.ModeList.add( new Watch(title,overview,poster));
    }




    public ArrayList<Watch> getModeList() {
        return ModeList;
    }
}

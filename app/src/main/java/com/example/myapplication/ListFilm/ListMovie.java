package com.example.myapplication.ListFilm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.DetailFilm.DetailFilm;
import com.example.myapplication.ListFilm2.Watch;
import com.example.myapplication.R;

import java.util.ArrayList;

public class ListMovie extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ListWatchAdapter listWatchAdapter;
    private ArrayList<Watch> list =new ArrayList<>();
    public static final String SELECTED_FILM ="selected_film";

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_film);
        findView();
        setAdapter();

    }
    private void findView(){
        recyclerView =findViewById(R.id.recycler_view);
    }

    public void setAdapter(){
        list.add(new Watch(getResources().getString(R.string.title_fast),getString(R.string.overview_fast),R.drawable.poster_fast));
        list.add(new Watch(getResources().getString(R.string.title_lady),getString(R.string.overview_lady),R.drawable.poster_lady));
        list.add(new Watch(getResources().getString(R.string.title_joker),getString(R.string.overview_joker),R.drawable.poster_joker));
        list.add(new Watch(getResources().getString(R.string.title_a_star),getString(R.string.overview_a_star),R.drawable.poster_a_start_is_born));
        list.add(new Watch(getResources().getString(R.string.title_alita),getString(R.string.overview_alita),R.drawable.poster_alita));
        list.add(new Watch(getResources().getString(R.string.title_aquaman),getString(R.string.overview_aquaman),R.drawable.poster_aquaman));
        list.add(new Watch(getResources().getString(R.string.title_bohemian),getString(R.string.overview_bohemian),R.drawable.poster_bohemian));
        list.add(new Watch(getResources().getString(R.string.title_creed),getString(R.string.overview_creed),R.drawable.poster_creed));
        list.add(new Watch(getResources().getString(R.string.title_crimes),getString(R.string.overview_crimes),R.drawable.poster_crimes));
        list.add(new Watch(getResources().getString(R.string.title_glass),getString(R.string.overview_glass),R.drawable.poster_glass));
        list.add(new Watch(getResources().getString(R.string.title_dragon),getString(R.string.overview_dragon),R.drawable.poster_dragon));
        list.add(new Watch(getResources().getString(R.string.title_mary),getString(R.string.overview_mary),R.drawable.poster_marry_queen));
        list.add(new Watch(getResources().getString(R.string.title_master),getString(R.string.overview_master),R.drawable.poster_master_z));
        list.add(new Watch(getResources().getString(R.string.title_mortal),getString(R.string.overview_mortal),R.drawable.poster_mortal_engines));
        list.add(new Watch(getResources().getString(R.string.title_overlord),getString(R.string.overview_overlord),R.drawable.poster_overlord));
        list.add(new Watch(getResources().getString(R.string.title_robin),getString(R.string.overview_robin),R.drawable.poster_robin_hood));


        listWatchAdapter =new ListWatchAdapter(ListMovie.this,list);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager =new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(listWatchAdapter);


        listWatchAdapter.SetOnClickListener(new ListWatchAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position, Watch watch) {
                Intent godetail =new Intent(ListMovie.this, DetailFilm.class);
                godetail.putExtra(ListMovie.SELECTED_FILM,watch);
                startActivity(godetail);
            }
        });















    }
}

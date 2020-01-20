package com.example.myapplication.ListFilm2;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.DetailFilm.DetailFilm;
import com.example.myapplication.ListFilm.ListMovie;
import com.example.myapplication.ListFilm.ListWatchAdapter;
import com.example.myapplication.ListTvShow.ListAcaraTvFragment;
import com.example.myapplication.Main2Activity;
import com.example.myapplication.R;

public class ListFilmFragment extends Fragment {
    private ListFilmViewModel list;
    private ListWatchAdapter mwatch;


    public static ListAcaraTvFragment newInstance(){
        return new ListAcaraTvFragment();
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.list_film_fragment, container, false);
    }



    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView =view.findViewById(R.id.recyclerview);
        LinearLayoutManager layoutManager =new LinearLayoutManager(view.getContext());
        recyclerView.setLayoutManager(layoutManager);

       list = ViewModelProviders.of(this).get(ListFilmViewModel.class);
        list.addWatch(getResources().getString(R.string.title_fast),getString(R.string.overview_fast),R.drawable.poster_fast);
        list.addWatch(getResources().getString(R.string.title_lady),getString(R.string.overview_lady),R.drawable.poster_lady);
        list.addWatch(getResources().getString(R.string.title_joker),getString(R.string.overview_joker),R.drawable.poster_joker);
        list.addWatch(getResources().getString(R.string.title_a_star),getString(R.string.overview_a_star),R.drawable.poster_a_start_is_born);
        list.addWatch(getResources().getString(R.string.title_alita),getString(R.string.overview_alita),R.drawable.poster_alita);
        list.addWatch(getResources().getString(R.string.title_aquaman),getString(R.string.overview_aquaman),R.drawable.poster_aquaman);
        list.addWatch(getResources().getString(R.string.title_bohemian),getString(R.string.overview_bohemian),R.drawable.poster_bohemian);
        list.addWatch(getResources().getString(R.string.title_creed),getString(R.string.overview_creed),R.drawable.poster_creed);
        list.addWatch(getResources().getString(R.string.title_crimes),getString(R.string.overview_crimes),R.drawable.poster_crimes);
        list.addWatch(getResources().getString(R.string.title_glass),getString(R.string.overview_glass),R.drawable.poster_glass);
        list.addWatch(getResources().getString(R.string.title_dragon),getString(R.string.overview_dragon),R.drawable.poster_dragon);
        list.addWatch(getResources().getString(R.string.title_mary),getString(R.string.overview_mary),R.drawable.poster_marry_queen);
        list.addWatch(getResources().getString(R.string.title_master),getString(R.string.overview_master),R.drawable.poster_master_z);
        list.addWatch(getResources().getString(R.string.title_mortal),getString(R.string.overview_mortal),R.drawable.poster_mortal_engines);
        list.addWatch(getResources().getString(R.string.title_overlord),getString(R.string.overview_overlord),R.drawable.poster_overlord);
        list.addWatch(getResources().getString(R.string.title_robin),getString(R.string.overview_robin),R.drawable.poster_robin_hood);

        mwatch =new ListWatchAdapter(view.getContext(),list.getModeList());
        recyclerView.setAdapter(mwatch);
        recyclerView.setHasFixedSize(true);

        mwatch.SetOnClickListener(new ListWatchAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position, Watch watch) {
                Intent movedetail =new Intent(view.getContext(), DetailFilm.class);
                movedetail.putExtra(ListMovie.SELECTED_FILM,watch);
                startActivity(movedetail);
            }
        });

    }
}

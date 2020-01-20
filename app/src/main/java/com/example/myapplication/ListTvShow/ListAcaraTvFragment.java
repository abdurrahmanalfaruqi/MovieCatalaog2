package com.example.myapplication.ListTvShow;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.DetailFilm.DetailFilm;
import com.example.myapplication.ListFilm.ListMovie;
import com.example.myapplication.ListFilm.ListWatchAdapter;
import com.example.myapplication.ListFilm2.Watch;
import com.example.myapplication.R;

public class ListAcaraTvFragment extends Fragment {
    private ListAcaraTvViewModel listAcaraTv;
    private ListWatchAdapter mwatch;


    public static ListAcaraTvFragment newInstance(){
        return new ListAcaraTvFragment();
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.list_acaratv_fragment,container,false);
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
        listAcaraTv = ViewModelProviders.of(this).get(ListAcaraTvViewModel.class);
        listAcaraTv.acaratv(getResources().getString(R.string.title_arrow),getString(R.string.overview_arrow),R.drawable.poster_arrow);
        listAcaraTv.acaratv(getResources().getString(R.string.title_doom),getString(R.string.overview_doom),R.drawable.poster_doom_patrol);
        listAcaraTv.acaratv(getResources().getString(R.string.title_dragonball),getString(R.string.overview_dragonball),R.drawable.poster_dragon_ball);
        listAcaraTv.acaratv(getResources().getString(R.string.title_fairtail),getString(R.string.overview_fairtail),R.drawable.poster_fairytail);
        listAcaraTv.acaratv(getResources().getString(R.string.title_flash),getString(R.string.overview_flash),R.drawable.poster_flash);
        listAcaraTv.acaratv(getResources().getString(R.string.title_grey),getString(R.string.overview_grey),R.drawable.poster_grey_anatomy);
        listAcaraTv.acaratv(getResources().getString(R.string.title_iron),getString(R.string.overview_iron),R.drawable.poster_iron_fist);
        listAcaraTv.acaratv(getResources().getString(R.string.title_naruto),getString(R.string.overview_naruto),R.drawable.poster_naruto_shipudden);
        listAcaraTv.acaratv(getResources().getString(R.string.title_ncis),getString(R.string.overview_ncis),R.drawable.poster_ncis);
        listAcaraTv.acaratv(getResources().getString(R.string.title_riverdale),getString(R.string.overview_riverdale),R.drawable.poster_riverdale);
        listAcaraTv.acaratv(getResources().getString(R.string.title_supergirl),getString(R.string.overview_supergirl),R.drawable.poster_supergirl);
        listAcaraTv.acaratv(getResources().getString(R.string.title_supernatural),getString(R.string.overview_supernatural),R.drawable.poster_supernatural);
        listAcaraTv.acaratv(getResources().getString(R.string.title_simpsons),getString(R.string.overview_simpsons),R.drawable.poster_the_simpson);
        listAcaraTv.acaratv(getResources().getString(R.string.title_umbrella),getString(R.string.overview_umbrella),R.drawable.poster_the_umbrella);

        mwatch =new ListWatchAdapter(view.getContext(),listAcaraTv.getacaratv());
        recyclerView.setAdapter(mwatch);
        recyclerView.setHasFixedSize(true);
        mwatch.SetOnClickListener(new ListWatchAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position, Watch watch) {
                Intent detail =new Intent(view.getContext(), DetailFilm.class);
                detail.putExtra(ListMovie.SELECTED_FILM,watch);
                startActivity(detail);
            }
        });
    }
}

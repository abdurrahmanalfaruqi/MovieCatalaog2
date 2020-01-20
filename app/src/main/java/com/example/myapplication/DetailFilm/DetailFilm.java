package com.example.myapplication.DetailFilm;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.ListFilm.ListMovie;
import com.example.myapplication.ListFilm2.Watch;
import com.example.myapplication.R;

public class DetailFilm extends AppCompatActivity {

    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView judul=findViewById(R.id.text_title);
        TextView overview=findViewById(R.id.text_overview);

        ImageView imageView =findViewById(R.id.fotodetail);
        Watch watch =getIntent().getParcelableExtra(ListMovie.SELECTED_FILM);
        judul.setText(watch.getTitle());
        overview.setText(watch.getOverview());
        imageView.setImageResource(watch.getPoster());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}

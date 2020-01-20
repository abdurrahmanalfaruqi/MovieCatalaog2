package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SectionIndexer;

import com.example.myapplication.UiMainActivity.SectionPagerAdapter;
import com.google.android.material.tabs.TabLayout;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        SectionPagerAdapter sectionPagerAdapter =new SectionPagerAdapter(this,getSupportFragmentManager());
        ViewPager viewPager =findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionPagerAdapter);

        TabLayout layout =findViewById(R.id.tabs);
        layout.setupWithViewPager(viewPager);

        Toolbar toolbar =findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.change_language) {
            Intent intent = new Intent(Settings.ACTION_LOCALE_SETTINGS);
            startActivity(intent);
        }

            return true;
        }
    }



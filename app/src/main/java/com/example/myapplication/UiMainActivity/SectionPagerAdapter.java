package com.example.myapplication.UiMainActivity;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.ListFragment;

import com.example.myapplication.ListFilm2.ListFilmFragment;
import com.example.myapplication.ListTvShow.ListAcaraTvFragment;
import com.example.myapplication.R;

public class SectionPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_JUDUL =new int[]{R.string.tab_text_pertama,R.string.tab_text_kedua};
    private final Context mContext;
    private ListFilmFragment filmFragment;
    private ListAcaraTvFragment acaraTvFragment;

    public SectionPagerAdapter(Context context,FragmentManager fm) {
        super(fm);
        mContext =context;
        filmFragment =new  ListFilmFragment();
        acaraTvFragment =new ListAcaraTvFragment();

    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new ListFilmFragment();
            case 1:
                return new ListAcaraTvFragment();
            default:
                return null;
        }
    }
    @NonNull
    @Override
    public CharSequence getPageTitle(int position){
        return mContext.getResources().getString(TAB_JUDUL[position]);
    }

    @Override
    public int getCount() {
        return 2;
    }
}

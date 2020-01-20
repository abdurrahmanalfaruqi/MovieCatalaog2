package com.example.myapplication.UiMainActivity;

import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;

public class PageViewModel extends ViewModel {
    private MutableLiveData<Integer> mutableLiveData =new MutableLiveData<>();
    private LiveData<String> text = Transformations.map(mutableLiveData, new Function<Integer, String>() {
        @Override
        public String apply(Integer input) {
            return "Hello World from section" + input;
        }
    });
    public void setText(int index){
        mutableLiveData.setValue(index);
    }
    public LiveData<String> getText(){
        return text;
    }

}

package com.example.holmesy.finalyearbuddycu;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import static com.example.holmesy.finalyearbuddycu.ThingsTodo.thingsToDo;

public class FragmentThingsToDo extends Fragment {

    RecyclerView recyclerView;
RecyclerViewAdapter recyclerViewAdapter;
    public FragmentThingsToDo() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        recyclerView = (RecyclerView) inflater.inflate(R.layout.fragment_todo, container, false);


        String[] titles = new String[thingsToDo.length];
        for (int i =0; i < titles.length; i++){
            titles[i] = thingsToDo[i].getTitle();
        }

        int[] images = new int[thingsToDo.length];
        for (int i = 0;
             i < images.length; i++) {
            images[i] = thingsToDo[i].getImage();
        }

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getActivity(),2);
        recyclerView.setLayoutManager(layoutManager);



        recyclerViewAdapter = new RecyclerViewAdapter(titles,images);
        recyclerView.setAdapter(recyclerViewAdapter);


return recyclerView;


    }
}
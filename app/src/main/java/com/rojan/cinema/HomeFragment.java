package com.rojan.cinema;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.gson.Gson;
import com.rojan.cinema.model.Movie;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {

    private RecyclerView nowRV;

    private NowShowingAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        init(view);

        return view;
    }

    private void init(View view) {
        nowRV = (RecyclerView) view.findViewById(R.id.nowRV);

        nowRV.setLayoutManager(new GridLayoutManager(getActivity(), 2));

        adapter = new NowShowingAdapter(getActivity(), getMoviesData());

        Log.e("DATA", new Gson().toJson(getMoviesData()));

        nowRV.setAdapter(adapter);
    }

    private List<Movie> getMoviesData() {
        List<Movie> movieList = new ArrayList<>();
        movieList.add(new Movie("Dangal", "dsds", "12/27/2016", "PG"));
        movieList.add(new Movie("Dangal1", "dsds", "12/28/2016", "PGP"));
        movieList.add(new Movie("Dangal2", "dsds", "12/29/2016", "PGA"));
        movieList.add(new Movie("Dangal3", "dsds", "12/23/2016", "PGB"));
        return movieList;
    }


}


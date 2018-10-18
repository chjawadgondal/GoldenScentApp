package app.desing.com.mytestapplication.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import app.desing.com.mytestapplication.R;
import app.desing.com.mytestapplication.adapter.LeftPanelAdapter;
import app.desing.com.mytestapplication.modal.ListItemModal;

public class LeftListFragment extends Fragment {


    private RecyclerView mRecyclerView;
    private LeftPanelAdapter mAdapter;
    private List<ListItemModal> listItemModals = new ArrayList<>();



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.left_list_frag,
                container, false);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.leftRecyclerView);
        setupRecyclerView();
        return view;
    }

    private void setupRecyclerView(){
        mAdapter = new LeftPanelAdapter(listItemModals);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setAdapter(mAdapter);
        prepareMovieData();
    }


    private void prepareMovieData() {
        ListItemModal movie = new ListItemModal("Mad Max: Fury Road", "Action & Adventure", "2015");
        listItemModals.add(movie);

        movie = new ListItemModal("Inside Out", "Animation, Kids & Family", "2015");
        listItemModals.add(movie);

        movie = new ListItemModal("Star Wars: Episode VII - The Force Awakens", "Action", "2015");
        listItemModals.add(movie);

        movie = new ListItemModal("Shaun the Sheep", "Animation", "2015");
        listItemModals.add(movie);

        movie = new ListItemModal("The Martian", "Science Fiction & Fantasy", "2015");
        listItemModals.add(movie);

        movie = new ListItemModal("Mission: Impossible Rogue Nation", "Action", "2015");
        listItemModals.add(movie);

        movie = new ListItemModal("Up", "Animation", "2009");
        listItemModals.add(movie);

        movie = new ListItemModal("Star Trek", "Science Fiction", "2009");
        listItemModals.add(movie);

        movie = new ListItemModal("The LEGO Movie", "Animation", "2014");
        listItemModals.add(movie);

        movie = new ListItemModal("Iron Man", "Action & Adventure", "2008");
        listItemModals.add(movie);

        movie = new ListItemModal("Aliens", "Science Fiction", "1986");
        listItemModals.add(movie);

        movie = new ListItemModal("Chicken Run", "Animation", "2000");
        listItemModals.add(movie);

        movie = new ListItemModal("Back to the Future", "Science Fiction", "1985");
        listItemModals.add(movie);

        movie = new ListItemModal("Raiders of the Lost Ark", "Action & Adventure", "1981");
        listItemModals.add(movie);

        movie = new ListItemModal("Goldfinger", "Action & Adventure", "1965");
        listItemModals.add(movie);

        movie = new ListItemModal("Guardians of the Galaxy", "Science Fiction & Fantasy", "2014");
        listItemModals.add(movie);

        mAdapter.notifyDataSetChanged();
    }


}

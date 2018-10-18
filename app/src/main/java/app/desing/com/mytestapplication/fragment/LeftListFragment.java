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
import app.desing.com.mytestapplication.modal.MainCatagoryItem;

public class LeftListFragment extends Fragment {


    private RecyclerView mRecyclerView;
    private LeftPanelAdapter mAdapter;
    private List<MainCatagoryItem> listItemModals = new ArrayList<>();



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
        mAdapter = new LeftPanelAdapter(getActivity(), listItemModals);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setAdapter(mAdapter);
        prepareMovieData();
    }


    private void prepareMovieData() {

        MainCatagoryItem movie = new MainCatagoryItem(getString(R.string.make_up),  "2015");
        listItemModals.add(movie);

        movie = new MainCatagoryItem(getString(R.string.skin_care),  "2015");
        listItemModals.add(movie);

        movie = new MainCatagoryItem(getString(R.string.hair),  "2015");
        listItemModals.add(movie);

        movie = new MainCatagoryItem(getString(R.string.beauty_tool),  "2015");
        listItemModals.add(movie);

        movie = new MainCatagoryItem(getString(R.string.home_frag),  "2015");
        listItemModals.add(movie);

        movie = new MainCatagoryItem(getString(R.string.men),  "2009");
        listItemModals.add(movie);

        movie = new MainCatagoryItem(getString(R.string.gifts),  "2009");
        listItemModals.add(movie);

        mAdapter.notifyDataSetChanged();
    }


}

package app.desing.com.mytestapplication.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import app.desing.com.mytestapplication.R;
import app.desing.com.mytestapplication.adapter.LeftPanelAdapter;
import app.desing.com.mytestapplication.adapter.RightPanelAdapter;
import app.desing.com.mytestapplication.modal.ListItemModal;

public class MainActivity extends AppCompatActivity {


    private RecyclerView mLeftRecyclerView;
    private RecyclerView mRightRecyclerView;
    private LeftPanelAdapter mLeftAdapter;
    private RightPanelAdapter mRightAdapter;

    private List<ListItemModal> listItemModals = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLeftRecyclerView = (RecyclerView) findViewById(R.id.leftRecyclerView);
        mRightRecyclerView = (RecyclerView) findViewById(R.id.detailRecyclerView);

        mLeftAdapter = new LeftPanelAdapter(listItemModals);
        mRightAdapter = new RightPanelAdapter(this, listItemModals);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        mLeftRecyclerView.setLayoutManager(mLayoutManager);
        mLeftRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mLeftRecyclerView.setAdapter(mLeftAdapter);

        RecyclerView.LayoutManager mRightLayoutManager = new LinearLayoutManager(getApplicationContext());
        mRightRecyclerView.setLayoutManager(mRightLayoutManager);
        mRightRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRightRecyclerView.setAdapter(mRightAdapter);

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

        mLeftAdapter.notifyDataSetChanged();
    }
}

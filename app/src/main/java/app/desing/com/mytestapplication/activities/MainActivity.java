package app.desing.com.mytestapplication.activities;

import android.support.v4.app.Fragment;
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

    private RecyclerView mRightRecyclerView;
    private RightPanelAdapter mRightAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


}

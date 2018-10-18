package app.desing.com.mytestapplication.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.h6ah4i.android.widget.advrecyclerview.utils.AbstractExpandableItemAdapter;

import java.util.List;

import app.desing.com.mytestapplication.R;
import app.desing.com.mytestapplication.modal.ListItemModal;

public class RightPanelAdapter extends AbstractExpandableItemAdapter {

    private List<ListItemModal> moviesList;
    private Context mContext;

    public RightPanelAdapter(Context context, List<ListItemModal> moviesList) {
        this.moviesList = moviesList;
        mContext = context;
    }

    @Override
    public int getGroupCount() {
        return moviesList.size();
    }

    @Override
    public int getChildCount(int groupPosition) {
        return 0;
    }

    @Override
    public long getGroupId(int groupPosition) {
        return 0;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return 0;
    }

    @Override
    public RecyclerView.ViewHolder onCreateGroupViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_left_item, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public RecyclerView.ViewHolder onCreateChildViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_left_item, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindGroupViewHolder(RecyclerView.ViewHolder holder, int groupPosition, int viewType) {
        ListItemModal movie = moviesList.get(groupPosition);
        MyViewHolder myViewHolder = (MyViewHolder)holder;
        myViewHolder.title.setText(movie.getTitle());
        myViewHolder.genre.setText(movie.getDetail());
        myViewHolder.year.setText(movie.getImgUrl());

    }

    @Override
    public void onBindChildViewHolder(RecyclerView.ViewHolder holder, int groupPosition, int childPosition, int viewType) {

    }

    @Override
    public boolean onCheckCanExpandOrCollapseGroup(RecyclerView.ViewHolder holder, int groupPosition, int x, int y, boolean expand) {
        /*// check the item is *not* pinned
        if (moviesList.getGroupItem(groupPosition).isPinned()) {
            // return false to raise View.OnClickListener#onClick() event
            return false;
        }

        // check is enabled
        if (!(holder.itemView.isEnabled() && holder.itemView.isClickable())) {
            return false;
        }

        return true;*/
        return false;
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, year, genre;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            genre = (TextView) view.findViewById(R.id.genre);
            year = (TextView) view.findViewById(R.id.year);
        }
    }




    /*@Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_left_item, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        ListItemModal movie = moviesList.get(position);
        holder.title.setText(movie.getTitle());
        holder.genre.setText(movie.getDetail());
        holder.year.setText(movie.getImgUrl());
    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }*/
}
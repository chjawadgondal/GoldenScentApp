package app.desing.com.mytestapplication.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import app.desing.com.mytestapplication.R;
import app.desing.com.mytestapplication.modal.ListItemModal;

public class LeftPanelAdapter extends RecyclerView.Adapter<LeftPanelAdapter.MyViewHolder> {

    private List<ListItemModal> moviesList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, year, genre;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            genre = (TextView) view.findViewById(R.id.genre);
            year = (TextView) view.findViewById(R.id.year);
        }
    }


    public LeftPanelAdapter(List<ListItemModal> moviesList) {
        this.moviesList = moviesList;
    }

    @Override
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
    }
}
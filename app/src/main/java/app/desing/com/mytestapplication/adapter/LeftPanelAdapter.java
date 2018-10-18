package app.desing.com.mytestapplication.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import app.desing.com.mytestapplication.R;
import app.desing.com.mytestapplication.modal.MainCatagoryItem;

public class LeftPanelAdapter extends RecyclerView.Adapter<LeftPanelAdapter.MyViewHolder> implements View.OnClickListener {

    private List<MainCatagoryItem> moviesList;
    private ImageView curSelectedView;
    private Context context;
    private int defaultSelectedItem;

    public LeftPanelAdapter(Context context, List<MainCatagoryItem> moviesList) {

        this.moviesList = moviesList;
        this.context = context;
    }

    @Override
    public void onClick(View view) {
        /*ImageView img = (ImageView) view.findViewById(R.id.card_selector_img);
        if (curSelectedView == null) {
            curSelectedView = (ImageView) view.findViewById(R.id.card_selector_img);
            curSelectedView.setBackgroundColor(context.getResources().getColor(R.color.black));
        } else {
            img.setBackgroundColor(context.getResources().getColor(R.color.black));
            curSelectedView.setBackgroundColor(context.getResources().getColor(R.color.white));
            curSelectedView = img;
        }*/
    }

    public void setSelectedItem(int id) {
        defaultSelectedItem = id;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_left_item, parent, false);
        itemView.setOnClickListener(this);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        MainCatagoryItem movie = moviesList.get(position);
        holder.title.setText(movie.getTitle());
        if (position == 0) {
            holder.selectorImg.setBackgroundColor(context.getResources().getColor(R.color.black));
        }

        /*holder.genre.setText(movie.getDetail());
        holder.year.setText(movie.getImgUrl());*/
    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title;
        public ImageView iconImg;
        public ImageView selectorImg;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            iconImg = (ImageView) view.findViewById(R.id.list_item_genre_icon);
            selectorImg = (ImageView) view.findViewById(R.id.card_selector_img);

        }


    }
}
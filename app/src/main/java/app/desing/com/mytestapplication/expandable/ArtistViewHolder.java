package app.desing.com.mytestapplication.expandable;

import android.view.View;
import android.widget.TextView;

import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;

import app.desing.com.mytestapplication.R;

public class ArtistViewHolder extends ChildViewHolder {

  private TextView childTextView;

  public ArtistViewHolder(View itemView) {
    super(itemView);
    childTextView = (TextView) itemView.findViewById(R.id.list_item_artist_name);
  }

  public void setArtistName(String name) {
    childTextView.setText(name);
  }
}

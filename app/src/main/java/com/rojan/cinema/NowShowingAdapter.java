package com.rojan.cinema;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.rojan.cinema.model.Movie;

import java.util.List;

public class NowShowingAdapter extends RecyclerView.Adapter<NowShowingAdapter.MyHolder> {

    private Context context;
    private List<Movie> movieList;

    public NowShowingAdapter(Context context, List<Movie> movieList) {
        this.context = context;
        this.movieList = movieList;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.single_movie, parent, false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        Movie movie = movieList.get(position);
        holder.txtTitle.setText(movie.title);
        holder.txtDate.setText(movie.date);
        holder.txtType.setText(movie.type);
    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {

        TextView txtTitle;
        TextView txtDate;
        TextView txtType;

        public MyHolder(View view) {
            super(view);

            txtTitle = (TextView) view.findViewById(R.id.txtTitle);
            txtDate = (TextView) view.findViewById(R.id.txtDate);
            txtType = (TextView) view.findViewById(R.id.txtType);

            txtTitle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(context, "Clicked", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}

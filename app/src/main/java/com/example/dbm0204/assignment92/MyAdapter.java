package com.example.dbm0204.assignment92;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;
import org.w3c.dom.Text;
import java.util.List;
/**
 * Created by dbm0204 on 7/10/17.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.viewHolder> {

    private Context context;
    private final List<Movie> movieList;
    private final OnItemClickListener listener;

    /*
    public interface  OnItemClicked{
        void onItemClick(Movie position);
    }
    */
    public MyAdapter(Context context, List<Movie> movieList, OnItemClickListener listener) {
        this.context = context;
        this.movieList = movieList;
        this.listener = listener;
    }

    @Override
    public MyAdapter.viewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent, false);
        viewHolder viewHolder = new viewHolder(view, context);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyAdapter.viewHolder holder, int position) {
        Movie movie = movieList.get(position);
        holder.movieName.setText(movie.getMovieName());
        holder.NumVotes.setText(movie.getMovieVoteCount());
        holder.movieId.setText(movie.getMovieId());
        //holder.bind(movieList.get(position),listener);
    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

    class viewHolder extends RecyclerView.ViewHolder {
        Context context;
        TextView movieName;
        TextView NumVotes;
        TextView movieId;


        viewHolder(View itemView, Context context) {
            super(itemView);
            this.context = context;
            movieId = (TextView) itemView.findViewById(R.id.movieID);
            NumVotes = (TextView) itemView.findViewById(R.id.textView_vote);
            movieName = (TextView) itemView.findViewById(R.id.textView_movieName);

        }
        /**
         *
         public void bind(final Movie item, final OnItemClickListener listener){
         movieName.setText(item.getMovieName());
         itemView.setOnClickListener(new View.OnClickListener(){
        @Override public void onClick(View view){
        listener.onItemClick(item);
        }
        });
         }*/
    }
}

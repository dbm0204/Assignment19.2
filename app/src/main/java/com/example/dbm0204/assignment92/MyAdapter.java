package com.example.dbm0204.assignment92;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by dbm0204 on 7/10/17.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.viewHolder> {

    Context context;
    List<Movie> movieList;
    public MyAdapter(Context context, List<Movie> movieList){
        this.context =context;
        movieList= movieList;
    }


    @Override
    public MyAdapter.viewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.row,parent,false);
        viewHolder viewHolder = new viewHolder(view,context);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyAdapter.viewHolder holder, int position) {


    }

    @Override
    public int getItemCount() {
        return 0;
    }
    class viewHolder extends RecyclerView.ViewHolder{
        Context context;


        public viewHolder(View itemView,Context context) {
            super(itemView);
            this.context=context;
        }
    }
}

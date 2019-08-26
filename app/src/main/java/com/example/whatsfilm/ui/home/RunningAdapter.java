package com.example.whatsfilm.ui.home;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.whatsfilm.R;

public class RunningAdapter extends RecyclerView.Adapter<RunningAdapter.ViewHolder> {

    private String[] mTitles;
    private LayoutInflater mInflater;

    public RunningAdapter(String [] titles){
        mTitles = titles;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        if (mInflater == null) {
            mInflater = LayoutInflater.from(viewGroup.getContext());
        }
        View view = mInflater.inflate(R.layout.item_movies_listing, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.bindData(mTitles[position]);
    }

    @Override
    public int getItemCount() {
        return mTitles != null ? mTitles.length : 0;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView mTextTitle;

        public ViewHolder(View itemView) {
            super(itemView);
            mTextTitle = itemView.findViewById(R.id.tv_name_movie);
        }

        public void bindData(String title) {
            if (title != null) {
                mTextTitle.setText(title);
            }
        }
    }
}

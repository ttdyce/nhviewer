package com.github.ttdyce.nhviewer.View;


import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.github.ttdyce.nhviewer.R;

public class ComicListViewHolder extends RecyclerView.ViewHolder {
    public CardView cvComicItem;
    public TextView tvTitle;
    public TextView tvNumOfPages;
    public ImageView ivThumb;
    public ImageButton ibCollect;
    public ImageButton ibFavorite;

    public ComicListViewHolder(View v) {
        super(v);
        tvTitle = v.findViewById(R.id.tvComicListItem);
        tvNumOfPages= v.findViewById(R.id.tvNumOfPages);
        ivThumb = v.findViewById(R.id.ivComicListItem);
        cvComicItem = v.findViewById(R.id.cvComicListItem);
        ibCollect = v.findViewById(R.id.ibCollect);
        ibFavorite = v.findViewById(R.id.ibFavorite);
    }
}
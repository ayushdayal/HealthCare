package com.atech.healthcare2.ui.home.pages.page_home;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.atech.healthcare2.R;
import com.google.android.youtube.player.YouTubePlayerSupportFragment;
import com.google.android.youtube.player.YouTubePlayerView;

class Viewholder_youtube extends RecyclerView.ViewHolder {
    YouTubePlayerView youTubePlayerView;

    public Viewholder_youtube(@NonNull View itemView) {
        super(itemView);
        youTubePlayerView = itemView.findViewById(R.id.ytpv);
    }
}

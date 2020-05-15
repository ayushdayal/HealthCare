package com.atech.healthcare2.ui.home.pages.page_home;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.atech.healthcare2.R;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;

class rv_yt_adapter extends RecyclerView.Adapter<Viewholder_youtube> {
    String[] urls = {"R2ZETF515Ec", "sHP0UIdZyI4", "kiDlHUTLeWs", "BtN-goy9VOY"};

    @NonNull
    @Override
    public Viewholder_youtube onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new Viewholder_youtube(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vh_youtube, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder_youtube viewholder_youtube, int i) {
        final int s=i;
        viewholder_youtube.youTubePlayerView.initialize("AIzaSyBgZhwMEU8PwJMs-l7Kv3wjuBih9g1DnKo", new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                if (!b)
                    youTubePlayer.loadVideo(urls[s]);
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        });
    }


    @Override
    public int getItemCount() {
        return 4;
    }
}

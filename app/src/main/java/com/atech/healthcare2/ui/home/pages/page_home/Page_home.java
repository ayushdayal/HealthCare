package com.atech.healthcare2.ui.home.pages.page_home;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.atech.healthcare2.MainActivity;
import com.atech.healthcare2.R;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerSupportFragment;

public class Page_home extends Fragment {
    String[] urls = {"t1Ps0tqcb2A", "sHP0UIdZyI4", "kiDlHUTLeWs", "BtN-goy9VOY"};
    int[] ids = {R.id.youtube_player_fragment};

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.page_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        TextView tv_call = view.findViewById(R.id.tv_call);
        tv_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:+9101122307145"));//change the number.
                if (ActivityCompat.checkSelfPermission(getActivity(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(getActivity(), new String[]{Manifest.permission.CALL_PHONE}, 1);
                    startActivity(intent);
                }else {
                    startActivity(intent);
                }
            }
        });
//        RecyclerView rv_youtube= (RecyclerView) view.findViewById(R.id.rv_youtube);
//        rv_youtube.setLayoutManager(new LinearLayoutManager(getContext()));
//        rv_youtube.setAdapter(new rv_yt_adapter());
//        for (int i = 0; i < 4; i++)
            initializeYoutubePlayer(0);

    }

    private void initializeYoutubePlayer(final int i) {
        YouTubePlayerSupportFragment youTubePlayerFragment = (YouTubePlayerSupportFragment) getChildFragmentManager().findFragmentById(ids[i]);
        if (youTubePlayerFragment == null)
            return;
        youTubePlayerFragment.initialize(getString(R.string.youtubeApiKey), new YouTubePlayer.OnInitializedListener() {

            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer player, boolean wasRestored) {
                if (!wasRestored) {
                    //set the player style default
                    player.setPlayerStyle(YouTubePlayer.PlayerStyle.DEFAULT);

                    //cue the 1st video by default
                    player.cueVideo(urls[i]);
                }
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider arg0, YouTubeInitializationResult arg1) {

                //print or show error if initialization failed
                Log.e("asd", "Youtube Player View initialization failed");
            }
        });
    }

}

package com.atech.healthcare2.ui.home.pages.page_faq;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.atech.healthcare2.R;


public class Page_faq extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.page_faq,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        RecyclerView rv= view.findViewById(R.id.rv_qna);
        LinearLayoutManager manager= new LinearLayoutManager(getContext());
        rv.setLayoutManager(manager);
        rv.setAdapter(new rv_qna_adapter());

    }
}

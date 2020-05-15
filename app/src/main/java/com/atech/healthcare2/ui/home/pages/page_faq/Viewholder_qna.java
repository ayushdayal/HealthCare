package com.atech.healthcare2.ui.home.pages.page_faq;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.atech.healthcare2.R;

import net.cachapa.expandablelayout.ExpandableLayout;

class Viewholder_qna extends RecyclerView.ViewHolder {
     TextView tv_q,tv_a;
     ExpandableLayout expandableLayout;

    public Viewholder_qna(@NonNull View itemView) {
        super(itemView);
        tv_q = itemView.findViewById(R.id.tv_qna_q);
        tv_a = itemView.findViewById(R.id.tv_qna_a);
        expandableLayout= itemView.findViewById(R.id.expandable_layout);
    }
}

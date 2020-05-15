package com.atech.healthcare2.ui.home.pages.page_faq;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.atech.healthcare2.R;

class rv_qna_adapter extends RecyclerView.Adapter<Viewholder_qna> {

    private String[] answers = {"Coronaviruses are a large family of viruses which may cause illness in animals or humans.  In humans, several coronaviruses are known to cause respiratory infections ranging from the common cold to more severe diseases such as Middle East Respiratory Syndrome (MERS) and Severe Acute Respiratory Syndrome (SARS). The most recently discovered coronavirus causes coronavirus disease COVID-19. ", "The most common symptoms of COVID-19 are fever, dry cough, and tiredness. Some patients may have aches and pains, nasal congestion, sore throat or diarrhea. These symptoms are usually mild and begin gradually. Some people become infected but only have very mild symptoms. Most people (about 80%) recover from the disease without needing hospital treatment. Around 1 out of every 5 people who gets COVID-19 becomes seriously ill and develops difficulty breathing. Older people, and those with underlying medical problems like high blood pressure, heart and lung problems, diabetes, or cancer , are at higher risk of developing serious illness. However anyone can catch COVID-19 and become seriously ill. Even people with very mild symptoms of COVID-19 can transmit the virus. People of all ages who experience fever, cough and difficulty breathing should seek medical attention. ", "Self-isolation is an important measure taken by those who have COVID-19 symptoms to avoid infecting others in the community, including family members. Self-isolation is when a person who is experiencing fever, cough or other COVID-19 symptoms stays at home and does not go to work, school or public places. This can be voluntarily or based on his/her health care provider’s recommendation. However, if you live in an area with malaria or dengue fever it is important that you do not ignore symptoms of fever. Seek medical help. When you attend the health facility wear a mask if possible, keep at least 1 metre distant from other people and do not touch surfaces with your hands. If it is a child who is sick help the child stick to this advice. ", "Research indicates that children and adolescents are just as likely to become infected as any other age group and can spread the disease. Evidence to date suggests that children and young adults are less likely to get severe disease, but severe cases can still happen in these age groups. Children and adults should follow the same guidance on self-quarantine and self-isolation if there is a risk they have been exposed or are showing symptoms. It is particularly important that children avoid contact with older people and others who are at risk of more severe disease. ", "Stay aware of the latest information on the COVID-19 outbreak, available on the WHO website and through your national and local public health authority. Most countries around the world have seen cases of COVID-19 and many are experiencing outbreaks. Authorities in China and some other countries have succeeded in slowing their outbreaks. However, the situation is unpredictable so check regularly for the latest news. "};
    private String[] questions = {"What is a coronavirus?", "What are the symptoms of COVID-19? ", "What does it mean to self-isolate?", "Which age group is most affected from COVID-19", "What can I do to protect myself and prevent the spread of the disease?"};

    @NonNull
    @Override
    public Viewholder_qna onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new Viewholder_qna(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vh_qna, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull final Viewholder_qna viewholder_qna, int i) {
        viewholder_qna.tv_q.setText(questions[i]);
        viewholder_qna.tv_a.setText(answers[i]);
        viewholder_qna.expandableLayout.collapse();
        viewholder_qna.tv_q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewholder_qna.expandableLayout.toggle();
            }
        });
    }

    @Override
    public int getItemCount() {
        return questions.length;
    }
}

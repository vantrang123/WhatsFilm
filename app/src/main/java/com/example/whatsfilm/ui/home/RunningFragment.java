package com.example.whatsfilm.ui.home;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.whatsfilm.R;

public class RunningFragment extends Fragment {

    private String[] mTitles = {
            "Android", "iOS", "PHP", "Ruby", "Python", "Java", "C#", "C+", "C++", "Node js",
            "React", "Rail", "Java", ".Net"
    };

    public RunningFragment(){
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.content_main,container,false);
        initViews(view);
        return view;
    }

    private void initViews(View v) {
        RecyclerView recyclerView = v.findViewById(R.id.rv_running);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        RunningAdapter runningAdapter = new RunningAdapter(mTitles);
        recyclerView.setAdapter(runningAdapter);
    }
}

package com.grumoon.androidultrapulltorefreshdemo.ui;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.grumoon.androidultrapulltorefreshdemo.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ContentListViewFragment extends Fragment {


    public ContentListViewFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_content_list_view, container, false);
    }


}

package com.nidhi.navigationdrawer.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nidhi.navigationdrawer.R;

/**
 * Created by nidhi on 5/18/2017.
 */

public class SlideshowFragment extends Fragment {
private View view;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view=inflater.inflate(R.layout.slideshow_fragment,container,false);
        return view;
    }
}

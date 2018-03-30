package com.sliit.tharaka.mymusicplayer.UI;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sliit.tharaka.mymusicplayer.R;

/**
 * Created by Naditha Harshana on 3/30/2018.
 */

public class playBackFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.media_playback_controls, container, false);
    }
}

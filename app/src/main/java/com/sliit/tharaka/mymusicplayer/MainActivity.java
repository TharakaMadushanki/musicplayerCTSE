package com.sliit.tharaka.mymusicplayer;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.sliit.tharaka.mymusicplayer.model.MusicHandler;
import com.sliit.tharaka.mymusicplayer.services.CustomMusicAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<MusicHandler> arrayList;
    private CustomMusicAdapter Madapter;
    private ListView songListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        songListView = (ListView) findViewById(R.id.song_list);
        arrayList = new ArrayList<>();
        arrayList.add(new MusicHandler("Idoraye Nagara Kone", "Amal Perera", R.raw.idorayenagarakone));
        arrayList.add(new MusicHandler("Mal Pita Mal", "Amal Perera Cover", R.raw.malpitamal));
        arrayList.add(new MusicHandler("Ran Meevitha", "Amal Perera", R.raw.ranmeevitha));
        arrayList.add(new MusicHandler("Sanda Midulata Enawa", "Amal Perera Cover", R.raw.sandamidulataenawa));


        Madapter = new CustomMusicAdapter(this, R.layout.media_list_item, arrayList);
        songListView.setAdapter(Madapter);
    }

}

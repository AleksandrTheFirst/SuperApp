package MusicPlayer.interfaces;

import java.util.ArrayList;

public interface IPlayList {

    ArrayList<ISong> getSongList();

    void addSong(ISong song);

    void playAllSongs();
}

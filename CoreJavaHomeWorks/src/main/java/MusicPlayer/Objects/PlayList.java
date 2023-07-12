package MusicPlayer.Objects;

import MusicPlayer.interfaces.IPlayList;
import MusicPlayer.interfaces.ISong;

import java.util.ArrayList;

public class PlayList implements IPlayList {
    private ArrayList<ISong> songList = new ArrayList<>();


    @Override
    public ArrayList<ISong> getSongList() {
        return songList;
    }

    @Override
    public void addSong(ISong song) {
        songList.add(song);
    }

    @Override
    public void playAllSongs() {
        for (ISong song : songList) {
            song.play();
        }
    }
}

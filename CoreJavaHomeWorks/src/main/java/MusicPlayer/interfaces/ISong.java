package MusicPlayer.interfaces;

import MusicPlayer.Objects.Author;

public interface ISong {

    String getName();
    Author getAuthor();

    void play();
}

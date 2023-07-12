package MusicPlayer;

import MusicPlayer.Objects.Author;
import MusicPlayer.Objects.PlayList;
import MusicPlayer.Objects.Song;

public class Main {

    public static void main(String[] args) {
        PlayList playList = new PlayList();

        Author author = new Author("Vasya");
        Author author1 = new Author("Kolya");
        Author author2 = new Author("Katya");
        Author author3 = new Author("Vika");

        Song song = new Song("Папайя", author);
        Song song1 = new Song("Ла-лай-ла", author1);
        Song song2 = new Song("Лапландия", author2);
        Song song3 = new Song("Всем привет", author3);

        playList.addSong(song);
        playList.addSong(song1);
        playList.addSong(song2);
        playList.addSong(song3);

        playList.playAllSongs();

    }
}

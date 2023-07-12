package MusicPlayer.Objects;

import MusicPlayer.interfaces.ISong;

public class Song implements ISong {

    private String name;
    private Author author;

    public Song(String name, Author author) {
        this.name = name;
        this.author = author;
    }

    public Song() {}


    @Override
    public void play() {
        System.out.println("Играет песня: " + name + ", автор: " + author.getName());
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

}

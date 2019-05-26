package finalProject.entities;

import javax.persistence.*;

@Entity
public class Verse {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer verse_id;
    private String text_of_verse;
    private String chords_of_verse;
    private Integer number_of_verse;


    @ManyToOne
    private Song song;

    public Integer getVerse_id() {
        return verse_id;
    }

    public void setVerse_id(Integer verse_id) {
        this.verse_id = verse_id;
    }

    public String getText_of_verse() {
        return text_of_verse;
    }

    public void setText_of_verse(String text_of_verse) {
        this.text_of_verse = text_of_verse;
    }

    public String getChords_of_verse() {
        return chords_of_verse;
    }

    public void setChords_of_verse(String chords_of_verse) {
        this.chords_of_verse = chords_of_verse;
    }

    public Integer getNumber_of_verse() {
        return number_of_verse;
    }

    public void setNumber_of_verse(Integer number_of_verse) {
        this.number_of_verse = number_of_verse;
    }

    public Song getSong() {
        return song;
    }

    public void setSong(Song song) {
        this.song = song;
    }
}

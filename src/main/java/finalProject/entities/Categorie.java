package finalProject.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Categorie {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String category;

    @OneToMany(mappedBy = "categorie")
    private List<Song> song = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<Song> getSongs() {
        return song;
    }

    public void setSong(Song song) {
        this.song.add(song);
    }
}
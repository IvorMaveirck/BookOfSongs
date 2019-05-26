package finalProject.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Song {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String title;

    @ManyToOne
    private Categorie categorie;

    @OneToMany (mappedBy = "song")
    private List<Verse> verse =  new ArrayList<>();

    public Integer get_id() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public List<Verse> getVerse() {
        return verse;
    }

    public void setVerse(Verse verse) {
        this.verse.add(verse);
    }
}

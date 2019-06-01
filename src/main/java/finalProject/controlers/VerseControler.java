package finalProject.controlers;

import com.google.common.collect.Lists;
import finalProject.entities.Song;
import finalProject.entities.Verse;
import finalProject.reposiories.SongRepository;
import finalProject.reposiories.VerseRepository;
import finalProject.reposiories.VerseRepositoryInstnce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class VerseControler {

    @Autowired
    SongRepository songRepository;

    @Autowired
    VerseRepository verseRepository;

    @Autowired
    VerseRepositoryInstnce verseRepositoryInstnce;


    @GetMapping("/song/{id}")
    public String allVersesOfSong (@PathVariable("id") Integer id, Model model) {

        List<Song> songs = Lists.newArrayList(songRepository.findAll());
        model.addAttribute("songs", songs);

        List<Verse> mySong = verseRepositoryInstnce.findAllVersesBySongId(id);
        model.addAttribute("mySong", mySong);
        return "song";
    }

}

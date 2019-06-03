package finalProject.controlers;

import com.google.common.collect.Lists;
import finalProject.entities.Song;
import finalProject.entities.Verse;
import finalProject.reposiories.SongRepository;
import finalProject.reposiories.SongeRepositoryInstnce;
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
    SongeRepositoryInstnce songeRepositoryInstnce;

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

    @GetMapping("/harcerskieSong/{id}")
    public String allVersesOfHarcerskie (@PathVariable("id") Integer id, Model model) {

        List<Song> songId1 = songeRepositoryInstnce.findAllSongsfromCategory(1);
        model.addAttribute("songId1", songId1);

        List<Verse> mySongId1 = verseRepositoryInstnce.findAllVersesBySongId(id);
        model.addAttribute("mySongId1", mySongId1);
        return "harcerskieSong";
    }

    @GetMapping("/chrzescijanskieSong/{id}")
    public String allVersesOfChrzescijanskie (@PathVariable("id") Integer id, Model model) {

        List<Song> songId2 = songeRepositoryInstnce.findAllSongsfromCategory(2);
        model.addAttribute("songId2", songId2);

        List<Verse> mySongId2 = verseRepositoryInstnce.findAllVersesBySongId(id);
        model.addAttribute("mySongId2", mySongId2);
        return "chrzescijanskieSong";
    }

    @GetMapping("/szantySong/{id}")
    public String allVersesOfSzanty (@PathVariable("id") Integer id, Model model) {

        List<Song> songId3 = songeRepositoryInstnce.findAllSongsfromCategory(3);
        model.addAttribute("songId3", songId3);

        List<Verse> mySongId3 = verseRepositoryInstnce.findAllVersesBySongId(id);
        model.addAttribute("mySongId3", mySongId3);
        return "szantySong";
    }

//    @GetMapping("/inneSong/{id}")
//    public String allVersesOfInne (@PathVariable("id") Integer id, Model model) {
//
//        List<Song> songId4 = songeRepositoryInstnce.findAllSongsfromCategory(4);
//        model.addAttribute("songId4", songId4);
//
//        List<Verse> mySongId4 = verseRepositoryInstnce.findAllVersesBySongId(id);
//        model.addAttribute("mySongId4", mySongId4);
//        return "inneSong";
//    }

}

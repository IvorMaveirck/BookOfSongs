package finalProject.controlers;

import com.google.common.collect.Lists;
import finalProject.entities.Song;
import finalProject.entities.Verse;
import finalProject.reposiories.CategorieRepository;
import finalProject.reposiories.SongRepository;
import finalProject.reposiories.SongeRepositoryInstnce;
import finalProject.reposiories.VerseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
public class SongControler {

    @Autowired
    SongRepository songRepository;

    @Autowired
    SongeRepositoryInstnce songeRepositoryInstnce;

    @GetMapping("/all")
    public String allSongs(Model model) {

        List<Song> songs = Lists.newArrayList(songRepository.findAll());
        model.addAttribute("songs", songs);
        return "all";
    }

    @GetMapping("/harcerskie")
    public String harcerskieSongs(Model model) {

        List<Song> songId1 = songeRepositoryInstnce.findAllSongsfromCategory(1);
        model.addAttribute("songId1", songId1);
        return "harcerskie";
    }

    @GetMapping("/chrzescijanskie")
    public String chrzescijanskieSongs(Model model) {

        List<Song> songId2 = songeRepositoryInstnce.findAllSongsfromCategory(2);
        model.addAttribute("songId2", songId2);
        return "chrzescijanskie";
    }

    @GetMapping("/szanty")
    public String szantySongs(Model model) {

        List<Song> songId3 = songeRepositoryInstnce.findAllSongsfromCategory(3);
        model.addAttribute("songId3", songId3);
        return "szanty";
    }

//    @GetMapping("/inne")
//    public String inneSongs(Model model) {
//
//        List<Song> songId4 = songeRepositoryInstnce.findAllSongsfromCategory(4);
//        model.addAttribute("songId4", songId4);
//        return "inne";
//    }

    @GetMapping("/search")
    public String searchSongs (Model model, @RequestParam("search") String search) {

        List<Song> searchSong = songeRepositoryInstnce.findAllSongsBySearch(search);
        model.addAttribute("searchSong", searchSong);
        return "search";
    }

}

package finalProject.reposiories;

import finalProject.entities.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;


@Repository
@Transactional
public class SongeRepositoryInstnce {

    @Autowired
    EntityManager em;

    public List<Song> findAllSongsfromCategory(Integer categoryId) {
        List resultList = em.createQuery("Select v from Song v where v.categorie = " + categoryId).getResultList();

        return resultList;
    }

    public List<Song> findAllSongsBySearch(String searchText) {
        List resultList = em.createQuery("Select v from Song v where v.title  like '%" + searchText +"%'").getResultList();

        return resultList;
    }
}

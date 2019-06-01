package finalProject.reposiories;

import finalProject.entities.Verse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;


@Repository
@Transactional
public class VerseRepositoryInstnce{

    @Autowired
    EntityManager em;

    public List<Verse> findAllVersesBySongId(Integer songId) {
        List resultList = em.createQuery("Select v from Verse v where v.song = " + songId).getResultList();

        return resultList;
    }
}

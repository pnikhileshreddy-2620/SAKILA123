package org.cg.Repository;

import org.cg.Enitity.FilmActor;
import org.cg.Enitity.FilmActorId;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created on 28/04/2018.
 *
 * @author Cesardl
 */
@Transactional
public interface FilmActorRepository extends CrudRepository<FilmActor, FilmActorId> {
}

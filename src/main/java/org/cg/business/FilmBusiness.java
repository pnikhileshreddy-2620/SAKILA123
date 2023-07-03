package org.cg.business;

import org.cg.dto.FilmDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface FilmBusiness {

    Page<FilmDTO> list(Pageable pageable);

    FilmDTO create(FilmDTO payload);

    List<FilmDTO> findFilmsByActor(Short actorId);

    FilmDTO get(Short filmId);
}

package kugushina.applogic;

import java.util.List;

import kugushina.model.Film;

public interface FilmHelper {

	void create(Film film);
	void delete(Film film);
	List<Film> search(String title);

}

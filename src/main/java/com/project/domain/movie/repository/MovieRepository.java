package com.project.domain.movie.repository;

import com.project.helper.Reader;
import java.util.List;

public class MovieRepository {

    private static final MovieRepository INSTANCE = new MovieRepository();
    private static final String FILE_LOCATION = "./repository/movie.txt";

    private final List<String> movies;

    private MovieRepository() {
        movies = Reader.read(FILE_LOCATION);
        System.out.println(movies);
    }

    public static MovieRepository getInstance() {
        return INSTANCE;
    }
}

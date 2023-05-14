package com.project;

import com.project.domain.movie.repository.MovieRepository;

public class MovieReservationApplication {

    public static void main(String[] args) {
        MovieRepository.getInstance();
    }
}

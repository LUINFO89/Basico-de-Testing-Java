package service;

import data.MovieRepository;
import model.Movie;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

public class MovieServiceTest {

    private MovieRepository movieRepository;
    private MovieService movieService;

    @BeforeEach
    public void setUp() {
        movieRepository = Mockito.mock(MovieRepository.class);
        movieService = new MovieService(movieRepository);
    }

    @Test
    public void testFindMoviesByGenre() {
        // Mocking the data
        Movie movie1 = new Movie(1, "Movie 1", 120, Movie.Genre.ACTION);
        Movie movie2 = new Movie(2, "Movie 2", 90, Movie.Genre.COMEDY);
        Movie movie3 = new Movie(3, "Movie 3", 110, Movie.Genre.ACTION);
        Collection<Movie> movies = Arrays.asList(movie1, movie2, movie3);

        // Define the behavior of movieRepository
        Mockito.when(movieRepository.findAll()).thenReturn(movies);

        // Perform the test
        Collection<Movie> actionMovies = movieService.findMoviesByGenre(Movie.Genre.ACTION);
        assertEquals(2, actionMovies.size()); // Expecting 2 action movies
    }

    @Test
    public void testFindMoviesByLength() {
        // Mocking the data
        Movie movie1 = new Movie(1, "Movie 1", 120, Movie.Genre.ACTION);
        Movie movie2 = new Movie(2, "Movie 2", 90, Movie.Genre.COMEDY);
        Movie movie3 = new Movie(3, "Movie 3", 110, Movie.Genre.ACTION);
        Collection<Movie> movies = Arrays.asList(movie1, movie2, movie3);

        // Define the behavior of movieRepository
        Mockito.when(movieRepository.findAll()).thenReturn(movies);

        // Perform the test
        Collection<Movie> shortMovies = movieService.findMoviesByLength(100);
        assertEquals(2, shortMovies.size()); // Expecting 2 movies with length <= 100
    }

}
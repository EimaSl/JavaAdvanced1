package lesson14.homeWork;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class MovieServiceTest {

    MovieService movieService = new MovieService();
    ArrayList<Movie> movie = new ArrayList<>();

    @Test
    void getAllMoviesNames() {
        //given
        Movie movie1 = new Movie(1,"Mokinuosi","Documentary","Maciaszczyk","Costa Rica",5, Year.of(1993));
        Movie movie2 = new Movie(3,"Rasyti","Comedy","Maciaszczyk","Costa Rica",10, Year.of(1995));
        Movie movie3 = new Movie(2,"Testukus","Drama|Comedy","Maciaszczyk","Costa Rica",15, Year.of(1997));
        movie.add(movie1);
        movie.add(movie2);
        movie.add(movie3);
        //when
        List<Movie> allMoviesNames = movieService.getAllMoviesNames(movie);
        //then
        assertEquals(3, allMoviesNames.size());
    }

    @Test
    void getAllMoviesNamesSortedByName() {
        //given
        Movie movie1 = new Movie(1,"As Mokinuosi","Documentary","Maciaszczyk","Costa Rica",5, Year.of(1993));
        Movie movie2 = new Movie(3,"Rasyti","Comedy","Maciaszczyk","Costa Rica",10, Year.of(1995));
        Movie movie3 = new Movie(2,"Testukus","Drama|Comedy","Maciaszczyk","Costa Rica",15, Year.of(1997));
        movie.add(movie1);
        movie.add(movie2);
        movie.add(movie3);
        //when
        List<Movie> allMoviesNamesSortedByName = movieService.getAllMoviesNamesSortedByName(movie);
        //then
        assertEquals("As Mokinuosi", allMoviesNamesSortedByName.get(0).getName());
        assertEquals("Testukus", allMoviesNamesSortedByName.get(2).getName());
    }

    @Test
    void getAllMoviesByCreator() {
        //given
        Movie movie1 = new Movie(1,"As Mokinuosi","Documentary","AMaciaszczyk","Costa Rica",5, Year.of(1993));
        Movie movie2 = new Movie(3,"Rasyti","Comedy","BMaciaszczyk","Costa Rica",10, Year.of(1995));
        Movie movie3 = new Movie(2,"Testukus","Drama|Comedy","CMaciaszczyk","Costa Rica",15, Year.of(1997));
        movie.add(movie1);
        movie.add(movie2);
        movie.add(movie3);
        //when
        List<Movie> allMoviesByCreator = movieService.getAllMoviesByCreator(movie);
        //then
        assertEquals("AMaciaszczyk", allMoviesByCreator.get(0).getCreator());
        assertEquals("BMaciaszczyk", allMoviesByCreator.get(1).getCreator());
        assertEquals("CMaciaszczyk", allMoviesByCreator.get(2).getCreator());
    }

    @Test
    void findMoviesAboveGiveYearMargin() {
        //given
//        Movie movie1 = new Movie(1,"As Mokinuosi","Documentary","AMaciaszczyk","Costa Rica",5, Year.of(1993));
//        Movie movie2 = new Movie(3,"Rasyti","Comedy","BMaciaszczyk","Costa Rica",10, Year.of(1995));
//        Movie movie3 = new Movie(2,"Testukus","Drama|Comedy","CMaciaszczyk","Costa Rica",15, Year.of(1997));
//        movie.add(movie1);
//        movie.add(movie2);
//        movie.add(movie3);
//
//        Year inputFirstYear = Year.of(1994);
//        Year inputSecondYear = Year.of(1996);
//        InputStream first = new ByteArrayInputStream(inputFirstYear.getBytes());
//        InputStream second = new ByteArrayInputStream(inputSecondYear.getBytes());
//        System.setIn(first);
//        System.setIn(second);
//
//
//        //when
//        movieService.findMoviesAboveGiveYearMargin(movie);
//        //then
//        assertEquals("BMaciaszczyk", movie.get(0).getCreator());

    }

    @Test
    void getAllMoviesByGenre() {
        //given
        Movie movie1 = new Movie(1,"As Mokinuosi","Documentary","AMaciaszczyk","Costa Rica",5, Year.of(1993));
        Movie movie2 = new Movie(3,"Rasyti","Comedy","BMaciaszczyk","Costa Rica",10, Year.of(1995));
        Movie movie3 = new Movie(2,"Testukus","Drama|Comedy","CMaciaszczyk","Costa Rica",15, Year.of(1997));
        movie.add(movie1);
        movie.add(movie2);
        movie.add(movie3);
        //when
        List<Movie> allMoviesByGenre = movieService.getAllMoviesByGenre(movie);
        //then
        assertEquals("Comedy", allMoviesByGenre.get(0).getGenre());
        assertEquals("Documentary", allMoviesByGenre.get(1).getGenre());
        assertEquals("Drama|Comedy", allMoviesByGenre.get(2).getGenre());
    }

    @Test
    void sortByBudgetDescending() {
        //given
        Movie movie1 = new Movie(1,"As Mokinuosi","Documentary","AMaciaszczyk","Costa Rica",5, Year.of(1993));
        Movie movie2 = new Movie(3,"Rasyti","Comedy","BMaciaszczyk","Costa Rica",10, Year.of(1995));
        Movie movie3 = new Movie(2,"Testukus","Drama|Comedy","CMaciaszczyk","Costa Rica",15, Year.of(1997));
        movie.add(movie1);
        movie.add(movie2);
        movie.add(movie3);
        //when
        List<Movie> movies = movieService.sortByBudgetDescending(movie);
        //then
        assertEquals(15, movies.get(0).getBudget());

    }

    @Test
    void findMovieByName() {
    }

    @Test
    void latestOldestMovie() {
    }

    @Test
    void findMoviesAboveGivenBudget() {
    }

    @Test
    void topFiveByCost() {
    }
}
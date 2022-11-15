package lesson14.homeWork;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        MovieDatabase movieDatabase = new MovieDatabase();
        ArrayList<Movie> listOfMoviesFromTxTFile = movieDatabase.getListOfMoviesFromFile();

        MovieService movieService = new MovieService();

        //movieService.getAllMoviesNames(listOfMoviesFromTxTFile);
        //movieService.getMoviesByCreator(listOfMoviesFromTxTFile);
        //movieService.getAllMoviesByGenre(listOfMoviesFromTxTFile);
        movieService.topFiveByCost(listOfMoviesFromTxTFile);









    }
}

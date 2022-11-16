package lesson14.homeWork;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MovieService {

    public void getAllMoviesNames(ArrayList<Movie> movies) {
        System.out.println("All movies names: ");
        for (Movie movie : movies) {
            System.out.println("\t\t\t" + movie.getName());
        }
    }

    public ArrayList<Movie> getMoviesByCreator(ArrayList<Movie> movies) {
        System.out.println("All genres");
        for (Movie movie : movies) {
            System.out.println("\t\t\t" + movie.getCreator() + ":\t\t\t\"" + movie.getName());
        }
        return movies;
    }

    public ArrayList<Movie> getAllMoviesByGenre(ArrayList<Movie> movies) {
        System.out.println("All genres");
        for (Movie movie : movies) {
            System.out.println("\t\t\t" + movie.getGenre() + ":\t\t\t\"" + movie.getName() + "|" + movie.getCountry() + "|"
                    + movie.getCreator() + "|" + movie.getBudget() + "|" + movie.getYear() + "|" + movie.getId());
        }
        return movies;
    }

    public List<Movie> topFiveByCost(ArrayList<Movie> movies) {
        System.out.println("Sorted by TOP5");

        List<Movie> sortedByBudgetToTopList = movies.stream()
                .sorted(Comparator.comparing(Movie::getBudget).reversed())
                .limit(5)
                .collect(Collectors.toList());

        sortedByBudgetToTopList.forEach(movie -> System.out.println("\t\t\tBudget: "
                + movie.getBudget() + "\t\t\tName " + movie.getName()));

        /*Optional<Movie> max = sortedByBudget.stream()
                .max(Comparator.comparingInt(Movie::getBudget));
        System.out.print("Most Expensive: " + max);*/

        return sortedByBudgetToTopList;
    }


}

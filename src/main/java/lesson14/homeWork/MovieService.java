package lesson14.homeWork;

import java.time.Year;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovieService {

    Scanner scanner = new Scanner(System.in);

    public List<Movie> getAllMoviesNames(ArrayList<Movie> movies) {
        System.out.println("All movies names by Id: ");
        List<Movie> moviesListSortedById = movies.stream()
                .sorted(Comparator.comparing(Movie::getId))
                .collect(Collectors.toList());
        moviesListSortedById.forEach(movie -> System.out.println("\t\t\tId: " + movie.getId()
                + ", Movie name: " + movie.getName()));
        return moviesListSortedById;
    }

    public List<Movie> getAllMoviesNamesSortedByName(ArrayList<Movie> movies) {
        System.out.println("All movies names by Id: ");
        List<Movie> moviesListSortedById = movies.stream()
                .sorted(Comparator.comparing(Movie::getName))
                .collect(Collectors.toList());
        moviesListSortedById.forEach(movie -> System.out.println("\t\t\tId: " + movie.getId()
                + ", Movie name: " + movie.getName()));
        return moviesListSortedById;
    }

    public List<Movie> getAllMoviesByCreator(ArrayList<Movie> movies) {
        System.out.println("All movies names by Creator: ");
        List<Movie> moviesListSortedByCreator = movies.stream()
                .sorted(Comparator.comparing(Movie::getCreator))
                .collect(Collectors.toList());
        moviesListSortedByCreator.forEach(movie -> System.out.println("\t\t\tId: " + movie.getId()
                + ", Movie creator: " + movie.getCreator()));
        return moviesListSortedByCreator;
    }

    public List<Movie> findMoviesAboveGiveYearMargin(ArrayList<Movie> movies) {

        System.out.println("Please provide margins of year movie build, as sample 1999 then 2022");
        Year inputFirstYear = Year.parse(scanner.next());
        Year inputSecondYear = Year.parse(scanner.next());
        System.out.println("Find movies build between years: " + inputFirstYear + "-" + inputSecondYear);

        List<Movie> mBetween = movies.stream()
                .filter(movie -> movie.getYear().isAfter(inputFirstYear) && inputFirstYear.isBefore(inputSecondYear))
                .sorted(Comparator.comparing(Movie::getYear))
                .collect(Collectors.toList());
        mBetween.forEach(movie -> System.out.println("\t\t\tMovie year: " + movie.getYear() + "\t\t\tMovie name" + movie.getName()));
        return mBetween;
    }

    public List<Movie> getAllMoviesByGenre(ArrayList<Movie> movies) {
        System.out.println("All movies names by Genre: ");
        List<Movie> moviesListSortedByGenre = movies.stream()
                .sorted(Comparator.comparing(Movie::getGenre))
                .collect(Collectors.toList());
        moviesListSortedByGenre.forEach(movie -> System.out.println("\t\t\tId: " + movie.getId()
                + ", Movie genre: " + movie.getGenre() + "\t\t\t Movie name:" + movie.getName()));
        return moviesListSortedByGenre;
    }

    public List<Movie> sortByBudgetDescending(ArrayList<Movie> movies) {
        System.out.println("Sorted by budget");

        List<Movie> sortedByBudgetToTopList = movies.stream()
                .sorted(Comparator.comparing(Movie::getBudget).reversed())
                .collect(Collectors.toList());
        sortedByBudgetToTopList.forEach(movie -> System.out.println("\t\t\tBudget: "
                + movie.getBudget() + "\t\t\tName " + movie.getName()));

        return sortedByBudgetToTopList;
    }

    public List<Movie> findMovieByName(ArrayList<Movie> movies) {
        System.out.println("Enter movie name to find");
        String movieTofFind = scanner.next();

        List<Movie> movieList = movies.stream()
                .filter(movie -> movie.getName().startsWith("\"" + movieTofFind))
                .collect(Collectors.toList());
        movieList.forEach(movie -> System.out.println("\t\t\tId: " + movie.getId() + "\t\t\t Movie Name: " + movie.getName()));

        return movieList;
    }

    public void latestOldestMovie(ArrayList<Movie> movies) {
        System.out.println("Available year range");

        movies.stream()
                .min(Comparator.comparing(Movie::getYear))
                .ifPresent(movie -> System.out.println("Oldest movie->\t\t\t Year" + movie.getYear() + "\t\t\t Name: " + movie.getName()));

        movies.stream()
                .max(Comparator.comparing(Movie::getYear))
                .ifPresent(movie -> System.out.println("Latest movie->\t\t\t Year: " + movie.getYear() + "\t\t\t Name: " + movie.getName()));
    }

    public List<Movie> findMoviesAboveGivenBudget(ArrayList<Movie> movies) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide margin above you are interested ");
        int inputMargin = Integer.parseInt(scanner.next());

        System.out.println("Movies above margin: " + inputMargin);

        List<Movie> aboveNBudget = movies.stream()
                .filter(movie -> movie.getBudget() > inputMargin)
                .sorted(Comparator.comparing(Movie::getBudget))
                .collect(Collectors.toList());
        aboveNBudget.forEach(movie -> System.out.println("\t\t\tMovie budget: " + movie.getBudget() + "\t\t\tMovie name" + movie.getName()));

        return aboveNBudget;
    }

    public List<Movie> topFiveByCost(ArrayList<Movie> movies) {
        System.out.println("Sorted by TOP5");

        List<Movie> sortedByBudgetToTopList = movies.stream()
                .sorted(Comparator.comparing(Movie::getBudget).reversed())
                .limit(5)
                .collect(Collectors.toList());
        sortedByBudgetToTopList.forEach(movie -> System.out.println("\t\t\tBudget: "
                + movie.getBudget() + "\t\t\tName " + movie.getName()));

        return sortedByBudgetToTopList;
    }
}

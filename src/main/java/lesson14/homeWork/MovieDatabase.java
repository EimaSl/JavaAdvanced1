package lesson14.homeWork;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;

public class MovieDatabase {

    public static final String RESOURCE_FROM_TXT_FILE = "src/main/resources/movies (1).txt";

    public ArrayList<Movie> getListOfMoviesFromFile() throws IOException {

        ArrayList<Movie> movies = new ArrayList<>();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(RESOURCE_FROM_TXT_FILE));
        String currentLine = bufferedReader.readLine();
        currentLine = bufferedReader.readLine();

        while (currentLine != null) {
            String[] splitLine = currentLine.split(",(?=(?:[^\"]|\"[^\"]*\")*$)");

            int id = Integer.parseInt(splitLine[0]);
            String name = splitLine[1];
            String gender = splitLine[2];
            String creator = splitLine[3];
            String country = splitLine[4];
            int budget = Integer.parseInt(splitLine[5]);
            Year year = Year.parse(splitLine[6]);

            movies.add(new Movie(id, name, gender, creator,country, budget, year));

            currentLine = bufferedReader.readLine();

        }

        return movies;
    }
}

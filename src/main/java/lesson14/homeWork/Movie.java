package lesson14.homeWork;

import lombok.*;

import java.time.LocalDate;
import java.time.Year;

//@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Movie {
    private int id;
    private String name;
    private String genre;
    private String creator;
    private String country;
    private int budget;
    private Year year;

}

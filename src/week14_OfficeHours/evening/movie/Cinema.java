package week14_OfficeHours.evening.movie;

import java.util.ArrayList;

public final class Cinema implements PlayMovie{
    String location;
    int numberOfTheaters;
    ArrayList<Movie> movies;

    public Cinema(String location, int numberOfTheaters, ArrayList<Movie> movies) {
        this.location = location;
        this.numberOfTheaters = numberOfTheaters;
        this.movies = new ArrayList<>(movies);
    }

    @Override
    public void playMovie(Movie movie) {
        System.out.println("Movie is starting, please grab your popcorn and turn off your phones");
    }

    public void buyTicket(Movie movie){
        if (movie.getRate()==5){
            System.out.println(movie.getTitle()+"'s is $25");
        }else if (movie.getRate()==4 || movie.getRate()==3){
            System.out.println(movie.getTitle()+"'s is $20");
        }else{
            System.out.println(movie.getTitle()+"'s is $15");
        }
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "location='" + location + '\'' +
                ", numberOfTheaters=" + numberOfTheaters +
                ", movies=" + movies +
                '}';
    }
}

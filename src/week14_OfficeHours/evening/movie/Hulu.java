package week14_OfficeHours.evening.movie;

public final class Hulu extends StreamingSite {

    public Hulu(String url, double subscriptionAmount, int numberOfAvailableMovies) {
        super(url, subscriptionAmount, numberOfAvailableMovies);
    }

    @Override
    public void subscribe() {
        System.out.println("#19.99 for Hulu");
    }

    @Override
    public void playMovie(Movie movie) {
        System.out.println("You can play "+ movie.getTitle()+" on Hulu");
    }

    @Override
    void pause() {
        System.out.println("You can pause movie");
    }
}

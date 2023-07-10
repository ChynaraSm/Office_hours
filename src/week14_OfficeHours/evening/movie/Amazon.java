package week14_OfficeHours.evening.movie;

public final class Amazon extends StreamingSite {

    public Amazon(String url, double subscriptionAmount, int numberOfAvailableMovies) {
        super(url, subscriptionAmount, numberOfAvailableMovies);
    }

    @Override
    public void subscribe() {
        System.out.println("#19.99 for Amazon");
    }

    @Override
    public void playMovie(Movie movie) {
        System.out.println("You can play "+ movie.getTitle()+" on Amazon");
    }

    @Override
    void pause() {
        System.out.println("You can pause movie");
    }
}

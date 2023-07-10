package week14_OfficeHours.evening.movie;

public abstract class StreamingSite implements PlayMovie, HasSubscription{
    String url;
    double subscriptionAmount;
    int numberOfAvailableMovies;

    public StreamingSite(String url, double subscriptionAmount, int numberOfAvailableMovies) {
        this.url = url;
        this.subscriptionAmount = subscriptionAmount;
        this.numberOfAvailableMovies = numberOfAvailableMovies;
    }

    abstract void pause();


}

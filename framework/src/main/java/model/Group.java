package model;

public class Group {
    private String destination;
    private int defaultNumberOfAdults;
    private int numberOfAdults;
    private int maxNumberOfAdults;

    public Group(String destination, String defaultNumberOfAdults, String numberOfAdults, String maxNumberOfAdults) {
        this.destination = destination;
        this.defaultNumberOfAdults = Integer.parseInt(defaultNumberOfAdults);
        if (Integer.parseInt(numberOfAdults) > 0 && Integer.parseInt(numberOfAdults) <= Integer.parseInt(maxNumberOfAdults)) {
            this.numberOfAdults = Integer.parseInt(numberOfAdults);
        } else {
            this.numberOfAdults = Integer.parseInt(defaultNumberOfAdults);
        }
        this.maxNumberOfAdults = Integer.parseInt(maxNumberOfAdults);
    }

    public String getDestination() {
        return destination;
    }

    public int getDefaultNumberOfAdults() {
        return defaultNumberOfAdults;
    }

    public int getNumberOfAdults() {
        return numberOfAdults;
    }

    public int getMaxNumberOfAdults() {
        return maxNumberOfAdults;
    }
}

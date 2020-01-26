package sda.prog1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Race implements Comparable<Race>{

    private String raceName;
    private List<Person> drivers;
    private int minimumAge;
    private int raceYear;

    public String getRaceName() {
        return raceName;
    }

    public void setRaceName(String raceName) {
        this.raceName = raceName;
    }

    public List getDrivers() {
        return drivers;
    }

    public void setDrivers(List drivers) {
        drivers = new ArrayList<>();
    }

    public int getMinimumAge() {
        return minimumAge;
    }

    public void setMinimumAge(int minimumAge) {
        this.minimumAge = minimumAge;
    }

    public int getRaceYear() {
        return raceYear;
    }

    public void setRaceYear(int raceYear) {
        this.raceYear = raceYear;
    }

    @Override
    public int compareTo(Race race) {
        return 0;
    }

    Race(String raceName, int minimumAge) {
        this.raceName =raceName;
        this.drivers = new ArrayList<>();
        this.minimumAge = minimumAge;


    }
}

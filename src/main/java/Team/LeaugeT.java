package Team;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeaugeT<T> {
    private String name;
    private List<T> teams;

    public LeaugeT(String name) {
        this.name = name;
        teams = new ArrayList<T>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<T> getTeams() {
        return teams;
    }

    public void setTeams(List teams) {
        this.teams = teams;
    }

    public boolean addTeam(T team){
        if (!teams.contains(team)) {
            System.out.println("Adding " + ((Team) team).getName() + " to " + name);
            return teams.add(team);
        }
        System.out.println("Team " + ((Team) team).getName() + " already in leauge ");
        return false;
    }

    public void prinTable() {
        Collections.sort((List<Team>)teams);
        System.out.println(name + " table: ");
        for (T team : teams) {
            System.out.println(((Team) team).getName());
        }
    }

    }


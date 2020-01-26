package Team;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leauge {
    private String name;
    private List<Team> teams;

    public Leauge(String name) {
        this.name = name;
        teams = new ArrayList<Team>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getTeams() {
        return teams;
    }

    public void setTeams(List teams) {
        this.teams = teams;
    }

    public boolean addTeam(Team team){
        if (!teams.contains(team)) {
            System.out.println("Adding " + team.getName() + " to " + name);
            return teams.add(team);
        }
        System.out.println("Team " + team.getName() + " already in leauge ");
        return false;
    }

    public void prinTable() {
        Collections.sort(teams);
        System.out.println(name + " table: ");
        for (Team team : teams) {
            System.out.println(team.getName());
        }
    }

    }


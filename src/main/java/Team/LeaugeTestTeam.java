package Team;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LeaugeTestTeam {
    public static void main(String[] args) {

        LeaugeTeam<FootballTeam> footballLeauge = new LeaugeTeam("Primera Division");

        Team footballTeam1 = new FootballTeam("Atletico Madryt");
        Team footballTeam2 = new FootballTeam(" Real Madryt");
        FootballTeam footballTeam3 = new FootballTeam(" RBarcelona");
        FootballTeam footballTeam4 = new FootballTeam(" Valencia");

        footballLeauge.addTeam((FootballTeam) footballTeam1);
        footballLeauge.addTeam((FootballTeam) footballTeam2);
        footballLeauge.addTeam(footballTeam3);
        footballLeauge.addTeam(footballTeam4);
        footballLeauge.prinTable();

        Team volleyballTeam1 = new VolleyballTeam("Skra Belchatow");
        Team volleyballTeam2 = new VolleyballTeam("Aseco Resovia");
        VolleyballTeam volleyballTeam3 = new VolleyballTeam("Zaksa");
        VolleyballTeam volleyballTeam4 = new VolleyballTeam("Jastrzebski");

        footballTeam1.setPoints(10);
        footballTeam2.setPoints(12);
        footballTeam3.setPoints(15);
        footballTeam4.setPoints(8);

        LeaugeTeam<VolleyballTeam> volleyballLeauge = new LeaugeTeam("Plus Liga");

        volleyballTeam1.setPoints(10);
        volleyballTeam1.setName("Skra Belchatow");
        volleyballTeam2.setPoints(12);
        volleyballTeam2.setName("Aseco Resovia");
        volleyballTeam3.setPoints(15);
        volleyballTeam3.setName("Zaksa");
        volleyballTeam4.setPoints(8);
        volleyballTeam4.setName("Jastrzebski");
        System.out.println("");
        volleyballLeauge.addTeam((VolleyballTeam) volleyballTeam1);
        volleyballLeauge.addTeam((VolleyballTeam) volleyballTeam2);
        volleyballLeauge.addTeam(volleyballTeam3);
        volleyballLeauge.addTeam(volleyballTeam4);

        //footballLeauge.addTeam(volleyballTeam1);

        volleyballLeauge.prinTable();
        System.out.println("==================");
        for (FootballTeam footballTeam : footballLeauge.getTeams()) {
            System.out.println(footballTeam.getName());
        }
        System.out.println("==================");
        System.out.println("Stream print");
        footballLeauge.getTeams().stream()
                .forEach(x -> System.out.println(x.getName()));

        System.out.println("Stream print with maping teams to names");
        footballLeauge.getTeams().stream()
                .map(x -> x.getName())
                .forEach(x -> System.out.println(x));

        System.out.println("Stream print with maping teams to names v2");
        footballLeauge.getTeams().stream()
                .map(x -> x.getName())
                .forEach(System.out::println);

        System.out.println("Stream print with maping teams to names v3");
        footballLeauge.getTeams().stream()
                .map(Team::getName)
                .forEach(System.out::println);

        System.out.println("Stream print with maping teams to names and limit to 2");
        footballLeauge.getTeams().stream()
                .limit(2).map(Team::getName)
                .forEach(System.out::println);

        System.out.println("Stream print with maping teams to names where points > 10");
        footballLeauge.getTeams().stream()
                .filter(x -> x.getPoints() > 10)
                .map(Team::getName)
                .forEach(System.out::println);

        System.out.println("Leauge copy with teams where points > 10");
        List<FootballTeam> teamCopy = footballLeauge.getTeams().stream()
                .filter(x -> x.getPoints() > 10)
                .collect(Collectors.toList());

        teamCopy.stream()
                .forEach(x -> System.out.println(x.getName()));
        List<FootballTeam> teamCopy2 = footballLeauge.getTeams();
        //laczenie strumieni

        List<FootballTeam> teamConcat =
                Stream.concat(teamCopy.stream(), teamCopy2.stream())
                .collect(Collectors.toList());
                //strumien zakonczony, mamy liste druzyn

        //laczenie strumieni v2
        List<FootballTeam> teamConcat2 =
                Stream.of(teamCopy, teamCopy2)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        //Lista nazw druzyn z listy druzyn
        List<String> teamNamesList = teamConcat2.stream()
                .map(Team::retriveName)
                .collect(Collectors.toList());

        Set<String> teamNamesSet = teamConcat2.stream()
                .map(Team::retriveName)
                .collect(Collectors.toSet());

        System.out.println("===ListPrint===");
        teamNamesSet.stream().forEach(System.out::println);
        System.out.println("===SetPrint===");
        teamNamesSet.stream().forEach(System.out::println);

        //suma punktow druzyn
        int sumPoints = footballLeauge.getTeams().stream()
                .map(Team::getPoints)
                .reduce(0, Integer::sum);

        //zliczanie elementow
        System.out.println("Suma punktów: " + sumPoints);
        long countElements = footballLeauge.getTeams().stream()
                .map(Team::getPoints)
                .count();

        countElements = footballLeauge.getTeams().stream()
                .count();

        countElements = footballLeauge.getTeams().stream()
                .filter(x -> x.getPoints() < 8)
                .count();

        //suma punktów drużyn gdzie drużyna ma co najmniej 10 punktów

        sumPoints = footballLeauge.getTeams().stream()
                .filter(t -> t.getPoints() >= 10)
                .map(Team::getPoints)
                .reduce(0, Integer::sum);

        Integer max = footballLeauge.getTeams().stream()
                .mapToInt(t -> t.getPoints())
                .max()
                .orElse(new Integer(0));

        Team teamExpected = footballLeauge.getTeams().stream()
                .max(Comparator.comparing(Team::getPoints))
                .orElseThrow(NoSuchElementException::new);

        System.out.println("max from team : " + teamExpected.getPoints());
        Integer max2 = footballLeauge.getTeams().stream()
                .max(Comparator.comparing(Team::getPoints))
                .map(Team::getPoints)
                .orElseThrow(NoSuchElementException::new);
        System.out.println("max2 : " + max2);


        Optional<Integer> max3 = footballLeauge.getTeams().stream()
                .max(Comparator.comparing(Team::getPoints))
                .map(Team::getPoints);
        if(max3.isPresent())
            System.out.println("max3 : " + max3);







    }
}


package Team;

public class LeaugeTestT {
    public static void main(String[] args) {

        LeaugeT footballLeauge = new LeaugeT ("Primera Division");

        Team footballTeam1 = new FootballTeam( "Atletico Madryt");
        Team footballTeam2 = new FootballTeam( " Real Madryt");
        Team footballTeam3 = new FootballTeam( " RBarcelona");
        Team footballTeam4 = new FootballTeam( " Valencia");

        footballLeauge.addTeam(footballTeam1);
        footballLeauge.addTeam(footballTeam2);
        footballLeauge.addTeam(footballTeam3);
        footballLeauge.addTeam(footballTeam4);
        footballLeauge.prinTable();

        Team volleyballTeam1 = new VolleyballTeam("Skra Belchatow");
        Team volleyballTeam2 = new VolleyballTeam("Aseco Resovia");
        Team volleyballTeam3 = new VolleyballTeam("Zaksa");
        Team volleyballTeam4 = new VolleyballTeam("Jastrzebski");

        footballTeam1.setPoints(10);
        footballTeam2.setPoints(12);
        footballTeam3.setPoints(15);
        footballTeam4.setPoints(8);

        LeaugeT volleyballLeauge = new LeaugeT("Plus Liga");

        volleyballTeam1.setPoints(10);volleyballTeam1.setName("Skra Belchatow");
        volleyballTeam2.setPoints(12);volleyballTeam2.setName("Aseco Resovia");
        volleyballTeam3.setPoints(15);volleyballTeam3.setName("Zaksa");
        volleyballTeam4.setPoints(8);volleyballTeam4.setName("Jastrzebski");
        System.out.println("");
        volleyballLeauge.addTeam(volleyballTeam1);
        volleyballLeauge.addTeam(volleyballTeam2);
        volleyballLeauge.addTeam(volleyballTeam3);
        volleyballLeauge.addTeam(volleyballTeam4);

        footballLeauge.addTeam(volleyballTeam1);

        volleyballLeauge.prinTable();
        for (Object team : footballLeauge.getTeams()) {
            System.out.println(((Team) team).getName());
        }


    }
}


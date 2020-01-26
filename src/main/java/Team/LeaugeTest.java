package Team;

public class LeaugeTest {
    public static void main(String[] args) {
        Team footballTeam1 = new FootballTeam( "Atletico Madryt");
        Team footballTeam2 = new FootballTeam( " Real Madryt");
        Team footballTeam3 = new FootballTeam( " RBarcelona");
        Team footballTeam4 = new FootballTeam( " Valencia");

        Team volleyballTeam1 = new VolleyballTeam("Skra Belchatow");
        Team volleyballTeam2 = new VolleyballTeam("Aseco Resovia");
        Team volleyballTeam3 = new VolleyballTeam("Zaksa");
        Team volleyballTeam4 = new VolleyballTeam("Jastrzebski");

        footballTeam1.setPoints(10);
        footballTeam2.setPoints(12);
        footballTeam3.setPoints(15);
        footballTeam4.setPoints(8);

        Leauge volleyballLeauge = new Leauge("Plus Liga");
        volleyballTeam1.setPoints(10);volleyballTeam1.setName("Skra Belchatow");
        volleyballTeam2.setPoints(12);volleyballTeam2.setName("Aseco Resovia");
        volleyballTeam3.setPoints(15);volleyballTeam3.setName("Zaksa");
        volleyballTeam4.setPoints(8);volleyballTeam4.setName("Jastrzebski");
        System.out.println("");
        volleyballLeauge.prinTable();

        Leauge footballLeauge = new Leauge ("Primera Division");



    }
}

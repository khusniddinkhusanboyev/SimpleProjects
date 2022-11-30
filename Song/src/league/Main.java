package league;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        League<Team<BaseBallPlayer>> baseBallPlayerLeague = new League<>("baseBallPlayerLeague");
        Team<BaseBallPlayer> baseBallPlayerTeam = new Team<>("Baseballteam");
        baseBallPlayerTeam.matchResult(baseBallPlayerTeam, 1,2);
        System.out.print("-->"+baseBallPlayerTeam.ranking()+" ");
        baseBallPlayerLeague.addTeam(baseBallPlayerTeam);
        baseBallPlayerTeam.addPlayer(new BaseBallPlayer("Xusniddin"));
        baseBallPlayerTeam.addPlayer(new BaseBallPlayer("Abror"));
        baseBallPlayerTeam.addPlayer(new BaseBallPlayer("Alisher"));
        baseBallPlayerTeam.addPlayer(new BaseBallPlayer("Aziz"));

        League<Team<SoccerPlayer>> teamLeague = new League<>("SoccerPlayerLeague");
        Team<SoccerPlayer> soccerPlayerTeam = new Team<>("SoccerTeam");
        soccerPlayerTeam.matchResult(soccerPlayerTeam, 2,1);
        System.out.print("-->"+soccerPlayerTeam.ranking()+" ");
        teamLeague.addTeam(soccerPlayerTeam);
        soccerPlayerTeam.addPlayer(new SoccerPlayer("Hayitali"));
        soccerPlayerTeam.addPlayer(new SoccerPlayer("Abbos"));
        soccerPlayerTeam.addPlayer(new SoccerPlayer("Karim"));
        soccerPlayerTeam.addPlayer(new SoccerPlayer("Axror"));

        League<Team<FootballPlayer>> teamLeague1 = new League<>("FootBallPlayerLeague");
        Team<FootballPlayer> footballPlayerTeam = new Team<>("FootBallTeam");
        footballPlayerTeam.matchResult(footballPlayerTeam, 0,1);
        System.out.print("-->"+footballPlayerTeam.ranking()+" ");
        teamLeague1.addTeam(footballPlayerTeam);
        footballPlayerTeam.addPlayer(new FootballPlayer("Hayotbek"));
        footballPlayerTeam.addPlayer(new FootballPlayer("Asrorbek"));
        footballPlayerTeam.addPlayer(new FootballPlayer("Akrom"));
        footballPlayerTeam.addPlayer(new FootballPlayer("benzima"));



    }
}

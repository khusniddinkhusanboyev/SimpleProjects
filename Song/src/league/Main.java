package league;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Team<BaseBallPlayer> baseBallPlayerTeam = new Team<>("Baseballteam");
        baseBallPlayerTeam.addPlayer(new BaseBallPlayer("Xusniddin"));
        baseBallPlayerTeam.addPlayer(new BaseBallPlayer("Abror"));
        baseBallPlayerTeam.addPlayer(new BaseBallPlayer("Alisher"));
        baseBallPlayerTeam.addPlayer(new BaseBallPlayer("Aziz"));
        League<Team<BaseBallPlayer>> baseBallPlayerLeague = new League<>("baseBallPlayerLeague");
        baseBallPlayerLeague.addTeam(baseBallPlayerTeam);

        Team<SoccerPlayer> soccerPlayerTeam = new Team<>("SoccerTeam");
        soccerPlayerTeam.addPlayer(new SoccerPlayer("Hayitali"));
        soccerPlayerTeam.addPlayer(new SoccerPlayer("Abbos"));
        soccerPlayerTeam.addPlayer(new SoccerPlayer("Karim"));
        soccerPlayerTeam.addPlayer(new SoccerPlayer("Axror"));
        League<Team<SoccerPlayer>> teamLeague = new League<>("SoccerPlayerLeague");
        teamLeague.addTeam(soccerPlayerTeam);

        Team<FootballPlayer> footballPlayerTeam = new Team<>("FootBallTeam");
        footballPlayerTeam.addPlayer(new FootballPlayer("Hayotbek"));
        footballPlayerTeam.addPlayer(new FootballPlayer("Asrorbek"));
        footballPlayerTeam.addPlayer(new FootballPlayer("Akrom"));
        footballPlayerTeam.addPlayer(new FootballPlayer("benzima"));
        League<Team<FootballPlayer>> teamLeague1 = new League<>("FootBallPlayerLeague");
        teamLeague1.addTeam(footballPlayerTeam);



    }
}

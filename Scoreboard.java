public class Scoreboard
{
    private String team1;
    private String team2;
    private String activeTeam;
    private int point1;
    private int point2;

    public Scoreboard(String team1, String team2)
    {
        this.team1 = team1;
        this.team2 = team2;
        activeTeam = team1;
    }

    public void recordPlay(int points)
    {
        if(activeTeam.equals(team1))
        {
            if(points > 0)
            {
                point1 += points;
            }
            else
            {
                activeTeam = team2;
            }
        }
        else
        {
            if(points > 0)
            {
                point2 += points;
            }
            else
            {
                activeTeam = team1;
            }
        }

    }

    public String getScore()
    {
        return String.format("%d-%d-%s", point1, point2, activeTeam);
    }
}
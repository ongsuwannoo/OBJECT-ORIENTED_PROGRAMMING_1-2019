package lab4.FootballPlayer;

public class FootballPlayer extends Player {
    private int playerNumber;
    private String Position;

    public void setPlayerNumber (int n) {
        this.playerNumber = n;
    }
    public int getPlayerNumber () {
        return this.playerNumber;
    }
    public void setPosition (String p) {
        this.Position = p;
    }
    public String getPosition () {
        return this.Position;
    }
    public boolean isSamePosition (FootballPlayer p) {
        if((p.getPosition().equals(this.getPosition()))&
            (p.getTeam().equals(this.getTeam()))){
            return true;
        }else{
            return false;
        }
    }
    // public boolean isSamePosition (FootballPlayer p) {
    //     return this.Position.equals(p.Position) ? true : false;
    // }
}
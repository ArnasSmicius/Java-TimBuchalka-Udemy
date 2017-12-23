import java.util.ArrayList;

/**
 * Created by Arnas on 2017.05.09.
 */
public class Team<T extends Player> implements Comparable<Team<T>> {
    private String name;
    private int won = 0;
    private int tied = 0;
    private int lost = 0;
    private int played = 0;
    private ArrayList<T> players;

    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player){
        if(this.players.contains(player)){
            System.out.println("This player is already exist");
            return false;
        } else {
            this.players.add(player);
            System.out.println(player.getName() + " added to " + this.getName());
            return true;
        }
    }

    public void matchResults(Team<T> opponent, int ourScore, int theirScore){
        String message;
        if(ourScore > theirScore){
            message = " beat ";
            won++;
        } else if (ourScore == theirScore){
            message = "drew to ";
            tied++;
        } else {
            message = " lost to ";
            lost++;
        }
        played++;

        if (opponent != null){
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResults(null, theirScore, ourScore);
        }

    }

    public int getScore(){
        return won;
    }

    @Override
    public int compareTo(Team<T> team) {
        if(this.getScore() > team.getScore()){
            return -1;
        } else if (this.getScore() == team.getScore()){
            return 0;
        } else {
            return 1;
        }
    }
}

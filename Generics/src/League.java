import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Arnas on 2017.05.09.
 */
public class League<T extends Team> {
    private String name;
    private ArrayList<T> league = new ArrayList<T>();

    public League(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addTeam(T team){
        if(league.contains(team)){
            System.out.println("Team is already exist");
            return false;
        } else {
            league.add(team);
            System.out.println(team.getName() + " is added to league");
            return true;
        }
    }

    public void sortList(){
        Collections.sort(league);
    }

    public void printList(){
        for(T team : league){
            System.out.println(team.getName() + ": " + team.getScore());
        }
    }
}

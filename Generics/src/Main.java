/**
 * Created by Arnas on 2017.05.09.
 */
public class Main {
    public static void main(String[] args) {
        Team<BasketballPlayer> lietuvosRytas = new Team<>("Lietuvos Rytas");
        BasketballPlayer linas = new BasketballPlayer("Linas");
        lietuvosRytas.addPlayer(linas);

        Team<GolfPlayer> pensininkuRojus = new Team<>("Pensininku Rojus");
        GolfPlayer kazys = new GolfPlayer("Kazys");
        pensininkuRojus.addPlayer(kazys);

        Team<BasketballPlayer> zalgiris = new Team<>("Zalgiris");
        BasketballPlayer linasValanciunas = new BasketballPlayer("Linas Valanciunas");

        League<Team<BasketballPlayer>> europines = new League<>("Europines Krepsinio Varzybos");
        europines.addTeam(zalgiris);
        europines.addTeam(lietuvosRytas);

        zalgiris.matchResults(lietuvosRytas, 80, 75);
        zalgiris.matchResults(lietuvosRytas, 60, 50);
        zalgiris.matchResults(lietuvosRytas, 45, 60);

        europines.sortList();
        europines.printList();

    }
}

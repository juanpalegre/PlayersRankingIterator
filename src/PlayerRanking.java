import java.util.Iterator;
import java.util.LinkedList;
import java.util.Spliterator;
import java.util.function.Consumer;

public class PlayerRanking implements PlayerIterator {

    private LinkedList<Player> players = new LinkedList();
    private int position = 0;

    public void addPlayer(Player player){
        players.add(player);
        players.sort(null);
    }

    public void getRanking(){
        for (Player player: players){
            System.out.println(player.getPlayerName() + " - Puntuacion: " + player.getScore());
        }
    }

    @Override
    public boolean hasNext() {
        return position < players.size();
    }

    @Override
    public void reset() {
        position = 0;
    }

    @Override
    public Player next() {
        Player player = players.get(position);
        position+=1;
        return player;
    }
}

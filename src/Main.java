public class Main {

    public static void main(String[] args) {
        PlayerRanking ranking = new PlayerRanking();
        ranking.addPlayer(new Player("Juan", 200));
        ranking.addPlayer(new Player("Roger", 100));
        ranking.addPlayer(new Player("Rafa", 1200));
        ranking.addPlayer(new Player("Nick", 20));
        ranking.addPlayer(new Player("Pedro", 300));

        //Obtenemos el ranking
        getUpdatedRanking(ranking);

    }

    private static void getUpdatedRanking(PlayerRanking ranking) {
        System.out.println("Ranking de Jugadores actualizado");
        ranking.getRanking();
    }
}



public interface PlayerIterator {

    //Chequea si hay más jugadores
    boolean hasNext();

    //Reiniciar el contador
    void reset();

    //Obtiene el siguiente jugador
    Player next();

}

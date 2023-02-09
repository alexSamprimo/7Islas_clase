import java.util.ArrayList;

public class Jugador {
    //ATRIBUTOS
    //private int numDoblones;
    private String nombre;

    private ArrayList<Carta> barajaJugador = new ArrayList<>(); //aqui se guardaran todas las cartas de cada jugador

    //CONSTRUCTORES

    public Jugador(){

    }

    public Jugador(String nombre) {
        int cantidadDoblones = 3;
        this.nombre = nombre;
        this.barajaJugador = new ArrayList<>();
        for (int i = 0; i < cantidadDoblones; i++) {
            this.barajaJugador.add(new Carta("doblones", 1)); //con este bucle, cada vez que se cree un jugador, se le dara automaticamente 3 doblones
        }
    }

    //GETTERS Y SETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Carta> getBarajaJugador() {
        return barajaJugador;
    }

    public void mostrarBarajaJugador(){
        for (Carta baraja : barajaJugador) {
            baraja.imprimirCarta();
        }
    }


}

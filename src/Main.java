import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Random rd = new Random();
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Jugador> jugadores = new ArrayList<>(); //CREAMOS EL ARRAYLIST PARA ALMACENAR LOS JUGADORES
    static Baraja baraja = new Baraja();
    static Jugador jugador = new Jugador();
    static ArrayList<String> tablero = new ArrayList<>();

    public static void main(String[] args) {
        baraja.crearBaraja();
        baraja.mostrarBarajaPrincipal();
        preguntarJugadores();
        System.out.println("---LA BARAJA prnicipal despues de borrar---");
        baraja.mostrarBarajaPrincipal();

        //mostrarJugadores();



    }

    //METODOS

    private static int tirarDado(){
        return rd.nextInt(1,7);
    }
    private static void preguntarJugadores(){
        int numJugadores = 0;
        do {
            try {
                System.out.println("Cuantas personas van a jugar?");
                numJugadores = sc.nextInt();
                sc.nextLine();
            }catch (Exception e){
                System.out.println("Error al introducir la cantidad de jugadores");
                sc.nextLine();
            }
        }while (numJugadores < 0 || numJugadores > 4); //bucle para controlar errores


        for (int i = 0; i < numJugadores; i++) { //BUCLE PARA AÑADIR TANTOS JUGADORES COMO SE DIGA

            System.out.println("Introduce el nombre del jugador " + (i+1) +":");
            String nombre = sc.nextLine();

            jugadores.add(new Jugador(nombre)); //LO AÑADIMOS AL ARRAYLIST DE JUGADORES

        }
        for (Jugador jugador: jugadores) { //aqui como hemos creado x jugadores, quitamos de la baraja principal tantos doblones como les hemos dado
            quitarDoblonesBaraja(jugadores);
        }
    }

    private static void quitarDoblonesBaraja(ArrayList<Jugador> jugadores){ //metodo para quitar 3 doblones de la baraja principal por cada jugador en la partida
        for (Jugador jugador: jugadores) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < baraja.getBarajaPrincipal().size(); j++) {
                    if (baraja.getBarajaPrincipal().get(j).equals("doblones")){ //esto es para acceder al nombre de la carta
                        baraja.getBarajaPrincipal().remove(j); //borramos la carta
                        break;
                    }
                }
            }
        }
    }
    private static void mostrarJugadores(){
        for (Jugador jugadores : jugadores) {
            System.out.println(jugadores.getNombre());
        }
    }
}
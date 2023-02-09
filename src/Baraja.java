import java.util.ArrayList;

public class Baraja {


    //ATRIBUTOS
    private ArrayList<String> barajaPrincipal;

    public ArrayList<String> getBarajaPrincipal() {
        return barajaPrincipal;
    }

    public void crearBaraja(){
        barajaPrincipal = new ArrayList<>();
        llenarBaraja();
    }

    private void llenarBaraja() { //METODO PARA LLENAR LA BARAJA CON CADA CARTA
        for (int i = 0; i < 15; i++) {
            barajaPrincipal.add("doblones");
        }

        // Calices
        for (int i = 0; i < 3; i++) {
            barajaPrincipal.add("calices");
        }

        // Rubies
        for (int i = 0; i < 3; i++) {
            barajaPrincipal.add("rubies");
        }

        // Diamantes
        for (int i = 0; i < 3; i++) {
            barajaPrincipal.add("diamantes");
        }

        // Collares
        for (int i = 0; i < 4; i++) {
            barajaPrincipal.add("collares");
        }

        // Mapas del tesoro
        for (int i = 0; i < 4; i++) {
            barajaPrincipal.add("mapas del tesoro");
        }

        // Corazones
        for (int i = 0; i < 4; i++) {
            barajaPrincipal.add("corazones");
        }

        // Revólveres
        for (int i = 0; i < 6; i++) {
            barajaPrincipal.add("revolveres");
        }

        // Espadas
        for (int i = 0; i < 6; i++) {
            barajaPrincipal.add("espadas");
        }

        // Barriles de ron
        for (int i = 0; i < 6; i++) {
            barajaPrincipal.add("barriles de ron");
        }
    }

    public void mostrarBarajaPrincipal(){
        for (String baraja : barajaPrincipal ) {
            System.out.println(baraja);
        }
    }

}

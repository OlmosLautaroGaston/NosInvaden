import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        LogicaDeJuego Juego = new LogicaDeJuego();
        Juego.generarTropas();
        Juego.ordenarInvasores();
        Juego.ordenarDefensores();
        Juego.mostrarResultadoDeTropas();
        Juego.comprobarVictoria();
    }
}

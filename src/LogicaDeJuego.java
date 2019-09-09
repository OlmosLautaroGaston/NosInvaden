import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class LogicaDeJuego {
    java.util.Scanner Scanner = new Scanner(System.in);
    private int [] invasores;
    private int [] defensores;
    private int N;
    private int result;
    private int cercano = 100;
    private int mascercano;

    public LogicaDeJuego(){
        dictarCiudadesInvadidas();
        invasores = new int[N];
        defensores = new int[N];
    }
    private void dictarCiudadesInvadidas(){
        System.out.println("Escriba el numero de ciudades invadidas para generar el numero de tropas de defensa.");
        N = Scanner.nextInt();
    }
    public void generarTropas(){
        System.out.println("Digite el valor de cada una de las "+N+" tropas invasores");
        for (int i=0;i<N;i++){
            invasores[i] = Scanner.nextInt();
        }
        System.out.println("Digite el valor de cada una de las "+N+" tropas defensoras");
        for (int i=0;i<N;i++){
            defensores[i] = Scanner.nextInt();
        }
    }
    public void ordenarInvasores(){
        Arrays.sort(invasores);
        int i = 0;
        int j = invasores.length - 1;
        int tmp;
        while (j > i) {
            tmp = invasores[j];
            invasores[j] = invasores[i];
            invasores[i] = tmp;
            j--;
            i++;
        }
    }
    public void ordenarDefensores(){
        Arrays.sort(defensores);
        int i = 0;
        int j = defensores.length - 1;
        int tmp;
        while (j > i) {
            tmp = defensores[j];
            defensores[j] = defensores[i];
            defensores[i] = tmp;
            j--;
            i++;
        }
    }
    public void mostrarResultadoDeTropas(){
        System.out.println("Invasores:");
        for (int j = 0; j < N; j++) {
            System.out.print(invasores[j]+" ");
        }
        System.out.println("");
        System.out.println("Defensores:");
        for (int k = 0; k < N; k++) {
            System.out.print(defensores[k]+" ");
        }
    }
    /**public void comprobarVictoria(){
        for (int i=0;i<N;i++){
            if(defensores[i]>=invasores[i]){
                result++;
            }
        }
        System.out.println("");
        System.out.println("Se realizaron "+result+" defensas con éxito.");
    }**/
    public void comprobarVictoria(){
        for (int i=0;i<N;i++){
            for (int j=0;j<N;j++) {
                if(defensores[i]>=invasores[j] && j != cercano){
                    result++;
                    cercano=j;
                    j=N;
                }
            }
        }
        System.out.println("");
        System.out.println("Se realizaron "+result+" defensas con éxito.");
    }
}
/**
 if(defensores[i] > invasores[i] && invasores[i]!= mascercano) {
 if (cercano <invasores[i]){
 cercano = invasores[i];
 mascercano = i;
 result++;
 }**/
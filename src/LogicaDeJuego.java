import java.util.Arrays;
import java.util.Scanner;

public class LogicaDeJuego {
    java.util.Scanner Scanner = new Scanner(System.in);
    private int [] invasores;
    private int [] defensores;
    private int N;
    private int result;

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
    public void ordenarArreglos(){
        Arrays.sort(invasores);
        Arrays.sort(defensores);
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
            for (int j=0;j<N;j++){
                if(defensores[i]>=invasores[j]){
                    result++;
                }
            }
        }
        System.out.println("");
        System.out.println("Se realizaron "+result+" defensas con éxito.");
    }
}

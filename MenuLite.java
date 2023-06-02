import java.util.Scanner;

public class MenuLite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//instancias para crear cada una de los libros
        Literatura bajo_la_misma_estrella = new Literatura("Romantica", "Camila roo", 2013);
        Literatura Terrorismo = new Literatura("ciencia ficcion", "Marcela Rojas", 2020);
        Literatura Zombie = new Literatura("Terror", "Ana lopez", 2014);
        Literatura Paris = new Literatura("Romantica", "Irma Diaz",2011);
        Literatura Camino = new Literatura("Terror", "Vinicio kim", 2017);
//Parte para imprimir los datos
        bajo_la_misma_estrella.imprimirdatos();
        Terrorismo.imprimirdatos();
        Zombie.imprimirdatos();
        Paris.imprimirdatos();
        Camino.imprimirdatos();
    }
}

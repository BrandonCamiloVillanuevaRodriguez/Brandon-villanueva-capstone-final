import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class Ordenamientos implements Order {
    public static final String BLACK = "\u001B[30m";
    public static final String WHITE = "\u001B[37m";
    public String Color;
    public int totalTime = 0;

    @Override
    public int SelectionsortInt(ArrayList<Piece> valores, int delay, String color) throws InterruptedException {
        // Algoritmo de ordenamiento por selección
        this.Color = color;
        for (int i = 0; i < 16 ; i++) {
            Print(valores);
            for (int k = 0; k < 16; k++){
                System.out.println(valores.get(k).getPosicionFinal());

            }
            int indiceMenor = i;
            for (int j = i + 1; j < 16; j++) {
                if (valores.get(j).getPosicionFinal() < valores.get(indiceMenor).getPosicionFinal()) {
                    indiceMenor = j;
                }
            }
            if (indiceMenor != i) {
                Collections.swap(valores, i, indiceMenor);
            }
            Thread.sleep(delay);
            totalTime += delay;
            if (Terminar(valores)){
                Print(valores);
                return totalTime;
            }
        }
        return totalTime;
    }

    @Override
    public int BublesortInt(ArrayList<Piece> valores, int delay, String color) throws InterruptedException {
        // Algoritmo de ordenamiento de burbuja
        Color = color;
        for (int i = 0; i < valores.size() - 1; i++) {
            Print(valores);
            for (int j = 0; j < valores.size() - i - 1; j++) {
                if (valores.get(j).getPosicionFinal() > valores.get(j + 1).getPosicionFinal()) {
                    Collections.swap(valores, j, j + 1);
                }
            }
            Thread.sleep(delay);
            totalTime += delay;

            if (Terminar(valores)){
                Print(valores);
                return totalTime;
            }

        }
        return totalTime;
    }

    @Override
    public int quickSort(ArrayList<Piece> lista, int inicio, int fin, int delay, String color) throws InterruptedException {
        Color = color;
        int i = inicio;
        int j = fin;
        // Escoge el pivote, podrías elegirlo de manera aleatoria si lo prefieres
        Piece pivote = lista.get(inicio + (fin - inicio) / 2);

        // Divide en dos listas
        while (i <= j) {
            Print(lista);
            while (lista.get(i).getPosicionFinal() < pivote.getPosicionFinal()) {
                i++;
            }
            while (lista.get(j).getPosicionFinal() > pivote.getPosicionFinal()) {
                j--;
            }
            if (i <= j) {
                Piece temp = lista.get(i);
                lista.set(i, lista.get(j));
                lista.set(j, temp);
                i++;
                j--;
            }
            totalTime += delay;
            Thread.sleep(delay);
            // Recursivamente ordena las sublistas
            if (inicio < j) {
                quickSort(lista, inicio, j, delay, color);
            }
            if (i < fin) {
                quickSort(lista, i, fin, delay, color);
            }
        }
        return totalTime;
    }

    @Override
    public int insertionSort(ArrayList<Piece> lista, int delay, String color) throws InterruptedException {
        Color = color;
        int n = lista.size();
        for (int i = 1; i < n; i++) {
            Print(lista);
            Piece actual = lista.get(i);
            int j = i - 1;
            while (j >= 0 && lista.get(j).getPosicionFinal() > actual.getPosicionFinal()) {
                lista.set(j + 1, lista.get(j));
                j--;
            }
            lista.set(j + 1, actual);
            totalTime+= delay;
            Thread.sleep(delay);

            if (Terminar(lista)){
                Print(lista);
                return totalTime;
            }
//            for (int k= 0; k < 16; k++){
//                System.out.println(lista.get(k).getPosicionFinal());
//                System.out.println(lista.get(k).getName());
//            }
        }
        return totalTime;
    }

    @Override
    public boolean Terminar(ArrayList<Piece> Lista){
        boolean verificado = true;
        for (int i = 0; i < 8; i++){
            if (Lista.get(i).getPosicionFinal() != i+1){
                verificado = false;
                break;
            }
        }
        return verificado;
    }

    @Override
    public void Print(ArrayList<Piece> valores) {
        if (Objects.equals(Color, "Black")){
            System.out.println(WHITE + "____" + BLACK + "____" + WHITE + "____" + BLACK + "____" + WHITE + "____" + BLACK + "____" + WHITE + "____" + BLACK + "____" );
            System.out.println(WHITE + "|"+ BLACK + valores.get(0).getName()+ WHITE + "|" + BLACK + "|"+ BLACK + valores.get(1).getName() + "|" + WHITE + "|"+ BLACK + valores.get(2).getName()+ WHITE + "|" + BLACK + "|"+ BLACK + valores.get(3).getName() + "|" + WHITE + "|"+ BLACK + valores.get(4).getName()+ WHITE + "|" + BLACK + "|"+ BLACK + valores.get(5).getName() + "|" + WHITE + "|"+ BLACK + valores.get(6).getName()+ WHITE + "|" + BLACK + "|"+ BLACK + valores.get(7).getName() + "|");
            System.out.println(WHITE + "____" + BLACK + "____" + WHITE + "____" + BLACK + "____" + WHITE + "____" + BLACK + "____" + WHITE + "____" + BLACK + "____" );
            System.out.println(BLACK + "____" + WHITE + "____" + BLACK + "____" + WHITE + "____" + BLACK + "____" + WHITE + "____" + BLACK + "____" + WHITE + "____" );
            System.out.println(BLACK + "|" + BLACK + valores.get(8).getName()+ BLACK + "|" + WHITE + "|"+ BLACK + valores.get(9).getName() + WHITE + "|" + BLACK + "|"+ BLACK + valores.get(10).getName()+ BLACK + "|" + WHITE + "|"+ BLACK + valores.get(11).getName()+ WHITE + "|" + BLACK + "|"+ BLACK + valores.get(12).getName()+ BLACK + "|" + WHITE + "|"+ BLACK + valores.get(13).getName()+ WHITE + "|" + BLACK + "|"+ BLACK + valores.get(14).getName()+ BLACK + "|" + WHITE + "|"+ BLACK + valores.get(15).getName()+ WHITE + "|");
            System.out.println(BLACK + "____" + WHITE + "____" + BLACK + "____" + WHITE + "____" + BLACK + "____" + WHITE + "____" + BLACK + "____" + WHITE + "____" );
            System.out.println(WHITE + "____" + BLACK + "____" + WHITE + "____" + BLACK + "____" + WHITE + "____" + BLACK + "____" + WHITE + "____" + BLACK + "____" );
            System.out.println(WHITE + "|"+ BLACK + "  " + WHITE + "|" + BLACK + "|"+ BLACK + "  " + "|" + WHITE + "|"+ BLACK + "  " + WHITE + "|" + BLACK + "|"+ BLACK + "  " + "|" + WHITE + "|"+ BLACK + "  " + WHITE + "|" + BLACK + "|"+ BLACK + "  " + "|" + WHITE + "|"+ BLACK + "  " + WHITE + "|" + BLACK + "|"+ BLACK + "  " + "|");
            System.out.println(WHITE + "____" + BLACK + "____" + WHITE + "____" + BLACK + "____" + WHITE + "____" + BLACK + "____" + WHITE + "____" + BLACK + "____" );
            System.out.println(BLACK + "____" + WHITE + "____" + BLACK + "____" + WHITE + "____" + BLACK + "____" + WHITE + "____" + BLACK + "____" + WHITE + "____" );
            System.out.println(BLACK + "|" + BLACK +  "  "+ BLACK + "|" + WHITE + "|"+ BLACK +  "  " + WHITE + "|" + BLACK + "|"+ BLACK +  "  "+ BLACK + "|" + WHITE + "|"+ BLACK +  "  " + WHITE + "|" + BLACK + "|"+ BLACK +  "  "+ BLACK + "|" + WHITE + "|"+ BLACK +  "  " + WHITE + "|" + BLACK + "|"+ BLACK +  "  " + BLACK + "|" + WHITE + "|"+ BLACK +  "  " + WHITE + "|");
            System.out.println(BLACK + "____" + WHITE + "____" + BLACK + "____" + WHITE + "____" + BLACK + "____" + WHITE + "____" + BLACK + "____" + WHITE + "____" );
            System.out.println("\n\n\n\n\n");
        }else {
            System.out.println(WHITE + "____" + BLACK + "____" + WHITE + "____" + BLACK + "____" + WHITE + "____" + BLACK + "____" + WHITE + "____" + BLACK + "____" );
            System.out.println(WHITE + "|"+ WHITE + valores.get(0).getName()+ WHITE + "|" + BLACK + "|"+ WHITE + valores.get(1).getName() + "|" + WHITE + "|"+ WHITE + valores.get(2).getName()+ WHITE + "|" + BLACK + "|"+ WHITE + valores.get(3).getName() + "|" + WHITE + "|"+ WHITE + valores.get(4).getName()+ WHITE + "|" + BLACK + "|"+ WHITE + valores.get(5).getName() + "|" + WHITE + "|"+ WHITE + valores.get(6).getName()+ WHITE + "|" + BLACK + "|"+ WHITE + valores.get(7).getName() + "|");
            System.out.println(WHITE + "____" + BLACK + "____" + WHITE + "____" + BLACK + "____" + WHITE + "____" + BLACK + "____" + WHITE + "____" + BLACK + "____" );
            System.out.println(BLACK + "____" + WHITE + "____" + BLACK + "____" + WHITE + "____" + BLACK + "____" + WHITE + "____" + BLACK + "____" + WHITE + "____" );
            System.out.println(BLACK + "|" + WHITE + valores.get(8).getName()+ BLACK + "|" + WHITE + "|"+ WHITE + valores.get(9).getName() + WHITE + "|" + BLACK + "|"+ WHITE + valores.get(10).getName()+ BLACK + "|" + WHITE + "|"+ WHITE + valores.get(11).getName()+ WHITE + "|" + BLACK + "|"+ WHITE + valores.get(12).getName()+ BLACK + "|" + WHITE + "|"+ WHITE + valores.get(13).getName()+ WHITE + "|" + BLACK + "|"+ WHITE + valores.get(14).getName()+ BLACK + "|" + WHITE + "|"+ WHITE + valores.get(15).getName()+ WHITE + "|");
            System.out.println(BLACK + "____" + WHITE + "____" + BLACK + "____" + WHITE + "____" + BLACK + "____" + WHITE + "____" + BLACK + "____" + WHITE + "____" );
            System.out.println(WHITE + "____" + BLACK + "____" + WHITE + "____" + BLACK + "____" + WHITE + "____" + BLACK + "____" + WHITE + "____" + BLACK + "____" );
            System.out.println(WHITE + "|"+ BLACK + "  " + WHITE + "|" + BLACK + "|"+ BLACK + "  " + "|" + WHITE + "|"+ BLACK + "  " + WHITE + "|" + BLACK + "|"+ BLACK + "  " + "|" + WHITE + "|"+ BLACK + "  " + WHITE + "|" + BLACK + "|"+ BLACK + "  " + "|" + WHITE + "|"+ BLACK + "  " + WHITE + "|" + BLACK + "|"+ BLACK + "  " + "|");
            System.out.println(WHITE + "____" + BLACK + "____" + WHITE + "____" + BLACK + "____" + WHITE + "____" + BLACK + "____" + WHITE + "____" + BLACK + "____" );
            System.out.println(BLACK + "____" + WHITE + "____" + BLACK + "____" + WHITE + "____" + BLACK + "____" + WHITE + "____" + BLACK + "____" + WHITE + "____" );
            System.out.println(BLACK + "|" + BLACK +  "  "+ BLACK + "|" + WHITE + "|"+ BLACK +  "  " + WHITE + "|" + BLACK + "|"+ BLACK +  "  "+ BLACK + "|" + WHITE + "|"+ BLACK +  "  " + WHITE + "|" + BLACK + "|"+ BLACK +  "  "+ BLACK + "|" + WHITE + "|"+ BLACK +  "  " + WHITE + "|" + BLACK + "|"+ BLACK +  "  " + BLACK + "|" + WHITE + "|"+ BLACK +  "  " + WHITE + "|");
            System.out.println(BLACK + "____" + WHITE + "____" + BLACK + "____" + WHITE + "____" + BLACK + "____" + WHITE + "____" + BLACK + "____" + WHITE + "____" );
            System.out.println("\n\n\n\n\n");
        }

    }
}

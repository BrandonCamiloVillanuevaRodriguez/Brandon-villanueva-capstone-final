import java.util.ArrayList;

public interface Order {
        int SelectionsortInt(ArrayList<Piece> valores, int delay, String color) throws InterruptedException;

        int BublesortInt(ArrayList<Piece> valores, int delay, String color) throws InterruptedException;

        void Print(ArrayList<Piece> valores);

        int quickSort(ArrayList<Piece> lista, int inicio, int fin, int delay, String color) throws InterruptedException;

        int insertionSort(ArrayList<Piece> lista, int delay, String color) throws InterruptedException;

        boolean Terminar(ArrayList<Piece> Lista);
}



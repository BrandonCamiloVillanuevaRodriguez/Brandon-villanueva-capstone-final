import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class Main {
    public int milisegundos;
    public int r;
    public String algoritmo;
    public String orden;
    public String tipo;
    public String in;
    public ArrayList<String> ListaLetras = new ArrayList<>();
    public ArrayList<Integer> listaNumeros = new ArrayList<>();
    public ArrayList<Integer> listaNumerosOrdenados = new ArrayList<>();
//    public Order ordenamientos = new Ordenamientos();
    public VerificarParametros Verificar = new VerificarParametros();

    public void asignar(String[] valores){
        for (int i = 0; i < valores.length; i++){
            valores[i] = valores[i].toLowerCase();
        }
        AsignarAlgoritmo(valores);

        //ordenamiento
        if (valores[2].charAt(2) == 'b'){
            orden = "Black";
        }else {
            orden = "Withe";
        }

        //In
        in = String.valueOf(valores[3].charAt(3));

        //R
        StringBuilder valor = new StringBuilder();
        for (int i = 2; i < valores[4].length(); i++){
            valor.append(valores[4].charAt(i));
        }
        r = Integer.parseInt(String.valueOf(valor));

        //milisegundos
        StringBuilder segundos = new StringBuilder();
        for (int i = 2; i < valores[5].length(); i++){
            segundos.append(String.valueOf(valores[5].charAt(i)));
        }
        milisegundos = Integer.parseInt(String.valueOf(segundos));

        //tipo
        if (valores[1].charAt(2) == 'n'){
            tipo = "Numeric";
            asignarLista();
        }else {
            tipo = "Charter";
            asignarLista();
        }
        listaNumerosOrdenados = listaNumeros;
    }

    public void AsignarAlgoritmo(String[] valores){

        //algoritmo
        switch (valores[0].charAt(2)){
            case 's':
                algoritmo = "Selection sort";
                break;
            case 'b':
                algoritmo = "Bubble sort";
                break;
            case 'i':
                algoritmo = "Insertion sort";
                break;
            case 'm':
                algoritmo = "Merge sort";
                break;
            case 'q':
                algoritmo = "Quick sort";
                break;
            case 'h':
                algoritmo = "Heap sort";
                break;
            case 'c':
                algoritmo = "Counting sort";
                break;
            case 'r':algoritmo = "Radix sort";
                break;
        }
    }

    public void Print(int totalTime, Tablero tablero){
        if (Objects.equals(tipo, "Numeric")){
            System.out.println("Lista de numeros desordenada = " + listaNumerosOrdenados);
        } else {
            System.out.println("Lista de caracteres desordenada = " + ListaLetras);
        }
        System.out.println("Algoritmo = " + algoritmo +
                            "\nTipo = " + tipo +
                            "\nOrden = " + orden +
                            "\nIn = " + in +
                            "\nNumero de piezas = " + r +
                            "\nMilisegundos = " + milisegundos +
                            "\nTiempo total = " + totalTime);
    }

    public void asignarLista(){
        String Letters = "abcdefghijklmnop";
        for (int i = 0; i < r; i++) {
            ListaLetras.add(String.valueOf(Letters.charAt(i)));
        }
        Collections.shuffle(ListaLetras);
        for (int i = 0; i < r; i++) {
            switch (ListaLetras.get(i)){
                case "a": listaNumeros.add(1);
                    break;
                case "b": listaNumeros.add(2);
                    break;
                case "c": listaNumeros.add(3);
                    break;
                case "d": listaNumeros.add(4);
                    break;
                case "e": listaNumeros.add(5);
                    break;
                case "f": listaNumeros.add(6);
                    break;
                case "g": listaNumeros.add(7);
                    break;
                case "h": listaNumeros.add(8);
                    break;
                case "i": listaNumeros.add(9);
                    break;
                case "j": listaNumeros.add(10);
                    break;
                case "k": listaNumeros.add(11);
                    break;
                case "l": listaNumeros.add(12);
                    break;
                case "m": listaNumeros.add(13);
                    break;
                case "n": listaNumeros.add(14);
                    break;
                case "o": listaNumeros.add(15);
                    break;
                case "p": listaNumeros.add(16);
                    break;
            }
        }
        if (listaNumeros.size() < 16){
            for (int i =  listaNumeros.size(); i < 16; i++){
                listaNumeros.add(0);
            }
        }
    }

    public void main(String[] args) throws InterruptedException {
        if (args.length == 6){
            if (Verificar.VerificarTodo(args)){
                asignar(args);
                Tablero tablero = new Tablero(listaNumeros, algoritmo, milisegundos, orden);
                tablero.CreatePiece();
                tablero.OrdenarTablero();
                Print(tablero.totalTime, tablero);
            }
            else {
                System.out.println("Valores invalidos");
            }
        }else {
            System.out.println("Faltan Valores");
        }
    }
}

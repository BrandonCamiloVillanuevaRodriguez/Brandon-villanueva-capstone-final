import java.util.ArrayList;
import java.util.Objects;

public class Tablero {
    public ArrayList<Integer> Piezas = new ArrayList<Integer>();
    public ArrayList<Piece> PiezasObjets = new ArrayList<Piece>();
    public Order ordenamientos = new Ordenamientos();
    public String Orden, Color;
    public int Delay;
    public int totalTime=0;

    public Tablero(ArrayList<Integer> piezas, String orden, int delay, String color){
        Piezas = piezas;
        Color = color;
        Orden = orden;
        Delay = delay;
    }

    public void CreatePiece(){
        Piece King = new Piece("Kg", 1, 4);
        Piece Queen = new Piece("Qn", 2, 5);
        Piece Alfil = new Piece("Al", 5, 3);
        Piece Alfil2 = new Piece("Al", 6, 6);
        Piece Hourse = new Piece("He", 7, 2);
        Piece Hourse2 = new Piece("He", 8, 7);
        Piece Tower = new Piece("Tr", 3, 1);
        Piece Tower2 = new Piece("Tr", 4, 8);
        Piece Peon = new Piece("Pn", 9, 9);
        Piece Peon2 = new Piece("Pn", 10, 10);
        Piece Peon3 = new Piece("Pn", 11, 11);
        Piece Peon4 = new Piece("Pn", 12, 12);
        Piece Peon5 = new Piece("Pn", 13, 13);
        Piece Peon6 = new Piece("Pn", 14, 14);
        Piece Peon7 = new Piece("Pn", 15, 15);
        Piece Peon8 = new Piece("Pn", 16, 16);
        AsignPiece(King, Queen, Alfil2, Alfil, Hourse2, Hourse, Tower2, Tower, Peon, Peon2, Peon3, Peon4, Peon5, Peon6, Peon7, Peon8);
    }

    public void AsignPiece(Object King, Object Queen, Object Alfil2, Object Alfil, Object Hourse2, Object Hourse, Object Tower2, Object Tower, Object Peon, Object Peon2, Object Peon3, Object Peon4, Object Peon5, Object Peon6, Object Peon7, Object Peon8){
        for (int i = 0; i < Piezas.size(); i++){
                    switch (Piezas.get(i)){
                        case 1:
                            PiezasObjets.add((Piece) King);
                            break;
                        case 2:
                            PiezasObjets.add((Piece) Queen);
                            break;
                        case 3:
                            PiezasObjets.add((Piece) Tower);
                            break;
                        case 4:
                            PiezasObjets.add((Piece) Tower2);
                            break;
                        case 5:
                            PiezasObjets.add((Piece) Alfil);
                            break;
                        case 6:
                            PiezasObjets.add((Piece) Alfil2);
                            break;
                        case 7:
                            PiezasObjets.add((Piece) Hourse);
                            break;
                        case 8:
                            PiezasObjets.add((Piece) Hourse2);
                            break;
                        case 9:
                            PiezasObjets.add((Piece) Peon);
                            break;
                        case 10:
                            PiezasObjets.add((Piece) Peon2);
                            break;
                        case 11:
                            PiezasObjets.add((Piece) Peon3);
                            break;
                        case 12:
                            PiezasObjets.add((Piece) Peon4);
                            break;
                        case 13:
                            PiezasObjets.add((Piece) Peon5);
                            break;
                        case 14:
                            PiezasObjets.add((Piece) Peon6);
                            break;
                        case 15:
                            PiezasObjets.add((Piece) Peon7);
                            break;
                        case 16:
                            PiezasObjets.add((Piece) Peon8);
                            break;
                        case 0:
                            boolean aprovado;
                            for (int posicion = 1; posicion <= Piezas.size(); posicion++){
                                aprovado = true;
                                for (Piece piezasObjet : PiezasObjets) {
                                    if (piezasObjet.getPosicionFinal() == posicion) {
                                        aprovado = false;
                                        break;
                                    }
                                }
                                if (aprovado){
                                    Piece None = new Piece("  ", 0, posicion);
                                    PiezasObjets.add(None);
                                    break;
                                }
                            }
                            break;
                    }
        }
//        System.out.println(Piezas);
//        for (int k= 0; k < 16; k++){
//            System.out.println(PiezasObjets.get(k).getPosicionFinal()+ " ......");
//            System.out.println(PiezasObjets.get(k).getName());
//        }
    }

    public void OrdenarTablero() throws InterruptedException {
        switch (Orden){
            case "Selection sort":
                totalTime = ordenamientos.SelectionsortInt(PiezasObjets, Delay, Color);
                break;
            case "Bubble sort":
                totalTime = ordenamientos.BublesortInt(PiezasObjets, Delay, Color);
                break;
            case "Quick sort":
                totalTime = ordenamientos.quickSort(PiezasObjets, 0, PiezasObjets.size() - 1 , Delay, Color);
                break;
            case "Insertion sort":
                totalTime = ordenamientos.insertionSort(PiezasObjets, Delay, Color);
                break;
        }
    }
}

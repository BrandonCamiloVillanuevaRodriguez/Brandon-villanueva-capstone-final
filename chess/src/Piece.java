public class Piece{
    private final String Name;
    private final int PosicionFinal;
    private final int Valor;

    public Piece(String name, int valor, int posicionFinal){
        this.Name = name;
        this.Valor = valor;
        this.PosicionFinal = posicionFinal;

    }

    public String getName() {
        return Name;
    }

    public int getPosicionFinal() {
        return PosicionFinal;
    }

    public int getValor() {
        return Valor;
    }

}

public class VerificarParametros {
    public boolean VerificarTodo(String[] args){
        boolean verificado;
        try {
            verificado = VerificarAlgoritmo(args[0]) &&
                    VerificarTipo(args[1]) &&
                    VerificarOrdenamiento(args[2]) &&
                    VerificarIn(args[3]) &&
                    VerificarPiezas(args[4]) &&
                    VerificarMilisegundos(args[5]);

        } catch (Exception E){
            return false;
        }
        return verificado;
    }
    public boolean VerificarAlgoritmo(String algoritmo){
        String comparadores=("aA=iIbBsSmMqQhHcCrR");
        if (algoritmo.charAt(0) == comparadores.charAt(0) || algoritmo.charAt(0) == comparadores.charAt(1)){
            if (algoritmo.charAt(1) == comparadores.charAt(2)){
                for (int i = 3; i < comparadores.length(); i++){
                    if (algoritmo.charAt(2) == comparadores.charAt(i)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public boolean VerificarTipo(String tipo){
        String comparadores=("tT=cCnN");
        if (tipo.charAt(0) == comparadores.charAt(0) || tipo.charAt(0) == comparadores.charAt(1)){
            if (tipo.charAt(1) == comparadores.charAt(2)){
                for (int i = 3; i < comparadores.length(); i++){
                    if (tipo.charAt(2) == comparadores.charAt(i)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public boolean VerificarOrdenamiento(String orden){
        String comparadores=("oO=bBwW");
        if (orden.charAt(0) == comparadores.charAt(0) || orden.charAt(0) == comparadores.charAt(1)){
            if (orden.charAt(1) == comparadores.charAt(2)){
                for (int i = 3; i < comparadores.length(); i++){
                    if (orden.charAt(2) == comparadores.charAt(i)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public boolean VerificarIn(String in){
        String comparadores=("iInI=r");
        if (in.charAt(0) == comparadores.charAt(0) || in.charAt(0) == comparadores.charAt(1)){
            if (in.charAt(1) == comparadores.charAt(2) || in.charAt(1) == comparadores.charAt(3)){
                if (in.charAt(2) == comparadores.charAt(4)){
                    if (in.charAt(3) == comparadores.charAt(5)){
                        return true;
                    }
                }
            }

        }
        return false;
    }
    public boolean VerificarPiezas(String piezas){
        StringBuilder valor = new StringBuilder();
        String comparadores=("rR=");
        int valorFinal=0;
        if (piezas.charAt(0) == comparadores.charAt(0) || piezas.charAt(0) == comparadores.charAt(1)){
            if (piezas.charAt(1) == comparadores.charAt(2)){
                for (int i = 2; i < piezas.length(); i++){
                    valor.append(piezas.charAt(i));
                }
                try {
                    valorFinal = Integer.parseInt(String.valueOf(valor));
                }catch (Exception E){
                }
                return valorFinal > 0 && valorFinal < 17;
            }
        }
        return false;
    }
    public boolean VerificarMilisegundos(String milisegundos){
        StringBuilder valor = new StringBuilder();
        String comparadores=("sS=");
        int valorFinal=0;
        if (milisegundos.charAt(0) == comparadores.charAt(0) || milisegundos.charAt(0) == comparadores.charAt(1)){
            if (milisegundos.charAt(1) == comparadores.charAt(2)){
                for (int i = 2; i < milisegundos.length(); i++){
                    valor.append(milisegundos.charAt(i));
                }
                try {
                    valorFinal = Integer.parseInt(String.valueOf(valor));
                }catch (Exception E){
                }
                return valorFinal > 0 && valorFinal <1001;
            }
        }
        return false;
    }
}

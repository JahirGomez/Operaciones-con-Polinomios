package Model;

public class Monomio {
    protected int coeficiente;
    protected int grado;


    public Monomio(int coeficiente, int grado) {
        this.coeficiente = coeficiente;
        this.grado = grado;
    }


    public Monomio() {

    }
    

    public int getCoeficiente() {
        return this.coeficiente;
    }

    public void setCoeficiente(int coeficiente) {
        this.coeficiente = coeficiente;
    }

    public int getGrado() {
        return this.grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    @Override
    public String toString (){
        String c, g;
        c=String.valueOf(this.coeficiente);
        g=String.valueOf(this.grado);
        if (g.equals("0")){
            return c;
        }else{
            if (g.equals("1")){
                if(c.equals("1")){
                    return "x";
                }else{
                    if(c.equals("-1")){
                        return "-x";
                    }else{
                        return c + "x";
                    }
                }
            }else{
                if(c.equals("1")){
                    return "x^" + g;
                }else{
                    if(c.equals("-1")){
                        return "-x^" + g;
                    }else{
                        return c + "x^" + g;
                    }
                }
            }
        }
        
    }

}

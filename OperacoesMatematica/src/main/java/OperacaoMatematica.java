public abstract class OperacaoMatematica {

    private double A,B;
    public abstract double calcula();

    public double getA() {
        return A;
    }

    public void setA(double A) {
        this.A = A;
    }

    public double getB() {
        return B;
    }

    public void setB(double B) {
        this.B = B;
    }

    @Override
    public String toString() {
        return "Valor de A: "+getA()+" Valor de B: "+getB()+" Resultado do calculo: "+calcula();
    }
}
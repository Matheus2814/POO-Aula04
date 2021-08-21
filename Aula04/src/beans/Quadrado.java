package beans;

// @author Matheus Machado

public class Quadrado implements Figura2D {
    
    private Ponto2D p0;
    private double lado;

    public Quadrado(Ponto2D p0, double lado) {
        this.p0 = new Ponto2D(p0.getX(), p0.getY());
        this.lado = lado;
    }

    
    
    @Override
    public double calcArea() {
        return lado * lado;
    }

    @Override
    public double calcPerimetro() {
        return lado * 4;
    }

    @Override
    public void moveX(double dX) {
        p0.moveX(dX);
    }

    @Override
    public void moveY(double dY) {
        p0.moveY(dY);
    }

    @Override
    public void moveXY(double dX, double dY) {
        p0.moveXY(dX, dY);
    }

    public Ponto2D getP0() {
        return p0;
    }

    public Ponto2D calcP1(){
        return new Ponto2D(p0.getX() + lado, p0.getY());
    }
    
    public Ponto2D calcP2(){
        return new Ponto2D(p0.getX(), p0.getY() + lado);
    }
    
    public Ponto2D calcP3(){
        return new Ponto2D(p0.getX() + lado, p0.getY() + lado);
    }
    
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Quadrado{" + "p0: " + p0 + ", p1: " + calcP1() + ", p2: " + calcP2() + ", p3: " + calcP3() +
                ", lado: " + lado + ", area: " + calcArea() + ", perimetro: " + calcPerimetro() + '}';
    }
    
    
    
}

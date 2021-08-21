
import beans.Circulo;
import beans.Ponto2D;
import beans.Quadrado;
import beans.SegReta;
import beans.Retangulo;


// @author Matheus Machado

public class Aula04Main {

  
    public static void main(String[] args) {
        
        Ponto2D p0 = new Ponto2D(2, 2);
        Ponto2D p1 = new Ponto2D(1,1);
        SegReta sr0 = new SegReta(p0, p1);
        
        System.out.println(p0);
        System.out.println(p1);
        System.out.println(sr0);
        
        sr0.moveX(2);
        
        System.out.println(p0);
        System.out.println(p1);
        System.out.println(sr0);
        
        Quadrado q0 = new Quadrado(p0, 3);
        System.out.println(q0);
        q0.moveXY(5, 5);
        System.out.println(q0);
        
        Retangulo r0 = new Retangulo(p0, 3, 4);
        System.out.println(r0);
        r0.moveXY(5, 5);
        System.out.println(r0);
        
        Ponto2D p3 = new Ponto2D(5, 5);
        Circulo c0 = new Circulo(p3, 5);
        System.out.println(c0);
        c0.moveXY(10, 10);
        System.out.println(c0);
        
    }
    
}

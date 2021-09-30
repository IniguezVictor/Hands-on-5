package simplelinearregression;
import java.util.Scanner;

public class Implementacion implements Interfaz{
    private int n;
    private double[] x;
    private double[] y;

    private double Beta0;
    private double Beta1;
    
    public Implementacion() {
        this.n = 9;
        this.x = new double[]{23, 26, 30, 34, 43, 48, 52, 57, 58};
        this.y = new double[]{651, 762, 856, 1063, 1190, 1298, 1421, 1440, 1518};
        this.Beta0 = 0;
        this.Beta1 = 0;
    }
    
    public int getN() { return n;   }

    public double getBeta0() {  return Beta0;   }
    public void setBeta0(double beta0) {    this.Beta0 = beta0;}

    public double getBeta1() {  return Beta1;   }
    public void setBeta1(double beta1) {    this.Beta1 = beta1;  }
    
    @Override
    public void Metodo() {
        double sumax = 0, sumay = 0, sumaxy = 0, sumax2 = 0;
        double promediox = 0, promedioy = 0;

        for (int i = 0; i < getN(); i++) {
            sumax += x[i];
            sumay += y[i];
            sumaxy += (x[i] * y[i]);
            sumax2 += (x[i] * x[i]);
        }
        promediox = sumax / getN();
        promedioy = sumay / getN();

        setBeta1((((n * sumaxy) - (sumax * sumay)) / ((n * sumax2) - (sumax * sumax))));
        setBeta0((promedioy - (Beta1 * promediox)));

        System.out.println("y = " + Beta0 + " + " + Beta1 + "x");  
    }

    @Override
    public void Sustitucion() {

        double resultado = (getBeta1() * 62) + getBeta0();
        System.out.println("f(62) = " + resultado);

    }
}
package simplelinearregression;

public class SLR implements SLRinterface{
    
    HelperArithmetic helper = new HelperArithmetic();
    DataSet data = new DataSet();
    Coeficientes c = new Coeficientes();
    
    public SLR() {}
    
    @Override
    public void Metodo() {
        double sumax = 0, sumay = 0, sumaxy = 0, sumax2 = 0;
        double promediox = 0, promedioy = 0;
        int n = data.getN();
        
        sumax = helper.sumatoria(data.getX());
        sumay = helper.sumatoria(data.getY());
        sumaxy = helper.sumatoria(data.getX(), data.getY());
        sumax2 = helper.sumatoria(data.getX(), 2);
        
        promediox = helper.promedio(sumax,n);
        promedioy = helper.promedio(sumay,n);

        c.setBeta1((((n * sumaxy) - (sumax * sumay)) / ((n * sumax2) - (sumax * sumax))));
        c.setBeta0((promedioy - (c.getBeta1() * promediox)));

        System.out.println("y = " + c.getBeta0() + " + " + c.getBeta1() + "x");  
    }

    @Override
    public void Sustitucion() {
        
        double resultado = (c.getBeta1() * 62) + c.getBeta0();
        System.out.println("f(62) = " + resultado);

    }
}
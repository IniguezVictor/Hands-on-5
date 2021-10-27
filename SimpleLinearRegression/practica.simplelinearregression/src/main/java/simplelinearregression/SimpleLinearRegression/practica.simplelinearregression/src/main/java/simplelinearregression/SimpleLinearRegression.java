/*
* AUTOR = Victor Manuel Iñiguez Mercado
* TRABAJO = Hands-on 5
*/
package simplelinearregression;

import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;

public class SimpleLinearRegression extends Agent {
    
    @Override
    protected void setup(){
        System.out.println("Inicio del agente " + getLocalName());
        addBehaviour(new MyOneShotBehaviour());
    }
    
    private class MyOneShotBehaviour extends OneShotBehaviour {

    @Override
    public void action() {
        System.out.println("-Agente en accion-");
        SLR Benetton = new SLR();
        Benetton.Metodo();
        Benetton.Sustitucion();
    } 
    
    @Override
    public int onEnd() {
      System.out.println("-Agente muriendo-");
      myAgent.doDelete();   
      return super.onEnd();
    } 
  } 
}
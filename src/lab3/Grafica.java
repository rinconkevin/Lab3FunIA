/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class Grafica{
    private List<Variable> ListVariables = new ArrayList<>();
    private int tamaño = 0;
    
    public Grafica() {
    }
    
    public void agregarVariable(Variable V){
        ListVariables.add(V);
        tamaño++;
    }
    
    public void mostrarVariables(){
        for (Variable L : ListVariables) {
            System.out.println(L.getNombre());
        }
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    
    public void agregarCombinacion(String C, String Campo){
        for (Variable L : ListVariables) {
            if(Campo.equals(L.getNombre())){
                L.agregarCombinacion(C);
            }
        }
    }
    
    public void MostrarCombinaciones(){
        for (Variable L : ListVariables) {
            L.MostrarCombinacion();
        }
    }
    
    public String MostrarVariables(){
        String Variable = "";
        for (Variable L : ListVariables) {
            Variable = Variable + L.getNombre() + " -";
        }
        return Variable;
    }
    
    public List<Variable> getLista(){
        return ListVariables;
    }
}

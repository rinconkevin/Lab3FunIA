/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Variable {
    private List<String> Combinacion = new ArrayList<>();
    private int activado;
    private String Nombre;
            
    public Variable(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public void agregarCombinacion(String comb){
        Combinacion.add(comb);
    }
    
    public void modificarEstado(int n){
        activado = n;
    }
    
    public void MostrarCombinacion(){
        System.out.println("Combinaciones de "+ this.Nombre);
        for (String C : Combinacion) {
            System.out.println(C);
        }
    }

    public List<String> getCombinacion() {
        return Combinacion;
    }

    public void setCombinacion(List<String> Combinacion) {
        this.Combinacion = Combinacion;
    }

    public int getActivado() {
        return activado;
    }

    public void setActivado(int activado) {
        this.activado = activado;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    
}

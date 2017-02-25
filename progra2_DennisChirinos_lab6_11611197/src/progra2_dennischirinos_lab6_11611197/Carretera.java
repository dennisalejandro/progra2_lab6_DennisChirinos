/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2_dennischirinos_lab6_11611197;

/**
 *
 * @author denni
 */
public class Carretera {
    int Numero;
    Double Distancia;
    Lugar Inicio;
    Lugar Final;

    public Carretera(int Numero, Double Distancia, Lugar Inicio, Lugar Final) {
        this.Numero = Numero;
        this.Distancia = Distancia;
        this.Inicio = Inicio;
        this.Final = Final;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public Double getDistancia() {
        return Distancia;
    }

    public void setDistancia(Double Distancia) {
        this.Distancia = Distancia;
    }

    public Lugar getInicio() {
        return Inicio;
    }

    public void setInicio(Lugar Inicio) {
        this.Inicio = Inicio;
    }

    public Lugar getFinal() {
        return Final;
    }

    public void setFinal(Lugar Final) {
        this.Final = Final;
    }

    @Override
    public String toString() {
        return ""+Numero;
    }
    
    
}

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
public class Casas extends Lugar{

    public Casas(String Nombre, String Direccion, int Valor) {
        super(Nombre, Direccion, Valor);
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getValor() {
        return Valor;
    }

    public void setValor(int Valor) {
        this.Valor = Valor;
    }

    public Carretera getEntrada() {
        return Entrada;
    }

    public void setEntrada(Carretera Entrada) {
        this.Entrada = Entrada;
    }

    public Carretera getSalida() {
        return Salida;
    }

    public void setSalida(Carretera Salida) {
        this.Salida = Salida;
    }

    @Override
    public String toString() {
        return Nombre;
    }
    
    
}

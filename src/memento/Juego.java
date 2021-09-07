/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

/**
 *
 * @author Velasco
 */
public class Juego {

	private String nombre;
	private int checkpoint;

	public int getCheckpoint() {
            return checkpoint;
	}

	public void setCheckpoint(int checkpoint) {
            this.checkpoint = checkpoint;
	}

	public String getNombre() {
            return nombre;
	}

	public void setNombre(String nombre) {
            this.nombre = nombre;
	}

	@Override
	public String toString() {
            return "Juego [nombre=" + nombre + ", checkpoint=" + checkpoint + "]";
	}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import memento.Caretaker;
import memento.Juego;
import memento.Originator;

/**
 *
 * @author Velasco
 */
public class App {

    public static void main(String[] args) {
        // TODO code application logic here
		String nombreJuego = "Crash Bandicoot";
		Caretaker caretaker = new Caretaker();
		Originator originator = new Originator();
                
		Juego juego = new Juego();
		juego.setNombre(nombreJuego);
		juego.setCheckpoint(1);
                originator.setEstado(juego);

		juego = new Juego();
		juego.setNombre(nombreJuego);
		juego.setCheckpoint(2);
		originator.setEstado(juego);

		juego = new Juego();
		juego.setNombre(nombreJuego);
		juego.setCheckpoint(3);		
		originator.setEstado(juego);

		caretaker.addMemento(originator.guardar()); // ESTADO POSICION 0

		juego = new Juego();
		juego.setNombre(nombreJuego);
		juego.setCheckpoint(4);
		originator.setEstado(juego);
                
		caretaker.addMemento(originator.guardar()); // ESTADO POSICION 1

		juego = new Juego();
		juego.setNombre(nombreJuego);
		juego.setCheckpoint(5);
		originator.setEstado(juego);
		caretaker.addMemento(originator.guardar()); // ESTADO POSICION 2

		originator.setEstado(juego);
		originator.restaurar(caretaker.getMemento(1));

		juego = originator.getEstado();
		System.out.println(juego);
	}
    }
    


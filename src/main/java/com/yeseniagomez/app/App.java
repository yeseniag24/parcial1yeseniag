package com.yeseniagomez.app;

import com.yeseniagomez.dominio.Dispensadora;

public class App {
    public static void main(String[] args) {
        Dispensadora maquina = new Dispensadora(10);


        maquina.agregarProducto("1","Doritos",3,2000);
        maquina.agregarProducto("2","Papas Limón",5,2500);
        maquina.agregarProducto("3","Chocolatina",7,900);
        maquina.agregarProducto("4","Galletas Festival",6,1200);
        maquina.agregarProducto("5","Choclitos",4,1700);
        maquina.agregarProducto("6","Barrilete",0,2000);

        maquina.sacarUnidad("4");
        maquina.consultarProductosAcabados();
        maquina.consultarTotalUnidades("3");
        maquina.consultarTodasUnidades();
        maquina.aumentarCantidad("1",5);
    }
}

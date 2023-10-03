package com.yeseniagomez.dominio;

public class Dispensadora {
    private Producto [] productoYG;
    private int contadorProductosYG;


    public Dispensadora(int capacidadYG) {
        this.productoYG = new Producto[capacidadYG];
        this.contadorProductosYG = 0;
    }


    public void agregarProducto(String codigo, String nombre, int cantidadMaxima, double precio) {
        if (contadorProductosYG >= productoYG.length) {
            System.out.println("La máquina está llena");
            return;
        }

        for (int i = 0; i < contadorProductosYG; i++) {
            if (productoYG[i].getCodigoYG().equals(codigo)) {
                System.out.println("Ya existe un producto con ese código");
                return;
            }
        }

        productoYG[contadorProductosYG] = new Producto(codigo, nombre, cantidadMaxima, precio);
        contadorProductosYG++;
        System.out.println("Producto agregado: " + nombre);
    }



    public void sacarUnidad(String codigo) {
        for (int i = 0; i < contadorProductosYG; i++) {
            if (productoYG[i].getCodigoYG().equals(codigo)) {
                productoYG[i].sacarUnidadProducto();
                System.out.println("Se retiró una unidad de " + productoYG[i].getNombreYG());
                return;
            }
        }

        System.out.println("Producto no encontrado");
    }



    public void consultarProductosAcabados() {
        for (int i = 0; i < contadorProductosYG; i++) {
            if (productoYG[i].getCantidadMaximaYG() <= 0) {
                System.out.println(productoYG[i].getNombreYG() + " está agotado");
            }
        }
    }



    public int consultarTotalUnidades(String codigo) {
        for (int i = 0; i < contadorProductosYG; i++) {
            if (productoYG[i].getCodigoYG().equals(codigo)) {
                System.out.println("El total de unidades es: "+productoYG[i].getCantidadMaximaYG());
                return 1;
            }
        }
        System.out.println("Producto no encontrado");
        return 0;
    }



    public void consultarTodasUnidades() {
        System.out.println("Total por unidades");
        for (int i = 0; i < contadorProductosYG; i++) {
            Producto producto = productoYG[i];
            System.out.println(producto.getNombreYG() + ": " + producto.getCantidadMaximaYG() + " unidades");
        }
    }



    public void aumentarCantidad(String codigo, int cantidad) {
        for (int i = 0; i < contadorProductosYG; i++) {
            if (productoYG[i].getCodigoYG().equals(codigo)) {
                productoYG[i].aumentarCantidadProducto(cantidad);
                System.out.println("Se aumentaron " + cantidad + " unidades de " + productoYG[i].getNombreYG());
                return;
            }
        }

        System.out.println("Producto no encontrado");
    }



    public Producto[] getProductoYG() {
        return productoYG;
    }

    public int getContadorProductosYG() {
        return contadorProductosYG;
    }


    public void setProductoYG(Producto[] productoYG) {
        this.productoYG = productoYG;
    }

    public void setContadorProductosYG(int contadorProductosYG) {
        this.contadorProductosYG = contadorProductosYG;
    }
}

package com.yeseniagomez.dominio;

public class Producto {
    private String codigoYG;
    private String nombreYG;
    private int cantidadMaximaYG;
    private int cantidadYG;
    private double precioYG;


    public Producto(String codigoYG, String nombreYG, int cantidadMaximaYG, double precioYG) {
        this.codigoYG = codigoYG;
        this.nombreYG = nombreYG;
        this.cantidadMaximaYG = cantidadMaximaYG;
        this.cantidadYG = cantidadYG;
        this.precioYG = precioYG;
    }



    public void sacarUnidadProducto(){
        if (cantidadYG > 0){
            cantidadYG --;
        }
    }

    public void aumentarCantidadProducto(int cantidad){
        if (this.cantidadYG + cantidadYG <= cantidadMaximaYG) {
            this.cantidadYG = this.cantidadYG + cantidadYG;
        }
    }


    public String getCodigoYG() {
        return codigoYG;
    }

    public String getNombreYG() {
        return nombreYG;
    }

    public int getCantidadMaximaYG() {
        return cantidadMaximaYG;
    }

    public int getCantidadYG() {
        return cantidadYG;
    }

    public double getPrecioYG() {
        return precioYG;
    }


    public void setCantidadMaximaYG(int cantidadMaximaYG) {
        this.cantidadMaximaYG = cantidadMaximaYG;
    }

    public void setCantidadYG(int cantidadYG) {
        this.cantidadYG = cantidadYG;
    }

    public void setPrecioYG(double precioYG) {
        this.precioYG = precioYG;
    }
}

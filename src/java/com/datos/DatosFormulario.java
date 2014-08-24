/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.datos;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Familia Torres
 */
@ManagedBean
@RequestScoped
public class DatosFormulario {

    private String cad ;
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    
    public DatosFormulario() {        
    }
    
    public String getCad() {
        return cad;
    }

    public void setCad(String cad) {
        this.cad = cad;
    }

    public int getA() {
        return A;
    }

    public void setA(int A) {
        this.A = A;
        
    }

    public int getB() {
        return B;
    }

    public void setB(int B) {
        this.B = B;
    }

    public int getC() {
        return C;
    }

    public void setC(int C) {
        this.C = C;
    }

    public int getD() {
        return D;
    }

    public void setD(int D) {
        this.D = D;
    }

    public int getE() {
        return E;
    }

    public void setE(int E) {
        this.E = E;
    }
   
    public String mayor (int a, int b){
        if (a==b){
            cad = "";
        }else {           
            if (a > b){
                cad = ( "A es el mayor");
            } 
            else {
                cad = ( "B es el mayor");
            }
        }
        return cad;
    }
    
    public String mayorr (int A, int B, int C){
        if (A==B && B==C){
            cad = "";
        }else {
            if (A > B && A > C){
                cad = ( "A es el mayor");
            }
            else {
                if (B > A && B > C){
                    cad = ( "B es el mayor");
                }
                else{
                    cad = ( "C es el mayor");
                }  
            }             
        }
        return cad;
    }
    
    public String suma (int A){
        int suma = 0;
        while ( A  < 10 ){
            A ++;
            suma = suma + A;
        }
        if (A == 10){
            cad = ( "suma");
        }
        else{
            cad = ( "N es mayor");
        }
          
        return cad;   
    }
    
    public double hipotenusa(int A, int B){
        if (A==0 && B ==0){
            return 0;
        } else{
            double hipo;
            hipo = A + B;
            hipo = Math.pow(hipo, 2);
            hipo = Math.sqrt(hipo);
            return hipo;
        } 
    }
    
    public String areaVolumen(int A, int B){
        if (A==0 && B ==0){
            cad = "";
        }else {
            double volumen;
            double area;
            volumen = Math.PI * Math.pow(A, 2)* B;
            area = (2* Math.PI ) * A * B;
            cad = "volumen: "+volumen+" area: "+area;
        }
        return cad;

    }
    
    public String par(int A){
        cad = "";
        if (A>0){
            if (A%2==0)
                cad = ("El número es par");
            else
                cad = ("El número es impar");
        }
        return cad;
    }
    
    public String nota(int c){
        cad = "";
        if (c <= 20){
            if (c >= 19 && c <= 20){
                cad = ("Nota A");
            }
            else {
                if (c >= 16 && c <= 18){
                    cad = ("Nota B");
                }else{
                    if (c >= 13 && c <= 15){
                        cad = ("Nota C");
                    }else{
                        if (c >= 10 && c <= 12){
                            cad = ("Nota D");
                        }else{
                            if (c >= 1 && c <= 9){
                                cad = ("Nota E");
                            }
                        }
                    }
                }
            }
        }
        return cad;
    }

    public String mayor2(){
        DatosFormulario df = new DatosFormulario();
        cad = df.mayor(A, B);
        return cad;
    }
    
    public String ejercicio2(){
        DatosFormulario df = new DatosFormulario();
        cad = df.mayorr(A, B, C);
        return cad;
    }
    
    public String ejercicio3(){
        DatosFormulario df = new DatosFormulario();
        cad = df.suma(E);
        return cad;
    }
    
    public String ejercicio4(){
        double hipo;
        DatosFormulario df = new DatosFormulario();
        hipo = df.hipotenusa(A, B);
        cad = "Hipotenusa "+hipo;
        return cad;
    }

    public String ejercicio5(){
        DatosFormulario df = new DatosFormulario();
        cad = df.areaVolumen(A, B);
        return cad;
    }
    
    public String ejercicio6(){
        DatosFormulario df = new DatosFormulario();
        cad = df.par(C);
        return cad;
    }
    
    public String ejercicio7(){
        DatosFormulario df = new DatosFormulario();
        cad = df.nota(D);
        return cad;
    }
    
    
}

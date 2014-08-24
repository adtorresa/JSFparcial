/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.datos;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author Familia Torres
 */
public class DatosFormularioTest {
    
    public DatosFormularioTest() {
    }
    
  
    @Test
    public void testMayor1() {
        System.out.println("mayorA");
        int A = 3;
        int B = 0;
        DatosFormulario instance = new DatosFormulario();
        String expResult = "A es el mayor";
        String result = instance.mayor(A, B);
        Assert.assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail. 
    }

    @Test
    public void testMayor2() {
        System.out.println("mayorB");
        int A = 0;
        int B = 4;
        DatosFormulario instance = new DatosFormulario();
        String expResult = "B es el mayor";
        String result = instance.mayor(A, B);
        Assert.assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail. 
    }
    
    @Test
    public void mayorABC1() {
        System.out.println("mayorABC1");
        int A = 3;
        int B = 2;
        int C = 1;
        DatosFormulario instance = new DatosFormulario();
        String expResult = "A es el mayor";
        String result = instance.mayorr(A, B, C);
        Assert.assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.     
    }

    @Test
    public void mayorABC2() {
        System.out.println("mayorABC2");
        int A = 2;
        int B = 3;
        int C = 1;
        DatosFormulario instance = new DatosFormulario();
        String expResult = "B es el mayor";
        String result = instance.mayorr(A, B, C);
        Assert.assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.     
    } 

    @Test
    public void mayorABC3() {
        System.out.println("mayorABC3");
        int A = 1;
        int B = 2;
        int C = 3;
        DatosFormulario instance = new DatosFormulario();
        String expResult = "C es el mayor";
        String result = instance.mayorr(A, B, C);
        Assert.assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.     
    } 
    
    @Test
    public void suma1() {
        System.out.println("suma1");
        int N = 0;
        DatosFormulario instance = new DatosFormulario();
        String expResult = "suma";
        String result = instance.suma(N);
        Assert.assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.     
    }
    
    @Test
    public void suma2() {
        System.out.println("suma2");
        int N = 11;
        DatosFormulario instance = new DatosFormulario();
        String expResult = "N es mayor";
        String result = instance.suma(N);
        Assert.assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.     
    }

    @Test
    public void hipo() {
        System.out.println("hipo");
        int A = 2;
        int B = 2;
        DatosFormulario instance = new DatosFormulario();
        double expResult = 4.0;
        double result = instance.hipotenusa(A, B);
        Assert.assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.     
    }
    
    @Test
    public void volumenA() {
        System.out.println("volumenA");
        int R = 2;
        int H = 3;
        DatosFormulario instance = new DatosFormulario();
        String expResult = "volumen: 37.69911184307752 area: 37.69911184307752";
        String result = instance.areaVolumen(R, H);
        Assert.assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.     
    }
    
    @Test
    public void testPar() {
        System.out.println("testPar");
        int A = 2;
        DatosFormulario instance = new DatosFormulario();
        String expResult = "El número es par";
        String result = instance.par(A);
        Assert.assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail. 
    }
    
    @Test
    public void testPar2() {
        System.out.println("testPar2");
        int A = 3;
        DatosFormulario instance = new DatosFormulario();
        String expResult = "El número es impar";
        String result = instance.par(A);
        Assert.assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail. 
    }
    
    @Test
    public void nota1() {
        System.out.println("nota1");
        int A = 20;
        DatosFormulario instance = new DatosFormulario();
        String expResult = "Nota A";
        String result = instance.nota(A);
        Assert.assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail. 
    }
    
    @Test
    public void nota2() {
        System.out.println("nota2");
        int A = 18;
        DatosFormulario instance = new DatosFormulario();
        String expResult = "Nota B";
        String result = instance.nota(A);
        Assert.assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail. 
    }
    
    @Test
    public void nota3() {
        System.out.println("nota3");
        int A = 15;
        DatosFormulario instance = new DatosFormulario();
        String expResult = "Nota C";
        String result = instance.nota(A);
        Assert.assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail. 
    }
    
    @Test
    public void nota4() {
        System.out.println("nota4");
        int A = 12;
        DatosFormulario instance = new DatosFormulario();
        String expResult = "Nota D";
        String result = instance.nota(A);
        Assert.assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail. 
    }
    
    @Test
    public void nota5() {
        System.out.println("nota5");
        int A = 9;
        DatosFormulario instance = new DatosFormulario();
        String expResult = "Nota E";
        String result = instance.nota(A);
        Assert.assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail. 
    }
}

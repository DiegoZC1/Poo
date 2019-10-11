/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Diego
 */
public class Complejos {
    private float real;
    private float imaginario;

    public float getReal() {
        return real;
    }

    public void setReal(float real) {
        this.real = real;
    }

    public float getImaginario() {
        return imaginario;
    }

    public void setImaginario(float imaginario) {
        this.imaginario = imaginario;
    }
    
    public Complejos suma (Complejos c){
        Complejos res = new Complejos();
        res.imaginario = c.imaginario+this.imaginario;
        res.real = c.real+this.real;
        
        return res;
    }
    
    public Complejos resta (Complejos c){
        Complejos res = new Complejos();
        res.imaginario = c.imaginario-this.imaginario;
        res.real = c.real-this.real;
        
        return res;
    }
    
    public Complejos conjugado (){
        Complejos res = new Complejos();
        res.imaginario = -(this.imaginario);
        res.real = this.real;
        
        return res;
    }
    
    public Complejos multiplicacion (Complejos c){
        Complejos res = new Complejos();
        res.imaginario = (c.real*this.imaginario) - (c.imaginario * this.imaginario);
        res.real = (c.real*this.real)+((c.imaginario*this.imaginario));
        
        return res;
    }
    
    public Complejos division (Complejos c){
        Complejos res = new Complejos();
        Complejos num, den;
        num = this.multiplicacion(this.conjugado());
        den = c.multiplicacion(c.conjugado());
        res.real = num.real/den.real;
        res.imaginario = num.imaginario/den.real;
        
        return res;
    }

    public Complejos() {
    }

    public Complejos(float real, float imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman.exceptions;

/**
 *
 * @author andres.gonzalez-ca
 */
public class ExcepcionValorInvalido extends Exception{
    
    public static String mensajeValorInvalido="VALOR INVALIDO";
    
    public ExcepcionValorInvalido(String msg){
        super(msg);
        
    }
}
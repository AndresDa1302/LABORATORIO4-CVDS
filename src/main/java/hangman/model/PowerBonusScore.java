/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman.model;

/**
 *
 * @author Javier Esteban López Peña
 * @author Andrés Felipe Dávila Gutierrez
 */
public class PowerBonusScore implements GameScore{
    /**
     * @throws hangman.exceptions.ExceptionValorInvalido
     * @pre correctCount numero entero, incorrectCount numero entero
     * @pos  se le suma 5 puntos por una $i-ésima$ letra correcta y se le resta 
     * la multiplicación de incorrectCount por 8
     * @param correctCount Numero de respuestas correctas de la persona
     * @param incorrectCountNumero Numero de respuestas correctas de la persona
     * @return score
     */
    public int calculateScore(int correctCount, int incorrectCount) throws ExceptionValorInvalido
    {
    }
}

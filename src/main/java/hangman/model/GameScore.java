/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman.model;
/**
 *
 * @author Javier Esteban López Peña
 */
public interface GameScore {
    /**
     * @throws hangman.exceptions.ExceptionValorInvalido
     * @pre correctCount numero entero, incorrectCount numero entero
     * @pos  se calcula el puntaje teniendo en cuenta los parametros
     * @param correctCount Numero de respuestas correctas de la persona
     * @param incorrectCountNumero Numero de respuestas correctas de la persona
     * @return score
     */
    public int calculateScore(int correctCount, int incorrectCount) throws ExceptionValorInvalido
    {
    }
}



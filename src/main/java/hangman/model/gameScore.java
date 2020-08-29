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
public interface GameScore {
    /**
     * @param incorrectCount
     * @throws hangman.exceptions.ExcepcionValorInvalido
     * @pre correctCount numero entero, incorrectCount numero entero
     * @pos  se calcula el puntaje teniendo en cuenta los parametros
     * @param correctCount Numero de respuestas correctas de la persona
     * @param incorrectCountNumero Numero de respuestas correctas de la persona
     * @return score
     */
    public int calculateScore(int correctCount, int incorrectCount);
}



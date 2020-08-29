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
public class OriginalScore implements GameScore{
   /**
     * @throws hangman.exceptions.ExcepcionValorInvalido
     * @pre correctCount numero entero, incorrectCount numero entero
     * @pos  se le resta la multiplicación de incorrectCount por 10
     * @param correctCount Numero de respuestas correctas de la persona
     * @param incorrectCountNumero Numero de respuestas correctas de la persona
     * @return score
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount)
    {
        int score = 100;
        score -= incorrectCount*10;
        if (score < 0)
        {
            score=0;
        }
        return score;
    } 
}

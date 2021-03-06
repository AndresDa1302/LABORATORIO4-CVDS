/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman.model;

import hangman.exceptions.ExcepcionValorInvalido;

/**
 *
 * @author Javier Esteban López Peña
 * @author Andrés Felipe Dávila Gutierrez
 */
public class BonusScore implements GameScore{
    /**
     * @throws hangman.exceptions.ExcepcionValorInvalido
     * @pre correctCount numero entero, incorrectCount numero entero
     * @pos  se le suma la multiplicacion del correctCount por 10 y se le resta 
     * la multiplicación de incorrectCount por 5
     * @param correctCount Numero de respuestas correctas de la persona
     * @param incorrectCountNumero Numero de respuestas correctas de la persona
     * @return score
     */
    public int calculateScore(int correctCount, int incorrectCount)throws ExcepcionValorInvalido
    {
          if(correctCount<0 || incorrectCount<0) 
        {
            throw new ExcepcionValorInvalido(ExcepcionValorInvalido.mensajeValorInvalido); 
        }
        int score = 0;
        score += correctCount*10;
        score -= incorrectCount*5;
        if (score < 0)
        {
            score=0;
        }
        return score;
    }
}

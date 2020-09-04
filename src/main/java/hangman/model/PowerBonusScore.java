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
public class PowerBonusScore implements GameScore{
    /**
     * @throws hangman.exceptions.ExcepcionValorInvalido
     * @pre correctCount numero entero, incorrectCount numero entero
     * @pos  se le suma 5 puntos elevado $i-ésima$ letra correcta y se le resta 
     * la multiplicación de incorrectCount por 8
     * @param correctCount Numero de respuestas correctas de la persona
     * @param incorrectCount Numero Numero de respuestas correctas de la persona
     * @return score
     */
    public int calculateScore(int correctCount, int incorrectCount)throws ExcepcionValorInvalido
    {
        if(correctCount<0 || incorrectCount<0) 
        {
            throw new ExcepcionValorInvalido(ExcepcionValorInvalido.mensajeValorInvalido); 
        }
        int score = 0;
        score += Math.pow(5,correctCount);
        score -= incorrectCount*8;
        if (score <= 0)
        {
            score=0;
        }else if (score > 500)
        {
            score=500;
        }
        return score;
    }
}

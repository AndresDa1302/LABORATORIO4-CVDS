/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hangman.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import hangman.exceptions.ExceptionValorInvalido;
import hangman.model.BonusScore;
import hangman.model.OriginalScore;
import hangman.model.PowerScore;
import junit.framework.Assert;

/**
 *
 * @author USUARIO
 */
public class GameScoreText {
    
    /**
     * correctCount < 0  throws  ExceptionValorInvalido
     */
    @Test
    public void calculateOriginalScore1()
    {
        OriginalScore score= new OriginalScore();
        try
        {
            int ans = score.calculateScore(-5,0);
        }catch(ExceptionValorValido e)
        {
            assertTrue(true);
        }
    }
    
    /**
     * correctCount > 0  Output  Integer
     */
    
     /**
     * incorrectCount < 0 throws ExceptionValorInvalido
     */
    
    /**
     * incorrectCount > 0 Output Integer
     */
    
    /**
     * correctCount < 0  throws ExceptionValorInvalido
     */
    
    /**
     * (correctCount > 0  && 100+(5^^correctCount)-8*incorrectCount < 500) Output Integer
     * 
     */
    
    /**
     * 100+(5^^correctCount)-8*incorrectCount > 500 Output 500
     */
    
    /**
     *
     * incorrectCount < 0  throws ExceptionValorInvalido
     */
    
    /**
     * (incorrectCount > 0 && 100+(5^^correctCount)-8*incorrectCount < 500) Output Integer
     */
    
     /**
     * correctCount < 0  throws ExceptionValorInvalido
     */
    
    /**
     * correctCount > 0  Output Integer
     */
    
    /**
     * incorrectCount < 0  throws ExceptionValorInvalido
     */
    
     /**
     * incorrectCount > 0  Output Integer
     */
    
     /**
     * CorrectCount = -1 && IncorrectCount=5 throws ExceptionValorInvalido
     */
    
    /**
     * CorrectCount = 5 && IncorrectCount=-1 throws ExceptionValorInvalido
     */
    
     /**
     * CorrectCount = 0 && IncorrectCount=5 
     */
    
     /**
     * CorrectCount = 5 && IncorrectCount=0 
     */
    
     /**
     * CorrectCount = 0 && IncorrectCount=0
     */
    
    /**
     * CorrectCount = -1 && IncorrectCount=5 throws ExceptionValorInvalido
     */
    
     /**
     * CorrectCount = 5 && IncorrectCount=-1 throws ExceptionValorInvalido
     */
    
     /**
     * CorrectCount = 0 && IncorrectCount=5 
     */
    
    /**
     * CorrectCount = 5 && IncorrectCount=0 
     */
    
    /**
     * CorrectCount = 0 && IncorrectCount=0 
     */
    
    /**
     * CorrectCount = -1 && IncorrectCount=5 throws ExceptionValorInvalido
     */
    
    /**
     * CorrectCount = 5 && IncorrectCount=-1 throws ExceptionValorInvalido
     */
    
    /**
     * CorrectCount = 0 && IncorrectCount=5 
     */
    
    /**
     * CorrectCount = 5 && IncorrectCount=0 
     */
    
    /**
     * CorrectCount = 0 && IncorrectCount=0 
     */
}

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
import hangman.exceptions.ExcepcionValorInvalido;
import hangman.model.BonusScore;
import hangman.model.OriginalScore;
import hangman.model.PowerBonusScore;
import java.util.logging.Level;
import java.util.logging.Logger;
import junit.framework.Assert;

/**
 *
 * @author USUARIO
 */
public class GameScoreTest {
    
    /**
     * correctCount < 0  throws  ExceptionValorInvalido
     */
   
    @Test
    public void calculaarPuntajeOriginal1() {
        OriginalScore score = new OriginalScore();
        try{
            int res = score.calculateScore(-2,0);
            assertTrue(false);
        }catch(ExcepcionValorInvalido e){
            assertTrue(true);
        }
    }
        
    
    /**
     * correctCount > 0  Output  Integer
     */
    @Test
    public void calculaarPuntajeOriginal2() {
        OriginalScore score = new OriginalScore();
        int res=-5;
        try {
            res = score.calculateScore(5,0);
        } catch (ExcepcionValorInvalido ex) {
            Logger.getLogger(GameScoreTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(100,res);
        
    }
     /**
     * incorrectCount < 0 throws ExceptionValorInvalido
     */
    @Test
    public void calcularPuntajeOriginal3() {
        OriginalScore score = new OriginalScore();
        try{
            int res = score.calculateScore(0,-2);
            assertTrue(false);
        }catch(ExcepcionValorInvalido e){
            assertTrue(true);
        }
    }
    
    /**
     * incorrectCount > 0 Output Integer
     */
    @Test
    public void calculaarPuntajeOriginal4() {
        OriginalScore score = new OriginalScore();
        int res=-5;
        try {
            res = score.calculateScore(5,5);
        } catch (ExcepcionValorInvalido ex) {
            Logger.getLogger(GameScoreTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(50,res);
        
    }
    
    /**
     * correctCount < 0  throws ExceptionValorInvalido
     */
     @Test
    public void calculaarPuntajePowerBonus1() {
        PowerBonusScore score = new PowerBonusScore();
        try{
            int res = score.calculateScore(-2,0);
           assertTrue(false);
        }catch(ExcepcionValorInvalido e){
            assertTrue(true);
        }
    }
    
    /**
     * (correctCount > 0  && 100+(5^^correctCount)-8*incorrectCount < 500) Output Integer
     * 
     */
    @Test
    public void calculaarPuntajePowerBonus2() {
        PowerBonusScore score = new PowerBonusScore();
        int res=-5;
        try {
            res = score.calculateScore(3,0);
        } catch (ExcepcionValorInvalido ex) {
            Logger.getLogger(GameScoreTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(125,res);
        
    }
    
    /**
     * 100+(5^^correctCount)-8*incorrectCount > 500 Output 500
     */
        @Test
    public void calculateScorePower3() {
        PowerBonusScore score = new PowerBonusScore();
        int res=-5;
        try {
            res = score.calculateScore(5,0);
        } catch (ExcepcionValorInvalido ex) {
            Logger.getLogger(GameScoreTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(500,res);
        
    }
    /**
     *
     * incorrectCount < 0  throws ExceptionValorInvalido
     */
     @Test
    public void calculaarPuntajePowerBonus4() {
        PowerBonusScore score = new PowerBonusScore();
        try{
            int res = score.calculateScore(0,-2);
            assertTrue(false);
        }catch(ExcepcionValorInvalido e){
            assertTrue(true);
        }
    }
    
    /**
     * (incorrectCount > 0 && 100+(5^^correctCount)-8*incorrectCount < 500) Output Integer
     */
    
     @Test
    public void calculaarPuntajePowerBonus5() {
        PowerBonusScore score = new PowerBonusScore();
        int res=-5;
        try {
            res = score.calculateScore(3,3);
        } catch (ExcepcionValorInvalido ex) {
            Logger.getLogger(GameScoreTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(101,res);
        
    }
    
     /**
     * correctCount < 0  throws ExceptionValorInvalido
     */
    
     @Test
    public void calculaarPuntajeBonus1() {
        BonusScore score = new BonusScore();
        try{
            int res = score.calculateScore(-2,0);
            assertTrue(false);
        }catch(ExcepcionValorInvalido e){
            assertTrue(true);
        }
    }
    
    /**
     * correctCount > 0  Output Integer
     */
    @Test
    public void calculaarPuntajeBonus2() {
        BonusScore score = new BonusScore();
        int res=-5;
        try {
            res = score.calculateScore(5,0);
        } catch (ExcepcionValorInvalido ex) {
            Logger.getLogger(GameScoreTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(50,res);
    }  
    /**
     * incorrectCount < 0  throws ExceptionValorInvalido
     */
     @Test
    public void calculaarPuntajeBonus3() {
        BonusScore score = new BonusScore();
        try{
            int res = score.calculateScore(0,-2);
            assertTrue(false);
        }catch(ExcepcionValorInvalido e){
            assertTrue(true);
        }
    }
    
     /**
     * incorrectCount > 0  Output Integer
     */
    @Test
    public void calculaarPuntajeBonus4() {
        BonusScore score = new BonusScore();
        int res=-5;
        try {
            res = score.calculateScore(0,1);
        } catch (ExcepcionValorInvalido ex) {
            Logger.getLogger(GameScoreTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(0,res);
    }  
    
     /**
     * CorrectCount = -1 && IncorrectCount=5 throws ExceptionValorInvalido
     */
    
     @Test
    public void calcularPuntajeOriginalFrontera1(){
        OriginalScore score = new OriginalScore();
        try{
            int res = score.calculateScore(-1,5);
            assertTrue(false);
        }catch(ExcepcionValorInvalido e){
            assertTrue(true);
        }
    }
    
    /**
     * CorrectCount = 5 && IncorrectCount=-1 throws ExceptionValorInvalido
     */
    
     @Test
    public void calcularPuntajeOriginalFrontera2(){
        OriginalScore score = new OriginalScore();
        try{
            int res = score.calculateScore(5,-1);
            assertTrue(false);
        }catch(ExcepcionValorInvalido e){
            assertTrue(true);
        }
    }
    
     /**
     * CorrectCount = 0 && IncorrectCount=5 
     */
    @Test
    public void calcularPuntajeOriginalFrontera3(){
        OriginalScore score = new OriginalScore();
        int res=-5;
        try {
            res = score.calculateScore(0,5);
        } catch (ExcepcionValorInvalido ex) {
            Logger.getLogger(GameScoreTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(50,res);
    }
     /**
     * CorrectCount = 5 && IncorrectCount=0 
     */
        @Test
    public void calcularPuntajeOriginalFrontera4(){
        OriginalScore score = new OriginalScore();
        int res=-5;
        try {
            res = score.calculateScore(5,0);
        } catch (ExcepcionValorInvalido ex) {
            Logger.getLogger(GameScoreTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(100,res);
    }
    
     /**
     * CorrectCount = 0 && IncorrectCount=0
     */
    @Test
    public void calcularPuntajeOriginalFrontera5(){
        OriginalScore score = new OriginalScore();
        int res=-5;
        try {
            res = score.calculateScore(0,0);
        } catch (ExcepcionValorInvalido ex) {
            Logger.getLogger(GameScoreTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        assertEquals(100,res);
    }
    
    /**
     * CorrectCount = -1 && IncorrectCount=5 throws ExceptionValorInvalido
     */
    @Test
    public void calcularBonusFrontera1(){
        BonusScore score = new BonusScore();
        try{
            int res = score.calculateScore(-1,5);
             assertTrue(false);
        }catch(ExcepcionValorInvalido e){
            assertTrue(true);
        }
    }
     /**
     * CorrectCount = 5 && IncorrectCount=-1 throws ExceptionValorInvalido
     */
      @Test
    public void calcularBonusFrontera2(){
        BonusScore score = new BonusScore();
        try{
            int res = score.calculateScore(5,-1);
             assertTrue(false);
        }catch(ExcepcionValorInvalido e){
            assertTrue(true);
        }
    }
     /**
     * CorrectCount = 0 && IncorrectCount=5 
     */
      @Test
    public void calcularBonusFrontera3(){
        BonusScore score = new BonusScore();
        int res=-5;
        try {
            res = score.calculateScore(0,5);
        } catch (ExcepcionValorInvalido ex) {
            Logger.getLogger(GameScoreTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(0,res);
    }
    /**
     * CorrectCount = 5 && IncorrectCount=0 
     */
    @Test
     public void calcularBonusFrontera4(){
        BonusScore score = new BonusScore();
        int res=-5;
        try {
            res = score.calculateScore(5,0);
        } catch (ExcepcionValorInvalido ex) {
            Logger.getLogger(GameScoreTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(50,res);
    }
    
    /**
     * CorrectCount = 0 && IncorrectCount=0 
     */
     
      @Test
    public void calcularBonusFrontera5(){
        BonusScore score = new BonusScore();
        int res=-5;
        try {
            res = score.calculateScore(0,0);
        } catch (ExcepcionValorInvalido ex) {
            Logger.getLogger(GameScoreTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(0,res);
    }
    
    /**
     * CorrectCount = -1 && IncorrectCount=5 throws ExceptionValorInvalido
     */
     @Test
    public void calcularPowerBonusFrontera1(){
        PowerBonusScore score = new PowerBonusScore();
        try{
            int res = score.calculateScore(-1,5);
             assertTrue(false);
        }catch(ExcepcionValorInvalido e){
            assertTrue(true);
        }
    }
    /**
     * CorrectCount = 5 && IncorrectCount=-1 throws ExceptionValorInvalido
     */
    @Test
    public void calcularPowerBonusFrontera2(){
        PowerBonusScore score = new PowerBonusScore();
        try{
            int res = score.calculateScore(5,-1);
             assertTrue(false);
        }catch(ExcepcionValorInvalido e){
            assertTrue(true);
        }
    }
    /**
     * CorrectCount = 0 && IncorrectCount=5 
     */
     @Test
     public void calcularPowerBonusFrontera3(){
        PowerBonusScore score = new PowerBonusScore();
        int res=-5;
        try {
            res = score.calculateScore(0,5);
        } catch (ExcepcionValorInvalido ex) {
            Logger.getLogger(GameScoreTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(0,res);
    }
    /**
     * CorrectCount = 5 && IncorrectCount=0 
     */
      @Test
     public void calcularPowerBonusFrontera4(){
        PowerBonusScore score = new PowerBonusScore();
        int res=-5;
        try {
            res = score.calculateScore(5,0);
        } catch (ExcepcionValorInvalido ex) {
            Logger.getLogger(GameScoreTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(500,res);
    }
    /**
     * CorrectCount = 0 && IncorrectCount=0 
     */
     @Test
    public void calcularPowerBonusFrontera5(){
        PowerBonusScore score = new PowerBonusScore();
        int res=-5;
        try {
            res = score.calculateScore(0,0);
        } catch (ExcepcionValorInvalido ex) {
            Logger.getLogger(GameScoreTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        assertEquals(1,res);
    
	}
	 @Test
    public void calcularPowerBonusFrontera51(){
        PowerBonusScore score = new PowerBonusScore();
        int res=-5;
        try {
            res = score.calculateScore(0,0);
        } catch (ExcepcionValorInvalido ex) {
            Logger.getLogger(GameScoreTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        assertEquals(1,res);
    }
    
}

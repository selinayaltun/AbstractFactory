/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SELİNAY
 */
public class BlackColorFactory implements AbstractFactoryforBar{

    @Override
    public ColorForBar createBarColor() {
       return new BlackColor();
    }
    
}

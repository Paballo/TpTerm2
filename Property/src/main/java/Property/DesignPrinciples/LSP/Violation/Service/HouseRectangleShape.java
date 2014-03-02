/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Property.DesignPrinciples.LSP.Violation.Service;

/**
 *
 * @author donkey
 */
public class HouseRectangleShape {
    
    
   protected int r_breadth;
   protected int r_length;

    public void setR_breadth(int r_breadth) {
        this.r_breadth = r_breadth;
    }

    public void setR_length(int r_length) {
        this.r_length = r_length;
    }

    public int getR_breadth() {
        return r_breadth;
    }

    public int getR_length() {
        return r_length;
    }
   
   public int getArea()
   {
       return r_breadth * r_length;
   }
    
}

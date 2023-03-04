/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package record_class_implement;

/**
 *
 * @author bhayu
 */
public class Record_class_Implement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        
        try
        {
              new UI().getVal();
           //   throw new Custom_Exception("Thrown !!!");
        }
        catch(Exception a)
        {
              a.printStackTrace();
        }
   
    }
    
}

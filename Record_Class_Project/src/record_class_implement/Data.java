/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package record_class_implement;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author bhayu
 */
public record Data (int id,String data,String file)  


{

    static int to_check=0;

    public     Data
                {
                    //Default Set krne k liye

                    if(id>100)
                        throw new NumberFormatException("Value Greater than limit");
                
                }
    
                               
                             
}

                                 

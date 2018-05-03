/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neural_networks;

import java.util.ArrayList;

/**
 *
 * @author simon
 */
public class Neurone {
    private int MIN = 1;
    private int MAX = 40;
    private ArrayList connection_weight = new ArrayList();
    private int layer_number;
    private int number_per_layer;
    
    public Neurone(){
        
    }
    
    
    
    public void initialisation_weight(){
        for(int i=0;i<layer_number;++i){
            
            connection_weight.add((int)( Math.random()*( MAX - MIN ) ) + MIN );
        }
        

}
    public double get_output(){
       double output = 0.0;
       return output;
    }
}



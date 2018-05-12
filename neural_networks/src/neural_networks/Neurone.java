/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neural_networks;

import java.util.ArrayList;
import static neural_networks.Network.get_inputs_size;

/**
 *
 * @author simon
 */
public class Neurone {
    private int MIN = 1;
    private int MAX = 40;
    private ArrayList connection_weight = new ArrayList();
    private ArrayList outputs = new ArrayList();
    private ArrayList inputs = new ArrayList();
    
    
    private int layer_number;
    private int number_in_layer;
    
    public Neurone(int layer_number_c, int number_in_layer_c){
        layer_number = layer_number_c;
        number_in_layer = number_in_layer_c;
    }
    
    
    
    public void initialisation_weight(){
        for(int i=0;i<layer_number;++i){
            
            connection_weight.add((int)( Math.random()*( MAX - MIN ) ) + MIN );
        }
        

}
    
    public void compute_total_input(){
        double total_input= 0;
        int number_inputs = get_inputs_size(layer_number);
        for(int i =0; i<inputs.size();++i){
            total_input += (double)inputs.get(i);
        }
    }
    
    public double get_output(int number_neuron_in_layer){
        return((double)outputs.get(number_neuron_in_layer));
        
    }
    
    public void compute_output(int number_neuron_per_layer, double total_input){
        for(int i = 0 ; i< number_neuron_per_layer;++i){
            outputs.add((double)connection_weight.get(i)* total_input);
        }
        
    }
    public double get_output(){
       double output = 0.0;
       return output;
    }
}



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neural_networks;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import neural_networks.Neurone;

/**
 *
 * @author simon
 */
public class Network {
    
    
    static int number_layer = 0;
    static int number_neurons_per_layer = 0;
    static ArrayList<ArrayList> layer = new ArrayList();
    
    
    
    static void construct_network() throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("how many hidden layer do you want ? \n");
        int number_layer = sc.nextInt();
        System.out.println(number_layer);
        System.out.println("how many neurones per layer do you want ? \n");
        int number_neurons_per_layer = sc.nextInt();
        System.out.println(number_layer);
        put_neurons_in_array();
        
    }
    
    static int get_inputs_size(int i){
        return layer.get(i-1).size();
    }
    
    static ArrayList<Neurone> getNeuronsBefore(int layer_number){
        return layer.get(layer_number-1);
    }
    
    static void put_neurons_in_array(){
        ArrayList neuron_entry_list = new ArrayList();
        layer.add(neuron_entry_list);
        Entry_neurone entry_neurone = new Entry_neurone(0,0);
        neuron_entry_list.add(entry_neurone);
        
        for(int i = 1 ; i< number_layer+1 ;++i){
            ArrayList neuron_in_layer = new ArrayList();
            layer.add(neuron_in_layer);
            for(int j = 0 ; j < number_neurons_per_layer ;++j){
                Neurone neurone = new Neurone(i,j);
                neuron_in_layer.add(neurone);
                
            }
        }
        
        ArrayList neuron_output_list = new ArrayList();
        layer.add(neuron_output_list);
        OutputNeurone output_neurone = new OutputNeurone(number_layer+1,0);
        neuron_entry_list.add(entry_neurone);    
    }
    
}

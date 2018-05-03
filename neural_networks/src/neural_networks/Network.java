/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neural_networks;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

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
    
    static void put_neurons_in_array(){
        for(int i = 0 ; i< number_layer ;++i){
            ArrayList neuron_in_layer = new ArrayList();
            layer.add(neuron_in_layer);
            for(int j = 0 ; j < number_neurons_per_layer ;++j){
                layer.get(i).add(Neurone neurone = new Neurone());
                
            }
        }
    }
    
}

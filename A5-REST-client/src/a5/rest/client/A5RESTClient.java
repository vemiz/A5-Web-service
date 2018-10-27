/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a5.rest.client;



/**
 *
 * @author tomas
 */
public class A5RESTClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        runExample(2);
    }
 static void runExample(int num){
    if(num==1){
        get_example example = new get_example("104.248.47.74", 80);
        example.doExampleGet(); //http://104.248.47.74/dkrest/test/get
    }
    if(num==2){
        get_example example = new get_example("104.248.47.74", 80);
        example.doExampleGet2(); //http://104.248.47.74/dkrest/test/get2
    }
 } 
}

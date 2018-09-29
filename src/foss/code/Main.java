/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
package foss.code;

/**
 *
 * @author P P Sandaruwan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // TODO code application logic here
        int input;
        while(true){
            System.out.println("Select What you want to do\nPress 1 to create Graph\nPress 2 to print the graph\nPress any number to exit the programe");
            input=scan.nextInt();
            if(input==1){
                int inpu;
                System.out.println("Enter the 1st vertex:");
                inpu=scan.nextInt();
                
                //create graph and enter 1st element
                int inp;
                while(true){
                    System.out.println("\nPress 1 for add another vertex if not  enter any number to exit this stage ");
                    inp=scan.nextInt();
                    if(inp==1){
                        int vertex;
                        System.out.println("Enter vertex:");
                        vertex=scan.nextInt();
                        //make vertex
                        
                        int firstedge;
                        System.out.println("Enter 1st edge other side: ");
                        firstedge=scan.nextInt();
                        //input 1st edge
                        while(true){
                            int i;
                            System.out.println("\nPress 1 for add another edge and if not press any number");
                            i=scan.nextInt();
                            if(i==1){
                                int nxtedg;
                                System.out.println("Enter value of other edge:");
                                nxtedg=scan.nextInt();
                            }else{
                                break;
                            }
                        }
                    }else{
                     break;   
                    }
                }
            }else if(input==2){
                //System.out.println(2);
                //print the created graph
            }else{
                System.out.println("error");
                break;
            }
    }
    }
    
}

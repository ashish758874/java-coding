/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swapping;

/**
 *
 * @author ashish
 */
import java.io.*;
public class Swapping 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException
    {
        int a,b,c;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the value of a");
        a=Integer.parseInt(br.readLine());
        System.out.println("Enter The Value of b");
        b=Integer.parseInt(br.readLine());
        System.out.println("Before Swapping value of a= "+a);
        System.out.println("b= "+b);
        
        
        c=a+b;
        a=c-a;
        b=c-b;
        System.out.println("a="+a);
        System.out.println("b="+b);
        // TODO code application logic here
    }
    
}

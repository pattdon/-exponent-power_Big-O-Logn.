/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author patta
 * exponent power Big(O) l
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(pow(2,4000));
    }
    public static long pow(long x,int n){
        if(n == 0){
            return 1;
        }
        if(n == 1 ){
            return x;
        }
        if(isEven(n)){
            return pow(x*x,n/2);
        }else{
            return pow(x*x,n/2)*x;
        }
    }
    public static boolean isEven(int n){
        Boolean key = false;
        if(n % 2 == 0){
            key = true;
        }
        return key;
    }
}














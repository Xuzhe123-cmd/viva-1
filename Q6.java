package WIX1002.viva.viva1;

import java.util.Scanner;
public class Q6{
    public static void main(String[]args){
        Scanner input= new Scanner (System.in);

        //Number of log strings to be tested
        int T=input.nextInt();
            
        //create a array of size T to store all the
        String[]compressed=new String[T];
        
        //loop for T times
        for (int i=0; i<T; i++){
            compressed[i]=input.next();
        }
                
        for(int i=0; i<T; i++){
            int length=0;
            boolean invalid = false;

            //rules A
            if(Character.isDigit(compressed[i].charAt(0))){
                System.out.print("Invalid Log ");
                continue;
            }

            //loop to check each character in th elog
            for (int j=0; j<compressed[i].length();j++){

                //store current character
                char current= compressed[i].charAt(j);

                //current character is letter
                if(Character.isLetter(current)){
                    length++;
                }
                //current character is digit
                else if(Character.isDigit(current)){

                    //rules B
                    if(current=='0'||current=='1'){
                        invalid=true;
                        break;
                    }

                    //rules C
                    char prev= compressed[i].charAt(j-1);
                    if (Character.isDigit(prev)){
                        invalid=true;
                        break;
                    }

                    //change char to int and add d-1 time to length
                    int d=current-'0';
                    length+=(d-1);
                    
                }
                

            }
            if (invalid) {
                System.out.print("Invalid Log ");
            } else {
                System.out.print(length+ " ");
            }
           
        }
    }
}
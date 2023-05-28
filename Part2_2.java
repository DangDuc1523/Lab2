package Part2;

import java.util.Scanner;

public class Part2_2 {
    public String inputString() throws Exception{
        String s;
        String pattern ="SE\\d{3}";
        Scanner sc = new Scanner (System.in);
            System.out.println("input the string: ");
        s = sc.nextLine();
        if(! s.matches(pattern)){
             throw new Exception();}
        return s;
    }
    
    public static void main(String[] args){
      Part2_2 obj = new Part2_2();
        boolean cont = false;
      do{
        try{
            String s = obj.inputString();
        System.out.println("The string is "+ s);
        cont = false;
        }catch(Exception e){
          System.out.println("The string is invalid");
          cont = true;
        }
      }while(cont);
    }
}

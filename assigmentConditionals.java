import java.util.*;

import javax.swing.text.html.parser.Element;
public class assigmentConditionals {
    
    public static void main(String[] args) {
        /* Q1 - Write a program which takes the values of length and breadth from user and check if it is
a square or not. 
        input 
        l = 5 
        b  = 4 
        output :rectangle 

*/  
        Scanner sc = new Scanner(System.in) ;

        int length = sc.nextInt() ;
        int width = sc.nextInt() ;

        if (length == width ){

            System.out.println("it is square");
        }else{
            System.out.println("it is rectangle");

        }


        int input = sc.nextInt() ;
        if(input<0){
            System.out.println((input)*(-1));
        }else{
            System.out.println(input);
        }

        /* Write a program to take input from user for Cost Price (C.P.) and Selling Price(S.P.) and
        calculate Profit or Loss. */

        System.out.println("enter cost price");
        int costPrice = sc.nextInt() ;
        System.out.println("enter selling price");
        int sellingPrice = sc.nextInt() ;

        if(sellingPrice>costPrice){
            System.out.println("profit : " + (sellingPrice - costPrice));
        }else{
            System.out.println("loss :" + (costPrice -sellingPrice ));
        }
        /* 4000
           9560
           profit : 5560 */

           /* Write a program to print positive number entered by the user, if user enters a negative
            number, it is skipped 
            
            Sample Input :
            Sample Output :

            Enter an integer: -6
            The number is negative and skipped*/

            int x ;
            System.out.println("enter number ");
            x = sc.nextInt() ;
            if(x>=0){
                System.out.println("you enter positive number");
            }else{
                System.out.println("you enter negative number and skipped");
            }

            /* Create a calculator using switch statement to perform addition, subtraction, multiplication
            and division. */
            int num1 = 6 ;
            int num2 = 8 ;
            System.out.println("enter opreator");
            char oprator = sc.next().charAt(0);
            int ans =0 ;
            switch (oprator) {
                case '+' :
                     ans = num1 + num2 ;
                    System.out.println(num1 + " + " + num2 +"=" + ans );
                    break;
                case '-' :
                     ans = num1 - num2 ;
                    System.out.println(num1 + " -" + num2 +"="+ ans );
                    break;
                case '/' :
                     ans = num1 /num2 ;
                    System.out.println(num1 + " / " + num2 +"="+ ans );
                    break;
                case '*' :
                     ans = num1 * num2  ;
                    System.out.println(num1 + " * " + num2 +"="+ ans );
                    break;
            
                default:
                System.out.println("error ! the oprator is not correct ");
                    break;
            }




            /* Write a program to calculate marks to grades . Follow the conversion rule as given below : */
            System.out.println("enter your marks");
            int marks =sc.nextInt() ;

            if (marks >= 90) {
                System.out.println("grade :A+ " );
            } else if(marks >=80){
                System.out.println("grade :A ");

            }else if(marks >= 70){
                System.out.println("grade :B+");
            }else if(marks >=60){
                System.out.println("grade :B");
            }else if(marks >= 50){
                System.out.println("grade : c");
            }else if(marks >=40){
                System.out.println("grade : E");
            }else {
                System.out.println("grade : F");
            }

    }
}

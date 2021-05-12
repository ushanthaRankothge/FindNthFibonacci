/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fibonaccipackage;
import java.util.*;
/**
 *
 * @author UR
 */
public class FindFibonacci {


public static void main (String[] args)
{
int fibNthNum; 
Scanner scanner = new Scanner (System.in);
System.out.println("please enter the nth fib number you want?");
fibNthNum = scanner.nextInt();
FindFibonacci fibonacci = new FindFibonacci();
System.out.println(fibonacci.calculateFibonacci(fibNthNum));
}

int fib;
//calcuate the nth fib number 
protected int calculateFibonacci(int nthFib)
{
if (nthFib == 0)
{
return fib = 0;
}
else if (nthFib == 1)
{
return fib = 1;
}
else
{
return calculateFibonacci(nthFib - 1) + calculateFibonacci(nthFib - 2);
}
}

}

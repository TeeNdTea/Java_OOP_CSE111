//Task1

import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        
        // A
        int var1 = 10;
        System.out.println("Initial value of var1: " + var1);
        
        // B
        int var2 = 20;
        var1 += var2;
        System.out.println("Value of var1 after adding var2: " + var1);
        
        // C
        int prod, div;
        prod = var1 * var2;
        System.out.println("Product is = " + prod);
        div = var1 / var2; 
        System.out.println("Division is = " + div);
        
        // D
        double var3 = 10.45;
        System.out.println("Initial value of var3: " + var3);
        
        double var4 = 20.85;
        var3 += var4;
        System.out.println("Value of var3 after adding var4: " + var3);
        
        double prod1, div1;
        prod1 = var3 * var4;
        System.out.println("Product for double variables = " + prod1);
        div1 = var4 / var3;
        System.out.println("Division for double variables = " + div1);
        
        //E
        int var5 = 5;
        System.out.println("Initial value of var5: " + var5);
        
        double var6 = 45.20;
        var5 += var6;
        System.out.println("Value of var5 after adding var6: " + var5);
        
        double prod2, div2;
        prod2 = var5 * var6;
        System.out.println("Product for double variables = " + prod2);
        div2 = var5 / var6;
        System.out.println("Division for double variables = " + div2);
        
        //F

        int var = 5;
        String res = "Java";
        System.out.println("Integer and String: " + (var+res));
        String s = "Hello";
        int q = 9;
        System.out.println("String and Integer: " + (s+q));
     
        //G
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int a,b;
        System.out.print("Enter 1st input:");
        a = sc1.nextInt();
        System.out.println("You First Input Is : "  + a);
        System.out.print("Enter 2nd input:");
        b = sc2.nextInt();
        a+=b;
        System.out.println("Your Result Is: " + a);
        
    }
}

//Task2

public class Task2{
  public static void main(String[]args){
    
    //Creating third variable
    int a=10;
    int b = 20;
    int n;
    n = a;
    a = b;
    b = n;
    System.out.println("Value of a = " + a);
    System.out.println("Value of b = " + b);
    
    //Without any variable
    int p = 15;
    int q = 25;
    p = p+q;
    q = p-q;
    p = p-q;
    System.out.println("Value of p = " + p);
    System.out.println("Value of q = " + q);
    
  }
}

//Task3

import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id;
        System.out.print("Enter student ID: ");
        id = sc.nextInt();
        int dig1 = id % 10;
        int dig2 = (id / 10) % 10;
        System.out.println(dig1);
        System.out.println(dig2);
    }
}

//Task4

import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n;
        n = sc.nextInt();
        if (n > 0) {
            System.out.println(n + " x 1 = " + n);
            System.out.println(n + " x 2 = " + (n * 2));
            System.out.println(n + " x 3 = " + (n * 3));
            System.out.println(n + " x 4 = " + (n * 4));
            System.out.println(n + " x 5 = " + (n * 5));
            System.out.println(n + " x 6 = " + (n * 6));
            System.out.println(n + " x 7 = " + (n * 7));
            System.out.println(n + " x 8 = " + (n * 8));
            System.out.println(n + " x 9 = " + (n * 9));
            System.out.println(n + " x 10 = " + (n * 10));
        } 
        else {
            System.out.println("Invalid input");
        }
    }
}

//Task5

import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        
        int a,b,c;
        System.out.print("Enter 1st num: ");
        a = sc1.nextInt();
        System.out.print("Enter 2nd num: ");
        b = sc2.nextInt();
        System.out.print("Enter 3rd num: ");
        c = sc3.nextInt();
        
        if (a>b && a>c) {
            System.out.print("Largest number: " + a);
        }
        else if(b>a && b>c){
          System.out.print("Largest number: " + b);
        }
        else {
            System.out.println("Largest number: " +c);
        }
    }
}


//Task6

import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y;
        System.out.print("Enter a Year: ");
        y = sc.nextInt();

        if (y % 4 == 0) {
            if (y % 100 != 0 || y % 400 == 0) {
                System.out.println(y + " is a leap year");
            } 
            else {
                System.out.println(y + " is not a leap year");
            }
        } 
        else {
            System.out.println(y + " is not a leap year");
        }
    }
}

//Task7

import java.util.Scanner;
public class Task7{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
     int a;
    System.out.print("Enter a number:");
    a = sc.nextInt();
    if(a%2 == 0 && a%5 ==0){
      System.out.println("Divisible by 5 and 7 both");
    }
    else if(a%5 == 0){
      System.out.println("Invalid: Divisible by 5 Only");
    }
    else if(a%7 == 0){
      System.out.println("Invalid: Divisible by 7 Only");
    }
    else{
      System.out.println("No");
    }
  }
}

//Task8

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id;
        System.out.print("Your ID = ");
        id = sc.nextInt();
        id = id/100000;
        int session = id%10;
        id/=10;
        if (session == 1){
          System.out.println("Student Joined BRAC in Spring" + id );
        }
        else if (session == 2){
          System.out.println("Student Joined BRAC in Fall" + id);
        }
        else{
          System.out.println("Student Joined BRAC in Summer" + id);
        }
    }
}


//Task9

import java.util.Scanner;
public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double cg;
        int credits;

        System.out.print("Your CGPA = ");
        cg = sc.nextDouble();

        System.out.print("Credits Completed = ");
        credits = sc.nextInt();

        int wav = 0;
        if (credits >= 30 && cg >= 3.80) {
            if (cg >= 3.80 && cg <= 3.89) {
                wav = 25;
            } 
            else if (cg >= 3.90 && cg <= 3.94) {
                wav = 50;
            } 
            else if (cg >= 3.95 && cg <= 3.99) {
                wav = 75;
            } 
            else if (cg == 4.00) {
                wav = 100;
            }
            System.out.println("The student is eligible for a waiver of " + wav + " percent");
        } 
        else {
            System.out.println("The student is not eligible for a waiver");
        }
    }
}


//Task10

import java.util.Scanner;
public class Task10{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
     int a;
    System.out.print("Enter a number:");
    a = sc.nextInt();
    if(a%2 == 0 || a%5 ==0){
      System.out.println("Multiple of 2 and 5 both");
    }
    else{
      System.out.println("Not a multiple we want");
    }
  }
}

//Task11

import java.util.Scanner;
public class Task11{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int x,res;
    System.out.print("Enter a number:");
    x = sc.nextInt();
    if(x<0){
      res = 2*x;
    }
    else if(x>=0 && x<2){
      res = x+1;
    }
    else if(x>=2 && x<5){
      res = x*x-1;
    }
    else{
      res = 3*x*x + 2;
    }
    System.out.println("Result is = " + res);
  }
}
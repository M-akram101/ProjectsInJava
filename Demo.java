
import java.io.BufferedReader;
////1
// class Calculator {
//     int a;
//     public int add (int a,int b){
//         int r = a+b;
//         System.out.println("added");
//         return r;
//     }
// }

// public class demo {

//     // main is a method, a start of execution 
//     public static void main(String a[]){
//         // primitive variable
//         int num1  = 9;
//         int num2 = 5;
       
//         // reference variable
//         Calculator calc = new Calculator() ;
//         int result = calc.add(4,5);
//         System.out.println(result);
            

// }
    
// }

// Object oriented programming
// Object properties & behaviours

// !st create a class
////2 
// class Computer {
//     //behaviour
//     public void playMusic(){
//         System.out.println("Music Playing..");

//     }

//     public String getMeAPen(int cost){
//         if (cost > 1)
//         return "Pen";

//         return "nothing";
//     }
// }

// public class demo {

//     // main is a method, a start of execution 
//     public static void main(String a[]){
//     Computer obj = new Computer();
//     obj.playMusic();
//     String value = obj.getMeAPen(4);
//     System.out.println(value);

// }
    
// }

/////2
// class Calculator {
//     public int add(int n1, int n2){
        
//         return n1 + n2;
//     }
    
//     public int add(int n1, int n2, int n3){
        
//         return n1 + n2+n3;
//     }
    
//     public int add(int n1, int n2, int n3,int n4){
        
//         return n1 + n2+n3+n4;
//     }
    
// }

// public class demo {

//     // main is a method, a start of execution 
//     public static void main(String a[]){
//         Calculator obj = new Calculator();
//         int r1 = obj.add(3,5,9);
//         System.out.println(r1);
    

// }
    
// }

//Array 
// public class main {

//     public static void main (String a[]){
//         // int nums[] = {3,7,2,4};
//     //     int nums[] = new int[4];
//     //     for (int i=0; i<4;i++){
//     //         System.out.println(nums[i]);
//     //     }        System.out.println(nums[1]);
//     // }

//     int nums1[][] = new int[3][4];
//     // for (int i=0;i<3;i++){
        
//     //     for (int j=0;j<4;j++){
//     //         nums1[i][j] = (int)(Math.random()*10);
//     // System.out.println(nums1[i][j]);
//     //     }
//     //     System.out.println();
//     // }

//     for (int n[]: nums1){
//         for (int m:n){
//             m = (int)(Math.random()*10);
//             System.out.println(m+"");
//         }
//         System.out.println();
//     }
// }}
// Jagged array
// public class main {

//     public static void main (String a[]){
//         int nums[][]= new int[3][];
//         nums[0]=new int[3];
//         nums[1]=new int[4];
//         nums[2]=new int[2];


//    for (int n[]:nums){
//     for (int m : n){
//         m= (int)(Math.random()*10);
//         System.out.println(m);
//     }
//    }
// }}
// draw backs 

// public class main {

//     public static void main (String a[]){
//         int nums[][]= new int[3][];
//         nums[0]=new int[3];
//         nums[1]=new int[4];
//         nums[2]=new int[2];


//    for (int n[]:nums){
//     for (int m : n){
//         m= (int)(Math.random()*10);
//         System.out.println(m);
//     }
//    }
// }}
// Array of objects
//  class Student {
//     int rollno;
//     String name;
//     int marks;
// }
//  class Demo{

//     public static void main(String a[]) {
//         Student s1 = new Student();
//         s1.rollno =9;
//         s1.name = "Kika";
//         s1.marks = 100;
//         Student s2 = new Student();
//         s2.rollno =9;
//         s2.name = "Kika";
//         s2.marks = 100;
//         Student s3 = new Student();
//         s3.rollno =9;
//         s3.name = "Kika";
//         s3.marks = 100;

//         Student students[]= new Student[3];
//         students[0] = s1;
//         students[1] = s2;
//         students[2] = s3;
//         for (int i=0;i<students.length;i++){
//             System.out.println(students[i].name + ":"+students[i].marks);
//         }
//         for (Student n : students){
//             System.out.println(n.name + ":"+n.marks);
//         }
        
//     }
// }


//// String
/// 
/// 
// public class main {

//     public static void main (String a[]){
//         // String name = new String("kikaaa");
//         // System.out.println("hello "+name);
//         // System.out.println(name.charAt(1));
//         // System.out.println(name.concat("hashem"));
//         String s1 ="kika";
//         String s2 = "kika";
//         s1 = "lobster";
//         System.out.println(s1 == s2);
//         System.out.println(s1);
//         System.out.println(s2);


    
// }}
// public class main {

//     public static void main (String a[]){
//         StringBuffer sb = new StringBuffer("kikaa");
//         System.out.println(sb.capacity());

    
// }}
// class Human {
//     // instance variable
//     private int age;
//     private String name;
//     public int getAge() {
//         return age;
//     }
//     // local variable(age)
//     public void setAge(int age) {
//         this.age = age;
//     }
//     public String getName() {
//         return name;
//     }
//     public void setName(String name) {
//         this.name = name;
//     }
   
    
// }
// public class main {

//     public static void main (String a[]){
//         Human obj = new Human();
//         obj.age = 90;
//         obj.name = "kika";

    
// }}
// class Human {
//     public Human(){
//         s
//     }
//     // instance variable
//     private int age;
//     private String name;
//     public int getAge() {
//         return age;
//     }
//     // local variable(age)
//     public void setAge(int age) {
//         this.age = age;
//     }
//     public String getName() {
//         return name;
//     }
//     public void setName(String name) {
//         this.name = name;
//     }
   
    
// }
// public class main {

//     public static void main (String a[]){
//         Human obj = new Human();
//         obj.age = 90;
//         obj.name = "kika";

    
// }}
// class Human {
    
//     public Human() {
//         this.age = age;
//         this.name = name;
//     }
//     public Human(int a, String n){
//         //parameterized constructor
        
//             this.age = age;
//         this.name = name;
        
//     }
//     // instance variable
//     private int age;
//     private String name;
//     public int getAge() {
//         return age;
//     }
//     // local variable(age)
//     public void setAge(int age) {
//         this.age = age;
//     }
//     public String getName() {
//         return name;
//     }
//     public void setName(String name) {
//         this.name = name;
//     }
   
    
// }
// public class main {

//     public static void main (String a[]){
//         Human obj = new Human();
//         obj.age = 90;
//         obj.name = "kika";

    
// }}
// class Mobile {
//     String brand;
//     int price;
//     String network;

//     public static void show1(){
//         System.out.println();
//     }
// }
// public class main {

//     public static void main (String a[]){

//         Mobile obj1 = new Mobile(); 

    
// }}

// Inheritance


// class A {
//     public A()
//     {
//         System.out.println("in A");
//     }
    

// }
// class B extends A{
//     public B()
//     {
//         System.out.println("in B");
//     }
// }

// public class Demo {
//     public static void main(String a[]){
//         B obj = new B();
//     }
// }
// class A {
//     public void show(){
//         System.out.println("in A show");

//     }
    



//     @Override
//     public String toString() {
//         return "A []";
//     }
    

// }
// class B extends A{
//     public B()
//     {
//         System.out.println("in B");
//     }
// }

// public class Demo {
//     public static void main(String a[]){
//         A obj = new A();
//         obj.show();
//     }

// }

// abstract class Car {
//     // Giving abstract idea that a car need to have drive feature
//     public abstract void drive();

//     public void playMusic(){
//         System.out.println("play music");
//     }
//     public abstract void fly();
// }
// class WaggonR extends Car {
//     public void drive(){
//         System.out.println("Driving..");
//     }
//     public void fly(){
//         System.out.println("Flying....");
//     }
// }
// public class Demo {
//     public static void main (String a[]){
//         Car obj = new WaggonR();
//         obj.drive();
//         obj.playMusic();
//     }
// }

// class A {
//     int age;

//     public void show(){
//         System.out.println("in show");
//     }
//     class B {
//         public void config()
//         {
//             System.out.println("in config");
//         }
//     }
// }
// public class Demo {
//     public static void main (String a[]){
//         A obj = new A();
//         obj.show();

//         A.B obj1 =  obj.new B();
//         obj1.config();
//     }
// }
// class A {
//     int age;

//     public void show(){
//         System.out.println("in show");
//     }
//     class B {
//         public void config()
//         {
//             System.out.println("in config");
//         }
//     }
// }
// public class Demo {
//     public static void main (String a[]){
//         A obj = new A();
//         obj.show();

//         A.B obj1 =  obj.new B();
//         obj1.config();
//     }
// }
// class A {
//     int age;

//     public void show(){
//         System.out.println("in show");
//     }
//     class B {
//         public void config()
//         {
//             System.out.println("in config");
//         }
//     }
// }
// public class Demo {
//     public static void main (String a[]){
//         A obj = new A();
//         obj.show();

//         A.B obj1 =  obj.new B();
//         obj1.config();
//     }
// }
///// Annonymous inner class
// class A {
//     int age;

//     public void show(){
//         System.out.println("in show");
//     }
   
// }
// public class Demo {
//     public static void main (String a[]){
//         A obj = new A(){
//             public void show(){
//                 System.out.println("in new Show");
//             }
//         };
//         obj.show();

       
//     }
// }
// abstract class A {
//     int age;

//     public abstract void show();
//     class B extends A{
//         public void show(){
//             System.out.println("in b show");
//         }
//     }
   
// }
// public class Demo {
//     public static void main (String a[]){
//         A obj = new A(){
//             public void show(){
//                 System.err.println("in new shows");
//             }
//         };

       
//     }
// }
// abstract class A {
//     int age;

//     public abstract void show();
//     class B extends A{
//         public void show(){
//             System.out.println("in b show");
//         }
//     }
   
// }
// public class Demo {
//     public static void main (String a[]){
//         A obj = new A(){
//             public void show(){
//                 System.err.println("in new shows");
//             }
//         };

       
//     }
// }
// interface A {
//     int age=44;
//     String area = "Mumbai";
//     void show();
//     void config();
    
// }
// class B implements A {
//     public void show(){
//         System.out.println("here is show");
//     }
//     public void config(){
//         System.out.println("Here is confg");
//     }
// }
// public class Demo {
//     public static void main (String a[]){
//         A obj;
//         obj = new B();
//         obj.show();
//         obj.config(){
//             System.out.println();
//         }

       
//     }
// }
// 
// // why inteface 
// class Computer {
//     public void code(){

//     }
// }
// class Laptop extends Computer {
//     public void code(){
//         System.out.println("code, compile faster, run");
//     }
// }
// class Desktop extends Computer {
//     public void code(){
//         System.out.println("code, compile, run");
//     }
// }
// class Developer {
//     public void devApp(Computer lap){
//         lap.code();
//     }
// }
// public class Demo {
//     public static void main (String a[]){

//         Computer desk = new Desktop();
//         Computer sony = new Laptop();

//         Developer navin = new Developer();

//         navin.devApp(desk);
//         }

       
//     }
// Enum

// enum Status {
//     Running, Failed, Pending, Success;
// }

// public class Demo {
//     public static void main (String a[]){
//         int i = 5;
//         Status s = Status.Running;
//         System.out.println(s);   
//         System.out.println(s.ordinal());   

       
//     }}

// enum if else switch


// enum Status {
//     Running, Failed, Pending, Success;
// }

// public class Demo {
//     public static void main (String a[]){
//        Status s = Status.Pending;
//         switch(s){
//             case Running:
//                 System.out.println("All good");
//                 break;
//             case Pending:
//                 System.out.println("Please Wait");
//                 break;
//             case Failed:
//                 System.out.println();
//                 break;
//             default:
//                 System.out.println("Done");
//                 break;
            

//         }
//        if (s == Status.Running)
//         System.out.println("All Good");
//        else if (s == Status.Failed)
//         System.out.println("Try AGain");
       


       
//     }}
// enum Laptop {
//     Macbook(2000),XPS(2200),Surface(1500),Thinkpad(1800);

//     private int price;

//     private Laptop(int price) {
//         this.price = price;
//     }

//     public int getPrice() {
//         return price;
//     }

    
// }

// public class Demo {
   
//        public static void main (String a[]){
//     //     Laptop lap = Laptop.Macbook;
//     //    System.out.println(lap.getPrice());
        
//         for (Laptop lap : Laptop.values()){
//             System.out.println(lap + ":"+lap.getPrice());
//         }
//     }


       
//     }

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// @FunctionalInterface
// interface A {
//     // void show(int i, int j);
//     int add(int i, int j);
    
// }
// class B implements A{
//     public void show(){
//         System.out.println("in show");
//     }
//     public void add(){
//         System.out.println("in show");
//     }
// }

// public class Demo {
   
//        public static void main (String a[]){
    
    

//     // A obj = new A(){
//     //     public void show(){
//     //         System.out.println("Not wrong");
//     //     }
//     // A obj = ( i,  j) -> 
//     //     System.out.println("Inside");
   
//     //     obj.show(3,2);

//     A obj = (i,j) -> i+j;
//     int result = obj.add(5,4);
//     System.out.println(result);
//     };
//     }
// class KikaException extends Exception {
//     public KikaException(String string){
//         super(string);
//     }
    
// }
// public class Demo {
   
//        public static void main (String a[]){
    
    

//     int i = 0;
//     int j = 0;

//     try {
//         j=18/i;
//         if (j==0)
//             throw new KikaException("I dont want to print zero");
//     }
//     catch(KikaException e){
//         j = 18/1;
//         System.out.println("Thats the default Output "+e );
//     }
//     catch (Exception e){
//         System.out.println("Something went wrong!  "+ e);
//     }
//     System.out.println(j);
//     System.out.println("Bye");

//     };
//     }

// public class Demo {
   
//        public static void main (String a[]) throws IOException{
    
//     System.out.println("Enter a Number: ");
//     //1
//     // int num = System.in.read();
//     // // returns asci value
//     // System.out.println(num-48);
    
//     //
//     InputStreamReader in = new InputStreamReader(System.in);
//     //2 
//     // BufferedReader bf = new BufferedReader(in);
//     // int num = Integer.parseInt(bf.readLine());
//     // bf.close();

//     //3
//     Scanner sc = new Scanner(System.in);
//     int num = sc.nextInt();
//     System.out.println(num);
    
    

    // };
    // }

// public class Demo {
   
//        public static void main (String a[]) {
//     int num=0;
//     BufferedReader br = null;

//     try {

//          int nu = 18/0;
//         br = new BufferedReader(new InputStreamReader(System.in));
//        num = Integer.parseInt(br.readLine());
//        System.out.println(num);
//     }
    
//     finally{
//         System.out.println("bYE ");
//         br.close();
//     }
    

//     };
//    
    
       
    

//////////////////////////tHREADSS 
// class A extends Thread {
//     public void run(){
//         for (int i=1;i<100;i++){
//             System.out.println("Hi");
//         }
//     }
// }
// class B extends Thread {
//     public void run(){
//         for (int i=1;i<100;i++){
//             System.out.println("Hello");
//         }
//     }
// }
// public class Demo {
   
//        public static void main (String a[]) {
    
//         A obj1 = new A();
//         B obj2 = new B();
//         obj1.start();
//         obj2.start();


//     }
    

//     };
    
       
    

////////////////////////tHREADSS 
// class A extends Thread {
//     public void run(){
//         for (int i=1;i<100;i++){
//             System.out.println("Hi");
//         }
//     }
// }
// class B extends Thread {
//     public void run(){
//         for (int i=1;i<100;i++){
//             System.out.println("Hello");
//         }
//     }
// }
// public class Demo {
   
//        public static void main (String a[]) {
    
//         A obj1 = new A();
//         B obj2 = new B();
//         obj1.start();
//         obj2.start();


//     }
    

//     };
    
       
    

// class A extends Thread {
//     public void run(){
//         for (int i=1;i<100;i++){
//             System.out.println("Hi");
//         }
//     }
// }
// class B extends Thread {
//     public void run(){
//         for (int i=1;i<100;i++){
//             System.out.println("Hello");
//         }
//     }
// }
// public class Demo {
   
//        public static void main (String a[]) {
    
//         A obj1 = new A();
//         B obj2 = new B();
//         obj1.start();
//         obj2.start();


//     }
    

//     };
    
       
    

class A implements Runnable {
    public void run(){
        for (int i=1;i<5;i++){
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            }
            catch (InterruptedException e){e.printStackTrace();}
        }
        
    }
}
class B implements Runnable {
    public void run(){
        for (int i=1;i<5;i++){
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            }
            catch (InterruptedException e){e.printStackTrace();}
        }
    }
}
public class Demo {
   
       public static void main (String a[]) {
    
        Runnable obj1 = new A();
        Runnable obj2 = new B();
        
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();


    }
    

    };
    
       
    


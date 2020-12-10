package com.Loading;

public class Main {
    String name;
    int emp_id;
    Main(String a,int b){
        name=a;
        emp_id=b;
    }

    public static void main(String[] args) {
        Main m1= new Main("Ram",1);
        Main m2=new Main("Shyam",2);
        System.out.println(m1.name+" "+m1.emp_id);
        System.out.println(m2.name+" "+m2.emp_id);
    }
}

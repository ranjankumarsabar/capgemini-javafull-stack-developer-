package ranjan;

import java.util.Scanner;

public class Atransport {


int w,charge;

String name;

void accept(){// method accept starts

    Scanner ob=new Scanner(System.in);

    System.out.println("Enter the name of customer");

    name=ob.nextLine();

    System.out.println("Enter the weight of parcel");

    w=ob.nextInt();

}// method accept ends

void calculate()

{// method calculate starts

if(w<=10)

charge=w*25;

else if(w<=30)

charge=w*25 +(w-10)*20;

else

charge=10*25+20*20+(w-30)*10;

charge=charge+(5/100)*charge;

} // method calculate ends

void print() // method print begins

{

System.out.println("Name\t weight\t Bill Amount");

System.out.println(name+"\t"+w+"\t"+charge);

} // method print ends

public static void main(String args[])

{// method main starts

Atransport obj=new Atransport();

obj.accept();  

obj.calculate();  

obj.print();

}// method main ends

}
import java.util.Scanner;
public class Canteen {
public static void main(String[] args) {
    String dal="dal fry", pan="paneer butter masala", chick="chicken curry", ff="fish fry", tom="tomato curry", item="";
int dalp=40, panp=100, chickp=120, ffp=100, tomp=30, price=0, i=0;
String[] arr = new String[6];
boolean flag=true;
System.out.println("Welcome to ace restaurant");
System.out.println("enter your name");
Scanner sc=new Scanner(System.in);
String inp=sc.nextLine();
System.out.println("hey "+inp);
while (flag==true){
   System.out.println("select from the menu");
System.out.println("1. dal fry-40");
System.out.println("2. paneer butter masala-100");
System.out.println("3. chicken curry-120");
System.out.println("4. fish curry-100");
System.out.println("5. tomato curry-30");
int y= sc.nextInt();
System.out.println("Enter the quantity");
int x=sc.nextInt();
switch(y){
   case 1: System.out.println("you have selected "+dal+"-"+(dalp*x));
   price=(dalp*x);
   item=dal;
   break;
   case 2: System.out.println("you have selected "+pan+"-"+(panp*x));
   price=(panp*x);
   item=pan;
   break;
   case 3: System.out.println("you have selected "+chick+"-"+(chickp*x));
   price=(chickp*x);
   item=chick;
   break;
   case 4: System.out.println("you have selected "+ff+"-"+(ffp*x));
   price=(ffp*x);
   item=ff;
   break;
   case 5: System.out.println("you have selected "+tom+"-"+(tomp*x));
   price=(tomp*x);
   item=tom;
   break;
}
if (i < arr.length) {
            arr[i] = item;
                i++;
}
int z=sc.nextInt();
sc.nextLine();
if(z==price){
   System.out.println("order placed, kindly wait");
}
else{
   System.out.println("Invalid amount");
}
System.out.println("do u want to continue shopping");
String yn=sc.nextLine();
if(yn.equals("yes")){
   flag=true;
}
else{
   flag=false;
   for(int j=0;j<arr.length;j++){
       System.out.print(arr[j]+",");
   }
}
}
}
}
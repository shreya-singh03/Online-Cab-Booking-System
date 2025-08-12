import java.util.Scanner; 
class Cab  
{ 
public static void main(String args[]) 
{ 
try 
{ 
Scanner sc=new Scanner(System.in); 
System.out.println("WELCOME TO THE CAB BOOKING SYSTEM"); 
System.out.println("Enter your name"); 
String name=sc.nextLine(); 
System.out.println("Enter email"); 
String email=sc.nextLine(); 
System.out.println("Enter the pickup location"); 
String pickup=sc.nextLine(); 
System.out.println("Enter your destinatin or drop off point"); 
String dropoff=sc.nextLine(); 
System.out.println("Enter your mobile number"); 
String mobilenum=sc.nextLine(); 
System.out.println("Enter your mobile number"); 
String date=sc.nextLine(); 
System.out.println("Enter time of your pickup"); 
String time=sc.nextLine(); 
System.out.println("Mode of payment"); 
System.out.println("Enter 1 for online payment "); 
System.out.println("Enter 2 for offline payment "); 
int payment=sc.nextInt(); 
if(payment==1) 
{ 
      System.out.println("You may pay through:"); 
      System.out.println("Net Banking"); 
      System.out.println("UPI"); 
      System.out.println("credit card"); 
      System.out.println("GPay"); 
      System.out.println("Enter your mode"); 
      sc.nextLine(); 
      String mode=sc.nextLine(); 
      System.out.println("This mode is currently unavailable so you may pay through cash"); 
  
 } 
else if(payment==2) 
{ 
      System.out.println("You may pay cash on reaching your destination to your driver"); 
} 
else 
{ 
      System.out.println("Invalid option"); 
} 
System.out.println("enter the size of the car"); 
System.out.println("Enter 1 for 5 seater car"); 
System.out.println("Enter 2 for 8 seater car"); 
int seat=sc.nextInt(); 
switch(seat) 
{ 
    case 1: 
    System.out.println("the list of cars available for 5 seater car are along with prizes"); 
    System .out.println("Wagon R"); 
    System.out.println("Swift"); 
    System.out.println("i10"); 
    System.out.println("Indigo"); 
    System.out.println("Tiago"); 
    System.out.println("Enter your desired car.Please enter the correct spelling of the car "); 
    sc.nextLine(); 
    String car5=sc.nextLine(); 
    if(car5.equalsIgnoreCase("wagonR")) 
    { 
        System.out.println("your car has been booked successfully"); 
        System.out.println("The no of your car is UP70FQ1284"); 
        System.out.println(" the car costs Rs 10/km"); 
        System.out.println(" The name of your driver is golu"); 
        System.out.println("if you want to track your car or have any query you want may contact your driver on 9458036011"); 
        System.out.println("have a happy and safe jouurney!"); 
        System.out.println("thank you"); 
    } 
    else if(car5.equalsIgnoreCase("swift")) 
    { 
                        System.out.println("your car has been booked successfully"); 
                        System.out.println("The no of your car is UP70FL9554"); 
                        System.out.println(" the car costs Rs 10/km"); 
                        System.out.println(" The name of your driver is kamal"); 
                        System.out.println("if you want to track your car or have any query you want may contact your driver on 9458036022"); 
                        System.out.println("have a happy and safe jouurney!"); 
                        System.out.println("thank you"); 
     } 
    else if (car5.equalsIgnoreCase("i10")) 
    {  
                        System.out.println("your car has been booked successfully"); 
                        System.out.println("The no of your car is UP70FR5684"); 
                        System.out.println(" the car costs Rs 10/km"); 
                        System.out.println(" The name of your driver is vineet"); 
                        System.out.println("if you want to track your car or have any query you want may contact your driver on 9458036045"); 
                        System.out.println("have a happy and safe jouurney!"); 
                         
                        System.out.println("thank you"); 
    } 
    else if(car5.equalsIgnoreCase("indigo")) 
    { 
                        System.out.println("your car has been booked successfully"); 
                        System.out.println("The no of your car is UP70FR5684"); 
                        System.out.println(" the car costs Rs 10/km"); 
                        System.out.println(" The name of your driver is vineet"); 
                        System.out.println("if you want to track your car or have any query you want may contact your driver on 9458036045"); 
                        System.out.println("have a happy and safe jouurney!"); 
                        System.out.println("thank you"); 
    } 
    else if(car5.equalsIgnoreCase("tiago"))        
    { 
                          System.out.println("your car has been booked successfully"); 
                        System.out.println("The no of your car is UP70FQ1284"); 
                        System.out.println(" the car costs Rs 10/km"); 
                        System.out.println(" The name of your driver is golu"); 
                        System.out.println("if you want to track your car or have any query you want may contact your driver on 9458036011"); 
                        System.out.println("have a happy and safe jouurney!"); 
                        System.out.println("thank you"); 
      } 
     else 
      { 
                        System.out.println("This car is not avilable"); 
      } 
      break; 
 case 2: 
                    System.out.println("The list of car avilable for 8 seater car along with prizes are"); 
                    System.out.println("Eritiga"); 
                    System.out.println("Innova"); 
                    System.out.println("Safari"); 
                    System.out.println("Fortuner"); 
                    System.out.println("Enter your desired car"); 
                    sc.nextLine(); 
                    String car8=sc.nextLine(); 
                    if(car8.equalsIgnoreCase("ertiga")) 
                    { 
                        System.out.println("your car has been booked successfully"); 
                        System.out.println("The no of your car is UP70FR5684"); 
                        System.out.println(" the car costs Rs 14/km"); 
                        System.out.println(" The name of your driver is vineet"); 
                        System.out.println("if you want to track your car or have any query you want may contact your driver on 9458036045"); 
                        System.out.println("have a happy and safe jouurney!"); 
                        System.out.println("thank you"); 
                    } 
                    else if (car8.equalsIgnoreCase("innova")) 
                    { 
                        System.out.println("your car has been booked successfully"); 
                        System.out.println("The no of your car is UP70FR5684"); 
                        System.out.println(" the car costs Rs 14/km"); 
                        System.out.println(" The name of your driver is vineet"); 
                        System.out.println("if you want to track your car or have any query you want may contact your driver on 9458036045"); 
                        System.out.println("have a happy and safe jouurney!"); 
                        System.out.println("thank you"); 
} 
else if(car8.equalsIgnoreCase("safari")) 
                    { 
                        System.out.println("your car has been booked successfully"); 
                        System.out.println("The no of your car is UP70FR5684"); 
                        System.out.println(" the car costs Rs 14/km"); 
                        System.out.println(" The name of your driver is vineet"); 
                        System.out.println("if you want to track your car or have any query you want may contact your driver on 9458036045"); 
                        System.out.println("have a happy and safe jouurney!"); 
                        System.out.println("thank you"); 
                    } 
                    else if(car8.equalsIgnoreCase("fortuner")) 
                    { 
                        System.out.println("your car has been booked successfully"); 
                        System.out.println("The no of your car is UP70FR5684"); 
                        System.out.println(" the car costs Rs 14/km"); 
                        System.out.println(" The name of your driver is vineet"); 
                        System.out.println("if you want to track your car or have any query you want may contact your driver on 9458036045"); 
                        System.out.println("have a happy and safe jouurney!"); 
                        System.out.println("thank you"); 
                    } 
                    else 
                    { 
                        System.out.println(" not available"); 
                    } 
                    break; 
                default: 
                    System.out.println("please  enter a valid choice between 1 or 2"); 
      
    } 
             
            System.out.println("do you want to cancle your cab (yes or no)"); 
            String cancel=sc.next(); 
            if ( cancel.equalsIgnoreCase("yes")) 
            { 
                System.out.println("your cab has been cancelled successfully"); 
            } 
            else if (cancel.equalsIgnoreCase("No")) 
{ 
                System.out.println("Go ahead with your journey,your car must be reaching you."); 
            } 
            else 
            { 
                System.out.println("Invalid"); 
            } 
        } 
catch(Exception e) 
{ 
System.out.println(e); 
} 
} 
} 


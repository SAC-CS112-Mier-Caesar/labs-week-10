import java.util.Scanner;

public class Cars {

public static void main(String[] args) {

int d;
int c;
int t;
String color;
String name;
Scanner input = new Scanner(System.in);

Automobile myCar = new Automobile();

System.out.println("How many doors does your car have? ");
d = input.nextInt();
myCar.setNumberOfDoors(d);

System.out.println("How many cylinders does your car have? ");
c = input.nextInt();
myCar.setNumberOfCylinders(c);

System.out.println("How many gears does your transmission have? ");
t = input.nextInt();
myCar.setTransmission(t);

System.out.println("What is the color of your car? ");
color = input.nextLine();
myCar.setColor(color);



System.out.println("What is the name of your car? ");
name = input.nextLine();
myCar.setName(name);

///////////////////////////////////////////////////////////

Automobile yourCar = new Automobile();

System.out.println("How many doors does your car have? ");
d = input.nextInt();
yourCar.setNumberOfDoors(d);

System.out.println("How many cylinders does your car have? ");
c = input.nextInt();
yourCar.setNumberOfCylinders(c);

System.out.println("How many gears does your transmission have? ");
t = input.nextInt();
yourCar.setTransmission(t);

System.out.println("What is the color of your car? ");
color = input.nextLine();
yourCar.setColor(color);



System.out.println("What is the name of your car? ");
name = input.nextLine();
yourCar.setName(name);

//////////////////////////////////////////////////////////////////////

Automobile Car3 = new Automobile();

System.out.println("How many doors does your car have? ");
d = input.nextInt();
Car3.setNumberOfDoors(d);

System.out.println("How many cylinders does your car have? ");
c = input.nextInt();
Car3.setNumberOfCylinders(c);

System.out.println("How many gears does your transmission have? ");
t = input.nextInt();
Car3.setTransmission(t);

System.out.println("What is the color of your car? ");
color = input.nextLine();
Car3.setColor(color);



System.out.println("What is the name of your car? ");
name = input.nextLine();
Car3.setName(name);

}

}

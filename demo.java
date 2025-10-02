package newpackage;

import java.util.Scanner;

public class demo 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        rentalSystem rs = new rentalSystem();

        car car1 = new car("car","toyota","camry",2020,38,4,false,"premium gas");
        car car2 = new car("car","toyota","supra",2017,75,2,true,"normal gas");
        car car3 = new car("car","ford","escape",2019,50,4,false,"normal gas");
        car car4 = new car("car","ford","mustang",2017,69,2,true,"premium gas");
        car car5 = new car("car","honda","accord",2021,90,4,false,"normal gas");
        car car6 = new car("car","honda","civic",2023,120,4,false,"normal gas");

        rs.addVehicle(car1);
        rs.addVehicle(car2);
        rs.addVehicle(car3);
        rs.addVehicle(car4);
        rs.addVehicle(car5);
        rs.addVehicle(car6);

        truck truck1 = new truck("truck","toyota","tundra",2017,84,1240,true);
        truck truck2 = new truck("truck","toyota","tacoma",2019,70,1220,true);
        truck truck3 = new truck("truck","ford","maverick",2020,78,1330,true);
        truck truck4 = new truck("truck","ford","f-150",2022,89,1100,true);
        truck truck5 = new truck("truck","chevy","silverado",2023,105,1500,true);
        truck truck6 = new truck("truck","chevy","colorado",2021,114,1500,true);

        rs.addVehicle(truck1);
        rs.addVehicle(truck2);
        rs.addVehicle(truck3);
        rs.addVehicle(truck4);
        rs.addVehicle(truck5);
        rs.addVehicle(truck6);

        motorcycle motorbike1 = new motorcycle("motorbike","harley-davidson","soft tail",2023,150,"soft tail");
        motorcycle motorbike2 = new motorcycle("motorbike","harley-davidson","dyna",2023,160,"steer");
        motorcycle motorbike3 = new motorcycle("motorbike","harley-davidson","vrod",2023,140,"steer");

        rs.addVehicle(motorbike1);
        rs.addVehicle(motorbike2);
        rs.addVehicle(motorbike3);

        System.out.print("Enter your name: ");
        String name = input.next();
        System.out.println("Hello " + name + "!!");

        boolean running = true;

        while(running)
        {
            System.out.println();
            System.out.println("====== Vehicle Renting System ======");
            System.out.println("1. Rent a vehicle.");
            System.out.println("2. Return a vehicle.");
            System.out.println("3. Display Available Vehicles.");
            System.out.println("4. Dispaly Rented Vehicles.");
            System.out.println("5. Exit.");
            System.out.println();
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();

            switch(choice)
            {
                case 1:
                {
                    System.out.println();
                    System.out.println("------ You chose to rent a Vehicle ------");
                    System.out.println("What kind of vehicle would you like to rent?");
                    System.out.println("a. Car.");
                    System.out.println("b. Motorcycle.");
                    System.out.println("c. Truck.");
                    System.out.print("Enter your choice: ");
                    char ans = input.next().charAt(0);

                    switch(ans)
                    {
                        case 'a': 
                        {
                            System.out.println("------ You chose to rent a car ------");
                            System.out.println("\nAvailable Cars:\n");

                            for(vehicle v : rs.getAvailableVehicles())
                            {
                                if(v instanceof car && ((rentable)v).isAvailable())
                                {
                                    v.displayInfo();
                                    System.out.println();
                                }
                            }

                            System.out.print("Enter the car's make: ");
                            String make = input.next();
                            System.out.print("Enter the car's model: ");
                            String model = input.next();

                            vehicle selectedVehicle = null;
                            for(vehicle v : rs.getAvailableVehicles())
                            {
                                if(v instanceof car && v.getMake().equalsIgnoreCase(make) && v.getModel().equalsIgnoreCase(model))
                                {
                                    selectedVehicle = v;
                                    break;
                                }
                            }

                            if(selectedVehicle != null && ((rentable)selectedVehicle).isAvailable())
                            {
                                System.out.print("Enter the rental duration in days: ");
                                int rd = input.nextInt();
                                double rc = rs.calculatRentalCost(selectedVehicle, rd);
                                System.out.println("The total is: " + rc + "$");
                                rs.rentVehicle(selectedVehicle);
                                ((rentable)selectedVehicle).rent();
                                System.out.println("Car rented successfully!!");
                            }
                            else
                            {
                                System.out.println("Car is not available for renting!!");
                            }
                            break;
                        }

                        case 'b': 
                        {
                            System.out.println("------ You chose to rent a motorcycle ------");
                            System.out.println("\nAvailable Motorcycles:\n");

                            for(vehicle v : rs.getAvailableVehicles())
                            {
                                if(v instanceof motorcycle && ((rentable)v).isAvailable())
                                {
                                    v.displayInfo();
                                    System.out.println();
                                }
                            }

                            System.out.print("Enter the motorcycle's make: ");
                            String make = input.next();
                            System.out.print("Enter the motorcycle's model: ");
                            String model = input.next();

                            vehicle selectedVehicle = null;
                            for(vehicle v : rs.getAvailableVehicles())
                            {
                                if(v instanceof motorcycle && v.getMake().equalsIgnoreCase(make) && v.getModel().equalsIgnoreCase(model))
                                {
                                    selectedVehicle = v;
                                    break;
                                }
                            }

                            if(selectedVehicle != null && ((rentable)selectedVehicle).isAvailable())
                            {
                                System.out.print("Enter the rental duration in days: ");
                                int rd = input.nextInt();
                                double rc = rs.calculatRentalCost(selectedVehicle, rd);
                                System.out.println("The total is: " + rc + "$");
                                rs.rentVehicle(selectedVehicle);
                                ((rentable)selectedVehicle).rent();
                                System.out.println("Motorcycle rented successfully!!");
                            }
                            else
                            {
                                System.out.println("Motorcycle is not available for renting!!");
                            }
                            break;
                        }

                        case 'c': 
                        {
                            System.out.println("------ You chose to rent a truck ------");
                            System.out.println("\nAvailable Trucks:\n");

                            for(vehicle v : rs.getAvailableVehicles())
                            {
                                if(v instanceof truck && ((rentable)v).isAvailable())
                                {
                                    v.displayInfo();
                                    System.out.println();
                                }
                            }

                            System.out.print("Enter the truck's make: ");
                            String make = input.next();
                            System.out.print("Enter the truck's model: ");
                            String model = input.next();

                            vehicle selectedVehicle = null;
                            for(vehicle v : rs.getAvailableVehicles())
                            {
                                if(v instanceof truck && v.getMake().equalsIgnoreCase(make) && v.getModel().equalsIgnoreCase(model))
                                {
                                    selectedVehicle = v;
                                    break;
                                }
                            }

                            if(selectedVehicle != null && ((rentable)selectedVehicle).isAvailable())
                            {
                                System.out.print("Enter the rental duration in days: ");
                                int rd = input.nextInt();
                                double rc = rs.calculatRentalCost(selectedVehicle, rd);
                                System.out.println("The total is: " + rc + "$");
                                rs.rentVehicle(selectedVehicle);
                                ((rentable)selectedVehicle).rent();
                                System.out.println("Truck rented successfully!!");
                            }
                            else
                            {
                                System.out.println("Truck is not available for renting!!");
                            }
                            break;
                        }

                        default:
                        {
                            System.out.println("Invalid entry. Try again.");
                        }
                    }
                    break;
                }

                case 2: 
                {
                    System.out.println();
                    System.out.println("------ You chose to return a Vehicle ------");
                    System.out.println("What kind of vehicle would you like to return?");
                    System.out.println("a. Car.");
                    System.out.println("b. Motorcycle.");
                    System.out.println("c. Truck.");
                    System.out.print("Enter your choice: ");
                    char ans1 = input.next().charAt(0);

                    switch(ans1)
                    {
                        case 'a': 
                        {
                            System.out.print("Enter the car's make: ");
                            String make = input.next();
                            System.out.print("Enter the car's model: ");
                            String model = input.next();

                            vehicle selectedVehicle = null;
                            for(vehicle v : rs.getRentedVehicles())
                            {
                                if(v instanceof car && v.getMake().equalsIgnoreCase(make) && v.getModel().equalsIgnoreCase(model))
                                {
                                    selectedVehicle = v;
                                    break;
                                }
                            }

                            if(selectedVehicle != null)
                            {
                                rs.returnVehicle(selectedVehicle);
                                ((rentable)selectedVehicle).returnVehicle();
                                System.out.println("Car returned successfully. Thank you!");
                            }
                            else
                            {
                                System.out.println("Car not found in rented vehicles.");
                            }
                            break;
                        }

                        case 'b': 
                        {
                            System.out.print("Enter the motorcycle's make: ");
                            String make = input.next();
                            System.out.print("Enter the motorcycle's model: ");
                            String model = input.next();

                            vehicle selectedVehicle = null;
                            for(vehicle v : rs.getRentedVehicles())
                            {
                                if(v instanceof motorcycle && v.getMake().equalsIgnoreCase(make) && v.getModel().equalsIgnoreCase(model))
                                {
                                    selectedVehicle = v;
                                    break;
                                }
                            }

                            if(selectedVehicle != null)
                            {
                                rs.returnVehicle(selectedVehicle);
                                ((rentable)selectedVehicle).returnVehicle();
                                System.out.println("Motorcycle returned successfully. Thank you!");
                            }
                            else
                            {
                                System.out.println("Motorcycle not found in rented vehicles.");
                            }
                            break;
                        }

                        case 'c': 
                        {
                            System.out.print("Enter the truck's make: ");
                            String make = input.next();
                            System.out.print("Enter the truck's model: ");
                            String model = input.next();

                            vehicle selectedVehicle = null;
                            for(vehicle v : rs.getRentedVehicles())
                            {
                                if(v instanceof truck && v.getMake().equalsIgnoreCase(make) && v.getModel().equalsIgnoreCase(model))
                                {
                                    selectedVehicle = v;
                                    break;
                                }
                            }

                            if(selectedVehicle != null)
                            {
                                rs.returnVehicle(selectedVehicle);
                                ((rentable)selectedVehicle).returnVehicle();
                                System.out.println("Truck returned successfully. Thank you!");
                            }
                            else
                            {
                                System.out.println("Truck not found in rented vehicles.");
                            }
                            break;
                        }

                        default:
                        {
                            System.out.println("Invalid entry. Try again.");
                        }
                    }
                    break;
                }

                case 3: 
                {
                    System.out.println("------ Available Vehicles ------");
                    for (vehicle v: rs.getAvailableVehicles())
                    {
                        v.displayInfo();
                        System.out.println();
                    }
                    break;
                }

                case 4: 
                {
                    System.out.println("------ Rented Vehicles ------");
                    for(vehicle v: rs.getRentedVehicles())
                    {
                        v.displayInfo();
                        System.out.println();
                    }
                    break;
                }

                case 5:
                {
                    System.out.println("Thank you for using the Vehicle Rental System. Goodbye!");
                    running = false;
                    break;
                }

                default:
                {
                    System.out.println("Invalid choice. Try again.");
                }
            }
        }

        input.close();
    }
}

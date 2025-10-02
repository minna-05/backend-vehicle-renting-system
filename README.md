# What This Code Does:

- This project is a ***backend vehicle renting system*** implemented in Java, showcasing ***OOP, class inheritance, interfaces, data structures, and basic user interaction***. Here’s a step-by-step overview:

## 1- Setup & Vehicle Creation:

  - Initializes a ***rental system*** object to manage all vehicles.  

  - Creates several vehicles for the system:  

  > ***Cars*** – Different makes, models, years, prices, and availability.  
  > ***Trucks*** – Different makes, models, payload capacities, and availability.  
  > ***Motorcycles*** – Different makes, models, and types.  

  - Adds all vehicles to the ***rental system*** inventory.  

  - Demonstrates ***class inheritance***: `car`, `truck`, and `motorcycle` all inherit from the base `vehicle` class.  

  - Implements a ***rentable interface*** to enforce consistent behavior for renting and returning vehicles.

## 2- User Interaction:

  - Prompts the user for their ***name*** and greets them.  

  - Displays a ***menu*** with options:

  > 1. Rent a vehicle  
  > 2. Return a vehicle  
  > 3. Display Available Vehicles  
  > 4. Dispaly Rented Vehicles  
  > 5. Exit  

  - The system uses a ***loop*** to continuously handle user input until they choose to exit.

## 3- Renting a Vehicle:

  - Prompts the user to select the type of vehicle (***Car, Motorcycle, Truck***).  

  - Shows ***available vehicles*** of the selected type.  

  - Allows the user to select a specific vehicle by ***make and model***.  

  - Calculates and displays the ***rental cost*** based on the duration.  

  - Updates the vehicle status as ***rented*** and stores it in the system’s rented list.  

  - Uses ***polymorphism*** to handle different vehicle types with the same renting logic.

## 4- Returning a Vehicle:

  - Prompts the user to select the type of vehicle they want to return.  

  - Allows the user to identify the vehicle by ***make and model***.  

  - Updates the vehicle status as ***available*** and removes it from the rented list.  

  - Confirms successful return to the user.  

  - Again demonstrates ***polymorphism*** and ***interface implementation*** for returning different types of vehicles.

## 5- Displaying System Information:

  - Displays ***rental information***, including which vehicles are rented or available. 

## 6- Exit:

  - Safely exits the program and terminates the ***loop*** when the user selects ***Exit***.

# Features Demonstrated:

- ***Object-Oriented Programming (OOP)***: Classes for `vehicle`, `car`, `truck`, `motorcycle`, and `rentalSystem`.  
- ***Class Inheritance***: Specific vehicle types inherit common attributes and methods from the base `vehicle` class.  
- ***Interface Implementation***: `rentable` interface ensures all vehicles implement ***renting and returning functionality***.  
- ***Polymorphism***: Single methods handle multiple vehicle types through common interfaces and inheritance.  
- ***Data Structures***: Uses ***lists*** to manage available and rented vehicles.  
- ***Backend Logic***: Implements core functionality for ***renting and returning vehicles***, tracking availability, and calculating rental costs.  
- ***User Interaction***: Handles input via the ***console***, with menus and options for multiple actions.

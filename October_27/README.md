# Problem 2: Vehicle Rental Shop

Build a rental shop for different kinds of vehicles.

Create an interface Rentable with calculateRent(int days) and isAvailable().
Create an abstract class Vehicle that implements it. Each vehicle has an id, model, daily rate and availability.
Car costs rate × days.
Bike costs rate × days, with a 10% discount for 7 or more days.
Truck costs rate × days plus a fixed 500 insurance charge.
A Customer keeps a history of their Rental objects. A Rental links a vehicle, a customer and a number of days.
RentalShop stores the fleet. It supports rent(), which throws an exception if the vehicle is missing or already rented, as well as giveBack() and showAvailable().

### Expected Output:
```text
Asha rented Bike Activa (B1) for 8 days = 2880.00
Ravi rented Truck Tata Ace (T1) for 2 days = 5500.00
Error: Bike Activa (B1) is already rented
Available vehicles:
  Car Swift (C1)
  Bike Activa (B1)

# Project Folder Structure

vehicle-rental-shop/
├── Rentable.java
├── Vehicle.java
├── Car.java
├── Bike.java
├── Truck.java
├── Customer.java
├── Rental.java
├── RentalException.java
├── RentalShop.java
└── Main.java

package newpackage;


public interface rentable {
    void rent();
    void returnVehicle();
    boolean isAvailable();
    double calculateRentalCost(int days);
    void displayInfo();
}

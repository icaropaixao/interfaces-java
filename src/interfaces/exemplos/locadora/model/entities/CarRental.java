package interfaces.exemplos.locadora.model.entities;

import java.time.LocalDateTime;

public class CarRental {

    private LocalDateTime start;
    private LocalDateTime startFinish;

    private Vehicle vehicle;
    private Invoice invoice;


    public CarRental(){}

    public CarRental(LocalDateTime start, LocalDateTime startFinish, Vehicle vehicle) {
        this.start = start;
        this.startFinish = startFinish;
        this.vehicle = vehicle;
    }

    //gets sets
    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getStartFinish() {
        return startFinish;
    }

    public void setStartFinish(LocalDateTime startFinish) {
        this.startFinish = startFinish;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }


}

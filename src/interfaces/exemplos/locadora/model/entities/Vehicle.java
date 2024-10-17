package interfaces.exemplos.locadora.model.entities;

public class Vehicle {

    private String model;

    public Vehicle(){

    }
    public Vehicle(String model){
        this.model = model;
    }

    //gets sets
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
}

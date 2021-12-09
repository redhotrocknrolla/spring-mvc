package model;




public class Car {
    private String car;
    private String model;
    private int year;

    public Car(String car, String model, int year) {
        this.car = car;
        this.model = model;
        this.year = year;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

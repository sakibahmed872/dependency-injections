package org.example;

public class Brand {
    private Car car;

    public Brand(Car car)
    {
        this.car = car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void printInfo(String info)
    {
        System.out.println(info);
    }

    public void updateCarTitile(String title)
    {
        car.setTitle(title);
    }
}

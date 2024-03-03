package GB.HomeWorkLapatoops;

import java.util.Objects;

public class Laptops {
    private String brand;
    private String model;
    private int price;
    private String os;
    private String processor;
    private int ram;
    private int diagonal;

    public Laptops(String brand, String model, int price, String os, String processor, int ram, int diagonal) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.os = os;
        this.processor = processor;
        this.ram = ram;
        this.diagonal = diagonal;
    }
    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    public int getPrice(){
        return price;
    }
    public int getDiagonal(){
        return diagonal;
    }
    public int getRAM(){
        return ram;
    }
    public String getOS(){
        return os;
    }
    public String getProcessor(){
        return processor;
    }
    public void setPrice(int price){
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ноутбук " + brand + " " + model + " " + os + " " + processor + " " + ram + "ГБ " + "Диагональю " + diagonal + " дюйм по цене: " + price;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Laptops laptop = (Laptops) obj;
        return brand.equals(laptop.brand) && model.equals(laptop.model)&& 
            os.equals(laptop.os) && processor.equals(laptop.processor) && 
            ram == (laptop.ram) && diagonal == (laptop.diagonal) && price ==(laptop.price);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(brand, model, os, processor, ram, diagonal, price);
    }
}

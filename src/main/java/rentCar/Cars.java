package rentCar;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "CARS")

public class Cars {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int carId;

    @Column(name = "brand")
    private String brand;

    @Column(name = "model")
    private String model;

    @Column(name = "color")
    private String color;

    @Column(name = "registration_number")
    private int registration_number;

    @Column(name = "vechicle_condition")
    @Enumerated(EnumType.STRING)
    private Vechicle_condition vechicle_condition;

    @Column(name = "cost")
    private BigDecimal cost;



    public Cars(int carId, String brand, String model, String color, int number, Vechicle_condition condition, BigDecimal cost) {
        this.carId = carId;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.registration_number = number;
        this.vechicle_condition = condition;
        this.cost = cost;
    }

    public int getId() {
        return carId;
    }

    public void setId(int id) {
        this.carId = carId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRegistration_number() {
        return registration_number;
    }

    public void setRegistration_number(int registration_number) {
        this.registration_number = registration_number;
    }

    public Vechicle_condition getVechicle_condition() {
        return vechicle_condition;
    }

    public void setVechicle_condition(Vechicle_condition vechicle_condition) {
        this.vechicle_condition = vechicle_condition;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

}

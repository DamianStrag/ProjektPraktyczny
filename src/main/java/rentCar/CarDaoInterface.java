package rentCar;

import com.google.protobuf.Enum;

import java.io.Serializable;
import java.math.BigDecimal;

public interface CarDaoInterface <T, Id extends Serializable>{

     void addCar(T entity);
     void deleteCar(T entity);
    public Vechicle_condition conditionOfTheCar(T entity);
    public BigDecimal pricePerDay();

}

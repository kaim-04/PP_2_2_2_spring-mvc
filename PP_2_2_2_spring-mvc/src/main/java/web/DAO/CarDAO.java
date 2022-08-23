package web.DAO;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAO {

    final List<Car> carList;
    List<Car> carListFinal = new ArrayList<>();

    {
        carList = new ArrayList<>();
        carList.add(new Car("Lada", 1));
        carList.add(new Car("Volga", 2));
        carList.add(new Car("UAZ", 3));
        carList.add(new Car("Oka", 4));
        carList.add(new Car("Hummer", 5));
    }


    public void newList(int x) {

        switch (x) {
            case 1 -> {
                carListFinal = new ArrayList<>();
                carListFinal.add(carList.get(0));
               // carList = carListFinal;
            }
            case 2 -> {
                carListFinal = new ArrayList<>();
                carListFinal.add(carList.get(0));
                carListFinal.add(carList.get(1));
              //  carList = carListFinal;
            }
            case 3 -> {
                carListFinal = new ArrayList<>();
                carListFinal.add(carList.get(0));
                carListFinal.add(carList.get(1));
                carListFinal.add(carList.get(2));
               // carList = carListFinal;
            }
            case 4 -> {
                carListFinal = new ArrayList<>();
                carListFinal.add(carList.get(0));
                carListFinal.add(carList.get(1));
                carListFinal.add(carList.get(2));
                carListFinal.add(carList.get(3));
             //   carList = carListFinal;
            }

            default -> {
                carListFinal = new ArrayList<>();
                carListFinal.addAll(carList);
            }
        }
    }

    public List<Car> getList() {
        return carList;
    }
    public List<Car>getNewList(){
        return carListFinal;
    }
}

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

    public List<Car> getList() {
        return carList;
    }

    public List<Car> getNewList() {
        return carListFinal;
    }

    public void newList2(int x) {

        if (x <= 5) {
            carListFinal = new ArrayList<>();
            for (int i = 0; i < x; i++) {
                carListFinal.add(carList.get(i));
            }
        } else {
            carListFinal = new ArrayList<>();
            carListFinal.addAll(carList);
        }

    }
}

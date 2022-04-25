package racingcar;

public class Car {
    private CarName name;
    private int position;

    Car(String name){
        this.name = new CarName(name);
        this.position = 0;
    }
}

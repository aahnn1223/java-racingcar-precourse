package racingcar;

public class Car {
    private CarName name;
    private int position;

    Car(){}
    Car(String name, int position){
        this.name = new CarName(name);
        this.position = position;
    }


}

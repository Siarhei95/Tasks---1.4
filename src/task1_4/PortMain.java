package task1_4;


import java.util.ArrayList;
import java.util.List;

//Многопоточность.  Порт  .  Корабли заходят в порт для
//        разгрузки/загрузки  контейнеров. Число контейнеров, находящихся в текущий момент
//        в порту и на корабле, должно быть неотрицательным и превышающим заданную
//        грузоподъемность судна и вместимость порта. В порту работает несколько причалов.
//        У одного причала может стоять один корабль. Корабль может загружаться у причала
//        или разгружаться.

public class PortMain {
    public static void main(String[] args) {
        Port port = new Port(2, 4335, 5366);

        List<Ship> ships = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            ships.add(new Ship("Ship " + i, 787, 0, port));
        }

        System.out.println("All ships have finished their task");

    }
}

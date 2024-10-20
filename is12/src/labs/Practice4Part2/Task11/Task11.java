package labs.Practice4Part2.Task11;

public class Task11 {
    private int door1 = 0;
    private int door2 = 0;
    private int door3 = 0;
    private int door4 = 0;
    private String currentGear = "P"; // Текущая передача // Метод для открытия двери, проверяющий, включена ли передача


    //Дверь закрытая или открыатя ?? Всего может быть 4 двери
    public int createDoor(int door, String statusDoor, String side) {
        String sideMessage = side.equalsIgnoreCase("left") ? "левая" : "правая";

        switch (door) {
            case 1:
                if (statusDoor.equalsIgnoreCase("open")) {
                    door1 = 1; // Открываем дверь 1
                    System.out.println("Открыта " + sideMessage + " дверь 1.");
                } else if (statusDoor.equalsIgnoreCase("close")) {
                    door1 = 0; // Закрываем дверь 1
                    System.out.println("Закрыта " + sideMessage + " дверь 1.");
                } else {
                    System.out.println("Неверное состояние для двери 1. Используйте 'open' или 'close'.");
                }
                break;
            case 2:
                if (statusDoor.equalsIgnoreCase("open")) {
                    door2 = 1; // Открываем дверь 2
                    System.out.println("Открыта " + sideMessage + " дверь 2.");
                } else if (statusDoor.equalsIgnoreCase("close")) {
                    door2 = 0; // Закрываем дверь 2
                    System.out.println("Закрыта " + sideMessage + " дверь 2.");
                } else {
                    System.out.println("Неверное состояние для двери 2. Используйте 'open' или 'close'.");
                }
                break;
            case 3:
                if (statusDoor.equalsIgnoreCase("open")) {
                    door3 = 1; // Открываем дверь 3
                    System.out.println("Открыта " + sideMessage + " дверь 3.");
                } else if (statusDoor.equalsIgnoreCase("close")) {
                    door3 = 0; // Закрываем дверь 3
                    System.out.println("Закрыта " + sideMessage + " дверь 3.");
                } else {
                    System.out.println("Неверное состояние для двери 3. Используйте 'open' или 'close'.");
                }
                break;
            case 4:
                if (statusDoor.equalsIgnoreCase("open")) {
                    door4 = 1; // Открываем дверь 4
                    System.out.println("Открыта " + sideMessage + " дверь 4.");
                } else if (statusDoor.equalsIgnoreCase("close")) {
                    door4 = 0; // Закрываем дверь 4
                    System.out.println("Закрыта " + sideMessage + " дверь 4.");
                } else {
                    System.out.println("Неверное состояние для двери 4. Используйте 'open' или 'close'.");
                }
                break;
            default:
                System.out.println("Неверный номер двери. Доступны двери 1-4.");
        }
        return door;
    }

    public String getDoorState(int door) {
        return switch (door) {
            case 1 -> door1 == 1 ? "Дверь 1 открыта" : "Дверь 1 закрыта";
            case 2 -> door2 == 1 ? "Дверь 2 открыта" : "Дверь 2 закрыта";
            case 3 -> door3 == 1 ? "Дверь 3 открыта" : "Дверь 3 закрыта";
            case 4 -> door4 == 1 ? "Дверь 4 открыта" : "Дверь 4 закрыта";
            default -> "Неверный номер двери. Доступны двери 1-4.";
        };
    }

    public int doorLock(int door, String lockMode, String sideDoor) {

        switch (door) {
            case 1:
                if (sideDoor.equalsIgnoreCase("open")) {
                    door1 = 1;
                } else if (sideDoor.equalsIgnoreCase("close")) {
                    door1 = 0;
                } else {
                    System.out.println("Неверное состояние для двери 1. Используйте 'open' или 'close'.");
                }
                break;
            case 2:
                if (sideDoor.equalsIgnoreCase("open")) {
                    door2 = 1;
                } else if (sideDoor.equalsIgnoreCase("close")) {
                    door2 = 0;
                } else {
                    System.out.println("Неверное состояние для двери 2. Используйте 'open' или 'close'.");
                }
                break;
            case 3:
                if (sideDoor.equalsIgnoreCase("open")) {
                    door3 = 1;
                } else if (sideDoor.equalsIgnoreCase("close")) {
                    door3 = 0;
                } else {
                    System.out.println("Неверное состояние для двери 3. Используйте 'open' или 'close'.");
                }
                break;
            case 4:
                if (sideDoor.equalsIgnoreCase("open")) {
                    door4 = 1;
                } else if (sideDoor.equalsIgnoreCase("close")) {
                    door4 = 0;
                } else {
                    System.out.println("Неверное состояние для двери 4. Используйте 'open' или 'close'.");
                }
                break;
            default:
                System.out.println("Неверный номер двери. Доступны двери 1-4.");
        }

        return 120;
    }


    public int closeDoor(int door) {
        if (isGearEngaged()) {
            System.out.println("Нельзя закрыть дверь " + door + ", так как передача включена.");
            return 0; // Не удалось закрыть дверь
        } else {
            switch (door) {
                case 1:
                    if (door1 == 1) { // Проверяем, открыта ли дверь
                        door1 = 0; // Закрываем дверь 1 System.out.println("Дверь 1 закрыта.");
                    } else {
                        System.out.println("Дверь 1 уже закрыта.");
                    }
                    break;
                case 2:
                    if (door2 == 1) { // Проверяем, открыта ли дверь door2 = 0; // Закрываем дверь 2
                        System.out.println("Дверь 2 закрыта.");
                    } else {
                        System.out.println("Дверь 2 уже закрыта.");
                    }
                    break;
                case 3:
                    if (door3 == 1) { // Проверяем, открыта ли дверь
                        door3 = 0; // Закрываем дверь 3 System.out.println("Дверь 3 закрыта.");
                    } else {
                        System.out.println("Дверь 3 уже закрыта.");
                    }
                    break;
                case 4:
                    if (door4 == 1) { // Проверяем, открыта ли дверь door4 = 0; // Закрываем дверь 4
                        System.out.println("Дверь 4 закрыта.");
                    } else {
                        System.out.println("Дверь 4 уже закрыта.");
                    }
                    break;
                default:
                    System.out.println("Неверный номер двери. Доступны двери 1-4.");
                    return 0; // Неверный номер двери }
            }
        }
        return 1; // Успешно закрыли дверь }

    }


    public int openDoor(int door) {
        if (isGearEngaged()) {
            System.out.println("Нельзя открыть дверь " + door + ", так как передача включена.");
            return 0; // Не удалось открыть дверь
        } else {
            System.out.println("Дверь " + door + " открыта.");
            return door = 1; // Успешно открыли дверь }
        }


    }


    public int slidingDoor(int door, String lockMode, String sideDoor) {
        //Ручка на раздвижение двери
        switch (lockMode) {
            case ("1"):
                return door = 1;
            case ("2"):
                return door = 0;
        }
        return 120;
    }

    public boolean isGearEngaged() {
        return !currentGear.equals("P"); // Если передача не "P" (парковка), то она включена
    }


    //Gear shift
    public String gearShift(String shift) {
        return switch (shift) {
            case ("1") -> shift = "P";
            case ("2") -> shift = "N";
            case ("3") -> shift = "D";
            case ("4") -> shift = "1";
            case ("5") -> shift = "2";
            case ("6") -> shift = "3";
            case ("7") -> shift = "R";
            default -> currentGear = shift;
        };

    }

    public static void main(String[] args) {
        Task11 t = new Task11();

        // Создаем двери и сохраняем их состояние
        t.createDoor(1, "close", "left");
        t.createDoor(2, "close", "left");
        t.createDoor(3, "open", "right");
        t.createDoor(4, "close", "right");

        System.out.println(t.getDoorState(1));
        System.out.println(t.openDoor(1));
        System.out.println(t.getDoorState(1));
        System.out.println(t.getDoorState(1));
        System.out.println(t.openDoor(1));
        System.out.println(t.getDoorState(1));


    }

}

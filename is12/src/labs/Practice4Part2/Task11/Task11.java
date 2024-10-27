package labs.Practice4Part2.Task11;

public class Task11 {
    private int door1 = 0;
    private int door2 = 0;
    private int door3 = 0;
    private int door4 = 0;
    private String currentGear = "P"; // Текущая передача // Метод для открытия двери, проверяющий, включена ли передача
    private int unlockStatus = 0;
    private int leftDoorCount = 0; // Счетчик левых дверей
    private int rightDoorCount = 0; // Счетчик правых дверей


    /**
     * Метод для создания двери и установки ее состояния (открыта/закрыта).
     *
     * @param door       Номер двери (1-4).
     * @param statusDoor Состояние двери ('open' или 'close').
     * @param side       Сторона двери ('left' или 'right').
     * @return Номер двери, если создание успешно, или -1 в случае ошибки.
     */
    public int createDoor(int door, String statusDoor, String side) {
        String sideMessage = side.equalsIgnoreCase("left") ? "левую" : "правая";

        // Проверка на создание только двух левых и двух правых дверей
        if (side.equalsIgnoreCase("left") && leftDoorCount >= 2) {
            System.out.println("Невозможно создать " + sideMessage + " двери. Достигнут лимит в 2 двери.");
            return -1; // Ошибка создания двери
        } else if (side.equalsIgnoreCase("right") && rightDoorCount >= 2) {
            System.out.println("Невозможно создать " + sideMessage + " двери. Достигнут лимит в 2 двери.");
            return -1; // Ошибка создания двери
        }

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
                if (side.equalsIgnoreCase("left")) {
                    leftDoorCount++;
                } else {
                    rightDoorCount++;
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
                if (side.equalsIgnoreCase("left")) {
                    leftDoorCount++;
                } else {
                    rightDoorCount++;
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
                if (side.equalsIgnoreCase("left")) {
                    leftDoorCount++;
                } else {
                    rightDoorCount++;
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
                if (side.equalsIgnoreCase("left")) {
                    leftDoorCount++;
                } else {
                    rightDoorCount++;
                }
                break;
            default:
                System.out.println("Неверный номер двери. Доступны двери 1-4.");
        }
        return door;
    }

    /**
     * Метод для получения состояния указанной двери.
     *
     * @param door Номер двери (1-4).
     * @return Строка, описывающая состояние двери (открыта или закрыта).
     */
    public String getDoorState(int door) {
        return switch (door) {
            case 1 -> door1 == 1 ? "Статус Дверь 1 открыта" : "Статус Дверь 1 закрыта";
            case 2 -> door2 == 1 ? "Статус Дверь 2 открыта" : "Статус Дверь 2 закрыта";
            case 3 -> door3 == 1 ? "Статус Дверь 3 открыта" : "Статус Дверь 3 закрыта";
            case 4 -> door4 == 1 ? "Статус Дверь 4 открыта" : "Статус Дверь 4 закрыта";
            default -> "Неверный номер двери. Доступны двери 1-4.";
        };
    }

    /**
     * Метод для закрытия указанной двери.
     *
     * @param door Номер двери (1-4).
     * @return Строка, описывающая результат операции.
     */
    public String closeDoor(int door) {
        if (isGearEngaged()) {
            System.out.println("Нельзя закрыть дверь " + door + ", так как передача включена.");
        } else {
            switch (door) {
                case 1:
                    door1 = 0;
                    break;
                case 2:
                    door2 = 0;
                    break;
                case 3:
                    door3 = 0;
                    break;
                case 4:
                    door4 = 0;
                    break;
                default:
                    System.out.println("Неверный номер двери. Доступны двери 1-4.");
            }
        }
        return "Дверь " + door + " закрыта";

    }

    /**
     * Метод для открытия указанной двери.
     *
     * @param door Номер двери (1-4).
     * @return Строка, описывающая результат операции.
     */
    public String openDoor(int door) {
        if (isGearEngaged()) {
            return "Нельзя открыть дверь " + door + ", так как передача включена.";
        } else {
            switch (door) {
                case 1:
                    door1 = 1;
                case 2:
                    door2 = 1;
                case 3:
                    if (mainUnlock(unlockStatus)) {
                        door3 = 0;
                        return "Дверь " + door + " не может быть открыта так как она заблокирована";
                    }
                    door3 = 1;
                    return "Дверь " + door + " открыта";
                case 4:
                    if (mainUnlock(unlockStatus)) {
                        door4 = 0;
                        return "Дверь " + door + " не может быть открыта так как она заблокирована";
                    }
                    door4 = 1;
            }
        }

        return "Дверь " + door + " открыта";
    }

    /**
     * Метод для проверки, включена ли передача.
     *
     * @return true, если передача включена; false в противном случае.
     */
    public boolean isGearEngaged() {
        return !currentGear.equals("P"); // Если передача не "P" (парковка), то она включена
    }

    /**
     * Метод для обработки статуса разблокировки.
     *
     * @param status Статус разблокировки (0 - разблокировано, 1 - заблокировано).
     * @return true, если двери разблокированы; false в противном случае.
     */
    public boolean mainUnlock(int status) {
        // Обработка статуса разблокировки
        unlockStatus = status; // Обновляем статус разблокировки
        return switch (status) {
            case 1 -> false; // Заблокирована
            case 0 -> true;  // Разблокировано
            default -> throw new IllegalArgumentException("Произошла ошибка: неверный статус."); // Обработка ошибки
        };
    }

    /**
     * Метод для переключения передач.
     * <p>
     * Этот метод изменяет текущее состояние передачи автомобиля в зависимости от переданного значения.
     * Передача может быть установлена на одну из стандартных позиций, таких как:
     * 1- "P" (Парковка)
     * 2- "N" (Нейтраль)
     * 3- "D" (Движение вперед)
     * 4,5,6- "1", "2", "3" (Передачи)
     * 7- "R" (Задний ход)
     * <p>
     * Если переданное значение не соответствует ни одной из стандартных позиций,
     * метод установит текущую передачу на значение, переданное в качестве аргумента.
     * <p>
     * Примечание: Метод не проверяет, находится ли автомобиль в безопасном состоянии
     * для переключения передач. Поэтому рекомендуется вызывать его только в
     * соответствующих условиях (например, когда автомобиль стоит на парковке).
     *
     * @param shift Новая передача, которую необходимо установить. Это строка, представляющая
     *              состояние передачи (например, "P", "N", "D", "1", "2", "3", "R" или любое другое значение).
     */
    //Gear shift
    public void gearShift(String shift) {
        switch (shift) {
            case "1":
                currentGear = "P";
                break;
            case "2":
                currentGear = "N";
                break;
            case "3":
                currentGear = "D";
                break;
            case "4":
                currentGear = "1";
                break;
            case "5":
                currentGear = "2";
                break;
            case "6":
                currentGear = "3";
                break;
            case "7":
                currentGear = "R";
                break;
            default:
                currentGear = shift; // Устанавливаем другую передачу
        }
    }

    public static void main(String[] args) {
        Task11 t = new Task11();
        // Создаем двери и сохраняем их состояние
        t.createDoor(1, "close", "left");
        t.createDoor(2, "close", "left");
        t.createDoor(3, "open", "right");
        t.createDoor(4, "close", "right");

        t.createDoor(5, "open", "left");
        //Включаем currentGear = "N";
        t.gearShift("2");
        //Блокируем
        t.mainUnlock(0);
        System.out.println(t.openDoor(3));
        System.out.println(t.getDoorState(2));
        t.gearShift("1");
        t.mainUnlock(1);
        System.out.println(t.openDoor(3));


    }

}

package Practice_Exercises.Codewars;

public class Circuit {
    private int switchesAndLampState; // Переменная для хранения состояний выключателей и лампы

    public Circuit(int numSwitches) {
        // Инициализируем переменную switchesAndLampState так, чтобы все биты, кроме самого младшего, были нулевыми
        switchesAndLampState = (1 << numSwitches) - 1;
    }

    // Метод для получения состояния определенного выключателя по его номеру
    public int getSwitchState(int switchNum) {
        // Проверяем состояние выключателя, используя побитовую операцию "И"
        return (switchesAndLampState >> switchNum) & 1;
    }

    // Метод для получения состояния лампы
    public int getLampState() {
        // Просто возвращаем младший бит переменной switchesAndLampState
        return switchesAndLampState & 1;
    }

    // Метод для переключения определенного выключателя
    public void toggleSwitch(int switchNum) {
        // Переключаем бит, соответствующий выключателю switchNum, используя побитовую операцию "ИСКЛЮЧАЮЩЕЕ ИЛИ"
        switchesAndLampState ^= (1 << switchNum);
    }

}


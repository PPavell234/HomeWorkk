package labs.la2;

/**
 * Класс Sheet представляет собой модель листа бумаги.
 * Он хранит ширину и высоту листа, а также предоставляет методы для разрезания листа и получения информации о нем.
 */
public class Sheet {

    private int width; // Ширина листа.
    private int height; // Высота листа.

    private int counter = 0; // Счетчик для идентификации листа.

    /**
     * Создает новый объект Sheet с размерами по умолчанию и нулевым счетчиком.
     * Ширина по умолчанию - 841 мм (A0), высота - 1189 мм (A0).
     */
    public Sheet() {
        this(841, 1189, 0);
    }

    /**
     * Создает новый объект Sheet с заданными размерами и счетчиком.
     *
     * @param width   Ширина листа.
     * @param height  Высота листа.
     * @param counter Значение счетчика для идентификации листа.
     */
    private Sheet(int width, int height, int counter) {
        this.width = width;
        this.height = height;
        this.counter = counter;
    }

    /**
     * Разрезает текущий лист пополам и возвращает новый лист с новыми размерами.
     *
     * @return Новый объект Sheet, представляющий собой половину исходного листа.
     */
    public Sheet cutInHalf() {
        // Вычисляем новые размеры листа
        int newWidth = Math.min(width, height);
        int newHeight = Math.max(width, height) / 2;

        // Создаем новый лист с новыми размерами и увеличиваем счетчик на 1
        return new Sheet(newWidth, newHeight, counter + 1);
    }

    /**
     * Возвращает ширину листа.
     *
     * @return Ширина листа.
     */
    public int getWidth() {
        return width;
    }

    /**
     * Возвращает высоту листа.
     *
     * @return Высота листа.
     */
    public int getHeight() {
        return height;
    }

    /**
     * Возвращает имя листа в формате "A" + счетчик.
     *
     * @return Имя листа.
     */
    public String getName() {
        return "A" + counter;
    }
}
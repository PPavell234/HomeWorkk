package labs.la2;

public class VotingMachine {
    // Переменные экземпляра
    private int democratVotes; // Голоса за демократов
    private int republicanVotes; // Голоса за республиканцев

    // Конструкторы

    /**
     * Создает объект VotingMachine с инициализированными нулевыми голосами
     */
    public VotingMachine() {
        democratVotes = 0;
        republicanVotes = 0;
    }

    // Методы

    /**
     * Отдает голос за демократов
     */
    public void voteDemocrat() {
        democratVotes++;
    }

    /**
     * Отдает голос за республиканцев
     */
    public void voteRepublican() {
        republicanVotes++;
    }

    /**
     * Получает количество голосов за республиканцев
     *
     * @return количество голосов за республиканцев
     */
    public int getRepublicanVotes() {
        return republicanVotes;
    }

    /**
     * Получает количество голосов за демократов
     *
     * @return количество голосов за демократов
     */
    public int getDemocratVotes() {
        return democratVotes;
    }

    /**
     * Сбрасывает количество голосов для обеих партий
     */
    public void clear() {
        democratVotes = 0;
        republicanVotes = 0;
    }

    /**
     * Получает победителя выборов
     *
     * @return победитель
     */
    public String getWinner() {
        return (getDemocratVotes() > getRepublicanVotes()) ? "Победа демократов!" :
                (getRepublicanVotes() > getDemocratVotes()) ? "Победа республиканцев!" : "Ничья!";
    }
}

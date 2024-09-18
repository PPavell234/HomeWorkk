package labs.la2;

public class VotingMachineTester {
    public static void main(String[] args) {
        // Создаем объект VotingMachine
        VotingMachine votingMachine = new VotingMachine();

        // Отдаем несколько голосов
        votingMachine.voteDemocrat();
        votingMachine.voteDemocrat();
        votingMachine.voteRepublican();
        votingMachine.voteRepublican();
        votingMachine.voteRepublican();

        // Выводим результаты голосования
        System.out.println("Голоса за демократов: " + votingMachine.getDemocratVotes());
        System.out.println("Голоса за республиканцев: " + votingMachine.getRepublicanVotes());

        // Получаем победителя и выводим сообщение
        System.out.println("Победитель: " + votingMachine.getWinner());

        // Очищаем голоса и проверяем, что счетчики сброшены
        votingMachine.clear();
        System.out.println("После очистки:");
        System.out.println("Голоса за демократов: " + votingMachine.getDemocratVotes());
        System.out.println("Голоса за республиканцев: " + votingMachine.getRepublicanVotes());
    }
}

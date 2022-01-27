public class Main {
    public static void main(String[] args) {
        int priceTicket = 5000;
        short limitFor1Mili = 20;
        int amountMili = priceTicket / limitFor1Mili;

        System.out.println("Всего миль - " + amountMili);
    }
}

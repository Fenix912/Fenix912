package day11.task1;

public class Courier implements Worker{
    private int salary;
    private static final int BONUS_SALARY = 100;
    private boolean isPayed;
    private Warehouse wh;

    public Courier(Warehouse wh) {
        this.wh = wh;
    }
    public double getSalary() {
        return salary;
    }
    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }
    @Override
    public void doWork() {
        salary += BONUS_SALARY;
        wh.CountDeliveredOrdersIncrease();
    }
    @Override
    public void bonus() {
        if(wh.getCountDeliveredOrders() < 10000){
            System.out.println("Бонус пока не доступен");
            return;
        }
        if (isPayed) {
            System.out.println("Бонус уже был выплачен");
            return;
        }
        salary += 50000;
        isPayed = true;
    }
}

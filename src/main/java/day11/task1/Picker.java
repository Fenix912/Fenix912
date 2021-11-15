package day11.task1;

public class Picker implements Worker{
    private int salary;
    private static final int BONUS_SALARY = 88;
    private boolean isPayed;
    private Warehouse wh;

    public Picker(Warehouse wh) {
        this.wh = wh;
    }
    public double getSalary() {
        return salary;
    }
    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }
    @Override
    public void doWork() {
        salary += BONUS_SALARY;
        wh.CountPickedOrdersIncrease();
    }
    @Override
    public void bonus() {
        if(wh.getCountPickedOrders() < 10000){
            System.out.println("Бонус пока не доступен");
            return;
        }
        if (isPayed) {
            System.out.println("Бонус уже был выплачен");
            return;
        }
        salary += 70000;
        isPayed = true;
    }
}

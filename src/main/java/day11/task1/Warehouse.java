package day11.task1;

public class Warehouse implements Worker{
    private int countPickedOrders;
    private int countDeliveredOrders;


    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public void CountDeliveredOrdersIncrease(){
        countDeliveredOrders++;
    }
    public void CountPickedOrdersIncrease(){
        countPickedOrders++;
    }



    @Override
    public String toString() {
        return "Warehouse{" +
                "countPickedOrders=" + countPickedOrders +
                ", countDeliveredOrders=" + countDeliveredOrders +
                '}';
    }

    @Override
    public void doWork() {

    }
    @Override
    public void bonus() {

    }
}

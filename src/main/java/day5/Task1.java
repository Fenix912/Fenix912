package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModel("Porshe");
        car1.setColor("Red");
        car1.setGod(2020);

        System.out.println("Модель машины: " + car1.getModel());
        System.out.println("Цвет машины: " + car1.getColor());
        System.out.println("Год машины: " + car1.getGod());
    }
}
    class Car {
        private String model;
        private String color;
        private int god;

        public void setModel(String userModel) {
            if (userModel.isEmpty()){
                System.out.println("Вы ввели пустую строку");
            } else {
            model = userModel;
            }
        }
        public String getModel() {
            return model;
        }

        public void setColor(String userColor) {
            if (userColor.isEmpty()){
                System.out.println("Вы ввели пустую строку");
            } else {
                color = userColor;
            }
        }
        public String getColor() {
            return color;
        }

        public void setGod(int userGod) {
            if (userGod < 0) {
                System.out.println("Год машины должен быть положительным числом");
            } else {
                god = userGod;
            }
        }
        public int getGod() {
            return god;
        }
    }


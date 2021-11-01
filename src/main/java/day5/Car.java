package day5;

public class Car {
        private String model;
        private String color;
        private int year;

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

        public void setyear(int useryear) {
            if (useryear < 0) {
                System.out.println("Год машины должен быть положительным числом");
            } else {
                year = useryear;
            }
        }
        public int getyear() {

            return year;
        }
    }


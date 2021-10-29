package day5;

public class Motorbike {

        private String Model;
        private String Color;
        private int God;

        public Motorbike(String Model, String Color, int God) {
            this.Model = Model;
            this.Color = Color;
            this.God = God;
        }

        public String getModel() {
            return Model;
        }
        public String getColor() {
            return Color;
        }
        public int getGod() {
            return God;
        }
}

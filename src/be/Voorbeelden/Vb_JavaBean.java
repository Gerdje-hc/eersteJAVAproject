package be.Voorbeelden;
import java.util.Date;
/**
 * Created by gerdhung-chu on 24/06/17.
 */
public class Vb_JavaBean {



    public class Car {
        private String model;
        private String make;
        private Date manufacturingYear;
        private double power;

        /**
         * Default constructor.
         */
        public Car() {
        }

        /**
         * Javabeans can still have regular constructor, as long as default constructor is still available.
         */
        public Car(String model, String make, Date manufacturingYear, double power) {
            this.model = model;
            this.make = make;
            this.manufacturingYear = manufacturingYear;
            this.power = power;
        }

        /**
         * Only getter here
         */
        public String getModel() {
            return model;
        }

        public String getMake() {
            return make;
        }

        public void setMake(String make) {
            this.make = make;
        }

        /**
         * Only getter here as well
         */
        public Date getManufacturingYear() {
            return manufacturingYear;
        }

        public double getPower() {
            return power;
        }

        public void setPower(double power) {
            this.power = power;
        }
    }
}

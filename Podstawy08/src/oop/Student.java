package oop;

import java.math.BigDecimal;


public class Student {
        private String name;
        private long idCardNumber;
        private BigDecimal income;

        public Student() {
        }

        public Student(String name, long idCardNumber) {
                //this(...) odwołuje się do konstruktora ponizej
                //i przekazuje domyślną wartość do parametru 'income' -> Zero

                this(name, idCardNumber, BigDecimal.ZERO);

                //this.name = name;
                //this.idCardNumber = idCardNumber;
                //this.income = BigDecimal.TEN;
        }

        public Student(String name, long idCardNumber, BigDecimal income) {
                this.name = name;
                this.idCardNumber = idCardNumber;
                this.income = income;
        }

        public void setName(String name) {

        }

        //gettery i settery
        public long getId() {
                return idCardNumber;
        }

        public void setId(long idCardNumber) {
                this.idCardNumber = idCardNumber;
        }

        public BigDecimal income() {
                return income;
        }

        public void setIncome(BigDecimal income) {
                this.income = income;
        }

        public String toString(){
                return String.format("%s, id=%d, income=%s", name, idCardNumber, income);
        }
}



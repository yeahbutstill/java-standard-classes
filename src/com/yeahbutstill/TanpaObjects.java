package com.yeahbutstill;

public class TanpaObjects {

    public static void main(String[] args) {
        execute(new Data("Dani", "Dani"));
        execute(new Data(null, null));
    }

    public static void execute(Data data) {

        if (data != null) {
            System.out.println(data.toString());
            System.out.println(data.hashCode());
            System.out.println(data.equals(data));
        }

    }

    public static class Data {
        private String product1;
        private String product2;

        public Data(String product1, String product2) {
            this.product1 = product1;
            this.product2 = product2;
        }

        public Data() {
        }

        public String getProduct1() {
            return product1;
        }

        public void setProduct1(String product1) {
            this.product1 = product1;
        }

        public String getProduct2() {
            return product2;
        }

        public void setProduct2(String product2) {
            this.product2 = product2;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Data data = (Data) o;

            if (product1 != null ? !product1.equals(data.product1) : data.product1 != null) return false;
            return product2 != null ? product2.equals(data.product2) : data.product2 == null;
        }

        @Override
        public int hashCode() {
            int result = product1 != null ? product1.hashCode() : 0;
            result = 31 * result + (product2 != null ? product2.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return "Data{" +
                    "product1='" + product1 + '\'' +
                    ", product2='" + product2 + '\'' +
                    '}';
        }
    }
}

package com.yeahbutstill;

import java.util.Objects;

public class ObjectsApp {
    public static void main(String[] args) {
        execute(new ObjectsApp.Product("Polo", "Chino"));
        execute(new ObjectsApp.Product("Code Orang", "Samurai"));
        execute(new ObjectsApp.Product(null, null));
    }

    public static void execute(Product product) {
        System.out.println(Objects.toString(product));
        System.out.println(Objects.hashCode(product));
        System.out.println(Objects.equals(product, product));
    }

    public static class Product {
        private String baju;
        private String celana;

        public Product(String baju, String celana) {
            this.baju = baju;
            this.celana = celana;
        }

        public Product() {
        }

        public String getBaju() {
            return baju;
        }

        public void setBaju(String baju) {
            this.baju = baju;
        }

        public String getCelana() {
            return celana;
        }

        public void setCelana(String celana) {
            this.celana = celana;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Product product = (Product) o;

            if (baju != null ? !baju.equals(product.baju) : product.baju != null) return false;
            return celana != null ? celana.equals(product.celana) : product.celana == null;
        }

        @Override
        public int hashCode() {
            int result = baju != null ? baju.hashCode() : 0;
            result = 31 * result + (celana != null ? celana.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "baju='" + baju + '\'' +
                    ", celana='" + celana + '\'' +
                    '}';
        }
    }
}

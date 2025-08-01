package HomeWork5.ArrayListHashMap.ku.cs.swcon;

import java.beans.PropertyDescriptor;
import java.util.ArrayList;
import java.util.HashMap;


public class SalesAnalyzer {
    
    private static class Product {
        String name;
        String category;

        public Product(String name, String category){
            this.name = name;
            this.category = category;
        }
    }
    private ArrayList<Product> productList;
    public SalesAnalyzer(){
        productList = new ArrayList<>();
    }

    public void addProduct(String name, String category){
        productList.add(new Product(name, category));
    }
    public void printCategorySummary(){
        HashMap<String, Integer> categoryCount = new HashMap<>();

        for(Product p : productList){
            int count = categoryCount.getOrDefault(categoryCount, 0);
            categoryCount.put(p.category, count + 1);
        }

        for (String category :  categoryCount.keySet()){
            System.out.println(category + ": " + categoryCount.get(category));  
        }
    }

    public class Main{
        public static void main(String[] args) {
            SalesAnalyzer analyzer = new SalesAnalyzer();
            analyzer.addProduct("Laptop", "Electronics");
            analyzer.addProduct("Smartphone", "Electronics");
            analyzer.addProduct("Notebook", "Stationery");
            analyzer.printCategorySummary();    
        }
    }
}

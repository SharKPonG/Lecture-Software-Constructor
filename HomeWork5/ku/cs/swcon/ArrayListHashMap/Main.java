package HomeWork5.ku.cs.swcon.ArrayListHashMap;
    public class Main{
        public static void main(String[] args) {
            SalesAnalyzer analyzer = new SalesAnalyzer();
            analyzer.addProduct("Laptop", "Electronics");
            analyzer.addProduct("Smartphone", "Electronics");
            analyzer.addProduct("Notebook", "Stationery");
            analyzer.printCategorySummary();    
        }
    }

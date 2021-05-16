package src;

public class Test {
    public static void main(String[] args) {
        int i;
      
        for (i = 0; i < 10; i++) {
            int j = (int) (Math.random() * 100);
            Product p = new Product(i, " Product " , j);
            p.printProd();//Не вышло зайти на сервлеты, проверка консолью


        }

    }
}

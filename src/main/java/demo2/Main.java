package demo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello2");
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        ShoppingCart shoppingCart = context.getBean(ShoppingCart.class);
        shoppingCart.checkout("done");
    }
}

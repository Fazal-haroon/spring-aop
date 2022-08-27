package demo2;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    public void checkout(String status){
        //logging
        //authentication and authorization
        //sanitize the data
        System.out.println("checkout method from shoppingCart called "+status);
    }

    public int quantity(){
        return 2;
    }
}

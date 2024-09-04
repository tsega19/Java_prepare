package Collection;


import java.util.Iterator;
import java.util.*;


@SuppressWarnings("rawtypes")
class Products {


    String name;

        public Products(String name) {
            this.name = name;
        }

        public static void main(String[] args) {

            Products product = new Products(null);
            List products = new ArrayList();
            // Check if the name is null before using it
            if (product.name != null) {
                System.out.println(product.name.getClass());
            } else {
                System.out.println("Product name is null.");
            }
        }
    }



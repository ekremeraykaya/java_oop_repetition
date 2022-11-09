public class Main{

    public static void main(String[] args) {
        	
	// Overloaded Constructors: Multiple constructors within a class with the same name,
	//                          but have different parameters
	//                          name + parameters = signature



	System.out.println("\n");

        Pizza pizza1 = new Pizza("thick crust", "tomato", "mozzerella", "pepperoni");

        System.out.println("Here are the ingredients of your first pizza: ");

        System.out.println(pizza1.bread);
        System.out.println(pizza1.sauce);
        System.out.println(pizza1.cheese);
        System.out.println(pizza1.topping);

        System.out.println("\n");

        Pizza pizza2 = new Pizza("thick crust", "tomato", "mozzerella");

        System.out.println("Here are the ingredients of your second pizza: ");

        System.out.println(pizza2.bread);
        System.out.println(pizza2.sauce);
        System.out.println(pizza2.cheese);

        System.out.println("\n");

        Pizza pizza3 = new Pizza("thick crust", "tomato");

        System.out.println("Here are the ingredients of your third pizza: ");

        System.out.println(pizza3.bread);
        System.out.println(pizza3.sauce);


        System.out.println("\n");


        Pizza pizza4 = new Pizza("thick crust");

        System.out.println("Here are the ingredients of your fourth pizza: ");

        System.out.println(pizza4.bread);


        System.out.println("\n");


        Pizza pizza5 = new Pizza();

        System.out.println("Here are the ingredients of your fifth pizza: ");

        System.out.println(pizza5.bread);
        System.out.println(pizza5.sauce);
        System.out.println(pizza5.cheese);
        System.out.println(pizza5.topping);

    }
}

		

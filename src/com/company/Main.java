package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Store walMart = new Store();

        Vendor weMakeIcecream = new Vendor("weMakeIcecream");
        Vendor weMakePop = new Vendor("weMakePop");
        Vendor weMakeCandy = new Vendor("weMakeCandy");

        Vendor listOfVendors[] = {weMakeIcecream, weMakePop, weMakeCandy};


        // loop add venders to the Store Class;
        for(int i =0; i < listOfVendors.length; i++){
            walMart.addToVenderList(listOfVendors[i]);
        }

        walMart.printVendorList();

        // Create products
        Products ic1 = new Products("chocolate", "a flavor", 2.25,9);
        Products ic2 = new Products("cookies and cream", "a flavor", 2.25,8);
        Products ic3 = new Products("butter pecan", "a flavor", 2.25,5);
        Products ic4 = new Products("mint chocolate chip", "a flavor", 2.25);
        Products ic5 = new Products("pineapple", "a flavor", 2.25,2);

        Products listOfIcecreamList[] = {ic1, ic2, ic3, ic4, ic5};
        // add ice cream products to WeMakeIceCream vendor
        for(int i = 0; i < listOfIcecreamList.length; i++){
            weMakeIcecream.addToProductsArr(listOfIcecreamList[i]);
        }

        // print ice cream list
        weMakeIcecream.printProctuctList();

        Products pop1 = new Products("Sprit", "a flavor", 2.25, 3);
        Products pop2 = new Products("Coke", "a flavor", 2.25, 5);
        Products pop3 = new Products("Pepsi", "a flavor", 2.25, 7);
        Products pop4 = new Products("HI-C", "a flavor", 2.25);
        Products pop5 = new Products("Grape", "a flavor", 2.25);

        Products listOfPop[] = {pop1, pop2, pop3, pop4, pop5};

        System.out.println("----------------");
        for(int i = 0; i < listOfIcecreamList.length; i++){
            weMakePop.addToProductsArr(listOfPop[i]);
        }
        weMakePop.printProctuctList();


        Products candy1 = new Products("Henry", "a flavor", 2.25);
        Products candy2 = new Products("M&M", "a flavor", 2.25);
        Products candy3 = new Products("Snickers", "a flavor", 2.25, 6);
        Products candy4 = new Products("KitKat", "a flavor", 2.25, 4);
        Products candy5 = new Products("Reeses", "a flavor", 2.25, 9);
        Products listOfCandy[] = {candy1, candy2, candy3, candy4, candy5};


        System.out.println("----------------");
        for(int i = 0; i < listOfIcecreamList.length; i++){
            weMakeCandy.addToProductsArr(listOfCandy[i]);
        }


        for(int i = 0 ; i < listOfCandy.length; i++){
            walMart.addProdToCart(listOfCandy[i]);
        }
        walMart.printCartList();

        candy5.incrementStock();


    }

//    public void printList(Vendor vendor, ArrayList<Products> list){
//
//    }
}

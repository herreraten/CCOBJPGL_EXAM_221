package Tourists;


import Locations.*;

public class Me implements Tourist {

    static int budget = 1000;
    

    public void visit() {
        System.out.print("Enjoying my stay");
    }

    public void visit(Boracay boracay) {
        System.out.println("ang cash money ko ay " + getBudget());

        if ( budget > boracay.airFare  ){
            System.out.println("going to boracay" );
            budget -= boracay.airFare;
            
        }else{
            System.out.println("wala nang pera");
        }

      checkBudget();
        
    }

    public void visit(Bohol bohol) {

        if(budget >bohol.airFare){
            System.out.println("lets go bohol");
            budget -= bohol.airFare;
        }else{
            System.out.println("wala nanaman pera");
        }

        checkBudget();
    }
    public void visit(Cebu cebu) {
        if(budget >cebu.airFare){
            System.out.println("cebu time!");
            budget -= cebu.airFare;
        }else{
            System.out.println("umay naman ubos na pera");
        }

        checkBudget();
    }

    public void visit(Palawan palawan) {
        if(budget >palawan.airFare){
            System.out.println("palawan time!");
            budget -= palawan.airFare;
        }else{
            System.out.println("wala nang budget");
        }

        checkBudget();
    }

    public void visit(Siargao siargao) {
        if(budget >siargao.airFare){
            System.out.println("lets go siargao!");
            budget -= siargao.airFare;
        }else{
            System.out.println("umay naman ubos na pera");
        }

        checkBudget();
    }

    public void visit(Vigan vigan) {
        if(budget >vigan.airFare){
            System.out.println("YES TARA VIGAN");
            budget -= vigan.airFare;
        }else{
            System.out.println("BROKE MOMENTS");
        }

        checkBudget();
    }

    public void checkBudget() {
        System.out.println("my budget is " + budget);
    }

    public static int getBudget() {
        return budget;
    }


}

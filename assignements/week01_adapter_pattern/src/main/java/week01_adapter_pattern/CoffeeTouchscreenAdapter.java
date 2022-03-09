package week01_adapter_pattern;


public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {

    protected OldCoffeeMachine oldVendingMachine;

    public CoffeeTouchscreenAdapter(){
        this.oldVendingMachine = new OldCoffeeMachine();
    }
    
    public void chooseFirstSelection(){
        this.oldVendingMachine.selectA();
    }
    
    public void chooseSecondSelection(){
        this.oldVendingMachine.selectA();    
    }
}

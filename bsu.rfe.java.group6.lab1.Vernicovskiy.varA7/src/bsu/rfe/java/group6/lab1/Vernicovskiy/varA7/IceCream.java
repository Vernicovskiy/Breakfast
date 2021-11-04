package bsu.rfe.java.group6.lab1.Vernicovskiy.varA7;

public class  IceCream extends Food {
    
    private String syrup;

    public IceCream (String a){
        super ("IceCream") ;
        this.syrup = a;
    }

    public String toString ()
    {
        return super.toString() + " c сиропом " + syrup;

    }
    public String get_syrup()
    {
        return syrup;

    }

    public void set_syrup (String b)
    {
        syrup = b;

    }
    public boolean equals(Object obj){
        if(!(obj instanceof Food)){
            return false;
        }
        else if (syrup == null || ((IceCream)obj).syrup == null){  // имя не задано
            return false;
        }
        return syrup.equals(((IceCream)obj).syrup);
    }

    @Override
    public void consume() {
        System.out.println(this + " " + "скушали");
    }
}

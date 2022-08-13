import static java.lang.Math.sqrt;

public class Paramether {

    private double a;
    private double b;
    private double c;

    public Paramether(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double delta(){
        double delta= b*b-4*a*c;
        return delta;
    }
    public void valutationDelta(){
        if(delta() > 0)
            System.out.println("The parabolic is positive");
        else if (delta() < 0)
            System.out.println("The parabolic no exist");
        else
            System.out.println("The parabolic is 0");
    }

    public void calcoltor(){
        double x1= (-b+sqrt(delta()))/2*a;
        double x2= (-b-sqrt(delta()))/2*a;
        System.out.println("X 1 = "+x1);
        System.out.println("X 2 = "+x2);
    }

    @Override
    public String toString() {
        return "-----Equazion-----" +"\n"+
                a+"X^2"+"+"+b+"X"+c+"=0";

    }
}

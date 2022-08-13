public class Paramether {

    private double a;
    private double b;
    private double c;

    public Paramether(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c,
    }
    public double delta(){
        double delta= b*b-4*a*c;
        return delta;
    }
    public void valutationDelta(){
        if(delta() > 0)
            System.out.println("The parabolic is positive");
        else if (delta() < 0)
            System.out.println("The parabolic is negative");
        else
            System.out.println("The parabolic is 0");
    }
}

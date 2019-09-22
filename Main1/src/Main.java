import java.util.Scanner;

/**
 * @author 17910
 */
public class Main {
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        Fraction a =new Fraction(in.nextInt(),in.nextInt());
        Fraction b =new Fraction(in.nextInt(),in.nextInt());
        a.print();
        b.print();
        a.plus(b).print();
        a.multiply(b).plus(new Fraction(5,6)).print();
        a.print();
        b.print();
        in.close();
    }

    }
class Fraction{

    private int up;
    private int down;
    Fraction(int m,int n) {
        this.up= m;
        this.down=n;
    }

    void print() {
        int x,m,n;
        m=up;n=down;

        if (m==n){
            System.out.println(m/n);
        }
        else{
            while(n!=0){
                x=m%n;
                m=n;
                n=x;
            }
            up=up/m;
            down=down/m;
            System.out.println(up+"/"+down);

        }
    }

    Fraction plus(Fraction b) {
        Fraction i=new Fraction(0,1);
        i.down=b.down*down;
        i.up=b.down*up+down*b.up;
        return i;
    }

    Fraction multiply(Fraction b){
        Fraction i=new Fraction(0,1);
        i.down=down*b.down;
        i.up=up*b.up;
        return i;
    }

    public double toDouble(){
        return up*0.1/down;
    }
}



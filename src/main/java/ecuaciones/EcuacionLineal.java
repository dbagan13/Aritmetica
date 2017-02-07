package ecuaciones;

/**
 * Created by al341841 on 7/02/17.
 */
public class EcuacionLineal {
    public double a;
    public double b;

    public EcuacionLineal() {
        this.a=0;
        this.b=0;

    }
    public EcuacionLineal(double a, double b) {
        this.a=a;
        this.b=b;
    }

    public double resultado() {
        if (b==0) return 0;
        return(-b/a);
    }
}

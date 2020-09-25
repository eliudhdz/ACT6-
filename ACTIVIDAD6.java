
import java.util.*;
import java.lang.*;

public class ACTIVIDAD6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cal []= new int[5];
        double prom;
        double suma=0;
        System.out.println("Dame el total de tu primer materia");
    cal[0]=scanner.nextInt();
        System.out.println("dame el total de tu segunda materia");
    cal[1]=scanner.nextInt();
        System.out.println("dame el total de tu tercer materia");
    cal[2]=scanner.nextInt();
        System.out.println("dame el total de tu cuarta materia");
    cal[3]=scanner.nextInt();
        System.out.println("dame el total de tu quinta materia");
    cal[4]=scanner.nextInt();
        for (int i : cal) {
            suma += i;
        }
        prom=(suma/cal.length);
        System.out.println("Tú promedio es: " +prom );

        if (prom>=91&&prom<=100)
            System.out.println("Felicidades tu califacacion final es 'A' ");
        else
        if (prom>=81&&prom<=90)
            System.out.println("Felicidades tu califacion final es 'B'");
        else
        if (prom>=71&&prom<=80)
            System.out.println("Felicidades tu calificacion finaL es aprobatoria 'C'");
        else
        if (prom>61&&prom<=70)
            System.out.println("Puedes hacerlo mejor tu califacion final no es aprobatoria 'D'");
        else
        if (prom>=51&&prom<=60)
            System.out.println("Puedes hacerlo mejor tu califacion final no es aprobatoria 'E'");
        else
        if (prom>=0&&prom<=50)
            System.out.println("Puedes hacerlo mejor tu califacion final no es aprobatoria 'F");


    }
}
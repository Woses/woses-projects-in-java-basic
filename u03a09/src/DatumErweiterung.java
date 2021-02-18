import java.util.Scanner;
import java.util.*;

public class DatumErweiterung {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int j= sc.nextInt();
        int m= sc.nextInt();
        int t= sc.nextInt();
        int s= sc.nextInt();
        int m1= sc.nextInt();
        int m2= sc.nextInt();
        int wert1=0;
        int wert2=0;
        int wert3=0;
        int wert4=0;    
        
        wert1 = ( m1 + m2 )/60;
        m1 += m2;
        if( m1 >= 60 ) {
            m1 = m1 %60;
        }
        wert2 = (s+wert1)/24;
        s+=wert1;
        if( s >= 24 ) {
            s = s % 24;
        }
        if( m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12 ) {
        	wert3 = (t +wert2)/31;
            t +=wert2;
            if(t>31) {
                t = t%31;
            }
        } else if( m == 4 || m == 6 || m == 9 || m == 11 ) {
        	wert3 = (t+wert2)/30;
            t +=wert2;
            if(t>30) {
                t = t%30;          
            }
        } else if( m == 2 ) {
            t += wert2;
            wert3 = (t+wert2)/28;
            if(t>=28) {
                t = t%28;
            }    
        }
        wert4 = (m+wert3)/12;
        m += wert3;
        if(m>12) {
            m = m%12;            
        }    
        j += wert4;
        System.out.println(j+" "+m+" "+t+" "+s+" "+m1);    
        sc.close();
    }            
}
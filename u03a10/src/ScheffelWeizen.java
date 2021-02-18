public class ScheffelWeizen {

    public static void main(String[] args) {
        
        int m, f, k, scheffelrest1, personenrest1, scheffelrest2, personenrest2, scheffelrest3, personenrest3;
        
        int s = Integer.parseInt(args[0]); 
        int n = Integer.parseInt(args[1]); 
        
        for(int i=0;i<=s;i++)
        {
            m = i;
            scheffelrest1 = s - (m * 3);
            personenrest1 = n - m;
            for(int j=0;j<=scheffelrest1;j++)
            {
                f = j;
                scheffelrest2 = scheffelrest1 - (f * 2);
                personenrest2 = personenrest1 - f;
                for(int l=0;l<=(scheffelrest2*2);l++)
                {
                    k = l;
                    scheffelrest3 = scheffelrest2 - (k / 2);
                    personenrest3 = personenrest2 - k;
                    if(scheffelrest3 == 0 && personenrest3 == 0)
                    {
                        System.out.println(m + " " + f + " " + k);
                    }
                }
            }
        }
    }
}
import java.util.*; 
  
class Hello
{ 
       
    static void max(int ar[], int n) 
    { 
        if (n < 2) 
        { 
            System.out.println("No pairs exists"); 
            return; 
        } 
       
        int a = ar[0], b = ar[1]; 
       
        for (int i = 0; i < n; i++) 
          for (int j = i + 1; j < n; j++) 
             if (ar[i] * ar[j] > a * b)
             { 
                a = ar[i];  
                b = ar[j]; 
             } 
               
        System.out.println("Max product pair is {" + 
                           a + ", " + b + "}"); 
    } 
      
    public static void main(String[] args)  
    { 
        int arr[] = {1, 2,8,4,6,3,7,8,4,0,4}; 
        int n = arr.length; 
        max(ar, n); 
              
    } 
} 

 class complex {
       complex(){

       }

       double real1;
        double imag1;
        complex( double real , double imaginary)
        {
            this.real1 = real;
            this.imag1= imaginary;
        }
        complex add(complex c1, complex c2)
        {
            complex ctemp = new complex();
            ctemp.real1 = c1.real1 + c2.real1;
            ctemp.imag1 = c1.imag1+c2.imag1;
            return ctemp;
        }

    }
      public class Solution {
    public static void main(String[] args){
         complex c1 = new complex(4,5);
         complex c2 = new complex(5,6);
         complex c3 = new complex();
         c3 = c3.add(c1,c2);
         System.out.println("Sum :");
        System.out.println("Real :" + c3.real1);
        System.out.println("Imaginary :" + c3.imag1);
    }
}



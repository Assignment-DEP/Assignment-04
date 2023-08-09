public class Assignment04B2{
    public static void main(String[] args) {
        int a = 0;
        int e =0;
        int b = 7;
        while(e++<4){
            int k = 0;
            while(k<7){
                if((b-(2*a-1))==8){
                    System.out.print("+ ");
                    
                    k++;
                }
                else {
                    if(k<((b-(2*a-1))/2)){
                        System.out.print("+ ");
                    }
                    else if(((b-(2*a-1))/2)<=k && (((b-(2*a-1))/2)+(2*a-1))>k){
                        System.out.print("  ");

                    }
                    else{
                        System.out.print("+ ");
                    }
                   k++;
                }
              
            }
            a++;
            System.out.println();
            // b-=(2*a-1);
            
            
        }

        
    }
}
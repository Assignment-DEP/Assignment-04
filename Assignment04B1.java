public class Assignment04B1{
    public static void main(String[] args) {
        int a = 0;
        int e =1;
        int b = 7;
        while(7>(2*a-1)&&((e<=(2*a-1))||b>0)){
            int k = 0;
            while(k<7){
                if((b-(2*a-1))==8){
                    System.out.print("* ");
                    
                    k++;
                }
                else {
                    if(k<((b-(2*a-1))/2)){
                        System.out.print("* ");
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
            // b-=(2*a-1);
            
            
        }

        
    }
}
class Armstrong{
          public static void main(String[] args){
              int num=153;
	        int t1=num;
              int length=0;
               while(t1!=0){
                    t1=t1/10;
                    length=length+1;
                   }
              int t2=num;
              int rem;
              int arm=0;
              while(t2!=0){
               rem=t2%10;
              int mult=1;	
              for(int i=1;i<=length;i++){
                   mult=mult*rem;
                    }
               arm=arm+mult;
               t2=t2/10;
              }
           if(num==arm){
            System.out.println("Armstrong Number!");
            }
           else{
               System.out.println("Not Armstrong Number!");
            }
    }
}
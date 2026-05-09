class monkey{
    public static void main(String [] args){
        int n,k,j,m,p;
        n=0;
        k=3;
        j=3;
        m=12;
        p=12;
        int remban=m%k;
        int rempea=p%j;

        if(n<1){
            System.out.println("Monkies not found !");
            System.exit(0);
        }


        if ((remban + rempea)==0){
            int downmonkey=(m/k)+(p/j);
            System.out.println("Monkies remaining on the tree is "+ (n-downmonkey));
        }else if((remban+rempea)>0){
            int downmonkey=((m-remban)/k)+((p-rempea)/j)+1;

            System.out.println("Monkies remaining on the tree is "+ (n-downmonkey));
        }

    }


}

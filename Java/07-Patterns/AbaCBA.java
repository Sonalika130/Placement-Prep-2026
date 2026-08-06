class AbaCBA {
    public static void main(String[] args){
        int n=4;
        for(int i=1;i<=n;i++){
            //restarts so inside loop
            char ch=(char)('A'+i-1);//starts with different charcter
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
                ch--;//backward to a

            }
            System.out.println();
        }
    }
}
class ExplicitNarrowing{
    public static void main(String[] args) {
        double d=5.50;
        int i=(int) d;
        System.out.println(i);
        int j=2;
        double res=(double)i/2;
        System.out.println(res);
        int k=65;
        char c=(char)k;
        System.out.println(c);
        double ress=(double)k/i;
        System.out.println(ress);
    }
}
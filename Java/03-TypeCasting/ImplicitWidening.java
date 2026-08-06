class ImplicitWidening{
    public static void main(String[] args) {
        int a=3;
        double b=a;
        float c=2.7f;
        double d=c;

        System.out.println("conversion to double:"+b+ "conversion to double:"+d);
    }
}
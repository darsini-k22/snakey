public class arraySort {
    public static void main(String[] argc){
        try{
            Number[] n=new Double[4];
            n[0]=2;
        }catch (ArrayStoreException a){
            System.out.println(a.getMessage());
        }

    }
}

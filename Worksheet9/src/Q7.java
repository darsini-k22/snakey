class QuickSort extends Thread{
    int[] arr;
    int h;
    int l;
    static int pivot;
    QuickSort(int[] arr,int h,int l){
        this.arr=arr;
        this.h=h;
        this.l=l;
    }

    static void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;
    }

    static int partition(int[] arr,int l,int h){
        pivot=arr[h];
        int i=(l-1);

        for(int j=l;j<=h-1;j++){
           if(arr[j]<=pivot){
               i++;
               swap(arr[i],arr[j]);
           }
        }
        swap(arr[i+1],arr[h]);
        return (i+1);
    }

    static void quickSort(int[] arr,int l,int h){
        if(l<h){
            int pindex=partition(arr,l,h);
            quickSort(arr,l,pindex-1);
            quickSort(arr,pindex+1,h);
        }

    }

//    void display(int[] array,int n){
//        for(int i=0;i<n;i++){
//            System.out.print(array[i]+", ");
//        }
//    }
}

public class Q7 {
    public static void main(String[] argc){
        int[] arr={10,2,6,7,9};
        QuickSort q=new QuickSort(arr,0,arr.length);
        q.quickSort(arr,arr[0],arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
    }
}

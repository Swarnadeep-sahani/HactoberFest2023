import java.util.HashSet;
import java.util.Set;
class intersationOfTwoArray {
    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
       Set<Integer>set1=new HashSet<>();
       Set<Integer>set2=new HashSet<>();
       int Size=0;
       for (int i : a) {
          set1.add(i);
       }
        for (int i : b) {
          set2.add(i);
       }
      if(n>m)
      {
       set1.retainAll(set2);
       Size=set1.size();
      }
      else{
        set2.retainAll(set1);
        Size=set2.size();
      }
       return Size; 
    }
    public static void main(String[] args) {
        int a[]={89, 24, 75, 11, 23};
        int b[]={89, 2, 4};
       System.out.println(NumberofElementsInIntersection(a, b, 6, 5));
    }
}

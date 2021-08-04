import java.util.Arrays;

public class JavaPractice {

    public static void main(String[] args) {

        String name="npd";
        System.out.println(name);

        String name2=new String("npd");
        System.out.println(name2);

        System.out.println();

        String s1="Cat";
        String s2="Cat";
        System.out.println(s1==s2);

        String d1="Dog";
        String d2="dog";
        System.out.println(d1==d2);

        System.out.println("===================================================");


        String c1="npd";//pool
        String c2=new String("npd"); //heap
        String c3=new String("npd");//heap
        String c4="npd";//pool
        String c5="npd";//pool

        System.out.println(c1==c2);
        System.out.println(c2==c3);


        System.out.println("==========================");
        int[]numbers={300,100,200,500,600};
        System.out.println(Arrays.toString(numbers));

        System.out.println("==========================");

        System.out.println("A");
        System.out.println("B");

        System.out.print("A");
        System.out.print("B");

        System.out.println("============================================");

        System.out.println("Hello \nMy name is Tuseef");

        System.out.println("==============================================");
        System.out.println("\tI am here");

        String[] fruits={"Apple","Banana","Kiwi","Apricot"};
        //                  0       1       2       3

        System.out.println("=============================================");

        String sentence="I am here once again";
        //               0 12 3456 78910 1112131415
        String word1=sentence.substring(0,4);


        System.out.println("what I tell my manager:");
        String myfeelings="I hate when I have to sign off from NPD";
        System.out.println(myfeelings);
        System.out.println("==========================");
        System.out.println("my real feelings:");
        String myrealfeelings=myfeelings.substring(0,7);
        String myrealfeelings2=myfeelings.substring(36);
        System.out.println(myrealfeelings + myrealfeelings2);
        System.out.println("==========================");
        System.out.println("myfeelings:\n"+myrealfeelings+ myrealfeelings2);

        System.out.println("=====================================");

        int []name3={1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i <= name3.length-1 ; i++) {
            System.out.print(name3[i]+" ");
        }

    }

}

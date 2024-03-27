package backupFiles;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

interface MathematicalOperation {
    public int operate(int x,int y);
}

class Addition implements MathematicalOperation{
    @Override
    public int operate(int x, int y) {
        return x+y;
    }
}

class Client{
    public static void main1(String[] args) {
        // MathematicalOperation operation = new Addition();
        // System.out.println(operation.operate(2, 3));

        // addition object is created and can be used anywhere in the code to add 2 numbers
        // MathematicalOperation addition = (num1,num2) -> num1+num2;
        // System.out.println(addition.operate(2, 3));

        //Comparator interfaces
        List<Integer> x = new ArrayList<>();
        x.add(2);
        x.add(1);
        x.add(4);
        x.add(3);

        System.out.println("\nDefault Sequence");
        x.forEach((a)-> {
            System.out.print(a + " ");
        });

        x.sort((a,b) -> {
            if(a>b) return -1;
            if(a<b) return 1;
            else return 0;
        });
        
        System.out.println("\nDescending Sorted Using list.sort(comparator) Method");
        x.forEach((a)-> {
            System.out.print(a+" ");
        });

        Collections.sort(x,(a, b)->{
            if(a>b) return 1;
            if(a<b) return -1;
            else return 0;
        });

        System.out.println("\nAscending Sorted Using Collections.sort(comparator) Method");
        x.forEach((a)-> {
            System.out.print(a+" ");
        });

        System.out.println("\n");

    }

    public static void main(String[] args) {
        List<Integer> x = new ArrayList<>();
        x.add(50);
        x.add(10);
        x.add(15);
        x.add(20);

        x.stream().filter((i) -> {return i % 5 == 0;}).sorted().limit(3).collect(Collectors.toList()).forEach((i)-> {
            System.out.println(i);
        });;

    }

}

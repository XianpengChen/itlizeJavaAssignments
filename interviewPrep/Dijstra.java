package interviewPrep;

import java.util.*;

public  class Dijstra {
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int start=s.nextInt();
        int current=s.nextInt();
        Map<Integer,Integer> version=new HashMap<Integer,Integer>();
        Map<Integer,Integer>volume=new HashMap<Integer,Integer>();
        volume.put(start,0);
        s.nextLine();
        while(s.hasNextLine()){
            String str=s.nextLine();
            String []input=str.split(" ");
            Integer input0=Integer.valueOf(input[0]);
            Integer input1=Integer.valueOf(input[1]);
            Integer input2=Integer.valueOf(input[2]);
            if(version.get(input1)==null){
                version.put(input1,input0);
                volume.put(input1,volume.get(input0)+input2);
            }else if(volume.get(input1)>volume.get(input0)+input2){
                version.put(input1,input0);
                volume.put(input1,volume.get(input0)+input2);
            }
        }
        List l=new ArrayList();
        l.add(current);
        int vol=volume.get(current);
        while(version.get(current)!=null){
            l.add(version.get(current));
            current=version.get(current);
        }
        for(int i=l.size()-1;i>=0;i--){
            System.out.print(l.get(i));
            if(i!=0)System.out.print("->");
        }
        System.out.printf("(%d)",vol);

    }
}
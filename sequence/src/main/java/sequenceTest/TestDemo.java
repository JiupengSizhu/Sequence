package sequenceTest;

//import java.awt.desktop.SystemEventListener;

public class TestDemo {
    public static void main(String[] args) {
        //表头
        String form="姓名  学号  数据结构  外语  数学建模  体育  总成绩";
        System.out.println(form);
        MySequenceImpl mySequence = new MySequenceImpl();
//        for (int i = 0; i < 5 ; i++) {
//
//            mySequence.add(i,i);
//
//        }
        Object[] data=new Object [5];
        data[0]="徐一  123456  87      98     94      90    372";
        data[1]="启强  123457  90      98     97      90    372";
        data[2]="启盛  123458  97      98     94      90    372";
        data[3]="黄五  123459  90      93     94      90    372";
        data[4]="刘六  123450  88      98     92      90    372";
        for(int i=0;i<5;i++){
            mySequence.add(i,data[i]);
        }
        mySequence.display();
        System.out.println("----------------------------------------------------");
        System.out.println("找到索引为2的数据为:");
        Object n1 = mySequence.getPostValue(2);
        System.out.println(n1);
        System.out.println("----------------------------------------------------");
        System.out.println("添加刘六的数据结果为：");
        mySequence.add(1,data[4]);
        mySequence.display();
        System.out.println("----------------------------------------------------");
        System.out.println("查找数据的索引为：");
        int ret1 = mySequence.search(data[3]);
        System.out.println(ret1);
        System.out.println("----------------------------------------------------");
        System.out.println("是否找到索引为3的数据：");
        boolean ret2 =mySequence.contains(data[3]);
        System.out.println(ret2);
//        System.out.println("---------------------------------------------------");
//        System.out.println("删除数据：");
//        Object k = mySequence.remove(data[0]);
//        System.out.println(k);

    }

}

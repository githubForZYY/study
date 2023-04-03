package collection.arraylist;

import java.util.ArrayList;
import java.util.List;

/*
    验证ArrayList的初始容量以及扩充容量
*/
public class TestArrayList {
    public static void main(String []args){
        List l=new ArrayList();
        System.out.println("不添加元素时ArrayList的初始容量："+l.size());
        Object b=new Object();
        l.add(b);
        System.out.println("添加一个元素时ArrayList的初始容量："+l.size());
    }
    //测试推送本地工程到GitHub
}

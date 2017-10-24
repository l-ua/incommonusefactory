package com.aspire.study.lu.BuilderFactory;

public class BuilderFactoryTest {
  public static void main(String[] args) {
    // 通过链表形式给对象注值提高了代码的可读性（相比通过构造器设置的方式）
    AbstractHuman man =
        new Human.Builder().age(25).caeer("程序猿").isSingal(true).name("tom").builder();
    man.age=30;
    System.out.println(man.age);
  }
}

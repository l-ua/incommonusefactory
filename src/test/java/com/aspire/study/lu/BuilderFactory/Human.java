package com.aspire.study.lu.BuilderFactory;

public class Human extends AbstractHuman {

  /**
   * 减少了 new xx(xxxx)  这样代码，提高了代码的可读性
   * @param personBuilder
   */
  public Human(Builder personBuilder) {
    super.age = personBuilder.age;
    super.caeer = personBuilder.caeer;
    super.isSingal = personBuilder.isSingal;
    super.name = personBuilder.name;

  }

  /**
   * 内部内 实现通过链表的方式给对象注入值
   */
  public static class Builder extends AbstractHuman {
   /* private String name;

    private int age;

    private String caeer;

    private boolean isSingal;*/

    /**
     * 内部内 实现通过链表的方式给对象注入值
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public Builder age(int age) {
      this.age = age;
      return this;
    }

    public Builder caeer(String caeer) {
      this.caeer = caeer;
      return this;
    }

    public Builder isSingal(boolean isSingal) {
      this.isSingal = isSingal;
      return this;
    }

    /**
     * 通过这个方法 调用 父类的构造器生成一个对象
     * 
     * @return
     */
    public Human builder() {
      return new Human(this);
    }
  }
}

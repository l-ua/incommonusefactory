package com.aspire.study.lu.DecoratorPattern;

/**
 * 对原始进行装饰（添加）功能A
 */
public class ConcreteDecoratorA extends Decorator {
  public ConcreteDecoratorA(Component component) {
    super(component);
  }

  private void operationBefore() {
    // 在调用父类的operation方法之前需要执行的操作
    System.out.println("A operationBefore " + "在调用父类的operation方法之前需要执行的操作");
  }

  private void operationAfter() {
    // 在调用父类的operation方法之后需要执行的操作
    System.out.println("A operationAfter " + "在调用父类的operation方法之后需要执行的操作");
  }

  public void operation() {
    // 调用父类的方法，可以在调用前后执行一些附加动作
    operationBefore(); // 添加的功能
    super.operation(); // 这里可以选择性的调用父类的方法，如果不调用则相当于完全改写了方法，实现了新的功能
    operationAfter(); // 添加的功能
  }
}

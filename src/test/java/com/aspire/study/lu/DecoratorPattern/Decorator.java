package com.aspire.study.lu.DecoratorPattern;

/**
 * 装饰基类
 */
public abstract class Decorator extends Component {
  // 为了 跟对象 服务
  // 装饰的目的就是为了修饰跟
  protected Component component;

  public Decorator(Component component) {
    this.component = component;
  }

  public void operation() {
    // 转发请求给组件对象，可以在转发前后执行一些附加动作
    component.operation();
  }
}

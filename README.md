# 设计模式学习代码
一些简单的设计模式实现.用于学习;  
                  _java_  
    # Iterator模式:

_为什么要引入?_

- ​		引入Iterator后可以将遍历与实现分离开来.即遍历过程中不依赖于集合的方法进行实现;

**在Iterator模式中,Aggregate与Iterator这两个接口对应,并且其具体类也对应,但是一个ConcreteAggregate可以对应多个ConcreteIterator,通过不同的ConcreteIterator来实现不同的遍历要求,例如:跳跃遍历,向前,向后遍历等;**

_易错点_

- ​		Iterator中的next方法:<u>是指返回当前元素,并指向下一个元素;</u>不是返回下一个元素;  

## 持续更新中....

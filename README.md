# 设计模式学习代码
一些简单的设计模式实现和笔记.用于学习;  
                  _java_  
## Iterator模式:

_为什么要引入?_

- ​		引入Iterator后可以将遍历与实现分离开来.即遍历过程中不依赖于集合的方法进行实现;

**在Iterator模式中,Aggregate与Iterator这两个接口对应,并且其具体类也对应,但是一个ConcreteAggregate可以对应多个ConcreteIterator,通过不同的ConcreteIterator来实现不同的遍历要求,例如:跳跃遍历,向前,向后遍历等;**

_易错点_

- ​		Iterator中的next方法:<u>是指返回当前元素,并指向下一个元素;</u>不是返回下一个元素;  

*登场角色*
**Iterator（迭代器）**
该角色负责定义按顺序逐个遍历元素的接口（API）。在示例程序中，由 Iterator 接口扮演这个角色，它定义了 hasNext 和 next 两个方法。其中，hasNext 方法用于判断是否存在下一个元素，next 方法则用于获取该元素。

**ConcreteIterator（具体的迭代器）**
该角色负责实现 Iterator 角色所定义的接口（API）。在示例程序中，由 BookShelfIterator 类扮演这个角色。该角色中包含了遍历集合所必需的信息。在示例程序中，BookShelf 类的实例保存在 bookShelf 字段中，被指向的书的下标保存在 index 字段中。

**Aggregate（集合）**
该角色负责定义创建 Iterator 角色的接口（API）。这个接口（API）是一个方法，会创建出“按顺序访问保存在我内部元素的人”。在示例程序中，由 Aggregate 接口扮演这个角色，它里面定义了 iterator 方法。

**ConcreteAggregate（具体的集合）**
该角色负责实现 Aggregate 角色所定义的接口（API）。它会创建出具体的 Iterator 角色，即 ConcreteIterator 角色。在示例程序中，由 BookShelf 类扮演这个角色，它实现了 iterator 方法。
## Adapter模式

**特点:** 

- 通过该模式可以很方便地创建我们需要的方法群;
- 便于排查系统bug,当出现bug时,我们可以只排查我们所创建的适配器类(Adapter类);
- 可以在不改变现有程序的情况下，通过创建一个适配器，去扩展我们所需的程序;



**源角色（Adaptee）**：你想把谁转换成目标角色，这个“谁”就是源角色，它是已经存在的、运行良好的类或对象。

**适配器角色（Adapter**）：适配器模式的核心角色，其他两个角色都是已经存在的角色，而适配器角色是需要新建立的，它的职责非常简单：通过继承或是类关联的方式把源角色转换为目标角色。

**目标角色（Target）**：该角色定义把其他类转换为何种接口，也就是我们的期望接口。

**类适配器**
优点：可以根据需求重写Adaptee类的方法，使得Adapter的灵活性增强了。
缺点：有一定局限性。因为类适配器需要继承Target类，而Java是单继承机制，所以要求Adaptee类必须是接口。

**对象适配器**
优点：同一个Adapter可以把Adaptee类和他的子类都适配到目标接口。
缺点：需要重新定义Adaptee行为时，需要重新定义Adaptee的子类，并将适配器组合适配。

### 适用场景

- 系统需要复用现有类，而该类的接口不符合系统的需求，可以使用适配器模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。
- 多个组件功能类似，但接口不统一且可能会经常切换时，可使用适配器模式，使得客户端可以以统一的接口使用它们。

## Template Method模式

_什么是Template Method模式?_

- 即在父类中定义处理流程的框架,在子类中实现具体处理;

_登场角色_

**AbstractClass(抽象类)**

不仅负责实现模板方法,还负责声明在模板方法中所使用到的抽象方法,抽象方法由其子类ConcreteClass类进行实现;

**ConcreteClass(具体类)**

实现AbstractClass类的抽象方法,实现的方法将会在AbstractClass角色的模板方法中被调用;

**应用场景**

在软件开发中实现一个算法时，整体步骤很固定、通用，这些步骤已经在父类中写好了。但是某些部分易变，易变部分可以抽象出来，供不同
子类实现。这就是一种模板模式。(使用例子:java的InputStream类)

*优点*:

- 它封装了不变部分，扩展可变部分。它把认为是不变部分的算法封装到父类中实现，而把可变部分算法由子类继承实现，便于子类继续扩展。
- 它在父类中提取了公共的部分代码，便于代码复用。
- 部分方法是由子类实现的，因此子类可以通过扩展方式增加相应的功能，符合开闭原则。

*缺点*:

- 对每个不同的实现都需要定义一个子类，这会导致类的个数增加，系统更加庞大，设计也更加抽象，间接地增加了系统实现的复杂度。
- 父类中的抽象方法由子类实现，子类执行的结果会影响父类的结果，这导致一种反向的控制结构，它提高了代码阅读的难度。
- 由于继承关系自身的缺点，如果父类添加新的抽象方法，则所有子类都要改一遍。
## Factory Method模式

工厂方法模式，又称工厂模式、多态工厂模式和虚拟构造器模式，通过定义工厂父类负责定义创建对象的公共接口，而子类则负责生成具体的对象。

- Product：为产品，属于框架内部，负责声明产品实例所需的方法
- Creator：为创建者，属于框架内部，不仅负责实现模板方法，还负责声明在模板方法中所使用到的抽象方法
- ConcreteProduct：为具体产品，负责具体实现Product角色中声明的抽象方法
- ConcreteCreator：为具体的创建者，负责具体实现Creator角色中声明的抽象方法

**动机**

在软件系统中，经常面临着创建对象的工作;由于需求的变化，需要创建的对象的具体类型经常变化。如何应对这种变化？如何绕过常规的对象创建方法（new），提供一种封装机制来避免客户程序和这种“具体对象创建工作”的紧耦合。

_优点:_

- 更符合开-闭原则 
  新增一种产品时，只需要增加相应的具体产品类和相应的工厂子类即可

  > 简单工厂模式需要修改工厂类的判断逻辑

- 符合单一职责原则 
  每个具体工厂类只负责创建对应的产品

  > 简单工厂中的工厂类存在复杂的switch逻辑判断

- 不使用静态工厂方法，可以形成基于继承的等级结构。

  > 简单工厂模式的工厂类使用静态工厂方法

总结：工厂模式可以说是简单工厂模式的进一步抽象和拓展，在保留了简单工厂的封装优点的同时，让扩展变得简单，让继承变得可行，增加了多态性的体现。

_缺点:_

- 添加新产品时，除了增加新产品类外，还要提供与之对应的具体工厂类，系统类的个数将成对增加，在一定程度上增加了系统的复杂度；同时，有更多的类需要编译和运行，会给系统带来一些额外的开销；
- 由于考虑到系统的可扩展性，需要引入抽象层，在客户端代码中均使用抽象层进行定义，增加了系统的抽象性和理解难度，且在实现时可能需要用到DOM、反射等技术，增加了系统的实现难度。
- 虽然保证了工厂方法内的对修改关闭，但对于使用工厂方法的类，如果要更换另外一种产品，仍然需要修改实例化的具体工厂类；
- 一个具体工厂只能创建一种具体产品

### 应用场景

在了解了优缺点后，我总结了工厂方法模式的应用场景：

- 当一个类不知道它所需要的对象的类时 
  在工厂方法模式中，客户端不需要知道具体产品类的类名，只需要知道所对应的工厂即可；
- 当一个类希望通过其子类来指定创建对象时 
  在工厂方法模式中，对于抽象工厂类只需要提供一个创建产品的接口，而由其子类来确定具体要创建的对象，利用面向对象的多态性和里氏代换原则，在程序运行时，子类对象将覆盖父类对象，从而使得系统更容易扩展。
- 将创建对象的任务委托给多个工厂子类中的某一个，客户端在使用时可以无须关心是哪一个工厂子类创建产品子类，需要时再动态指定，可将具体工厂类的类名存储在配置文件或数据库中。

Factory Method模式用于隔离类对象的使用者和具体类型之间的耦合关系。面对一个经常变化的具体类型，紧耦合关系会倒置软件的脆弱。
Factory Method模式通过面向对象的方法，将所要创建的对象工作延迟到子类，从而实现一种拓展（而非更改）的策略，较好地解决了这种紧耦合关系。
<u>耦合性说明</u>

> 代码耦合：一个软件结构内不同模块之间互连程度的度量(耦合性也叫块间联系。指软件系统结构中各模块间相互联系紧密程度的一种度量。模块之间联系越紧密，其耦合性就越强，模块的独立性则越差，模块间耦合的高低取决于模块间接口的复杂性，调用的方式以及传递的信息。)
>
> 软件工程规定写代码的原则是“高内聚，低耦合”。内聚是代码块间的独立性，耦合是各个代码块间的联系。
> 对于低耦合，粗浅的理解是：一个完整的系统，模块与模块之间，尽可能的使其独立存在。也就是说，让每个模块，尽可能的独立完成某个特定的子功能。模块与模块之间的接口，尽量的少而简单。
> 代码内聚就是一个模块内各个元素彼此结合的紧密程度，高内聚就是一个模块内各个元素彼此结合的紧密程度高。所谓高内聚是指一个软件模块是由相关性很强的代码组成，只负责一项任务，也就是常说的单一责任原则。
> 高内聚，低耦合的系统有什么好处呢？事实上，短期来看，并没有很明显的好处，甚至短期内会影响系统的开发进度，因为高内聚，低耦合的系统对开发设计人员提出了更高的要求。长期来看，低耦合的模块便于进行单元测试，且便于维护。
> 举例：
> 在java中，你想在你的程序中调用某个类比如说是A1，如果你在程序中直接new A1()，这样就写死了。如过下次业务逻辑有变化，你就必须重新修改A1类的代码。在这种情况下，如果A1类被其他的程序调用，你修改了A1类的代码，可能会对其他程序造成影响。
> 但是如果你在配置文件里配置你要用到的类的相关属性，通过程序动态地区获得，你只用修改这个配置文件，把他指向另一个类A2就行了。用A2替代A1。这就是低耦合，也是java的面向增加开放，面向修改关闭的原则。

## 持续更新中....

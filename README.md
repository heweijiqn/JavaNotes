# JavaNotes
Java SE 笔记
1. Java 语言基础
1.1 数据类型
Java 提供了基本数据类型，如整数（int）、浮点数（float、double）、字符（char）和布尔（boolean）。
还有引用数据类型，如类、接口和数组。
1.2 变量和常量
使用 var 关键字可以根据初始化值自动推断变量类型。
使用 final 关键字定义常量，一旦赋值后不能修改。
1.3 控制流程
使用 if、else if、else 来控制条件分支。
使用 for、while、do-while 控制循环。
switch 语句用于多分支选择。
1.4 方法
方法是一段可重用的代码块，可以接受参数和返回值。
方法可以在类内部或外部定义，使用 public、private、protected 等修饰符限制访问。
2. 面向对象编程
2.1 类和对象
类是对象的模板，描述了对象的属性（字段）和行为（方法）。
对象是类的实例，可以通过 new 关键字创建。
2.2 继承
继承允许一个类继承另一个类的属性和方法。
使用 extends 关键字来建立继承关系。
2.3 多态
多态性允许不同对象对相同方法产生不同的行为。
通过方法的重写和接口来实现多态。
2.4 封装
封装将数据和方法隐藏在类的内部，只提供公共接口。
使用 private、protected、public 修饰符来控制访问权限。
3. 异常处理
3.1 异常基础
异常是程序运行时的错误或异常情况。
Java 提供了异常处理机制，包括 try、catch 和 finally 块。
3.2 自定义异常
可以创建自定义异常类来处理特定情况下的异常。
4. Java 标准库
4.1 Java API
Java 标准库提供了丰富的类和方法，用于各种任务，如文件操作、网络通信、数据库访问等。
4.2 集合框架
Java 提供了集合框架，包括列表、集合、映射等，用于存储和操作数据。
常见的集合类包括 ArrayList、HashMap、LinkedList 等。
4.3 文件处理
使用 java.io 包来进行文件读写操作。
常见的类包括 File、FileInputStream、FileOutputStream 等。
4.4 网络通信
Java 支持网络通信，可以使用 java.net 包来创建网络应用程序。
常见的类包括 Socket、ServerSocket、URL 等。
4.5 多线程
Java 具有强大的多线程支持，可以使用 java.lang.Thread 类来创建和管理线程。
通过 synchronized 和 wait()、notify() 方法实现线程同步。
5. Java 开发工具
5.1 编译与运行
使用 javac 命令编译 Java 源代码。
使用 java 命令运行 Java 应用程序。
5.2 开发环境
常用的 Java 集成开发环境（IDE）包括 Eclipse、IntelliJ IDEA 和 NetBeans。
6. Java 最佳实践
6.1 命名规范
遵循命名规范，使用有意义的变量名和方法名。
6.2 代码风格
采用良好的代码风格，缩进、注释和代码结构清晰。
6.3 异常处理
好的异常处理能提高程序的可靠性，及时捕获和处理异常。
这份笔记涵盖了 Java SE 的基本概念和常用特性。要深入学习 Java 编程，建议阅读官方文档和相关书籍，以及参与实际项目开发。

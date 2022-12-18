# 2022-12-18

---

**下面有关JSP内置对象的描述，说法错误的是？**

A、session对象：session对象指的是客户端与服务器的一次会话，从客户连到服务器的一个WebApplication开始，直到客户端与服务器断开连接为止

B、request对象：客户端的请求信息被封装在request对象中，通过它才能了解到客户的需求，然后做出响应

C、application对象：多个application对象实现了用户间数据的共享，可存放全局变量

D、response对象：response对象包含了响应客户请求的有关信息

**选C**

答案：C application对象是共享的，多个用户共享一个，以此实现数据共享和通信 JSP内置对象和属性列举如下： 1.request对象

客户端的请求信息被封装在request对象中，通过它才能了解到客户的需求，然后做出响应。它是HttpServletRequest类的实例。

2.response对象

response对象包含了响应客户请求的有关信息，但在JSP中很少直接用到它。它是HttpServletResponse类的实例。 3.session对象

session对象指的是客户端与服务器的一次会话，从客户连到服务器的一个WebApplication开始，直到客户端与服务器断开连接为止。它是HttpSession类的实例.

4.out对象

out对象是JspWriter类的实例,是向客户端输出内容常用的对象

5.page对象

page对象就是指向当前JSP页面本身，有点象类中的this指针，它是java.lang.Object类的实例

6.application对象

application对象实现了用户间数据的共享，可存放全局变量。它开始于服务器的启动，直到服务器的关闭，在此期间，此对象将一直存在；这样在用户的前后连接或不同用户之间的连接中，可以对此对象的同一属性进行操作；在任何地方对此对象属性的操作，都将影响到其他用户对此的访问。服务器的启动和关闭决定了application对象的生命。它是ServletContext类的实例。

7.exception对象

exception对象是一个例外对象，当一个页面在运行过程中发生了例外，就产生这个对象。如果一个JSP页面要应用此对象，就必须把isErrorPage设为true，否则无法编译。他实际上是java.lang.Throwable的对象

8.pageContext对象

pageContext对象提供了对JSP页面内所有的对象及名字空间的访问，也就是说他可以访问到本页所在的SESSION，也可以取本页面所在的application的某一属性值，他相当于页面中所有功能的集大成者，它的本

类名也叫pageContext。

9.config对象

config对象是在一个Servlet初始化时，JSP引擎向它传递信息用的，此信息包括Servlet初始化时所要用到的参数（通过属性名和属性值构成）以及服务器的有关信息（通过传递一个ServletContext对象）

---

**以下多线程对int型变量x的操作，哪个不需要进行同步（ ）**

A、x=y;

B、x++;

C、++x;

D、x=1;

**选D**

A.由于y的值不确定，所以要加锁；

B,C 两个在多线程情况下是必须要加锁的，因为他们是先被读入寄存器，然后再进行+1操作，如果没有加锁，那么可能会出现数据异常；

D 原子操作，所以不需要加锁

原子性：指该操作不能再继续划分为更小的操作。

Java中的原子操作包括：

除long和double之外的基本类型的赋值操作

所有引用reference的赋值操作

java.concurrent.Atomic.* 包中所有类的一切操作

---

**以下哪些内存区域属于JVM规范？（ ）**

A、方法区

B、实例变量

C、静态变量

D、程序计数器

E、虚拟机栈

**选ADE**

JVM内存区：程序计数器、虚拟机栈、本地方法栈、堆、方法区（包括常量池）。

不属于JVM内存区：直接内存（Direct Memory），用户I/O操作

---

**以下关于final关键字说法错误的是（）**

A、final是java中的修饰符，可以修饰类、接口、抽象类、方法和属性

B、final修饰的类不能被继承

C、final修饰的方法不能被重载

D、final修饰的变量不允许被再次赋值

**选AC**

1.final修饰变量，则等同于常量

2.final修饰方法中的参数，称为最终参数。

3.final修饰类，则类不能被继承

4.final修饰方法，则方法不能被重写。

final 不能修饰抽象类

final修饰的方法可以被重载 但不能被重写

---

**下面关于变量及其范围的陈述哪些是不正确的（）**

A、实例变量是类的成员变量

B、实例变量用关键字static声明

C、在方法中定义的局部变量在该方法被执行时创建

D、局部变量在使用前必须被初始化

**选BC**

A.类的成员变量包括实例变量和类变量（静态变量）,成员方法包括实例方法和类方法（静态方法）。 A正确

B.类变量（静态变量）用关键字static声明，B错误

C.方法中的局部变量在方法被调用加载时开始入栈时创建，方法入栈创建栈帧包括局部变量表操作数栈，局部变量表存放局部变量，并非在执行该方法时被创建，C错误

D.局部变量被使用前必须初始化，否则程序报错。D正确

---

**下面的Java赋值语句哪些是有错误的 （）**

A、int i =1000;

B、float f = 45.0;

C、char s = ‘\u0639’;

D、Object o = ‘f’;

E、String s = "hello,world\0";

F、Double d = 100;

**选BF**

b：小数如果不加 f 后缀，默认是double类型。double转成float向下转换，意味着精度丢失，所以要进行强制类型转换。

c：是使用unicode表示的字符。

d：'f' 字符会自动装箱成包装类，就可以向上转型成Object了。

f：整数默认是int类型，int类型不能转型为Double，最多通过自动装箱变为Integer但是Integer与Double没有继承关系，也没法进行转型。

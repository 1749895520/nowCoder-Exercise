# 2022-12-19

---

**java中提供了哪两种用于多态的机制**

A、通过子类对父类方法的覆盖实现多态

B、利用重载来实现多态.即在同一个类中定义多个同名的不同方法来实现多态。

C、利用覆盖来实现多态.即在同一个类中定义多个同名的不同方法来实现多态。

D、通过子类对父类方法的重载实现多态

**选AB**

重载是类中的多态，如果在一个类中定义了多个同名的方法，它们有不同的参数个数、有不同的参数类型、不同的参数顺序，则可通过不同的参数对同一个函数名进行动态绑定。即用同样的函数名实现多个不同方法，即多态。

---

**以下类型为Final类型的为（）**

A、HashMap

B、StringBuffer

C、String

D、Hashtable

**选BC**

通过阅读源码可以知道，string与stringbuffer都是通过字符数组实现的。

其中string的字符数组是final修饰的，所以字符数组不可以修改。

stringbuffer的字符数组没有final修饰，所以字符数组可以修改。

string与stringbuffer都是final修饰，只是限制他们所存储的引用地址不可修改。

至于地址所指内容能不能修改，则需要看字符数组可不可以修改。

---

**下面几个关于Java里queue的说法哪些是正确的（）？**

A、LinkedBlockingQueue是一个可选有界队列，不允许null值

B、PriorityQueue，LinkedBlockingQueue都是线程不安全的

C、PriorityQueue是一个无界队列，不允许null值，入队和出队的时间复杂度是O（log(n)）

D、PriorityQueue，ConcurrentLinkedQueue都遵循FIFO原则

**选AC**

A、LinkedBlockingQueue是一个基于节点链接的可选是否有界的阻塞队列，不允许null值。

B、LinkedBlockingQueue是一个线程安全的阻塞队列，实现了先进先出等特性。

C、PriorityQueue是一个队列，不允许null值，入队和出队的时间复杂度是O（log(n)）。

D、PriorityQueue是不同于先进先出队列的另一种队列。每次从队列中取出的是具有最高优先权的元素。ConcurrentLinkedQueue是一个基于链接节点的***线程安全队列，该队列的元素遵循FIFO原则。

---

**以下各类中哪几个是线程安全的？( )**

A、ArrayList

B、Vector

C、Hashtable

D、Stack

**选BCD**

线程安全的集合有Vector、Stack、Hashtable。Vector与ArrayList相比多了同步机制，虽然保证了线程安全，但降低了效率。Stack继承了Vector，也保证了线程安全。HashTable是线程安全的类，它很多方法都使用synchronized修饰，但同时也因为加锁导致效率低下。

---

**下列哪些方法是针对循环优化进行的**

A、强度削弱

B、删除归纳变量

C、删除多余运算

D、代码外提

**选ABD**

代码优化也可分为局部优化、 循环优化和全局优化： 局部优化指的是在只有一个入口、 一个出口的基本程序块上进行的优化。 循环优化是对循环中的代码进行的优化，在一个程序运行时，相当多的一部分时间会花在循环上，因此，基于循环的优化非常重要。
全局优化是在整个程序范围内进行的优化。

删除多余运算 使生成的目标代码减少而执行速度较快

也叫删除公共子表达式

循环优化：对循环中的代码段，可以进行代码外提、强度削弱和删除归纳变量等优化。

删除多余运算应该不是专门针对循环优化的。

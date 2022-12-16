# 2022-12-14

---

**子类A继承父类B, A a = new A(); 则父类B构造函数、父类B静态代码块、父类B非静态代码块、子类A构造函数、子类A静态代码块、子类A非静态代码块 执行的先后顺序是？**

A、父类Ｂ静态代码块->父类Ｂ构造函数->子类Ａ静态代码块->父类Ｂ非静态代码块->子类Ａ构造函数->子类Ａ非静态代码块

B、父类Ｂ静态代码块->父类Ｂ构造函数->父类Ｂ非静态代码块->子类Ａ静态代码块->子类Ａ构造函数->子类Ａ非静态代码块

C、父类Ｂ静态代码块->子类Ａ静态代码块->父类Ｂ非静态代码块->父类Ｂ构造函数->子类Ａ非静态代码块->子类Ａ构造函数

D、父类Ｂ构造函数->父类Ｂ静态代码块->父类Ｂ非静态代码块->子类Ａ静态代码块->子类Ａ构造函数->子类Ａ非静态代码块

**选C**

正确的执行顺序是:父类Ｂ静态代码块->子类Ａ静态代码块->父类Ｂ非静态代码块->父类Ｂ构造函数->子类Ａ非静态代码块->子类Ａ构造函数 也就是说非静态初始化块的执行顺序要在构造函数之前。

---

**执行以下程序后的输出结果是（）**

```java
public class Test {
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("A");
        StringBuffer b = new StringBuffer("B");
        operator(a, b);
        System.out.println(a + "," + b);
    }

    public static void operator(StringBuffer x, StringBuffer y) {
        x.append(y);
        y = x;
    }
}
```

A、A,A

B、A,B

C、B,B

D、AB,B

**选D**

string是值传递，stringbuffer是引用传递。
a和x是同个地址，b和y是同个地址，然后执行x.append(y)就把y的值放在x的地址里面此时a地址和x是同一个所以a就是AB了，接着执行y=x是把x的地址给y，这时候axy属于同一个地址。
所以y=x 只是改变了y的地址没改变b的地址，所以b还是B。

---

**java如何返回request范围内存在的对象？**

A、request.getRequestURL()

B、request.getAttribute()

C、request.getParameter()

D、request.getWriter()

**选B**

request.getAttribute()方法返回request范围内存在的对象，而request.getParameter()方法是获取http提交过来的数据。getAttribute是返回对象,getParameter返回字符串。

---

**下面代码的输出是什么？**

```java
public class Base {
    private String baseName = "base";

    public Base() {
        callName();
    }

    public void callName() {
        System.out.println(baseName);
    }

    static class Sub extends Base {
        private String baseName = "sub";

        public void callName() {
            System.out.println(baseName);
        }
    }

    public static void main(String[] args) {
        Base b = new Sub();
    }
}
```

A、null

B、sub

C、base

**选A**

1.首先，需要明白类的加载顺序。

(1) 父类静态代码块(包括静态初始化块，静态属性，但不包括静态方法)

(2) 子类静态代码块(包括静态初始化块，静态属性，但不包括静态方法  )

(3) 父类非静态代码块(  包括非静态初始化块，非静态属性  )

(4) 父类构造函数

(5) 子类非静态代码块  (  包括非静态初始化块，非静态属性  )

(6) 子类构造函数

其中：类中静态块按照声明顺序执行，并且(1)和(2)不需要调用new类实例的时候就执行了(意思就是在类加载到方法区的时候执行的)

2.其次，需要理解子类覆盖父类方法的问题，也就是方法重写实现多态问题。

Base b = new Sub();它为多态的一种表现形式，声明是Base,实现是Sub类， 理解为 b
编译时表现为Base类特性，运行时表现为Sub类特性。

当子类覆盖了父类的方法后，意思是父类的方法已经被重写，题中
父类初始化调用的方法为子类实现的方法，子类实现的方法中调用的baseName为子类中的私有属性。

由1.可知，此时只执行到步骤4.,子类非静态代码块和初始化步骤还没有到，子类中的baseName还没有被初始化。所以此时 baseName为空。 所以为null。

---

**下面有关值类型和引用类型描述正确的是（）？**

A、值类型的变量赋值只是进行数据复制，创建一个同值的新对象，而引用类型变量赋值，仅仅是把对象的引用的指针赋值给变量，使它们共用一个内存地址。

B、值类型数据是在栈上分配内存空间，它的变量直接包含变量的实例，使用效率相对较高。而引用类型数据是分配在堆上，引用类型的变量通常包含一个指向实例的指针，变量通过指针来引用实例。

C、引用类型一般都具有继承性，但是值类型一般都是封装的，因此值类型不能作为其他任何类型的基类。

D、值类型变量的作用域主要是在栈上分配内存空间内，而引用类型变量作用域主要在分配的堆上。

**选D**

引用类型的变量也在栈区，只是其引用的对象在堆区

---

**类之间存在以下几种常见的关系：**

A、“USES-A”关系

B、“HAS-A”关系

C、“IS-A”关系

D、“INHERIT-A”关系

**选ABC**

USES-A：依赖关系，A类会用到B类，这种关系具有偶然性，临时性。但B类的变化会影响A类。这种在代码中的体现为：A类方法中的参数包含了B类。

关联关系：A类会用到B类，这是一种强依赖关系，是长期的并非偶然。在代码中的表现为：A类的成员变量中含有B类。

HAS-A：聚合关系，拥有关系，是关联关系的一种特例，是整体和部分的关系。比如鸟群和鸟的关系是聚合关系，鸟群中每个部分都是鸟。

IS-A：表示继承。父类与子类，这个就不解释了。

要注意：还有一种关系：组合关系也是关联关系的一种特例，它体现一种contains-a的关系，这种关系比聚合更强，也称为强聚合。它同样体现整体与部分的关系，但这种整体和部分是不可分割的。

---

**Hashtable 和 HashMap 的区别是：**

A、Hashtable 是一个哈希表，该类继承了 AbstractMap，实现了 Map 接口

B、HashMap 是内部基于哈希表实现，该类继承AbstractMap，实现Map接口

C、Hashtable 线程安全的，而 HashMap 是线程不安全的

D、Properties 类 继承了 Hashtable 类，而 Hashtable 类则继承Dictionary 类

E、HashMap允许将 null 作为一个 entry 的 key 或者 value，而 Hashtable 不允许。

**选BCDE**

Hashtable：

（1）Hashtable 是一个散列表，它存储的内容是键值对(key-value)映射。

（2）Hashtable 的函数都是同步的，这意味着它是线程安全的。它的key、value都不可以为null。

（3）HashTable直接使用对象的hashCode。

HashMap：

（1）由数组+链表组成的，基于哈希表的Map实现，数组是HashMap的主体，链表则是主要为了解决哈希冲突而存在的。

（2）不是线程安全的，HashMap可以接受为null的键(key)和值(value)。

（3）HashMap重新计算hash值

Hashtable,HashMap,Properties继承关系如下： public class Hashtable<K,V> extends Dictionary<K,V>     implements Map<K,V>,
Cloneable, java.io.Serializable public class HashMap<K,V>extends AbstractMap<K,V> implements Map<K,V>, Cloneable,
Serializable java.lang.Objecct java.util.Dictionary<K,V> java.util.Hashtable<Object,Object> java.util.Properties

---

**下面哪些赋值语句是正确的（）**

A、long test=012

B、float f=-412

C、int other =(int)true

D、double d=0x12345678

E、byte b=128

**选ABD**

A和B中long和float，正常定义需要加l和f，但是long和float属于基本类型，会进行转化，所以不会报出异常。AB正确

boolean类型不能和任何类型进行转换，会报出类型异常错误。所以C错。

D选项可以这样定义，D正确。

E选项中，byte的取值范围是-128—127。报出异常： cannot convert from int to byte.所以E选项错误。

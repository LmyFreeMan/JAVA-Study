**一：几个概念**

并行：指两个或多个事件在同一时刻点发生。<br/>
并发：指两个或多个事件在一个时间段发生。<br/>
时间片：CPU分配给程序的时间（很小的概念）。<br/>
线程：进程中的一个执行任务(控制单元)，一个进程可以运行多个并发线程。<br/>
进程：指一个内存运行中的应用程序。<br/>

**二：线程与进程的区别**

进程：有独立的的内存空间，进程中的数据存放空间（堆，栈空间）是独立的，至少有一个进程。<br/>
线程：堆空间是共享的，栈空间是独立的 ，线程所消耗资源比较小，相互之间可以影响的，又称之为轻型进程或者进程元。<br/>
因为一个进程中多个进程是并发运行，那么从微观也是有先后顺序的，那么线程执行完全取决于JVM来调度，程序员是控制不了的。JVM是抢占式调度，没有采用分时调度，因此造成了
java进程中至少包含主线程和垃圾回收线程（后台线程）。<br/>

**三：多线程优势**

进程之前不能共享内存，而线程之间共享内存则很简单。<br/>
系统创建内存需要为进程重新分配系统资源，付出的代价很小，因此实现多任务并发时，多线程效率更高。<br/>
java内置了多线程功能的支持，而不是单纯作为底层系统的调度方式，从而简化了多线程编程。

**四：java中的线程生命周期**

有六种，分别是新建状态，可运行状态（runable）,等待状态（waiting),计时等待（time waiting），终止状态（terminated), 阻塞状态（block)<br/>
新建状态：使用new创建一个线程对象，仅仅在堆中分配内存空间，在调用start之前，只能调用一次start，否则报错。<br/>
可运行状态：分为两种状态表示就绪状态（线程对象调用start方法之后，等待jvm调度）和进行状态（线程对象获得jvm调度，如果存在多个cpu，那么允许多个线程并行运行）<br/>
等待状态：当线程处于运行状态，调用wait方法，此时jvm把对象存在对象等待池
计时等待状态：①：当线程处于运行状态，调用wait（long time）方法，此时jvm把对象存在对象等待池②调用sleep（long time）
堵塞状态：正在进行的线程因为某些原因放弃cpu，暂时停止运行，就会进去堵塞状态。<br/>
线程的终止状态：正常执行run方法退出或遇到异常退出

**五：JAVA中的一些特殊线程**

后台线程：在后台运行的线程，其目的为其他线程提供服务，也称之为"守护线程"，JVM的垃圾回收机制就是典型的后台线程。<br/>
特点：若所有前台线程都死亡，后台线程自动死亡，前台线程没有结束，后台线程是不会结束的。
协助线程：几个线程一起执行。









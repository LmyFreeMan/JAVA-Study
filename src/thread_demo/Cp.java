package thread_demo;
/**
 * @name:    Pro
 * @Author:  Coder
 * @describle:生产者
 * @CreateDate: 2019/11/1 14:48
 */
class Pro implements Runnable{
    //共享资源
    private Share share=null;
    public Pro(Share share) {
        this.share = share;
    }
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            if(i%2==0)
                share.push("春哥哥","男");
            else
                share.push("凤姐姐","女");
        }
    }
}
/**
 * @name:    C
 * @Author:  Coder
 * @describle:消费者
 * @CreateDate: 2019/11/1 15:02
 */
class C implements Runnable{
    //共享资源
    private Share share=null;
    public C(Share share) {
        this.share = share;
    }
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
           share.popup();
        }
    }
}
    /**
     * @name:    Share
     * @Author:  Coder
     * @describle:共享类
     * @CreateDate: 2019/11/1 15:29
     */
class Share{
    private String name;
    private String gender;
    private boolean isEmpty=true;//表示共享资源对象是否为空的状态
        /**
         * @name:push
         * @param name 存储的姓名
         * @param gender 存储的性别
         * @describe:生产者向共享资源对象中存储数据
         * @return:void
         * @exception:
         * @date:2019/11/1 15:12
         */
    synchronized public void push(String name,String gender){
        //不空等待着消费者来获取
            try {
                while(!isEmpty) {
                    this.wait();//表示当前进程释放同步锁，只能被其它线程唤醒
                }
                //生成开始
                this.name=name;
                this.gender = gender;
                //生成结束
                isEmpty=false;
                this.notify();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
        /**
         * @name:popup
         * @param
         * @describe:消费者从共享资源中取出对象
         * @return:void
         * @exception:
         * @date:2019/11/1 15:14
         */
        synchronized  public void popup(){
        try {
            while (isEmpty){
                this.wait();
            }
            //消费开始
            System.out.println(this.name+"-"+this.gender);
            //消费结束
            this.isEmpty = true;
            this.notify();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class Cp {
    public static void main(String[] args) {
        //创建生产者和消费者共同的资源对象
        Share share=new Share();
        //启动生产者进程
        new Thread(new Pro(share)).start();
        //启动消费者进程
        new Thread(new C(share)).start();
    }
}

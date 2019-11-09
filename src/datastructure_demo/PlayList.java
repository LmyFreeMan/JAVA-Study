package datastructure_demo;
public class PlayList {
    //初始化容量为5,用来存储场上的五个号码。
    private static   Integer[] players=null;
    //用来表示场上球员的个数
    private static  Integer size=0;

    //设置容量为5
    public static void init(int initialCapacit){
        if(initialCapacit<0){
            throw  new IllegalArgumentException("非法参数异常");
        }
        players=new Integer[initialCapacit];
    }
    public static void add(int playNum) {
        players[size]=playNum;
        size++;
    }
    public static void print(){
            if(size==0||players==null){
                System.out.println("[]");
                return;
            }
            StringBuilder stringBuilder=new StringBuilder(size*2+1);
            for (int index = 0; index < players.length; index++) {
                stringBuilder.append(players[index]);
           }
            System.out.println(stringBuilder.toString());
    }
    //查询指定位置的球衣号码是多少
    public static Integer get(int  index){
        if(index<0||index>=size){
            throw  new IllegalArgumentException("索引越界");
        }
        return players[index];
    }
    //根据球衣号码查询该球员在场上的位置
    public static int getIndexByPlayerNum(int playNum) {
        for (int index = 0; index < players.length; index++) {
            if(playNum==players[index])
                return index;
        }
        return -1;
    }
    private static void set(int key, int value ) {
        players[key]=value;
    }
    public static void main(String[] args) {
             init(-5);
             //安排五个球员上场
             add(11);
             add(22);
             add(33);
             add(44);
             add(55);
             //打印球员号码
             print();
             System.out.println(get(2));
             //指定球员球衣的索引
            System.out.println(getIndexByPlayerNum(44));
            //把索引为2的球员替换为333
            set(2,333);
            print();
    }
}
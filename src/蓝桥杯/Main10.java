package 蓝桥杯;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @author: Li jx
 * @date: 2019/11/21 13:22
 * @description:
 */
public class Main10 {
    public static PriorityQueue<State> queue=new PriorityQueue<State>();
    public static boolean[][] is=new boolean[105][105];
    public static int a=0;
    public static int b=0;
    public static int c=0;
    public static int desA =0;
    public static int desB =0;
    public static int desC =0;
    public static void main(String[]args){
        int num=0;
        Scanner in=new Scanner(System.in);
        num=in.nextInt();
        for(int i=0;i<num;i++){
            a=in.nextInt();
            b=in.nextInt();
            c=in.nextInt();
            desA =in.nextInt();
            desB =in.nextInt();
            desC =in.nextInt();
            queue.clear();
            for(int j=0;j<105;j++) {
                Arrays.fill(is[j],false);
            }
            System.out.println(fun());
        }
        in.close();
    }
    public static int fun(){
        int sum=a;
        State cur=new State(a,0,0);
        is[a][0]=true;
        queue.offer(cur);
        while(queue.size()!=0){
            cur=queue.poll();
            if(cur.ca== desA &&cur.cb== desB) {
                return cur.value;
            }
            if(cur.ca!=0){
                if(cur.cb<b){
                    if(cur.ca+cur.cb>=b){
                        int ta=cur.ca-(b-cur.cb);
                        if(!is[ta][b]){
                            queue.offer(new State(ta,b,cur.value+1));
                            is[ta][b]=true;
                        }
                    }
                    else{
                        int tb=cur.ca+cur.cb;
                        if(!is[0][tb]){
                            queue.offer(new State(0,tb,cur.value+1));
                            is[0][tb]=true;
                        }
                    }
                }
                if((sum-c)!=cur.ca+cur.cb){
                    if(sum-cur.cb>c){
                        int ta=sum-cur.cb-c;
                        if(!is[ta][cur.cb]){
                            queue.offer(new State(ta,cur.cb,cur.value+1));
                            is[ta][cur.cb]=true;
                        }
                    }
                    else{
                        if(!is[0][cur.cb]){
                            queue.offer(new State(0,cur.cb,cur.value+1));
                            is[0][cur.cb]=true;
                        }
                    }
                }
            }
            if(cur.cb!=0){
                if(cur.ca<a){
                    int ta=cur.ca+cur.cb;
                    if(!is[ta][0]){
                        queue.offer(new State(ta,0,cur.value+1));
                        is[ta][0]=true;
                    }
                }
                if((sum-c)!=cur.ca+cur.cb){
                    if(sum-cur.ca>c){
                        int tb=sum-cur.ca-c;
                        if(!is[cur.ca][tb]){
                            queue.offer(new State(cur.ca,tb,cur.value+1));
                            is[cur.ca][tb]=true;
                        }
                    }
                    else{
                        if(!is[cur.ca][0]){
                            queue.offer(new State(cur.ca,0,cur.value+1));
                            is[cur.ca][0]=true;
                        }
                    }
                }
            }
            if(sum!=(cur.ca+cur.cb)){
                if(cur.ca<a){
                    int ta=sum-cur.cb;
                    if(!is[ta][cur.cb]){
                        queue.offer(new State(ta,cur.cb,cur.value+1));
                        is[ta][cur.cb]=true;
                    }
                }
                if(cur.cb<b){
                    if(sum-cur.ca>b){
                        if(!is[cur.ca][b]){
                            queue.offer(new State(cur.ca,b,cur.value+1));
                            is[cur.ca][b]=true;
                        }
                    }
                    else{
                        if(!is[cur.ca][sum-cur.ca]){
                            queue.offer(new State(cur.ca,sum-cur.ca,cur.value+1));
                            is[cur.ca][sum-cur.ca]=true;
                        }
                    }
                }
            }
        }
        return -1;
    }
}
class State implements Comparable<State>{
    public int ca;
    public int cb=0;
    public int value=0;
    public State(int ca,int cb,int value){
        this.ca=ca;
        this.cb=cb;
        this.value=value;
    }
    @Override
    public int compareTo(State a2) {
        if(this.value>a2.value) {
            return 1;
        } else if(this.value==a2.value) {
            return 0;
        } else {
            return -1;
        }
    }

}

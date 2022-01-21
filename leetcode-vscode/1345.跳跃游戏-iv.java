import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=1345 lang=java
 *
 * [1345] 跳跃游戏 IV
 */

// @lc code=start
class Solution {
    public int minJumps(int[] arr) {
        if(arr.length==1){return 0;}
        boolean cameBefore[]=new boolean[arr.length];
        Map<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){map.put(arr[i],new ArrayList<>());}
            map.get(arr[i]).add(i);
        }
        Queue<int[]> q=new LinkedList<>();//{坐标，步数}
        cameBefore[0]=true;
        q.add(new int[]{0,0});
        while(q.size()>0){
            int a[]=q.poll();//每个点拿出后，检查所有同值的点，以及前后的点
            if(a[0]+1==arr.length-1){return a[1]+1;}
            if(!cameBefore[a[0]+1]){
                cameBefore[a[0]+1]=true;
                q.add(new int[]{a[0]+1,a[1]+1});
            }
            if(a[0]>1&&!cameBefore[a[0]-1]){
                cameBefore[a[0]-1]=true;
                q.add(new int[]{a[0]-1,a[1]+1});
            }
            if(map.containsKey(arr[a[0]])){
                List<Integer> list=map.get(arr[a[0]]);
                for(int i=0;i<list.size();i++){
                    if(list.get(i)-a[0]!=0&&!cameBefore[list.get(i)]){
                        if(list.get(i)-arr.length+1==0){return a[1]+1;}
                        cameBefore[list.get(i)]=true;
                        q.add(new int[]{list.get(i),a[1]+1});
                    }
                }
                map.remove(arr[a[0]]);
            }
        }
        return -1;
    }
}
// @lc code=end

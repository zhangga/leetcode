import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=564 lang=java
 *
 * [564] 寻找最近的回文数
 */

// @lc code=start
class Solution {
    private long getNum(long k, boolean isEven){
        StringBuilder sb = new StringBuilder();
        sb.append(k);
        int n = sb.length(), idx = isEven ? n-1:n-2;
        while(idx >= 0)
            sb.append(sb.charAt(idx--));
        return Long.parseLong(sb.toString());
    }


    public String nearestPalindromic(String n) {
        int len = n.length();

        //将传进来的字串符转换为long型的整数(int会溢出)
        long cur = Long.parseLong(n);

        //存放可能的结果集合
        Set<Long> set = new HashSet<>();
        //将与长度相关的边界值也纳入考虑，即将「长度为 n - 1n−1 的回文串最大值（99...9999...99）」和「长度为 n + 1n+1 的回文串最小值（10...0110...01）」也纳入考虑
        set.add((long) Math.pow(10,(len-1))-1);
        set.add((long) Math.pow(10,len)+1);

        //截取传来的字符串的前一半
        long t = Long.parseLong(n.substring(0,(len+1)/2));

        //获取可能的相邻回文数
        for(long i = t-1; i <= t+1; i++){
            long temp = getNum(i, len % 2 == 0);
            if(temp != cur)
                set.add(temp);
        }

        long ans = -1;
        //遍历结果集合，
        for(long i:set){
            //ans为初始值时，直接赋值为结果集合中第一个结果
            if(ans == -1)
                ans = i;
            //如果如果当前遍历到的结果i与传进来的数值距离更近，就更新ans为当前结果i的值
            else if(Math.abs(i - cur) < Math.abs(ans - cur))
                ans = i;
            //当结果集中有两个结果与传进来的值距离一样，并且当前的结果i的值更小，那么就将ans的值赋为当前结果i；
            else if(Math.abs(i-cur) == Math.abs(ans - cur) && i < ans)
                ans = i;
        }
        //将结果转换为字符串返回
        return String.valueOf(ans);
    }
}
// @lc code=end


package string;

/**
 * @name KMP
 * @description KMP算法
 * 1. 前后缀字符串： 前缀 -> 不含有尾字符串的所有子字符串，"cdcdfdc" : (c,cd,cdc,cdcd,cdcdf,cdcdfd). 后缀 -> 不含有头字符串的所有字符串， "cdcdfdc" : (dcdfdc,cdfdc,dfdc,fdc,dc,d)
 * 2. 前缀表： 
 *      cdcdfdc: 
 *          c          : 该字串无前缀又没有后缀，          next[0] = 0
 *          cd         : 该字符串前缀不等于后缀,           next[1] = 0
 *          cdc        : 前缀后缀有c,                     next[2] = 1
 *          cdcd       : 前后缀为cd,                      next[3] = 2
 *          cdcdf      : 无相等前后缀,                    next[4] = 0
 *          cdcdfd     : 无相等前后缀,                    next[5] = 0
 *          cdcdfdc    : 无相等前后缀,                    next[6] = 0
 *      index   0   1   2   3   4   5   6
 *      T       c   d   c   d   f   d   c
 *      next    0   0   1   2   0   0   0
 * 3. 对于字符串有cdcdfccdcdfdc.
 *      在按照朴素匹配到fc时，存在不符，则有next[j - 1]则 j 回退到 next[j - 1]。 (注； i = 主串index, j = 子串index), 则 i 一直不需要回退。‘
 * 4. 然后不断持续不走知道匹配成功或者结束
 * 
 * KMP主要分为两个步骤， 1 -> 预处理子字符串。  2 -> 匹配处理
 */
public class KMP {
    public void getNext(string s, int[] nexts) {
        int j = 0; 
        char[] chs = s.toCharArray();
        nexts[0] = 0;
        for (int i = 1; i < chs.length; i ++) {
            while (j > 0 && chs[i] != chs[j]) j = nexts[j - 1];
            if (chs[i] == chs[j]) j++;
            nexts[i] = j;
        }
    }

    public int strSTR(string s, string t) {
        int n = t.length();
        if (n == 0) return 0;
        int[] nexts = new int[n];
        getNext(t, nexts);
        int j = 0;
        for(int i = 0; i < s.size(); i++){
            while (j > 0 && s[i] != t[j]) j = next[j-1];
            if (s[i] == t[j]) j++;
            if (j == n) return i - n + 1;
        }
        return -1;
    }
}

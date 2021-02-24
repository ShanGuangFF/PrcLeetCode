package replaceSpace;

/**
 * @author cc_ff
 * @creat 2021-02-2021/2/24-23:38
 */
/*
    请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
    在Python和Java等语言中，字符串都被设计为不可变类型，即无法直接修改字符串的某一位字符，需要新建一个字符串实现
    时间复杂度o(n)
    空间复杂度o(n)
 */
public class Solution {
    public String replaceSpace_sb(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray() ){
            if(c == ' '){
                sb.append("%20");
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public String replaceSpace_libraryFunction(String s){
        return s.replace(" ","%20");
    }
}

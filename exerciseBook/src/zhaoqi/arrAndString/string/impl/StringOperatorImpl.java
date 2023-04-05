package arrAndString.string.impl;

import arrAndString.string.StringOperator;

public class StringOperatorImpl implements StringOperator {

    public String replaceSpaceByJDK(String srcStr) {
        //"We are happy." --> "We%20are%20happy."
        return srcStr.replace(" ", "%20");
    }

    /**
     * 补充:一个汉字占两个字节，也就是一个char类型
     */
    @Override
    public String replaceSpace(String srcStr) {
        StringBuilder sb = new StringBuilder();
        for (char c : srcStr.toCharArray()) {
            if(c == ' ') sb.append("%20");
            else sb.append(c);
        }

        return sb.toString();
    }
}

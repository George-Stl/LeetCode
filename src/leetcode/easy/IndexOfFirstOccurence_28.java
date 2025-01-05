package leetcode.easy;

public class IndexOfFirstOccurence_28 {
    public static void main(String[] args) {
        IndexOfFirstOccurence_28 ioc = new IndexOfFirstOccurence_28();
        System.out.println(ioc.strStr("ssadsadbutsad", "sad"));
    }

    public int strStr(String haystack, String needle) {
        int k = 0;
        int resultIndex = -1;
        for (int i = 0; i < haystack.length(); i++) {
            if (needle.charAt(k) == haystack.charAt(i) && k == 0) {
                resultIndex = i;
                k++;
            } else if (needle.charAt(k) == haystack.charAt(i) && (k == needle.length() - 1)) {
                return resultIndex;
            } else if (needle.charAt(k) == haystack.charAt(i)) {
                k++;
            } else {
                i = i - k;
                k = 0;
                resultIndex = -1;
            }
        }

        return resultIndex;
    }
}

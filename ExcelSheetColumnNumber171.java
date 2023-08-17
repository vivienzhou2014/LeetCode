public class ExcelSheetColumnNumber171 {
    public int titleToNumber(String columnTitle) {
        char[] charArray = columnTitle.toCharArray();
        int res = 0;
        int loc = 0;
        for (int i = charArray.length-1; i >= 0; i--) {//go through the str from right to left, just like how we treat numbers
            //char col = Character.toLowerCase(charArray[i]);
            int dis = charArray[i] - 'A';//using ASCII code to get distance
            res += Math.pow(26, loc) * (dis + 1);
            loc++;
        }
        return res;
    }
}

public class ValidPalindrome125 {
    public static boolean isPalindrome(String s) {
        //remove all non-alphanumeric characters
        String cleanS = s.replaceAll("[^a-zA-Z0-9]","");
        //System.out.println(cleanS);
        int front = 0;
        int back = cleanS.length() - 1;
        //for easy comparison, make all letters lowercase before putting it into char[]
        char[] word = cleanS.toLowerCase().toCharArray();
        while(front < back){
            if(word[front] != word[back]){
                return false;
            }
            front++;
            back--;
        }
        return true;
    }

    //it seems like my method is too slow, get some idea from others
    public static boolean isPalindrome2(String s){
        //1. get rid of corner case
        if(s.isEmpty()){
            return true;
        }
        //2.set front and back
        int front = 0;
        int back = s.length() - 1;
        //3.use charAt instead of using extra space for char[]
        while(front < back) {
            char charFront = s.charAt(front);
            char charBack = s.charAt(back);
            //4.used method in character to ignore non-alphanumeric chars
            if (!Character.isLetterOrDigit(charFront)) {
                front++;
            } else if (!Character.isLetterOrDigit(charBack)) {
                back--;
            } else {
                if(Character.toLowerCase(charFront) != Character.toLowerCase(charBack)){
                    return false;
                }
                front++;
                back--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        //System.out.println('z' - 'A');
        String s = "A man, a plan, ,,,a canal: Panama";
        System.out.println(isPalindrome2(s));
    }
}

import java.util.Stack;

public class SimplifyPath71 {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] names = path.split("/");
        for(String name : names){
            if(name.equals("..")){
                if(!stack.isEmpty()){stack.pop();}
            }else if(!name.equals("") && !name.equals(".")){
                stack.push(name);
            }
        }
        StringBuilder sb = new StringBuilder();
        if(!stack.isEmpty()){
            for(String item : stack){
                sb.append("/");
                sb.append(item);
            }
        }else{sb.append("/");}
        return sb.toString();
    }
}

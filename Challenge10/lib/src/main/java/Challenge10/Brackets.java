package Challenge10;

public class Brackets {

    public boolean validateBrackets(String str){
        Stack<Character> stack = new Stack<>();

        for(int i = 0 ; i < str.length() ; i++){
            char x = str.charAt(i);
            if(x == '(' || x == '[' || x == '{'){
                stack.push(x);
            }

            if(stack.isEmpty())
                return false;

            char check;
            switch (x) {
                case ')' -> {
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                }
                case '}' -> {
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                }
                case ']' -> {
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        return false;
                }
            }
        }
        return (stack.isEmpty());
    }

}

import java.util.Stack;

class SimplifyPath {
    public static String Simplify(String path) {
        Stack<String> stack = new Stack<>();
        String[] components = path.split("/");

        // --> /a/../../b/../c//.//
        // --> ["", "a", "..", "..", "b", "..", "c", "", ".", ""]

        for (String s : components) {

            if (s.isEmpty())
                continue;

            if (s.equals("."))
                continue;

            if (s.equals("..")) {
                if (stack.isEmpty())
                    continue;
                else {
                    stack.pop();
                    continue;
                }
            }

            stack.push(s);
        }

        StringBuilder simplifiedPath = new StringBuilder();
        for (String dir : stack) {
            simplifiedPath.append("/").append(dir);
        }

        return simplifiedPath.length() > 0 ? simplifiedPath.toString() : "/";

    }

    public static void main(String[] args) {
        String path = "/a/../../b/../c//.//";
        String simplifiedPath = Simplify(path);
        System.out.println("Simplified Canonical Path: " + simplifiedPath);
    }
}
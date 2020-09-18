package Easy;

public class DefangIPaddr {
    public static void runDefangIPaddr(){
        String address = "1.1.1.1";

        String solution = defangIPaddr(address);

        System.out.println(solution.toString());
    }

    public static String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();

        for (char c : address.toCharArray()) {
            if (c == '.') {
                sb.append("[.]");
            }
            else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}

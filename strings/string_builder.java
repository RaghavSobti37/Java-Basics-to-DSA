package strings;
public class string_builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Raghav");
        System.out.println(sb);

        System.out.println(sb.charAt(0));

        // set char at index
        sb.setCharAt(1, 'e');
        System.out.println(sb);

        // insert char at index
        sb.insert(sb.length(), "s");
        System.out.println(sb);

        // delete substring
        sb.delete(sb.length()-1,sb.length());
        System.out.println(sb);

        // append string
        // no change in memory , making changes in the same string
        sb.append(" is a good boy!");
        System.out.println(sb);

        System.out.println(sb.length());

        // reverse string 
        for (int i = 0 ; i < sb.length()/2 ; i++){
            int front = i;
            int back = sb.length() - 1 - i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);

            System.out.println(sb);
        }
    }
}

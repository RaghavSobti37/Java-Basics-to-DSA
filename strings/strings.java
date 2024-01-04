package strings;
public class strings {
    public static void main(String[] args) {
        // concatenation
        String firstName = "Raghav";
        String lastName = "Sobti";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        System.out.println(fullName.length());

        //char at
        for (int i = 0 ; i < fullName.length() ; i++){
            System.out.print(fullName.charAt(i) + " ") ;
        }

        // Return value for 'compareTo' function
        // s1 > s2 -> +ve
        // s1 = s2 -> 0 
        // s1 < s2 -> -ve

        if(firstName.compareTo(lastName) == 0){
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
        
        //substring
        String sentence = "My name is Raghav Sobti";
        String name = sentence.substring(11);
        System.out.println(name);
    }
}

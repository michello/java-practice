public class StrBuildStrFormat {
    public static void main(String[] args) {
        // inefficient; keeps creating a new string
        String info = "";
        info += "My name is Michelle";
        info += " ";
        info += "";

        // more efficient - appends the text
        // String Builder is more lightweight
        StringBuilder sb = new StringBuilder("");
        sb.append("My name is Michelle.");
        sb.append(" ");
        sb.append("I am a programmer.");

        StringBuilder s = new StringBuilder();
        s.append("My name is Michelle.")
            .append(" ")
            .append("I am a weeb.");
        System.out.println(s.toString());

        // thread safe version of StringBuilder
        StringBuffer ss = new StringBuffer("Hellooo");
        System.out.println(ss.toString());

        System.out.printf("Total cost %d; quantity is %d\n", 5, 120);
    }
}
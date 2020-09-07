public class PD {
    // StringBuilder
    // StringBuffer
    // poczytac o roznicach
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append(1);
        sb.append("00");
        sb.append("%");
        sb.append(' ');
        sb.append('P');
        
        String createdString = sb.toString();
        System.out.println("createdString = " + createdString);

    }

}

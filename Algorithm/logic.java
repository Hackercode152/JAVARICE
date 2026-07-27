public class logic {
    public static void main(String[] args) {
        int x = 6;
        int y = 3;

System.out.println(!(x < 10 && y > 1));           
System.out.println(!(x < 10 && y < 1));             
System.out.println(!(x > 10 || y > 1));            
System.out.println(!(x > 10 || y < 1));             
System.out.println(!((x < 10 && y > 1) && x != 6)); 
    }
}

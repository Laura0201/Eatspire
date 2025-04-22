package BusinessLogik;

public class Main {
    public static void main(String[]  args){
        User Jona = new User("jt.buettner", "JTZ67(@erkjlsg");
        System.out.println(Jona.passwortKorrekt("jt.buettner", "ksdögkdj"));
    }
}

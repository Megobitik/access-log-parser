public class Main {
    public static void main(String[] args){
    System.out.println("Введите текст и нажмите <Enter>: " +
            Math.random());
    String text = new Scaner(System.in).nextLine();
    System.out.println("Длина текста: "+ text.lengh());
    }
}

public class Patterns {
    public static void main(String[] args) {
        draw(4,4);
    }
    private static void draw(int target, int pointer){
        if (pointer==0)return;
        String str="";
        for (int i=0;i<pointer;i++){
            str+="* ";
        }
        System.out.println(str);
        draw(target,--pointer);
    }
}

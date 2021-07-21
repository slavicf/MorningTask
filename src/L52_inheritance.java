class Super {
    public static String getSuper() {
        return "Базовая версия";
    }
}

class Sub extends Super {
    public static String getSuper() {
        return "Производная версия";
    }
}

public class L52_inheritance {
    public static void main(String[] args) {
        Super sup = new Sub();
        System.out.println(sup.getSuper());
    }
}

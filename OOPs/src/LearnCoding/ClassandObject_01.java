package LearnCoding;

class ClassandObject_01 {
    int a = 10; String b = "Ankush";  // data
    void show() {       // methods
        System.out.println(a+ " " + b);
    }

}
class Test {
    public static void main(String[] args) {
        ClassandObject_01 r = new ClassandObject_01();
        r.show();
    }
}

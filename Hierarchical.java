class Shape {
void draw() {
System.out.println("Drawing");
}
}
class Rectangle extends Shape {
void rect() {
System.out.println("Rectangle");
}
}
class Triangle extends Shape {
void tri() {
System.out.println("Triangle");
}
}
public class Hierarchical {
public static void main(String a[]) {
Triangle t =new Triangle();
t.draw();
//t.rect();
t.tri();
}
}
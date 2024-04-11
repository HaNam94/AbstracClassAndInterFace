//public interface Flyable { // Khai báo interface
//    String fly(); // Phương thức trừu tượng
//    public abstract String fly(); // phương thức trừu tượng và mặc định sẽ co modifier là public và khai báo từ khóa abstract
//
////    int a(){ // Không được khai báo phương thức có triển khai trong Interface
////        return 1;
////    }
//    interface Animal{
//        void sleep;
//        String fly();
//}
//    class Bird extends Square implements Flyable, Animal {  // Sử dụng từ khóa implements để triển khai interface
//
//        @Override
//        public String fly() {
//            return "Bird is flying";
//        }
//
//        @Override
//        public void sleep() {
//            System.out.println("Bird is sleeping");
//        }
//    }
//
//class Main{
//    public static void main(String[] args) {
////        Flyable flyable = new Flyable();
//        System.out.println(Flyable.A);
//        Flyable f = new Bird();
//        f.fly();
//        Animal f2 = new Bird();
//        f2.fly();
//    }
//}

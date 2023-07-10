package Week15_OfficeHours.evening;

public class Runner {
    public static void main(String[] args) throws FailToCheckOutException {


        Library library = new Library();
        library.getLibrary("XXXXX");
        library.borrow(true);
    }

        public static void m1() throws FailToCheckOutException{
            Library library=new Library();
            library.borrow(true);
        }

        public static void m2(){
        Library library=new Library();
            try {
                library.borrow(true); //ctrl+alt+T
            } catch (FailToCheckOutException e) {
                //throw new RuntimeException(e);
            }
        }

}

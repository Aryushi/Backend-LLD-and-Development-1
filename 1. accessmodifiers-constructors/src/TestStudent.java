public class TestStudent {
    public static void main(String[] args) {
        Student obj1 = new Student();
        Address address= new Address();
        obj1.rollNo = 27;
        address.addressId = 1;
        obj1.address = address;
        obj1.name="Aryushi";
        //Student obj2 =obj1 ;//reference copy
        Student obj2 = obj1.clone();//shallow copy
        obj2.rollNo = 30;
        obj2.address.addressId =2;
        obj2.name = "Mehta";
        System.out.println(obj1.rollNo);
        System.out.println(obj2.rollNo);
        System.out.println(obj1.address.addressId);
        System.out.println(obj2.address.addressId);
        System.out.println(obj1.name);
        System.out.println(obj2.name);
    }
}

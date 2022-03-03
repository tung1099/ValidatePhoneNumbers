public class PhoneNumberTest {

    public static PhoneNumber phoneNumber;
    public static final String[] validPhoneNumbers = new String[]{"84123456789","0911260811","00215565889",
                                                                     "1245555412","0122554"};

    public static void main(String[] args) {
        phoneNumber = new PhoneNumber();
        for (String number:validPhoneNumbers
             ) {
            boolean isValid = phoneNumber.validate(number);
            if (isValid == true){
                System.out.println("SDT: '" + number + '\'' + "hợp lệ!");
            } else {
                System.out.println("SDT: '" + number + '\'' + "không hợp lệ...");
            }
        }
    }
}

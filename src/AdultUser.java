public class AdultUser implements LibraryUser {
    int age;
    String bookType;

    public AdultUser(int age, String bookType) {
        this.age = age;
        this.bookType = bookType;
    }

    @Override
    public void registerAccount() {
        if (age >= 12) {
            System.out.println("You have successfully registered under an Adult Account");
        } else {
            System.out.println("Sorry, age must be greater than 12 to register as an adult.");
        }
    }
        @Override
        public void requestBook () {
        if(bookType == "Fiction"){
            System.out.println("Book issued successfully, please return the book within 7 days");
        }else {
            System.out.println("OOPs, you are allowed to take only adult Fiction books");
        }

        }
    }


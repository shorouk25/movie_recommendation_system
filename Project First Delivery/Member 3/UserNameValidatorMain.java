public class UserNameValidatorMain {
    public static void main(String[] args) {
        String name = "SaRaH   TaReK";
        String error = UserNameValidator.validate(name);

        if (error != null) {
            System.out.println(error);
        }
        else {
            System.out.println("{" + name + "} is a valid name");
        }
    }
}

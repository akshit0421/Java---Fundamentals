import java.util.Arrays;
public class CreatePassword {
    public static void main(String[] args) {
        String[] password = {"ASDFDFA", "34958234985234820934", "243082304920394", "ASDFAFMMMMMMMMM99999999", "12212112", "23094230482"};
        Arrays.sort(password);

        String[] sortedPasswords = new String[3];
        String passphrase = "";

        sortedPasswords[0] = password[0];
        sortedPasswords[1] = password[1];
        sortedPasswords[2] = password[2];

        for (int i = 0; i < sortedPasswords.length; i++) {
            passphrase += sortedPasswords[i];
        }
        System.out.println(passphrase);
    }
}

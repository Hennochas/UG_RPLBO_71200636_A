package login.com;

import java.util.Scanner;
        import java.util.regex.Matcher;
        import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        System.out.println("Selamat datang di Toko Henok");
        System.out.println("Silakan daftarkan diri kamu untuk dapat mengakses menu di Toko Henok");

        User user = new User("", "", "");

        Scanner scan = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Username: ");
                String username = scan.nextLine();
                if (username.isEmpty()) {
                    throw new UsernameException(1);
                } else if (username.length() < 6) {
                    throw new UsernameException(2);
                } else {
                    user.setUsername(username);
                    break;
                }
            } catch (UsernameException e) {
                System.out.println(e.getErrMessage());
            }
        }

        while (true) {
            try {
                System.out.println("Email: ");
                String email = scan.nextLine();
                if (email.isEmpty()) {
                    throw new EmailException(1);
                } else if (!(email.contains("@ti.ukdw.com"))) {
                    throw new EmailException(2);
                } else {
                    user.setEmail(email);
                    break;
                }
            } catch (EmailException e) {
                System.out.println(e.getErrMessage());
            }
        }

        while (true) {
            try {
                boolean flagKecil = false;
                boolean flagBesar = false;
                boolean flagSimbol = false;
                boolean flagAngka = false;

                System.out.println("Password: ");
                String password = scan.nextLine();

                for (int i = 0; i < password.length(); i++) {
                    char c = password.charAt(i);
                    if (Character.isLetter(c) && Character.isLowerCase(c)) {
                        flagKecil = true;
                    }
                    if (Character.isDigit(c)) {
                        flagAngka = true;
                    }
                    if (Character.isLetter(c) && Character.isUpperCase(c)) {
                        flagBesar = true;
                    }
                }

                Pattern pattern = Pattern.compile("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
                Matcher match = pattern.matcher(password);
                boolean check = match.find();

                if (check)
                    flagSimbol = true;

                if (password.isEmpty()) {
                    throw new PasswordException(1);
                } else if (!(flagKecil && flagBesar && flagSimbol && flagAngka)) {
                    throw new PasswordException(4);
                } else if (password.equals(user.getUsername())) {
                    throw new PasswordException(3);
                } else if (password.length() < 7) {
                    throw new PasswordException(2);
                } else {
                    user.setPassword(password);
                    while (true) {
                        System.out.println("Password Confirmed: ");
                        String password2 = scan.nextLine();
                        if (!(password2.equals(user.getPassword()))) {
                            throw new PasswordException(5);
                        } else {
                            break;
                        }
                    }
                    break;
                }
            } catch (PasswordException e) {
                System.out.println(e.getErrMessage());
            }
        }
        System.out.println("Akun anda berhasil didaftarkan!");
        System.out.println("Silahkan login untuk melanjutkan.");

        while (true) {
            try {
                System.out.println("Username: ");
                String username = scan.nextLine();
                System.out.println("Password: ");
                String password = scan.nextLine();
                if (username.isEmpty() || password.isEmpty()) {
                    throw new LoginException(1);
                } else if (!(username.equals(user.getUsername()) && password.equals(user.getPassword()))) {
                    throw new LoginException(2);
                } else {
                    System.out.println("Selamat datang");
                    break;
                }
            } catch (LoginException e) {
                System.out.println(e.getErrMessage());
            }

        }


    }
}

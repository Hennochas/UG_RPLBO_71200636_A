package com.ug11.instapost;

public class InstaPost {
    private int totalMention;
    private String email;
    private String username;

    public InstaPost() {}

    public void login(String email) {
        try {
            if (!email.contains("@")) {
                throw new EmailException(1);
            } else if (!email.contains("gmail.com")) {
                throw new EmailException(2);
            } else {
                this.email = email;
                String[] arr = email.split("@");
                if (arr[0].isEmpty()) {
                    throw new EmailException(1);
                }
                else {
                    this.username = arr[0].toUpperCase();
                    System.out.println("Login Berhasil!");
                }

            }
        }
        catch (EmailException m) {
            System.out.println(m.getErrorMessage());
        }
    }

    public void post(String caption) {
        String[] arr = caption.split(" ");
        StringBuilder mention = new StringBuilder();
        int c = 0;
        for (String s : arr) {
            if (s.charAt(0) == '@') {
                if (mention.isEmpty()) {
                    mention.append(s);
                } else {
                    mention.append(", ").append(s);
                }
                c += 1;
            }
        }

        totalMention += c;

        System.out.println("Caption: " + caption);

        if (c > 0) {
            System.out.println("Pengguna yang anda mention: " + mention);
        }
        else {
            System.out.println("Pengguna yang anda mention: -");
        }

        System.out.println("Total username yang Anda Mention " + c);
    }

    public void printInfo() {
        System.out.println("Username: " + this.username);
        System.out.println("Email: " + this.email);
        System.out.println("Total Mention: " + totalMention);
    }
}

package Notesmanagement;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NotesPasswordManger {

        private static Map<String, String> notes = new HashMap<>();
        private static Map<String, String> passwords = new HashMap<>();

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int choice=0;
            do {
                System.out.println("1. Add Note");
                System.out.println("2. View Notes");
                System.out.println("3.Remove Notes");
                System.out.println("4. Add Password");
                System.out.println("5. View Passwords");
                System.out.println("6.Remove Password");
                System.out.print("Enter your choice: ");
                try {
                    choice = scanner.nextInt();
                    scanner.nextLine();
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter a number.");
                    scanner.nextLine();
                    continue;
                }
                switch (choice) {
                    case 1:
                        addNote(scanner);
                        break;
                    case 2:
                        viewNotes();
                        break;
                    case 3:
                        notes.remove("jungle");
                        System.out.println(notes);
                    case 4:
                        addPassword(scanner);
                        break;
                    case 5:
                        viewPasswords();
                        break;
                    case 6:
                        passwords.remove("shivani.com");
                        System.out.println(passwords);
                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                }
            } while (choice != 0);
            scanner.close();
        }

        private static void addNote(Scanner scanner) {
            System.out.print("Enter the note title: ");
            String title = scanner.nextLine();
            System.out.print("Enter the note content: ");
            String content = scanner.nextLine();
            notes.put(title, content);
            System.out.println("Note added successfully!");
        }
        private static void viewNotes() {
            if (notes.isEmpty()) {
                System.out.println("No notes available.");
            } else {
                System.out.println("Notes:");
                for (Map.Entry<String, String> entry : notes.entrySet()) {
                    System.out.println("Title: " + entry.getKey());
                    System.out.println("Content: " + entry.getValue());
                    System.out.println("------");
                }
            }
        }
        private static void addPassword(Scanner scanner) {
            System.out.print("Enter the website or account name: ");
            String website = scanner.nextLine();
            System.out.print("Enter the password: ");
            String password = scanner.nextLine();
            passwords.put(website, password);
            System.out.println("Password added successfully!");
        }
        private static void viewPasswords() {
            if (passwords.isEmpty()) {
                System.out.println("No passwords available.");
            } else {
                System.out.println("Passwords:");
                for (Map.Entry<String, String> entry : passwords.entrySet()) {
                    System.out.println("Website/Account: " + entry.getKey());
                    System.out.println("Password: " + entry.getValue());
                    System.out.println("------");
                }
            }
        }
    }
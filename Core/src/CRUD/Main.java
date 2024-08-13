package CRUD;

import java.util.Scanner;

public class Main {
    private static BlogService blogService = new BlogService();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1. Create Post");
            System.out.println("2. View All Posts");
            System.out.println("3. View Post by ID");
            System.out.println("4. Update Post");
            System.out.println("5. Delete Post");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    createPost();
                    break;
                case 2:
                    viewAllPosts();
                    break;
                case 3:
                    viewPostById();
                    break;
                case 4:
                    updatePost();
                    break;
                case 5:
                    deletePost();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void createPost() {
        System.out.print("Enter title: ");
        String title = scanner.nextLine();
        System.out.print("Enter content: ");
        String content = scanner.nextLine();
        Post post = blogService.createPost(title, content);
        System.out.println("Post created: " + post);
    }

    private static void viewAllPosts() {
        System.out.println("All Posts:");
        blogService.getAllPosts().forEach(System.out::println);
    }

    private static void viewPostById() {
        System.out.print("Enter post ID: ");
        int id = scanner.nextInt();
        blogService.getPostById(id).ifPresentOrElse(
                post -> System.out.println("Post: " + post),
                () -> System.out.println("Post not found.")
        );
    }

    private static void updatePost() {
        System.out.print("Enter post ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        System.out.print("Enter new title: ");
        String title = scanner.nextLine();
        System.out.print("Enter new content: ");
        String content = scanner.nextLine();
        blogService.updatePost(id, title, content).ifPresentOrElse(
                post -> System.out.println("Post updated: " + post),
                () -> System.out.println("Post not found.")
        );
    }

    private static void deletePost() {
        System.out.print("Enter post ID: ");
        int id = scanner.nextInt();
        if (blogService.deletePost(id)) {
            System.out.println("Post deleted.");
        } else {
            System.out.println("Post not found.");
        }
    }
}

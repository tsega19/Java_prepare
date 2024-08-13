package CRUD;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BlogService {
    private List<Post> posts = new ArrayList<>();
    private int nextId = 1;

    // Create
    public Post createPost(String title, String content) {
        Post post = new Post(nextId++, title, content);
        posts.add(post);
        return post;
    }

    // Read all posts
    public List<Post> getAllPosts() {
        return new ArrayList<>(posts);
    }

    // Read a single post by ID
    public Optional<Post> getPostById(int id) {
        return posts.stream().filter(post -> post.getId() == id).findFirst();
    }

    // Update
    public Optional<Post> updatePost(int id, String title, String content) {
        Optional<Post> postOpt = getPostById(id);
        postOpt.ifPresent(post -> {
            post.setTitle(title);
            post.setContent(content);
        });
        return postOpt;
    }

    // Delete
    public boolean deletePost(int id) {
        return posts.removeIf(post -> post.getId() == id);
    }
}
